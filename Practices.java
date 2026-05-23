import java.util.Scanner;

public class Practices{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int day= input.nextInt();
        
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
            }
        
    }
}