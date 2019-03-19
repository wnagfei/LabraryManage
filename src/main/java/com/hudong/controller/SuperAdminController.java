package com.hudong.controller;

import com.hudong.model.*;
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
@RequestMapping("/admin")
public class SuperAdminController {

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

    @Autowired
    private MaterialService materialService;

    @Autowired
    private RepairService repairService;

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("")
    public String index(){
        return "/superadmin/index";
    }

    @RequestMapping("/left")
    public String left(){
        return "/superadmin/left";
    }

    @RequestMapping("/addLabray")
    public String addLabray(){
        return "/superadmin/addLabray";
    }

    @RequestMapping(value = "/addLabray/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addLabray_submit(@RequestParam("qInfo")String qInfo,@RequestParam("qName") String qName,
                                   @RequestParam("qContent")String qContent,@RequestParam("qStatus") String qStatus){
        return labrayService.addLabray(qInfo,qName,qContent,qStatus);
    }

    @RequestMapping("/addMaterial")
    public String addMaterial(){
        return "/superadmin/addMaterial";
    }

    @RequestMapping(value = "/addMaterial/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addMaterialSubmit(@RequestParam("mateNo") String mateNo,
                                                @RequestParam("mateName")String mateName,
                                                @RequestParam("mateCategory")String mateCategory,
                                                @RequestParam("mateOwn")String mateOwn,
                                                @RequestParam("mateStatus")String mateStatus,
                                                @RequestParam("matePeople")String matePeople,
                                                @RequestParam("mateAddress")String mateAddress){
        return materialService.addMaterial(mateNo,mateName,mateCategory,mateOwn,mateStatus,matePeople,mateAddress);
    }

    @RequestMapping(value = "/updateMaterial/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> updateMaterial(@RequestParam("mateNo") String mateNo,
                                                @RequestParam("mateName")String mateName,
                                                @RequestParam("mateCategory")String mateCategory,
                                                @RequestParam("mateOwn")String mateOwn,
                                                @RequestParam("mateStatus")String mateStatus,
                                                @RequestParam("matePeople")String matePeople,
                                                @RequestParam("mateAddress")String mateAddress){
        return materialService.updateMaterial(mateNo,mateName,mateCategory,mateOwn,mateStatus,matePeople,mateAddress);
    }

    @RequestMapping("/MaterialList")
    public String MaterialList(Model model){
        List<MaterialInfo> list = materialService.getList();
        model.addAttribute("list", list);
        return "/superadmin/MaterialList";
    }

    @RequestMapping("/query/MaterialList/{name}")
    public String MaterialListquery(@PathVariable("name")String name, Model model){

        List<MaterialInfo> list = materialService.getList();
        for (MaterialInfo materialInfo :list){
            if(materialInfo.getMaterialName().equals(name)){
                model.addAttribute("list", materialInfo);
                break;
            }
        }
        return "/MaterialList_query";
    }

    @RequestMapping("/payforMaterial")
    public String payforMaterial(){
        return "/superadmin/payforMaterial";
    }

    @RequestMapping("/updateMaterial/{no}")
    public String upateMaterial(@PathVariable("no")String no, Model model){
        List<MaterialInfo> list = materialService.getList();
        for(MaterialInfo materialInfo : list){
            if (materialInfo.getMaterialNo().equals(no)){
                model.addAttribute("info", materialInfo);
                break;
            }
        }
        return "/superadmin/updateMaterial";
    }

    @RequestMapping("/updateUserinfo")
    public String updateUserinfo(){
        return "/superadmin/updateUserinfo";
    }

    @RequestMapping("/deleteMaterial/{no}")
    public String deleteMaterial(@PathVariable("no")Integer no, Model model){
        materialService.delete(no);
        return "redirect:/admin/MaterialList";
    }

    @RequestMapping("/repairMaterial")
    public String repairMaterial(){
        return "/superadmin/repairMaterial";
    }

