package com.codigofacilito.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

  @GetMapping("/")
  public String index(Model model) {
      model.addAttribute("titulo", "Atributo titulo");
      model.addAttribute("nombre", "Atributos model");
      model.addAttribute("show", true);
      return "index";
  }
 
}
