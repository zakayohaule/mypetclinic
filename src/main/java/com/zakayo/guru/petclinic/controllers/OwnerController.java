package com.zakayo.guru.petclinic.controllers;

import com.zakayo.guru.petclinic.services.OwnerService;
import com.zakayo.guru.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owners")
public class OwnerController {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService , VetService vetService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"" , "index" , "index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners" , ownerService.findAll());
        return "owners/index";
    }

}
