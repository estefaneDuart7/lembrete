package br.com.ifal.lembrete;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador {
    @RequestMapping("/cadastro")
    public ModelAndView cadastro(){
        ModelAndView mv = new ModelAndView("cadastro.html");
        mv.addObject("lembrete", new Lembrete());
        return mv;
    }
    
}