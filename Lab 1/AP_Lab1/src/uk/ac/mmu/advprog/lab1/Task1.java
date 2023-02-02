package uk.ac.mmu.advprog.lab1;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; int age; String dis; String vet; String SE; String trav;
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String a = Input.next();
		name = a;
		
		System.out.println("Enter your age: ");
		int b = Input.nextInt();
		age = b;
		
		System.out.println("Are you disabled? Y/N: ");
		String c = Input.next().toUpperCase();
		dis = c;
		
		System.out.println("Are you a veteran? Y/N: ");
		String d = Input.next().toUpperCase();
		vet = d;
		
		System.out.println("Are you travelling in the South East? Y/N: ");
		String e = Input.next().toUpperCase();
		SE = e;
		
		System.out.println("Is there 2 people traveling together? Y/N: ");
		String f = Input.next().toUpperCase();
		trav = f;
		
		
		Input.close();
		
		if (dis.equals("Y")) {
			System.out.println("Hey " + name + " You should get a : Disabled Railcard");
		}
		else if (dis.equals("N")) {
			
			if (vet.equals("Y")) {
				System.out.println("Hey " + name + " You should get a : Veterans Railcard");
			}
			else if (vet.equals("N")) {
				
				if (SE.equals("Y")) {
					System.out.println("Hey " + name + " You should get a : Network Railcard");
				}
				else if (SE.equals("N")) {
					
					if (trav.equals("Y")) {
						System.out.println("Hey " + name + " You should get a : Two Together Railcard");
					}
					else if (trav.equals("N")) {
						if(age == 16 || age == 17){
							System.out.println("Hey " + name + " You should get a : 16 - 17 Saver");
						}
						else if (age > 59) {
							System.out.println("Hey " + name + " You should get a : Senior Railcard");
						}
						else if (age > 15 && age < 26) {
							System.out.println("Hey " + name + " You should get a : 16-25 Railcard");
						}
						else if (age > 25 && age < 31) {
							System.out.println("Hey " + name + " You should get a : 26-30 Railcard");
						}
						else if (age > 4 && age < 16) {
							System.out.println("Hey " + name + " You should get a : Family & Friends Railcard");
						}
						else ;
					}
				}
			}
		}
	}
}
