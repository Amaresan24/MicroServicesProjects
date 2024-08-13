//package com.StudentResults.Controller;
//
//public class check {
//
//
//
//package com.onesoft.studentResults.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.onesoft.studentResults.entity.MarkSheet;
//import com.onesoft.studentResults.entity.Results;
//import com.onesoft.studentResults.entity.Student;
//import com.onesoft.studentResults.service.ResultsService;
//
//@RestController
//public class ResultsController {
//	
//	@Autowired
//	RestTemplate rt;
//	@Autowired
//	ResultsService rs;
//
//	@GetMapping("resViaStu")
//	public List<Student> resViaStu(){
//		String url ="http://localhost:8080/getAll";
//		
//		ResponseEntity<List<Student>> res= rt.exchange(url,HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>> () {});
//		List<Student> x = res.getBody();
//		return x;
//	}
//	
//	@GetMapping("resViaMark")
//	public List<MarkSheet> resViaMark(){
//		String url ="http://localhost:8081/getAll";
//		ResponseEntity<List<MarkSheet>> res = rt.exchange(url,HttpMethod.GET, null, new ParameterizedTypeReference<List<MarkSheet>>() {});
//		List<MarkSheet> m =res.getBody();
//		return m;
//	}
//	
//	@GetMapping("getResult")
//	public List<Results> getResult(){
//		List<Student> a = resViaStu();
//		List<MarkSheet> b = resViaMark();
//		
//		List<Results> res = new ArrayList<>();
//		for(int i=0;i <a.size();i++) {
//			int id = a.get(i).getId();
//			String name = a.get(i).getName();
//			int roll_number = a.get(i).getRollNumber();
//			int total_marks =0;
//			if(a.get(i).getAttendance()>90) {
//				total_marks=(5+(b.get(i).getSem1_total()+b.get(i).getSem2_total())/2);
//			}
//			else {
//				total_marks =((b.get(i).getSem1_total()+b.get(i).getSem2_total())/2);
//			}
//			int percentage =total_marks/2;
//			
//			res.add(new Results( id, roll_number,name, total_marks, percentage));
//		}
//		return res;
//	}
//	
//	@PostMapping("setResult")
//	public String setResult() {
//		List<Results> x =getResult();
//		return rs.setResult(x);
//	}
//	
//	@GetMapping("getToper")
//	public String getToper() {
//		return rs.getToper();
//	}
//	@GetMapping("getTop3")
//	public List<String> getTop3() {
//		return rs.getTop3();
//	}
//	@GetMapping("getByRange")
//	public List<String> getByRange() {
//		return rs.getByRange();
//	}
//	
//	
//
//}
//-------------------------------------------------------------------------
//-----------------------------Service ---------------
//package com.onesoft.studentResults.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.onesoft.studentResults.dao.ResultsDao;
//import com.onesoft.studentResults.entity.Results;
//
//@Service
//public class ResultsService {
//	
//	@Autowired
//	ResultsDao rd;
//
//	public String setResult(List<Results> x) {
//		// TODO Auto-generated method stub
//		return rd.setResult(x);
//	}
//
//	public String getToper() {
//		// TODO Auto-generated method stub
//		return rd.getToper();
//	}
//
//	public List<String> getTop3() {
//		// TODO Auto-generated method stub
//		return rd.getTop3();
//	}
//
//	public List<String> getByRange() {
//		// TODO Auto-generated method stub
//		return rd.getByrange();
//	}
//}
//----------------------------------------------------------------
//                             dao
//package com.onesoft.studentResults.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.onesoft.studentResults.entity.Results;
//import com.onesoft.studentResults.repositary.ResultsRepositary;
//
//@Repository
//public class ResultsDao {
//	
//	@Autowired
//	ResultsRepositary rr;
//
//	public String setResult(List<Results> x) {
//		// TODO Auto-generated method stub
//		rr.saveAll(x);
//		return "Sucess Kamal";
//	}
//
//	public String getToper() {
//		// TODO Auto-generated method stub
//		return rr.getToper();
//	}
//
//	public List<String> getTop3() {
//		// TODO Auto-generated method stub
//		return rr.getTop3();
//	}
//
//	public List<String> getByrange() {
//		// TODO Auto-generated method stub
//		return rr.getByRange();
//	}
//}
//---------------------------------------------------------------
//
//Resposistory
//package com.onesoft.studentResults.repositary;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import com.onesoft.studentResults.entity.Results;
//
//public interface ResultsRepositary extends JpaRepository<Results, Integer> {
//
//	@Query(value = "select name from student_result.results where percentage=(select max(percentage) from results)", nativeQuery = true)
//	String getToper();
//	@Query(value="select name from results order by percentage desc limit 3",nativeQuery=true)
//	List<String> getTop3();
//	@Query(value="select name from results where percentage>80 and percentage<=90",nativeQuery=true)
//	List<String> getByRange();
//
//}
//---------------------------------------------------
//enity MarkSheet ---pojo
//
//package com.onesoft.studentResults.entity;
//
//public class MarkSheet {
//	
//	private int id;
//	private int roll_number;
//	private int sem1_theory;
//	private int sem1_practical;
//	private int sem1_total;
//	private int sem2_theory;
//	private int sem2_practical;
//	private int sem2_total;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getRoll_number() {
//		return roll_number;
//	}
//	public void setRoll_number(int roll_number) {
//		this.roll_number = roll_number;
//	}
//	public int getSem1_theory() {
//		return sem1_theory;
//	}
//	public void setSem1_theory(int sem1_theory) {
//		this.sem1_theory = sem1_theory;
//	}
//	public int getSem1_practical() {
//		return sem1_practical;
//	}
//	public void setSem1_practical(int sem1_practical) {
//		this.sem1_practical = sem1_practical;
//	}
//	public int getSem1_total() {
//		return sem1_total;
//	}
//	public void setSem1_total(int sem1_total) {
//		this.sem1_total = sem1_total;
//	}
//	public int getSem2_theory() {
//		return sem2_theory;
//	}
//	public void setSem2_theory(int sem2_theory) {
//		this.sem2_theory = sem2_theory;
//	}
//	public int getSem2_practical() {
//		return sem2_practical;
//	}
//	public void setSem2_practical(int sem2_practical) {
//		this.sem2_practical = sem2_practical;
//	}
//	public int getSem2_total() {
//		return sem2_total;
//	}
//	public void setSem2_total(int sem2_total) {
//		this.sem2_total = sem2_total;
//	}
//	
//}
//-------------------------------------------
//
//Entity ------------------------Student-----------
//package com.onesoft.studentResults.entity;
//
//public class Student {
//	
//	private int id;
//	private String name;
//	private  int rollNumber;
//	private String gender;
//	private int age;
//	private String course;
//	private int attendance;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getRollNumber() {
//		return rollNumber;
//	}
//	public void setRollNumber(int rollNumber) {
//		this.rollNumber = rollNumber;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getCourse() {
//		return course;
//	}
//	public void setCourse(String course) {
//		this.course = course;
//	}
//	public int getAttendance() {
//		return attendance;
//	}
//	public void setAttendance(int attendance) {
//		this.attendance = attendance;
//	}
//}
//---------------------------------Results Enity
//package com.onesoft.studentResults.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="results")
//public class Results {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private int roll_number;
//	private String name;
//	private int total_marks;
//	private int percentage;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getRoll_number() {
//		return roll_number;
//	}
//	public void setRoll_number(int roll_number) {
//		this.roll_number = roll_number;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getTotal_marks() {
//		return total_marks;
//	}
//	public void setTotal_marks(int total_marks) {
//		this.total_marks = total_marks;
//	}
//	public int getPercentage() {
//		return percentage;
//	}
//	public void setPercentage(int percentage) {
//		this.percentage = percentage;
//	}
//	public Results() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Results(int id, int roll_number, String name, int total_marks, int percentage) {
//		super();
//		this.id = id;
//		this.roll_number = roll_number;
//		this.name = name;
//		this.total_marks = total_marks;
//		this.percentage = percentage;
//	}
//	
//}
//
//MsTask.txt
//Displaying MsTask.txt.
//}
