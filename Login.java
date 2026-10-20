import java.util.Scanner;
public class Login {
    public static void main(String [] args) {

        Scanner login = new java.util.Scanner(System.in);

        String[] users = {"Kyle", "Enrick", "John", "Vincent", "Javie"};
        String[] passwords = {"Doubtedbell", "Bading", "Dunno", "123456", "ILY123"};


        System.out.println("Input Username: ");
        String search = login.nextLine();
        System.out.println("Input Password: ");
        String search1 = login.nextLine();

        for(int i = 0; i <= users.length; i++) {
            
            if(users[i].equalsIgnoreCase(search)) {
                System.out.println("Username Found: " + users[i]);
                break;
            }else {
                System.out.println("Username does not exist.");
                System.out.println("Try Again.");
                break;
            }
        }

         for(int j = 0; j <= passwords.length; j++) {

            if(passwords[j].equalsIgnoreCase(search1)) {
                System.out.println("Login Successful: " + passwords[j]);
                break;
            }else {
                System.out.println("Password is Invalid");
                System.out.println("Try Again.");
                break;
            }

    
    }


}
}
