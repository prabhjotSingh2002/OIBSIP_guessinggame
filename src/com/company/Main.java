package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int score=0;
        boolean b= true;
        while (b) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter min range\t\t\tcurrent score:"+score);
            int min = sc.nextInt();
            System.out.println("enter max range\t\t\tcurrent score:"+score);
            int max = sc.nextInt();

            System.out.println("for how many trials do you wish to play game");
            int t = sc.nextInt();
            int generatednum = (int) (Math.random() * (max - min + 1) + min);
//            System.out.println("generated number" + generatednum);
            for (int i = 0; i < t; i++) {
                System.out.println("enter guessed number");
                int guessnum = sc.nextInt();
                if (generatednum > guessnum) {
                    System.out.println("it is lower than generated number ,try again\t\t\tcurrent score:"+score);
                } else if (generatednum < guessnum) {
                    System.out.println("it is higher  than generated number,try again\t\t\tcurrent score:"+score);
                } else if(generatednum == guessnum) {
                    score++;
                    System.out.println("You have guessed the correct number,congrats you have won\t\t\tcurrent score:"+score);

                    break;
                }
            }
            System.out.println("Do you want to play again  \n enter Yes ,else No");
            String str= sc.next();
            if(str.equalsIgnoreCase("yes")||str.equalsIgnoreCase("y")){
                b=true;
            }else {
               b=false;
            }
        }
    }
}
