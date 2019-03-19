package com.hudong.controller;

import com.hudong.model.LabrayInfo;
import com.hudong.model.OrderInfo;
import com.hudong.model.PublicInfo;
import com.hudong.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private PublicInfoService publicInfoService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayForService payForService;

    @Autowired
    private LabrayService labrayService;

    @RequestMapping("")
    public String index(Model model){
        return "/teacher/index";
    }

    @RequestMapping("/left")
    public String left(){
        return "/teacher/left";
    }

    @RequestMapping("/republic_task")
    public String republic_task(){
        return "/teacher/republic_task";
    }

    @RequestMapping("/republic_task/submit")
    @ResponseBody
    public Map<String, Object> republic_taskSubmit(@RequestParam("qName") String qName,
                                                   @RequestParam("qInfo") String qInfo,
                                                   @RequestParam("startTime") String startTime,
                                                   @RequestParam("endTime") String endTime){
        return teacherService.republic_taskSubmit(qName,qInfo,startTime,endTime);
    }


    @RequestMapping("/task_list")
    public String task_list(Model model){
        List<PublicInfo> publicInfoList = publicInfoService.getPublicInfoList();
        model.addAttribute("list", publicInfoList);
        return "/teacher/task_list";
    }

    @RequestMapping("/orderlist")
    public String orderlist(Model model){
        List<OrderInfo> orderInfoList = orderService.getOrderInfoList();
        model.addAttribute("list", orderInfoList);
        return "/teacher/orderlist";
    }

    @RequestMapping("/labrayList")
    public String labrayList(Model model){
        List<LabrayInfo> orderInfoList = labrayService.getLabrayList();
        model.addAttribute("list", orderInfoList);
        return "/teacher/labrayList";
    }

    @RequestMapping("/corret_task/{id}")
    public String corret_task(@PathVariable("id") Integer id, Model model){
        PublicInfo info = publicInfoService.getPublicInfoById(id);
        model.addAttribute("info", info);
        return "/teacher/corret_task";
    }

    @RequestMapping("/public/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        publicInfoService.delete(id);
        return "redirect:/teacher/task_list";
    }

    @RequestMapping("/order/pay/{id}")
    public String deleteorder(@PathVariable("id") Integer id){
        orderService.delete(id);
        return "redirect:/teacher/orderlist";
    }

    @RequestMapping("/public/query/{qName}")
    public String publicquery(@PathVariable("qName") String qName, Model model, HttpServletRequest request){
        List<PublicInfo> publicInfoList = publicInfoService.getPublicInfoList();
        for(PublicInfo publicInfo : publicInfoList){
            if(publicInfo.getPublicName().equals(qName)){
                model.addAttribute("list", publicInfo);
                request.setAttribute("list", publicInfo);
                break;
            }
        }
        return "/task_list_query";
    }

    @RequestMapping("/query/order/{qName}")
    public String publicorder(@PathVariable("qName") String qName, Model model, HttpServletRequest request){
        List<OrderInfo> publicInfoList = orderService.getOrderInfoList();
        for(OrderInfo publicInfo : publicInfoList){
            if(publicInfo.getMaterialNo().equals(qName)){
                model.addAttribute("list", publicInfo);
                request.setAttribute("list", publicInfo);
                break;
            }
        }
        return "/orderlist_query";
    }

    @RequestMapping("/orderLabray")
    public String orderLabray(){
        return "/teacher/orderLabray";
    }

    @RequestMapping(value = "/orderLabray/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> orderLabraysubmit(@RequestParam("qName") String qName,
                                    @RequestParam("qInfo") String qInfo,
                                    @RequestParam("startTime")String startTime,
                                    @RequestParam("endTime")String endTime){
        return orderService.inserOrder(qName,qInfo,startTime,endTime);
    }

    @RequestMapping("/payforMaterial/{id}")
    public String payforMaterial(@PathVariable("id") Integer id,Model model){
        List<OrderInfo> orderInfoList = orderService.getOrderInfoList();
        for(OrderInfo orderInfo: orderInfoList){
            if(orderInfo.getId()==id){
                model.addAttribute("info", orderInfo);
            }
        }
        orderService.delete(id);
        return "/teacher/payforMaterial";
    }

    @RequestMapping(value = "payforMaterial/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> payforMaterialSubmit(@RequestParam("qName") String qName,
                                                   @RequestParam("qInfo") String qInfo,
                                                   @RequestParam("qMoney") String qMoney,
                                                   @RequestParam("qPeople") String qPeople){
        return payForService.addPayFor(qName,qInfo,qMoney,qPeople);
    }

    @RequestMapping(value = "deleteMaterial/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> deleteMaterialSubmit(@RequestParam("qName") String qName,
                                                   @RequestParam("qInfo") String qInfo,
                                                   @RequestParam("qMoney") String qMoney,
                                                   @RequestParam("qPeople") String qPeople){
        return payForService.addPayFor(qName,qInfo,qMoney,qPeople);
    }

    @RequestMapping("/orderMaterial")
    public String orderMaterial(){
        return "/teacher/orderMaterial";
    }

    @RequestMapping("/deleteMaterial")
    public String deleteMaterial(){
        return "/teacher/deleteMaterial";
    }



    @RequestMapping(value = "/orderMaterial/submit",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> orderMaterialsubmit(@RequestParam("qName") String qName,
                                      @RequestParam("qInfo") String qInfo,
                                      @RequestParam("startTime")String startTime,
                                      @RequestParam("endTime")String endTime) {
        return orderService.inserOrder(qName, qInfo, startTime, endTime);
    }

    @RequestMapping("/teacherinfo_edit")
    public String teacherinfo_edit(){
        return "/teacher/teacherinfo_edit";
    }


    @RequestMapping("/teacherinfo_edit/submit")
    @ResponseBody
    public Map<String,Object> teacherinfo_edit_submit(@RequestParam("userName") String userName,
                                                      @RequestParam("className") String className,
                                                      @RequestParam("role")String role,
                                                      @RequestParam("sex")String sex,
                                                      @RequestParam("department")String department,
                                                      @RequestParam("title")String title){
        return teacherService.update(userName,className,role,sex,department,title);
    }

    @RequestMapping("/password")
    public String password(){
        return "/teacher/password";
    }

    @RequestMapping(value = "/password/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> passwordsubmit(@RequestParam("username") String username,
                                             @RequestParam("password1") String password1,
                                             @RequestParam("password2")String password2,
                                             @RequestParam("password3")String password3){
        return teacherService.password(username,password1,password2,password3);
    }
}
