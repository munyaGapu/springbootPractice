package com.spring.databaseApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {
    @Autowired
    AlienRepository alienRepository;
    @RequestMapping("/home")
    public String show(){
        return "home.jsp";
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        alienRepository.save(alien);
        return "home.jsp";
    }
    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("showAlien.jsp");
       Alien alien=alienRepository.findById(id).orElse(new Alien());
       modelAndView.addObject(alien);
        return modelAndView;
    }
    @RequestMapping("/deleteAlien")
    public String deleteAlien(@RequestParam int id){
        alienRepository.deleteById(id);
        return "home.jsp";
    }
    @RequestMapping("updateAlien")
    public String updateAlien(Alien alien){
        alienRepository.delete(alien);
        alienRepository.save(alien);
        return "home.jsp";
    }
}
