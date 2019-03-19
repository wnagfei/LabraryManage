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
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private PublicInfoService publicInfoService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayForService payForService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private LabrayService labrayService;

    @RequestMapping("")
    public String index(){
        return "/student/index";
    }

    @RequestMapping("/left")
    public String left(){
        return "/student/left";
    }

    @RequestMapping("/top")
    public String top(){
        return "/student/top";
    }

    @RequestMapping("/republic_task")
    public String republic_task(){
        return "/student/republic_task";
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
        return "/student/task_list";
    }

    @RequestMapping("/orderList")
    public String orderlist(Model model){
        List<OrderInfo> orderInfoList = orderService.getOrderInfoList();
        model.addAttribute("list", orderInfoList);
        return "/student/orderList";
    }

    @RequestMapping("/corret_task/{id}")
    public String corret_task(@PathVariable("id") Integer id, Model model){
        PublicInfo info = publicInfoService.getPublicInfoById(id);
        model.addAttribute("info", info);
        return "/student/corret_task";
    }

    @RequestMapping("/public/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        publicInfoService.delete(id);
        return "redirect:/student/task_list";
    }

    @RequestMapping("/order/pay/{id}")
    public String deleteorder(@PathVariable("id") Integer id){
        orderService.delete(id);
        return "redirect:/student/orderList";
    }

    @RequestMapping("/query/public/{qName}")
    public String publicquery(@PathVariable("qName") String qName, Model model, HttpServletRequest request){
        List<PublicInfo> publicInfoList = publicInfoService.getPublicInfoList();
        for(PublicInfo publicInfo : publicInfoList){
            if(publicInfo.getId() == Integer.parseInt(qName)){
                model.addAttribute("list", publicInfo);
                request.setAttribute("list", publicInfo);
                break;
            }
        }
        return "/corretinfo_query";
    }

    @RequestMapping("/query/order/{qName}")
    public String publicorder(@PathVariable("qName") String qName, Model model, HttpServletRequest request) throws UnsupportedEncodingException {
        qName = new String(qName.getBytes("iso8859-1"), "UTF-8");
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
        return "/student/orderLabray";
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
        return "/student/payforMaterial";
    }

    @RequestMapping(value = "payforMaterial/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> payforMaterialSubmit(@RequestParam("qName") String qName,
                                                   @RequestParam("qInfo") String qInfo,
                                                   @RequestParam("qMoney") String qMoney,
                                                   @RequestParam("qPeople") String qPeople){
        return payForService.addPayFor(qName,qInfo,qMoney,qPeople);
    }

    @RequestMapping("/orderMaterial")
    public String orderMaterial(){
        return "/student/orderMaterial";
    }

    @RequestMapping(value = "/orderMaterial/submit",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> orderMaterialsubmit(@RequestParam("qName") String qName,
                                                   @RequestParam("qInfo") String qInfo,
                                                   @RequestParam("startTime")String startTime,
                                                   @RequestParam("endTime")String endTime) {
        return orderService.inserOrder(qName, qInfo, startTime, endTime);
    }

    @RequestMapping("/studentinfo_edit")
    public String studentinfo_edit(){
        return "/student/studentinfo_edit";
    }

    @RequestMapping("/studentinfo_edit/submit")
    @ResponseBody
    public Map<String, Object> studentinfo_edit_submit(@RequestParam("username") String username,
                                          @RequestParam("sex")String sex,
                                          @RequestParam("role")String role,
                                          @RequestParam("classname")String classname,
                                          @RequestParam("department")String department){

        return studentService.update(username,sex,role,classname,department);
    }


    @RequestMapping(value = "deleteMaterial/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> deleteMaterialSubmit(@RequestParam("qName") String qName,
                                                   @RequestParam("qInfo") String qInfo,
                                                   @RequestParam("qMoney") String qMoney,
                                                   @RequestParam("qPeople") String qPeople){
        return payForService.addPayFor(qName,qInfo,qMoney,qPeople);
    }

    @RequestMapping("/labrayList")
    public String labrayList(Model model){
        List<LabrayInfo> orderInfoList = labrayService.getLabrayList();
        model.addAttribute("list", orderInfoList);
        return "/teacher/labrayList";
    }

    @RequestMapping("/deleteMaterial")
    public String deleteMaterial(){
        return "/teacher/deleteMaterial";
    }

    @RequestMapping("/password")
    public String password(){
        return "/student/password";
    }

    @RequestMapping("/corretinfo")
    public String corretinfo(Model model){
        List<PublicInfo> publicInfoList = publicInfoService.getPublicInfoList();
        model.addAttribute("list", publicInfoList);
        return "/student/corretinfo";
    }

    @RequestMapping(value = "/password/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> passwordsubmit(@RequestParam("username") String username,
                                             @RequestParam("password1") String password1,
                                             @RequestParam("password2")String password2,
                                             @RequestParam("password3")String password3){
        return studentService.password(username,password1,password2,password3);
    }
}
