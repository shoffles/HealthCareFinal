/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystem;


public class User {
    
    private String userName;
    private String userPassword;
    /* 
    User types coded by int: 
    Assistant: 1
    Nurse: 2
    Doctor: 3
    */
    private int userType;
    
    public User(String newName, String newPassword, String newUserType) {
        userName = newName;
        userPassword = newPassword;
        switch(newUserType) {
            case "Assistant" : 
                userType = 1;
                break;
                
            case "Nurse" : 
                userType = 2;
                break;
                    
            case "Doctor" :
                userType = 3;
                break;
                      
            default :    
                userType = 1;
        }
        System.out.println("User Created");
    }
    
    public boolean checkUsername(String check) {
        boolean match;
        
        if (check.equals(userName)) {
            match = true;
        } else {
            match = false;
        }
        
        return match;
    }
    
    public boolean checkPassword(String check) {
        boolean match;
        
        if (check.equals(userPassword)) {
            match = true;
        } else {
            match = false;
        }
        
        return match;
    }
    
    public int getUserType() {
        return userType;
    }
}
