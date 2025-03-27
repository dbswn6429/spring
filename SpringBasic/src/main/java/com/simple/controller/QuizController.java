package com.simple.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@RequestMapping("/quiz01")
	public String quiz01() {
		
		return "quiz/quiz01";
	}
	
	@RequestMapping("/join")
	public ModelAndView quiz01_ok(@RequestParam("id") String id,
	        					  @RequestParam("pw") String pw,
	        					  @RequestParam("name") String name,
	        					  @RequestParam("email") String email) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id );
		mv.addObject("pw", pw);
		mv.addObject("name", name );
		mv.addObject("email", email);
		mv.setViewName("quiz/quiz01_ok");  //뷰에 대한 정보
		
		return mv;
	
	}
	
	
	@RequestMapping("/result")
	public String quiz02() {
		return "quiz/result";
	}
	
	@RequestMapping("/birthday")
    public String birthday(@ModelAttribute("year") String year, 
                         @ModelAttribute("month") String month, 
                         @ModelAttribute("day") String day, 
                         @ModelAttribute("msg") String msg, 
                         RedirectAttributes ra) {
		String myMsg = year + "-" + month + "-" + day + " " + msg;
		System.out.println(myMsg);
       
       ra.addFlashAttribute("msg", msg);
       return "redirect:/quiz/result";
    }
 
}
