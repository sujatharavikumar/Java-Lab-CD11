package Ravikumar.Sujatha.Greeting;

import java.util.Scanner;

/**
 * Created by sujatharavikumar on 9/9/16.
 */
public class Greeting {

    public void checkName(String name){
        if (name != null){

            if (name.equals("Alice")){
                System.out.println("Hello Alice");
            }
            else if (name.equals("Bob")){
                System.out.println("Hello Bob");
            }
            else{
                System.out.println("Hello User");
            }
        }
    }

    public static void main(String args[]){

        Greeting greetingObj = new Greeting();
        Input inputObj = new Input();
        System.out.println("Enter a name: ");
        String name = inputObj.getStringInput();
        greetingObj.checkName(name);

    }

}
