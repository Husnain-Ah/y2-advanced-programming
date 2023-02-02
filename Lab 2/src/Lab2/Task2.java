package Lab2;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] temp = {35,4,23,54,53,6,86,45,25};
		
		System.out.println("The original array is: ");
        for (int num : temp) {
            System.out.print(num + " ");
        }
        Arrays.sort(temp);
        System.out.println("\nThe sorted array is: ");
        for (int num : temp) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nThe minimum value is " + temp[0]);
        
        
        int max = temp.length -1;
        System.out.println("The maximum value is " + temp[max]);
       
         int sum = 0; 
            
         for (int i = 0; i < temp.length; i++)
            {sum += temp[i];}
               
        double average = (sum / temp.length);
        System.out.println("The average value is " + average );
        
	}
}
