package com.fpg.ec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fpg.ec.model.Student;

@Controller
@RequestMapping("/ws")
//@Consumes(MediaType.APPLICATION_JSON)
public class MyRest {

	/**
	 * 在Controller的某个方法上加@ResponseBody注解，
	 * 表示该方法的返回结果直接写入HTTP response body中。 
	 * @return
	 */
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	@ResponseBody
	public Student test(){
		Student theStudent = new Student();
		theStudent.setName("longZero");
		theStudent.setGender("Male");
		return theStudent;
	}
	
	/**
	 *  将HTTP request context convert to HttpMessageConverter
	 * @param theStudent
	 */
	@RequestMapping(value="/hello2", method = RequestMethod.POST)
	public @ResponseBody void test2(@RequestBody Student theStudent){
		System.out.println("theStudent.name:"+theStudent.getName());
		System.out.println("theStudent.gender:"+theStudent.getGender());
	}
}
