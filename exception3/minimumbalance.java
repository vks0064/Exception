package exception3;
import java.util.Scanner;
public class minimumbalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class MinimumAccountBalance extends Exception {

		    String message;

		    public MinimumAccountBalance(String message) {
		        this.message = message;
		    }

		    
		    public String toString() {
		        return message;
		    }
		}

		class UserDefinedException {

		    static double current_balance = 2000;

		    public static void main(String[] args) throws MinimumAccountBalance {
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter amount to withdrawal");
		        int n = s.nextInt();
		        try {
		            if (current_balance < n) {
		                throw new MinimumAccountBalance("Insufficient funds " + current_balance);
		            } else {
		                System.out.println("Please Take The Money : " + n);
		            }

		        } catch (MinimumAccountBalance mab) {
		            mab.printStackTrace();
		        }
		    }

		}
	}

}
