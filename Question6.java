//Sarfraz Ali soomro.
// Roll num:94


//Create a restaurant manu in switch case where if we select any option the program should the price of that food item....



import java.util.*;
class Question6{
	public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println(" Welcom to Safi Restaurant & Bar be Q....");
	System.out.println(" ");
	System.out.println("This is manu: \n \n1)Burger with fies.\n2)Zinger Burger.\n3)Chat shola.\n4)Chicken karahi.\n5)White chiken karahi.\n6)Beaf pulao.\n7)special chai.\n8)Cold Drinks.");
System.out.println("\nPlease order! Would you wanna know prize about items\n" +
 " Enter the number of item.. ");
     int z=ob.nextInt();
	switch(z){
		case 1:
	 	System.out.println("Per Burgur with fries. \f Rs.500.0"); 
		break;
		case 2:
		 System.out.println("Per Zinger Birgur. \f Rs.450.0"); 
		 break;
		 	case 3:
	 	System.out.println("Per chat shola plate.\f Rs.150.0"); 
	 	break;
	 		case 4:
	 	System.out.println("Chicken karahi\f Rs.1200.0"); 
	 	break;
	 		case 5:
	 	System.out.println("White karahi.\f Rs.1300.0"); 
	 	break;
	 		case 6:
	 	System.out.println("Beaf pulao plate.\f Rs.400.0"); 
	 	break;
	 		case 7:	
	 	System.out.println("Special chai one cup.\f Rs.120"); 
	 	break;
	 		case 8:
	 	System.out.println("250ml Cold Drinks.\fRs.80"); 
		default:
		System.out.println("Sorry, This item is not available. please select among above items..");
	}
	System.out.print("\"Thanx for coming..\" \fHave a good Day!");                                                                                                                                       	                		
	}
}
