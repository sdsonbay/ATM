import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        String correctUsername = "admin";
        String correctPassword = "pass";
        int right = 3;
        int balance = 1500;
        int select;
        Scanner scanner = new Scanner(System.in);

        while(right > 0){
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();

            if(username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Welcome to the Bank!");
                do{
                    System.out.println("1- Deposit\n" +
                            "2- Withdraw\n" +
                            "3- Check Balance\n" +
                            "4- Log Out");
                    System.out.println("Select an operation");
                    select = scanner.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Amount: ");
                            int price = scanner.nextInt();
                            if(price >= 0){
                                balance += price;
                                System.out.println("New Balance: " + balance);
                            }else{
                                System.out.println("You entered a negative number.");
                            }
                            break;
                        case 2:
                            System.out.println("Amount: ");
                            int amount = scanner.nextInt();
                            if(amount <= 0){
                                balance -= amount;
                                System.out.println("New Balance: " + balance);
                            }else{
                                System.out.println("You cannot withdraw this amount.");
                            }
                            break;
                        case 3:
                            System.out.println("Balance: ");
                            break;
                        case 4:
                            System.out.println("See you!");
                            break;
                        default:
                            System.out.println("Unknown operation.");
                            break;
                    }
                } while(select != 4);
            }else{
                right--;
                System.out.println("Invalid username or password. Please try again.");
                if(right == 0){
                    System.out.println("Your account blocked after too many incorrect tryings.");
                }else{
                    System.out.println("Remaining times: " + right);
                }
            }
        }
    }
}
