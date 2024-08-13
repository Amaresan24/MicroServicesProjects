package com.example.electronics.respository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.electronics.enity.AC;

public interface Ac_repository extends JpaRepository<AC, Integer> {

	@Query(value = "select * from electronics.ac_value where brand = ?", nativeQuery = true)
	public List<AC> getmatch_brand(String a);

	//// ---------- using subquery ---- tofind maxprice --- and return maxprice list

	@Query(value = "select * from electronics.ac_value where price = (select max(price) from ac_value)", nativeQuery = true)
	public List<AC> getmax_price();

	@Query(value = "select brand from electronics.ac_value where length(brand) = ?", nativeQuery = true)
	public List<String> getbrand_length(int a);

	@Query(value = "select brand from electronics.ac_value where brand like 'L%?' ", nativeQuery = true)
	
	public List<String> getbrand_char(char a);
	/// ------------------------------------------------jquery
	/// ------------------starts----here----------->

	@Query(value = "select x from AC x where x.price>:n1 and x.price<:n2")
	public List<AC> getPriceRange(@Param("n1") int n1, @Param("n2") int n2);

	@Query(value = "select a from AC a where a.price>:n")
	public List<AC> getpricerange(@Param("n") int n);

	@Query(value = "select Y from AC Y where Y.isLead =:Z")
	public List<AC> get_isLead(@Param("Z") boolean a);

	@Query(value = "select K from AC K  where K.brand like  :V%")
	public List<AC> getIs_char(@Param("V") char a);

	/// --- > if you dont now dB table or any schema that time i use Jquery,
	// just keep on enity class name like that schema name that is I mention name
	/// "N,
	/// -> AC" , : -> using in matching pupose
	/// - @Param -> is identfy the passing @pathvariable that is i mention in "B"

	@Query(value = "select N from AC N where N.brand like :B")
	public List<AC> getbrand_match(@Param("B") String a);

	//// ----> i show whole items in on this query list full items
	@Query(value = "select D from AC D")
	public List<AC> getfull_iteams();

}
