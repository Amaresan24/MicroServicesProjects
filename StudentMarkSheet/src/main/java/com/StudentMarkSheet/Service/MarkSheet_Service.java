package com.StudentMarkSheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMarkSheet.Dao.MarkSheet_Dao;
import com.StudentMarkSheet.Entity.MarkSheet;

@Service
public class MarkSheet_Service {
	@Autowired
	MarkSheet_Dao md;

	public String post_Mark(MarkSheet a) {
		// TODO Auto-generated method stub
		int sem1_total = a.getSem1Practicals() + a.getSem1Theory();
		int sem2_total = a.getSem2Practicals() + a.getSem2Theory();
		a.setSem1Total(sem1_total);
		a.setSem2Total(sem2_total);
		return md.post_Mark(a);
	}

	public List<MarkSheet> getStudent_mark() {
		// TODO Auto-generated method stub
		return md.getStudent_mark();
	}

}
