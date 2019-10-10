package com.xf._14_springboot_validate_form.controller;

import com.xf._14_springboot_validate_form.entity.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:56 2019/10/10
 * @description :FormController类
 */
@Controller
@RequestMapping("/")
public class FormController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(PersonForm personForm) {
        return "form";
    }

    /**
     *
     * @param personForm 实体对象与页面对应是否合法
     * @param bindingResult 校验结果对象
     * @return 返回回调路径
     */
    @PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }
        return "redirect:/results";
    }
}
