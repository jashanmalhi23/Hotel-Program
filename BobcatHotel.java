package BobcatHotel;
import java.util.Random;
import java.util.Scanner; 
public class BobcatHotel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sing = 50.50;
		double doub = 75.00;
		double quee = 100.75;
		double king = 150.25;
		double ms = 225.50;
		
		int comp = 0;
		int stand = 30;
		int delux = 50;
		int indul = 85;
		
		double rt; // room type
		int mt; // meal cost
		double pc; // preliminary cost
		double AAA; // AAA discount
		double cd; // club discount
		double dc = 0; //discounted cost
		double tt; // total cost
		int ng; // number of guest
		int nn; // number of nights
		int amemb; // AAA member
		int cmemb; // club member
		double doff = 0; // days off
		int randNum = 0; // randnum
		Scanner kbd = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Room Options: \n 1.Single = $50.50 per night \n 2.Double = $75.00 per night \n 3.Queen = $100.75 per night \n 4.King = $150.25 per night \n 5.Master Suite = $225.50");
		System.out.println("Please enter number of guest:");
		ng = kbd.nextInt();
		System.out.println("Please enter your choice of room. Please enter 1,2,3,4,5 corresponding with the options above.");
		rt = kbd.nextInt();
		System.out.println("Please enter the number of nights you will be staying:");
		nn = kbd.nextInt();
		System.out.println("Are you an AAA Memeber (1 = Yes / 0 = No)");
		amemb = kbd.nextInt();		
		if (amemb == 1 || amemb == 0)
		System.out.println("Are you a Club Member (1 = Yes / 0 = No)");
		cmemb = kbd.nextInt();
		if (cmemb == 1) {
			randNum = rand.nextInt(10) + 0;
				if (randNum >= 4)
				System.out.println("Congratulations! You've qualified for our stay four nights get one free promotion! n/ Discount wil be applied during checkout dpending on the number of days stayed.");
				else if (randNum < 4)
					System.out.println("Unfortunatley, you did not qualify for our stay four nights get one free promotion. Better luck next time!");
				if (randNum >= 4)
					doff = (int)(nn / 4);
		}
	
		if (rt == 5)
			System.out.println("Meal Packages(Prices are shown per night): \n 0.Complementary = $0 per guest \n 1.Standard = $30 per guest \n 2.Deluxe = $50 per person \n 3.Indulgence = $85 per guest \n Please select your desired meal package (enter 0/1/2/3 corresponding to the options displayed above)");
		else 
			System.out.println("Meal Packages(Prices are shown per Night): \n 0.Complementary @ $0 per guest \n 1.Standard @ $30 per guest \n 2.Deluxe @ $50 per guest \n Please enter 0/1/2 for meal package");
		mt = kbd.nextInt();
		
		switch (mt)
		{
		case 0 :
			mt = comp;
		break;
		case 1 :
			mt = stand;
		break;
		case 2 :
			mt = delux;
		break;
		case 3 :
			mt = indul;
		break;
		}
		
		//if (mt == 0)
		//	mt = comp;
		//else if (mt == 1)
		//	mt = stand;
		//else if (mt == 2)
		//	mt = delux;
		//else if (mt == 3)
		//mt = indul;
	
		if (rt == 1)
			rt = sing;
		else if (rt == 2)
			rt = doub;
		else if (rt == 3)
			rt = quee;
		else if (rt == 4)
			rt = king;
		else if (rt == 5)
			rt = ms;		
	
		pc = (rt*nn) + (mt*ng*nn);
		System.out.println("Room Cost: +" + "$" + (rt * nn));
		System.out.println("Meal Cost: +" + "$" + (mt*ng*nn) );
		System.out.println("Preliminary Total Cost: " + "$" + pc);
		tt = (rt * (nn-doff));
		cd = ((rt*nn) - (rt * (nn - doff)));
		System.out.println("********************************************************************* \n Discounts:");
		System.out.println("Club member Discount: -" + "$" + cd);
		
		AAA = (pc) * (.10);
		
		if (amemb == 1)	 
		System.out.println("AAA club member discount: -" + "$" + (float)(AAA));
		if (amemb == 0)
		System.out.println("AAA club member discount: -$0");	
		
		
		
		if (amemb == 1 && cmemb == 1)
			System.out.print("Total cost of booking: $" + (pc - AAA - cd));
			if  (amemb == 0 && cmemb == 1)
			System.out.print("Total cost of booking: $" + (pc - cd));
			if (amemb == 1 && cmemb == 0)
			System.out.print("Total cost of booking: $" +  (pc - AAA));
			if(amemb == 0 && cmemb == 0)
			System.out.print("Total cost of booking: $" + pc);
		
		
		
	}			

}	