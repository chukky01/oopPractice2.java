public class Student extends User {  // Defines a Student class that inherits from User class
    private boolean _verified = false;  // Private boolean field to track verification status, defaults to false

    // Setter method for verification status (package-private access)
    void set_verified(boolean verified){
        _verified = verified;  // Assigns parameter value to private _verified field
    }

    // Getter method for verification status (package-private access)
    boolean get_verified(){
        return _verified;  // Returns current verification status
    }
        
}  // End of Student class
