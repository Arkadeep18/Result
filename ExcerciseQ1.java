import java.util.*;
public class ExcerciseQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of subject 1");
		byte Subject1 = sc.nextByte();
		System.out.println("Enter the marks of subject 2");		//entering the marks of 3 subjects
		byte Subject2 = sc.nextByte();
		System.out.println("Enter the marks of subject 3");
		byte Subject3 = sc.nextByte();
		
		
		double avg = (Subject1 + Subject2 + Subject3)/3;	//calculating average
		System.out.println("Average Marks"+ avg);
		
		if(avg >= 40 && Subject1 >=33 && Subject2 >=33 && Subject3 >=33) {    //to check if the student is pass or not
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
	}

}
