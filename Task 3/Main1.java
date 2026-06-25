class User{
  private String username;
  private String email;

  public User(String username, String email){
    this.username =username;
    this.email=email;
  }
  public String getUsername(){return username;}
  public String getEmail(){return email;}
}

class EmailValidator{
  public static boolean isValid(String email){
    return email !=null && email.contains("@");
  }
}
class UserRepository {
    public void save(User user) {
        if (EmailValidator.isValid(user.getEmail())) {
            System.out.println("Connecting to database...");
            System.out.println("Saving user " + user.getUsername() + " to the users table.");
        } else {
            System.out.println("Invalid email format. User not saved.");
        }
    }
}


public class Main {
  public static void main(String[] args){
    System.out.println("======= Task 1: SRP =======");

    User user = new User("john_doe","jhon@example.com");
    UserRepository repo = new UserRepository();
    repo.save(user);
  }
}
