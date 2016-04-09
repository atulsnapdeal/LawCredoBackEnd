package com.snapdeal;


import maincontroller.BeanIntializer;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import dao.DaoForAppointment1;
import dao.ObjectToDataBase;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		public String hello(ModelMap model) {
			System.out.println("atul");
			System.out.println("irfan");
			model.addAttribute("msg", "JCG Hello World!");
			return "helloworld";
		}
		
		@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
		public String displayMessage(@PathVariable String msg, ModelMap model) {
			model.addAttribute("msg", msg);
			return "helloworld";
		}
		
		
		    @RequestMapping(value = "/appointmentService", method =  RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		    public @ResponseBody Appointment saveAppointmentToDB(@RequestBody Appointment appointment)
		    { 
		    	
		    	System.out.println("inAppointment");
		    	 DaoForAppointment1 dfa = (DaoForAppointment1)BeanIntializer.ctx.getBean("appointmentDao");
		    	 dfa.saveEmployee(appointment);
		    	
		   /*    ObjectToDataBase otd = new ObjectToDataBase();
		       Appointment appointmentSaved = (Appointment)otd.saveObjectToDatabase(appointment);*/
		        return null;
		}
		    
		    
		    @RequestMapping(value = "/login", method =  RequestMethod.POST)
		    public @ResponseBody Registration saveRegistrationToDB(Registration registration)
		    { 
		    	
		    System.out.println("inRegistration");
		    return registration;
		   
		    
		}
		    
		    
		
	}