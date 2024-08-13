package com.NetPrice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class NetPrice_Controller {
	@Autowired
	RestTemplate add;
	
	@GetMapping(value ="/find_netPrice")
	public List<Product> get_netPrice() {
		String url_1 = "http://localhost:8080/getAll";
		String pes_url = "http://localhost:8081/get_hsnCode/";
ResponseEntity<List<Product>> re = add.exchange(url_1, HttpMethod.GET ,null , 
		new ParameterizedTypeReference<List<Product>>(){});
List<Product> prods = re.getBody();
prods.forEach(X -> {
	int hsn = X.getHsnCode();
	ResponseEntity<Integer> re2 = add.exchange(pes_url + hsn,HttpMethod.GET ,null, Integer.class);
	Integer per = re2.getBody();
	int net_Price = X.getPrice() +(X.getPrice() * per /100);
	X.setPrice(net_Price);
});
return prods;

		
	}
	
	
	
}
