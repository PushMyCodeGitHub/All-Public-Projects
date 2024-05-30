package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/reservation")
@Controller
public class Mycontroller {
	
	   @RequestMapping("/bookingForm")
	     public String bookingForm(Model model) {
		   //create resvetion object to model
		       Reservation r1=new Reservation();
		   //privide reservation object to model 
		        model.addAttribute("reservation" ,r1);
		        
	    	  return "reservation-page";
	     }
	   
	   @RequestMapping("/submitForm")
	   public String submitForm(@ModelAttribute("reservation")  Reservation r1) {
		     return "confirmation-form";
	   }

}
