/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Validation {
    // validate first name
   public static boolean validateFirstName( String firstName )
   {
      return firstName.matches( "[A-Z][a-zA-Z]*" );
   } // end method validateFirstName

   // validate last name
   public static boolean validateLastName( String lastName )
   {
      return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
   } // end method validateLastName

   // validate address
   public static boolean validateAddress( String address )
   {
      return address.matches( 
         "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // end method validateAddress

   // validate city
   public static boolean validateCity( String city )
   {
      return city.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // end method validateCity

   // validate state
   public static boolean validateState( String state )
   {
      return state.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
   } // end method validateState

   // validate zip
   public static boolean validateZip( String zip )
   {
      return zip.matches( "\\d{5}" );
   } // end method validateZip

   // validate phone
   public static boolean validatePhone( String phone )
   {
      return phone.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
   } // end method validatePhone
   
   public static boolean validateCourseName(String courseName) {
      return courseName.matches("[A-Za-z]+([ '-][A-Za-z]+)*");
   }
  
   
   public static boolean validateCourseCode(String courseCode)
   {
       return courseCode.matches("[C][S]-[1-9]\\d\\d");
   }
}
