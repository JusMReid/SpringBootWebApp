package net.example.demo;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/*
 * TO RUN: Run Program then open http://localhost:8080 in browser
 */
//Annotate the class with @Controller
@Controller
@SpringBootApplication
public class SpringBootWebAppApplication {
	
	/*Create a mapping to URL "/"
	//This will map the home() method to this URL
	 * AKA when the browser makes a GET request to 
	 * http://localhost:8080 it will be served by this method
	 */
	@RequestMapping("/")
	//Annotate the home() method with @ResponseBody to return a 
	//response to the browser
	@ResponseBody
	String home(){
		String user = "Justin";
		return "Greetings, " + user +"!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppApplication.class, args);
	}
}
