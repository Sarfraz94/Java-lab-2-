//Sarfraz Ali soomro.
// Roll num:94

// create a login interface where user inputs its email and password to read direct on welcom screen..NOTE: where atleat 5 users should be registered we can compare their emails and password, user's detail must be stored in multi dimensional arry.

import java.util.*;
class Question5{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
	String password,email;
		String [][] arry= new String[2][5];
		arry[0][0]="Sarfraz21@gmail.com";  
		arry[0][1]="saR21";
		arry[0][2]="Star@gmail.com";
		arry[0][3]="GkoO10";
		arry[0][4]="Ali110@gmail.com";
		arry[1][0]="110alI";
		arry[1][1]="hello56@gmail.com";
		arry[1][2]="105good";			
		arry[1][3]="boy88@gmail.com";
		arry[1][4]="inocEnt10";
		System.out.println("<Welcom on sarfraz Website>");
		System.out.println("Enter the Email: ");
	email=ob.nextLine();
		if(email.equalsIgnoreCase(arry[0][0])|| email.equalsIgnoreCase(arry[0][2])||email.equalsIgnoreCase(arry[0][4])|| email.equalsIgnoreCase(arry[1][1])||email.equalsIgnoreCase(arry[1][3])){
			System.out.println(" Enter the password:");
			password=ob.nextLine();
			if(password.equals(arry[0][1]) && email.equalsIgnoreCase(arry[0][0]) || password.equals(arry[0][3]) && email.equalsIgnoreCase(arry[0][2]) ||password.equals(arry[1][0]) && email.equalsIgnoreCase(arry[0][4]) ||password.equals(arry[1][2])&&email.equalsIgnoreCase(arry[1][1]) ||password.equals(arry[1][4])&&email.equalsIgnoreCase(arry[1][3])){
				System.out.print("Welcom on the page..");
			}
			else
			{
				System.out.print("Invaild password");
			}	
			}
			else
			{
				System.out.print("Sorry, Email is not registered..");
			}			
	
}

}