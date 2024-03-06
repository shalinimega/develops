package com.Anntation.contoller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("junior")
public class JuniorEmp  implements Emp{
	public String getmsg()
	{
		return "This is junior";
	}

}
