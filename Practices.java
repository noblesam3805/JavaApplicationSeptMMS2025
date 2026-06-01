import java.util.Scanner;
import java.util.ArrayList;

public class Practices{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
		ArrayList<Integer> digits= new ArrayList<>();
		
		//get encrympted code
		System.out.println("Enter Encrypted Code");
		String encCode= input.nextLine();
		
		//split code
		for(int i=0; i<encCode.length(); i++){
			digits.add(i, encCode.charAt(i)-'0');
		}
		
		//swap code
		for(int i=0; i<digits.size()-1; i+=2){
			int temp= digits.get(i);
			digits.set(i, digits.get(i+1));
			digits.set(i+1, temp);
		}
		
		//decrypt code
		for(int i=0; i<digits.size(); i++){
			digits.set(i, (digits.get(i)+10-7)%10);
		}
		
		for(int i:digits){
			System.out.print(i);
		}
		
		//get code from user
		/***
		System.out.println("Enter Code");
		String code= input.nextLine();
		
		//split code
		for(int i=0; i<code.length(); i++){
			digits.add(code.charAt(i)-'0');
		}
		
		//swap code
		for(int i=0; i<digits.size()-1; i+=2){
			int temp= digits.get(i);
			digits.set(i, digits.get(i+1));
			digits.set(i+1, temp);
		}
		
		//encrypt code
		for(int i=0; i<digits.size(); i++){
			int temp=(digits.get(i)+7)%10;
			digits.set(i, temp);
		}
		
		//print code
		for(int i:digits){
			System.out.print(i);
		}
**/
        /***int day= input.nextInt();
        
            if(day==1){
            System.out.println("day is: Sunday");
            }
            else if(day==2){
            System.out.println("day is: Monday");
            }
             else if(day==3){
            System.out.println("day is: Tuesday");
            }
            else if(day==4){
            System.out.println("day is: Wednesday");
            }
            else if(day==5){
            System.out.println("day is: Thursday");
            }
            else if(day==6){
            System.out.println("day is: Friday");
            }
            else if(day==7){
            System.out.println("day is: Saturday");
            }
            else{
                System.out.println("Invalid input");
            } **/
			
			/*** int sum=0;
			System.out.println("enter number(-1 to stop)");
			int number= input.nextInt();
			while(number !=-1){
				sum=sum+number;
				number=input.nextInt();
			}
        System.out.println(sum); **/
		
		
			

			/*** for (int row = 1; row <= 8; row++) {

            // If row is even, start with a space
            if (row % 2 == 0) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 8; col++) {
                System.out.print("* ");
            }

            System.out.println();
        } **/
    


    }
}


