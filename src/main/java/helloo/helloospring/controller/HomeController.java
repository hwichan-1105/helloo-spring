package helloo.helloospring.controller;

import helloo.helloospring.domain.Member;
import helloo.helloospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController{


    @GetMapping("/")
    public String home(){
            return "home";
    }
    @PostMapping("/a")
    public String  log(@RequestParam("id") String id, @RequestParam("password") String password, MemberForm form, Model model){
        Member member = new Member();
        if(member.setName(id) = form.getName() && member.setName(password) = form.getPassword()){
            return "/members/sucess";
        }else{
            return "redirect:/";
        }

    }

    }


