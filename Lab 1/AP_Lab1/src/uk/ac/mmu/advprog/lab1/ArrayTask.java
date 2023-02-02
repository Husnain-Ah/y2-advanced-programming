package uk.ac.mmu.advprog.lab1;

public class ArrayTask {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnitMark A = new UnitMark(34,67);
		UnitMark B = new UnitMark(31,27);
		UnitMark C = new UnitMark(24,65);
		UnitMark D = new UnitMark(54,19);
		UnitMark E = new UnitMark(39,63);
		UnitMark F = new UnitMark(31,57);
		UnitMark G = new UnitMark(84,47);
		UnitMark H = new UnitMark(64,32);
		UnitMark I = new UnitMark(14,88);
		UnitMark J = new UnitMark(38,65);
		UnitMark K = new UnitMark(21,35);
		UnitMark L = new UnitMark(24,10);
		
		System.out.println("test");
		
		System.out.println(A.calculateUnitGrade());
		System.out.println(B.calculateUnitGrade());
		System.out.println(C.calculateUnitGrade());
		System.out.println(D.calculateUnitGrade());
		
		Student Bob = new Student("Bob");
		Student Dob = new Student("Dob");
		Student Rob = new Student("Rob");
		
		UnitMark[] markArray1 = {A,B,C,D};
		UnitMark[] markArray2 = {E,F,G,H};
		UnitMark[] markArray3 = {I,J,K,L};
		
		Bob.setMarks(markArray1);
		Dob.setMarks(markArray2);
		Rob.setMarks(markArray3);
		
		System.out.println(Bob.calculateOverallGrade());
	}

}
