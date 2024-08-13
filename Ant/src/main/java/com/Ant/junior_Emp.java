 package com.Ant;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("juinor")
public class junior_Emp extends Senior_Emp {
	public String  get_mes() {
		return "Amaresh";
	}

}
