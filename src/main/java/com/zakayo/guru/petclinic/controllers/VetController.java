package com.zakayo.guru.petclinic.controllers;

import com.zakayo.guru.petclinic.services.VetService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vets")
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"" , "index" , "index.html"})
    public String vetList(Model model){
        model.addAttribute("model" , model);
        model.addAttribute("vets" , vetService.findAll());
        return "vets/index";
    };
}
