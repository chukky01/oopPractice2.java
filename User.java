import java.util.List;  // Imports List interface for collection handling

public class User {  // Defines public User class
    
    // Private instance fields (encapsulated data)
    private String _name;           // Stores user's name
    private String _membership = "Bronze";  // Stores membership level with default "Bronze"

    // Static field shared by all User instances
    public static List<User> admins;  // List to hold admin User objects (not initialized here)

    // Static method to print all admin names
    public static void print_admin_names(){
        // Loops through each User object 'u' in the static admins list
        for(User u: admins){
            System.out.println(u.get_name());  // Prints name of current admin user
        }

    }

    // Overrides default toString() to provide custom string representation
    public String toString(){
        return get_name() + " " + get_membership();  // Returns formatted "name membership"
    }

    // Custom equals() method to compare User objects
    public boolean equals(User u2){
        // Compares both name and membership fields using == (should use .equals() for strings)
        if (get_name() == u2.get_name() && get_membership() == u2.get_membership()){
            return true;  // Returns true if both match
        } else{
            return false;  // Returns false otherwise
        }
    }

    // Default constructor (no arguments)
    public User(){

    }
    
    // Constructor with name and membership parameters
    public User(String name, String membership) {
        //TODO Auto-generated constructor stub
        set_name(name);           // Sets user's name via setter
        set_membership(membership);  // Sets membership via setter
    }

    // Constructor with only name parameter (uses default membership)
    public User(String name) {
        //TODO Auto-generated constructor stub
        set_name(name);  // Sets user's name via setter
    }

    // Setter method for name (package-private access)
    void set_name(String name){
        _name = name;  // Assigns parameter to private _name field
    }

    // Getter method for name (package-private access)
    String get_name(){
        return _name;  // Returns current name value
    }

    // Setter method for membership (String version, package-private)
    void set_membership(String membership){
        _membership = membership;  // Assigns string to private _membership field
    }

    // Overloaded setter method for membership (using enum, package-private)
    void set_membership(Membership membership){
        _membership = membership.name();  // Extracts enum name as string and assigns it
    }

    // Public enum defining valid membership levels
    public enum Membership{
        Bronze, Silver, Gold;  // Three possible membership values
    }

    // Getter method for membership (package-private access)
    String get_membership(){
        return _membership;  // Returns current membership value
    }

}  // End of User class
