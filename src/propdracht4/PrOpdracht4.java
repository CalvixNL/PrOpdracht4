/**
 * Class: IG105 Java Comprehensive <br />
 * Instructor: P Rats  <br />
 * Description:This code will throw Die untill a 6 is thrown.  <br />
 * Due: 9/31/2014 </ br>
 * I pledge that I have completed the programming assignment independently. <br />
   I have not copied the code from a student or any source. <br />
   I have not given my code to any student. <br />
   <br />
   Sign here: Calvin Sammarone <br />

 */

package propdracht4;
import java.util.Scanner;
public class PrOpdracht4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This symbol needs to represent the eyes of the dice:");
        String scanner = input.next();
        char ch = scanner.charAt(0);
        double eyeNumber;
        //Declare a Loop that will randomly generate a Die and print the number of eyes after every try.
         for (eyeNumber = Math.random() * (6-1) + 1; eyeNumber == 6;eyeNumber = Math.random() * (6-1) + 1){
         
            if (eyeNumber == 1){
                System.out.println(ch);
            }
            if (eyeNumber == 2){
                System.out.println(ch + "\n\n\t\t" + ch);
            }
            if (eyeNumber == 3){
                System.out.println(ch + "\n\t" + ch + "\n\t\t" + ch);
            }
            if(eyeNumber == 4){
                System.out.println(ch + "\t\t" + ch + "\n\n" + ch + "\t\t" + ch);
            }
            if(eyeNumber == 5){
                System.out.println(ch + "\t\t" + ch + "\n\t" + ch + "\n" + ch + "\t\t" + ch);
            }
            if(eyeNumber == 6) {
                System.out.println(ch+"\t\t"+ch+"\n"+ch+"\t\t"+ch+"\n"+ch+"\t\t"+ch);
            }
    }
    
}
}
