package com.shz.worlds_archive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author aeryxx
 */

@Controller
public class NavigationController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String goToMenu(HttpServletRequest request, Model model){
        return "menu";
    }

    @RequestMapping(value="/Characters/Menu", method=RequestMethod.GET)
    public String goToCharactersMenu(HttpServletRequest request, Model model){
        return "characterPage/characterMenu";
    }
    
}
