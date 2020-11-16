public class Strings {
  public static void main(String[] args) {
      String greeting = "Hello World";
      System.out.println(greeting);

/* A string in java is actually an object which contains methods that can perform certain operations on strings.
For example, the length of a string can be found with teh length() method */

  String txt = "adjfaklfasl;jdfas";
  System.out.println("The Length of the string is: " + txt.length());


  // String.indexOf()
  String txt2  = "Please  where locate occurs!";
  System.out.println(txt2.indexOf("locate"));

  //Concatenate
  String FirstName = "John";
  String LastName = "Doe";
  System.out.println(FirstName + " " + LastName);

  System.out.println("Concat Test: ");

  System.out.println(FirstName.concat(LastName)); 



  }


}
