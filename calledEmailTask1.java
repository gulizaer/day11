public class calledEmailTask1 {
    public static void main(String[] args) {

    String email = "mike_tyson@gmail.com";

    String firstnam= email.substring(0,email.indexOf("_"));
    String lastname= email.substring(email.indexOf("_")+1)email.indexOf("@"));
    String result = email.substring(email.indexOf("@)"));
    email= lastname+"_" + firstnam + result;

    System.out.println(email);




        /*
         Create a class calledEmailTask1.
      Assume that email address is constructed by person's
      first name and followed by an underscore and last name.

    Write a program that can swap first name with last name
    in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
         */

    }



}
