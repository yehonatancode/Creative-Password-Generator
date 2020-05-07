import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
public static void main(String []args) {
	char charToAdd;
	int numToAdd = 0;
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	   //65-90 Small capitals, 90-122 Big capitals
	//The goal is to make a password in client's desired length, randomizing without certain template.
	int passLength = s.nextInt();
	String pass ="";
	for(int i=0; i<passLength; i++) {
		int decision = (int) (Math.random()*3 +1);
		if(decision==1) { // Time to randomize a small capital letter
			
			charToAdd = (char)(r.nextInt(26) + 'a');
			pass = pass + charToAdd;
		}
		else if(decision==2) { //Randomize a Capital Letter
			charToAdd = (char)(r.nextInt(26) + 'A');
			pass = pass + charToAdd;
					
		}
		else { //Randomize a  number
				numToAdd=r.nextInt(9);
				pass = pass + numToAdd;
		}
	}
	
	System.out.println(pass);
	
	
}
}
