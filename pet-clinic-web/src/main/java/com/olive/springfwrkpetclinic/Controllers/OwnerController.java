package com.olive.springfwrkpetclinic.Controllers;

import org.olive.springfwrkpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;


    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners",ownerService.findall());
        return "owners/index";
    }
}
