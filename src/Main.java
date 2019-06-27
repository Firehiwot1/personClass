import java.util.ArrayList;
import java.util.Scanner;
public class Main {

        public static void main(String[] args){
            ArrayList<Person> persons=new ArrayList<>();
            Scanner keyboard=new Scanner(System.in);
            String answer;

            do {
                Person thePerson=new  Person();
                String PersonName;
                System.out.println("Enter your name");
                PersonName=keyboard.nextLine();
                thePerson.setName(PersonName);

                System.out.println("Enter your email");
                String PersonEmail;
                PersonEmail=keyboard.nextLine();
                thePerson.setEmail(PersonEmail);

                System.out.println("Enter your favorite Color");
                String PersonFavoriteColor;
                PersonFavoriteColor=keyboard.nextLine();
                thePerson.setFavoriteColor( PersonFavoriteColor);


                System.out.println("Do you want to add another person?" + "\n(yes/no)");
                answer = keyboard.nextLine();


            } while (answer.equalsIgnoreCase("yes"));
        }
    }



