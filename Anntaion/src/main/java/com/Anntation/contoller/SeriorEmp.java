package com.Anntation.contoller;

import org.springframework.stereotype.Component;

@Component("senior")
public class SeriorEmp  implements Emp{
	public String getmsg()
	{
		return "this is senior";
	}

}
