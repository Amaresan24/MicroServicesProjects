package com.StudentDetails.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.StudentDetails.CostomException.AgeNotMatch_Exception;
import com.StudentDetails.Dao.Student_Dao;
import com.StudentDetails.Entity.Student;

@Service
public class Student_Service {
	@Autowired
	Student_Dao sd;

	public String post_student(Student s) throws AgeNotMatch_Exception {
		// TODO Auto-generated method stub
		/// when you using Globel Exception we cannot used try and Catch Handler in your
		// Sevices are whole project ---
		/// because exception Handeler is given is first priorty in Try And Catch only
		// -------OK

		// try {

		if (s.getAge() > 18) {
			return sd.post_student(s);
		} else {
			throw new AgeNotMatch_Exception("Your Age Doesn`t match our Cetria");
		}

		// } catch (Exception e) {
		// return "<--------- your age is below 18 we cannot procced further -----> ";

		// }

	}

	public String postall_student(List<Student> a) {
		// TODO Auto-generated method stub
		return sd.postall_student(a);

	}

	public Student getStudent_id(int a) {
		// TODO Auto-generated method stub
		return sd.getStudent_id(a);
	}

	public List<Student> getall_Student() {
		// TODO Auto-generated method stub
		return sd.getall_Student();
	}

	public String update_student(Student s, int a) {
		// TODO Auto-generated method stub
		Student de = sd.getStudent_id(a); /// its--- find the student in given id ------
		de.setName(s.getName()); /// -------------update the student and set the Student object setter method ---
		de.setRollnumber(s.getRollnumber());
		de.setGender(s.getGender());
		de.setAge(s.getAge());
		de.setCourse(s.getCourse());
		de.setAttendance(s.isAttendance());
		sd.post_student(de); //// it is using the mathod in save purpose --------------> in

		return "<--------Student ---details -- update sucessfully----->";
	}

	public String delete_student(int a) {
		// TODO Auto-generated method stub
		return sd.delete_student(a);
	}

	public String delete_full() {
		// TODO Auto-generated method stub
		return sd.delete_full();
	}

	public List<Integer> get_att() {
		// TODO Auto-generated method stub
		return  sd.getall_Student().stream().map(X -> X.isAttendance()).toList();
	}

}
