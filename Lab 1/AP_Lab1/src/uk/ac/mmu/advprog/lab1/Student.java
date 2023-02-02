package uk.ac.mmu.advprog.lab1;
//import java.util.ArrayList;

public class Student {
	
	String Student;
	UnitMark[] marks; 

	public Student(String string) {
		// TODO Auto-generated constructor stub
		
	}

	
	//ArrayList<UnitMark> Marks = new ArrayList<UnitMark>(); 
	
	
	
	public void setMarks(UnitMark[] mark) {
		
		this.marks = mark;
//		UnitMark [] markArray ;
		
		
	}
	
	double calculateOverallGrade()   {
		
		double total = 0;
		
		for (int i = 0; i < marks.length; i++) {
			  total += marks[i].calculateUnitGrade(); 
			} 
	
		return total/marks.length;
		
	}

}
