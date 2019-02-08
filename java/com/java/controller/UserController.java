package com.java.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.bll.IUserService;
import com.java.bll.IUserService2;
import com.java.entity.User;

@Controller  
@RequestMapping("/user")  
public class UserController {
	private static Logger log=LoggerFactory.getLogger(UserController.class);
	
	
	 @Resource  
     private IUserService userService;
	 @Resource(name="UserServiceForOracleImpl")
     private IUserService2 userService2;     
	 
	 	@RequestMapping(value="/test")  
	    public String test(HttpServletRequest req,HttpServletResponse res){  
	 		String userid=req.getParameter("id");
	 		if(userid!=null){
	 			 User user = this.userService.getUserById(userid);  
	 			 System.out.println(user);
	 			 if(user!=null){
	 				  log.debug(user.toString());
	 			 }
	 	        if(userid.equals("all")){
	 	        	List list=userService.selall(userid);
	 	        }
	 		}
	 		
	        return "/index.jsp";  
	    }  
	 	@RequestMapping(value="/test2")  
	    public String test2(HttpServletRequest req,HttpServletResponse res){  
	 		String userid=req.getParameter("id");
	 		if(userid!=null){
	 			 User user = this.userService2.getUserById(userid);  
	 			 System.out.println(user);
	 			 if(user!=null){
	 				  log.debug(user.toString());
	 			 }
	 	        if(userid.equals("all")){
	 	        	List list=userService2.selall(userid);
	 	        }
	 		}
	 		
	        return "/index.jsp";  
	    }  
}