    @RequestMapping(value = "/repairMaterial/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> repairMaterialsubmit(@RequestParam("qInfo") String qInfo,
                                       @RequestParam("qName") String qName,
                                       @RequestParam("qTime")String qTime){
        return repairService.repair(qInfo,qName,qTime);
    }

    @RequestMapping("/addPublic")
    public String addPublic(){
        return "/superadmin/addPublic";
    }

    @RequestMapping("/publicList")
    public String publicList(){
        return "/superadmin/publicList";
    }

    @RequestMapping("/addUserinfo")
    public String addUserinfo(){
        return "/superadmin/addUserinfo";
    }

    @RequestMapping(value = "/addUserinfo/submit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addUserinfosubmit(@RequestParam("username")String username,
                                                @RequestParam("sex")String sex,
                                                @RequestParam("role")String role,
                                                @RequestParam("classname")String classname,
                                                @RequestParam("department")String department){
        return userInfoService.addInfo(username,sex,role,classname,department);
    }

    @RequestMapping("/userinfoList")
    public String userinfoList(Model model){
        List<TeacherInfo> list = userInfoService.getList();
        model.addAttribute("list", list);
        return "/superadmin/userinfoList";
    }

    @RequestMapping("/query/userinfolist/{name}")
    public String queryuserinfolist(@PathVariable("name")String name,Model model){
        List<TeacherInfo> list = userInfoService.getList();
        for (TeacherInfo info: list){
            if(info.getName().equals(name)){
                model.addAttribute("list", info);
                break;
            }
        }
        return "/userinfoList_query";
    }

    @RequestMapping("/delete/userinfo/{id}")
    public String deleteUserInfo(@PathVariable("id")Integer id){
        userInfoService.delete(id);
        return "redirect:/admin/userinfoList";
    }

    @RequestMapping("/top")
    public String top(){
        return "/superadmin/top";
    }

    @RequestMapping("/republic_task")
    public String republic_task(){
        return "/superadmin/republic_task";
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
        return "/superadmin/publicList";
    }

    @RequestMapping("/orderList")
    public String orderlist(Model model){
        List<OrderInfo> orderInfoList = orderService.getOrderInfoList();
        model.addAttribute("list", orderInfoList);
        return "/superadmin/orderList";
    }

    @RequestMapping("/corret_task/{id}")
    public String corret_task(@PathVariable("id") Integer id, Model model){
        PublicInfo info = publicInfoService.getPublicInfoById(id);
        model.addAttribute("info", info);
        return "/superadmin/corret_task";
    }

    @RequestMapping("/public/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        publicInfoService.delete(id);
        return "redirect:/superadmin/task_list";
    }

    @RequestMapping("/order/pay/{id}")
    public String deleteorder(@PathVariable("id") Integer id){
        orderService.delete(id);
        return "redirect:/superadmin/orderList";
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
        return "/superadmin/orderLabray";
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
        return "/superadmin/payforMaterial";
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
        return "/superadmin/orderMaterial";
    }

    @RequestMapping(value = "/orderMaterial/submit",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> orderMaterialsubmit(@RequestParam("qName") String qName,
                                                   @RequestParam("qInfo") String qInfo,
                                                   @RequestParam("startTime")String startTime,
                                                   @RequestParam("endTime")String endTime) {
        return orderService.inserOrder(qName, qInfo, startTime, endTime);
    }

    @RequestMapping("/superadmininfo_edit")
    public String superadmininfo_edit(){
        return "/superadmin/superadmininfo_edit";
    }

    @RequestMapping("/superadmininfo_edit/submit")
    @ResponseBody
    public Map<String, Object> superadmininfo_edit_submit(@RequestParam("username") String username,
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
        return "/superadmin/password";
    }

    @RequestMapping("/corretinfo")
    public String corretinfo(Model model){
        List<PublicInfo> publicInfoList = publicInfoService.getPublicInfoList();
        model.addAttribute("list", publicInfoList);
        return "/superadmin/corretinfo";
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
