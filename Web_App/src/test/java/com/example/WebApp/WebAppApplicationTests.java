package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebAppApplicationTests {
	
	@Autowired
	Wep_AppCont wa;

	@Test
	void contextLoads() {
	}
	
@Test
public String get() {
	assertNotNull(wa.get_junit());
	return null;
}

private void assertNotNull(String string) {
	// TODO Auto-generated method stub
	}


}
