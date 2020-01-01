package cn.jbit.controller;

import cn.jbit.entity.ProjectAdvanceMoney;
import cn.jbit.service.ProjectAdvanceMoneyService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jnlp.IntegrationService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/money")
public class ProjectAdvanceMoneyController {

    @Autowired
    private ProjectAdvanceMoneyService projectAdvanceMoneyService;

    //显示页面
    @RequestMapping(value = "/m")
    public String m()
    {
        return "/checkProjectAdvance/advance";
    }

    //显示所有待审核预支信息
    @PostMapping("/findAll")
    @ResponseBody
    public PageInfo<ProjectAdvanceMoney> findAll(@RequestParam(value = "pageNum",defaultValue = "1",required = false) String pageNum,
                                                 @RequestParam(value = "pageSize",defaultValue = "3",required = false) Integer pageSize,
                                                 HttpSession session, @RequestParam(value = "productionContractId",required =false)String productionContractId)
    {
        try {
            Integer nextUser = 3;
            session.setAttribute("nextUser", nextUser);
            //当前页数
            Integer pageNo = null;
            if (pageNum.equals("null") || pageNum == null) {
                pageNo = 1;
            } else {
                pageNo = Integer.valueOf(pageNum);
            }
            PageInfo<ProjectAdvanceMoney> pageInfo = projectAdvanceMoneyService.findAll(nextUser,productionContractId,pageNo, pageSize);
            System.out.println(pageInfo.getList());
            return pageInfo;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //显示单条审核信息
    @RequestMapping("/u")
    public String u(@RequestParam(value = "id",required =false)Integer id,Model model){
        ProjectAdvanceMoney p=projectAdvanceMoneyService.findById(id);
        model.addAttribute("p",p);
        return "/checkProjectAdvance/checkAdvance";
    }

    //审核
    @GetMapping("/check")
    public String update(Model model,@RequestParam(value = "checkStatus",required =false)Integer checkStatus, @RequestParam(value = "id",required = false)Integer id, HttpSession session)
    {
        Integer num=0;
        Integer nextUser= (Integer) session.getAttribute("nextUser");//获取审核人
        System.out.println("id:"+id);
        System.out.println("审核人:"+nextUser);
        System.out.println("状态："+checkStatus);
        if (nextUser==3){
            if (checkStatus==2){    //厂长审核通过修改审核人
                nextUser=4;
                num=projectAdvanceMoneyService.updateNextUser(id,nextUser);
            }
            if (checkStatus==3){    //厂长审核未通过修改审核状态
                num=projectAdvanceMoneyService.updateStatus(id,checkStatus);
            }
            if(num>0){
                return "/checkProjectAdvance/advance";
            }else {
                return "/checkProjectAdvance/checkAdvance";
            }
        }
        if (nextUser==4){   //财务审核
            num=projectAdvanceMoneyService.updateStatus(id,checkStatus);
        }
        if(num>0){
            return "/checkProjectAdvance/advance";
        }
        return "/checkProjectAdvance/checkAdvance";
    }


}
