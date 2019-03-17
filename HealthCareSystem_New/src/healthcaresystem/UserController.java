
package healthcaresystem;


public class UserController {
    
    
    private LoginView loginView;
    private User user;
    
    public UserController() {
        this.loginView = new LoginView();
        this.user = new User("testuser", "password", "3");
        this.userTest();
    }
    
    
    public void userTest() {
        this.user.checkPassword("password");
        this.user.checkUsername("testuser");
        System.out.println("User test complete \n");
    }
}
