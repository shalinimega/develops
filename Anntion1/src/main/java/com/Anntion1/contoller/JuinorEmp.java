package com.Anntion1.contoller;

import org.springframework.stereotype.Component;

@Component("juinor")
public class JuinorEmp  implements Emp{
	public String msg()
	{
		return "welcome office";
	}
}
