import java.util.ArrayList;  // Imports the ArrayList class for dynamic array functionality
import java.util.List;       // Imports the List interface for collection operations

public class practice {     // Defines a public class named 'practice'

    public static void main(String[] args) {  // Main method - program entry point

        // Creates a new Student object instance
        Student s = new Student();
        
        // Prints the student's verification status (assumes get_verified() returns boolean/String)
        System.out.println(s.get_verified());
        
        // Sets the student's membership level to "Gold"
        s.set_membership("Gold");
        
        // Prints the student's current membership level
        System.out.println(s.get_membership());

        /*
         // The following code block is commented out:
         
        // Initializes a static list of admin users in the User class
        User.admins = new ArrayList<User>();
        
        // Adds three User objects to the admins list (with names Paul, You, Jacob)
        User.admins.add(new User("Paul"));
        User.admins.add(new User("You"));
        User.admins.add(new User("Jacob"));

        // Calls a static method to print all admin names
        User.print_admin_names();

        */
        
    }  // End of main method
}  // End of practice class
