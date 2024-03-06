package com.Anntion1.contoller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("senior")
public class Senior implements Emp{
	public String msg()

	{
		return "this senior";
	}
}
