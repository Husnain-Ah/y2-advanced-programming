package uk.ac.mmu.advprog.lab1;

public class UnitMark {
	
	
		double Coursework1; double Coursework2;
		
		public UnitMark(double Coursework1, double Coursework2) {
			this.Coursework1 = Coursework1;
			this.Coursework2 = Coursework2;
		}
		
		double calculateUnitGrade() {
			double averageGrade = (Coursework1+Coursework2)/2;
			return averageGrade;
		}
		
		String calculateUnitClassification(UnitMark a) {
			
			if (calculateUnitGrade() > 70) {
				return "I";
			}
			else if (calculateUnitGrade() > 59 && calculateUnitGrade() < 71) {
				return "II (I)";
			}
			else if (calculateUnitGrade() > 49 && calculateUnitGrade() < 60) {
				return "II (II)";
			}
			else if (calculateUnitGrade() > 39 && calculateUnitGrade() < 50) {
				return "III";
			}
			else  {
				return "Fail";
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			UnitMark A = new UnitMark(34,67);
			UnitMark B = new UnitMark(31,27);
			UnitMark C = new UnitMark(24,65);
			UnitMark D = new UnitMark(54,19);

			System.out.println("test");
			System.out.println(A.calculateUnitGrade());
			System.out.println(B.calculateUnitGrade());
			System.out.println(C.calculateUnitGrade());
			System.out.println(D.calculateUnitGrade());
		}
		
}
