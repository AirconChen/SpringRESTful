package com.fpg.ec;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Component;

@Component
@Path("/ws")
//@Consumes(MediaType.APPLICATION_JSON)
public class MyRest {

	
	@GET
	@Path("/hello")
//	@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
	public String test() throws Exception {
		return "hello";
	}
	
	@POST
	@Path("/hello2")
	@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
	public void test2(JSONObject iJSONObject) throws Exception {
		System.out.println("iJSONObject:"+iJSONObject);
	}
}
