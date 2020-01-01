package cn.jbit.controller;

import cn.jbit.entity.TodayWhereAbout;
import cn.jbit.entity.User;
import cn.jbit.service.TodayWhereService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/todaywhere")
public class TodayWhereController {
    @Autowired
    private TodayWhereService todayWhereService;

    @RequestMapping(value = "/t")
    public String t()
    {
        return "today";
    }

    @PostMapping("/findAll")
    @ResponseBody
    public List<TodayWhereAbout> findAll(){
        List<TodayWhereAbout> list=todayWhereService.findAll();
        System.out.println(list);
        return list;
    }

    @GetMapping("/opop")
    public String update(Model model,@RequestParam("id")Integer id)
    {
        model.addAttribute("todayWhereAbout",todayWhereService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String updateTodayWhere(TodayWhereAbout todayWhereAbout)
    {
        if(todayWhereService.updateTodayWhere(todayWhereAbout)>0)
        {
            return "today";
        }
        return "update";
    }

    @GetMapping("/findById")
    public String one(Model model,Integer id)
    {
        TodayWhereAbout todayWhereAbout=todayWhereService.findById(id);
        model.addAttribute("todayWhereAbout",todayWhereService.findById(id));
        return "update";
    }

}
