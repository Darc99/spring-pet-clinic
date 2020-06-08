package first.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import first.springframework.springpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
       
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        
        model.addAttribute("owne  rs", ownerService.findAll());

        return "owners/index";
    }

}