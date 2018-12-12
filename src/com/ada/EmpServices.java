package com.ada;



import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/emp")
public class EmpServices  {
	
	@POST
	@Path("/add")
	/*@Consumes(MediaType.APPLICATION_JSON)*/
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Employee> addEmp(){
		
		System.out.println("testing.....");
		String output=null;
		Employee e=new Employee();
		
	    e.setId(1);
	    e.setName("jolly");
	   
	    List<Employee> emp=new ArrayList<Employee>();
	    emp.add(e);
	  
/*		if(e.getId()!=0  && e.getName()!=null)
		{
			
		    output="Successfully add";
		}
		else
		{
			output="Error occur";
		}
	
		
		return output;
*/		return emp;
		
	}

}
