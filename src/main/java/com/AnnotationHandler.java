package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * \Date: 2018/6/25
 * \
 * \Description:
 * \
 */
@Controller
public class AnnotationHandler {

    @RequestMapping("/modelAndViewTest")
    public ModelAndView modelAndViewTest(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","fyb");

        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping("modelTest")
    public String ModelTest(Model model){
        model.addAttribute("name","zmy");

        return "show";
    }


    @RequestMapping("/maplTest")
    public String MapTest(Map<String,String> map){
        map.put("name","1314");

        return "show";
    }

    @RequestMapping("/add")
    public ModelAndView addGoods(Goods goods){

        System.out.println(goods.getName());
        ModelAndView modelAndView =new ModelAndView();

        modelAndView.addObject("goods",goods);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
