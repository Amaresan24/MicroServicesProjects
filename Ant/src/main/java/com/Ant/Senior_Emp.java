package com.Ant;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Senior_Emp implements Employee {

	public String  get_mes() {
		return "hai world";
	}

}
