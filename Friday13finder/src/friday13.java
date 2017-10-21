import java.util.Scanner;

public class friday13 {

	public static void main(String[] args) {
		System.out.println("Enter the desired year:");
		Scanner input =new Scanner(System.in);
		int year = input.nextInt();
		int diff = year-2012;
		int k = 0;
		int extraday;
		
		if(diff >= 0) {
		    //int k = 1;
		    if(diff%4 != 0) {
			   k = 1;
		    }
		    extraday = (((diff/4)*5 + (diff%4 + k)) % 7);
				extraday = extraday - ((diff+12)/100)// αφαιρει τα δισεκτα που μπηκαν λαθος πριν
				extraday = extraday + ((diff+12)/400)// προσθετη αυτα που εβγαλε λαθος η προηγουμενη εντολη 
					
		}
		else {
			if(diff%4 != 3) {
				k = -1;
			}
			extraday = (((diff/4)*5)+(diff%4 + k)) % 7;
			extraday=8+extraday ;
		}
		String day = "";
		switch(extraday) {
		case 0:
			day = "Sunday";
			break;
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		case 8:
			day = "Monday";
		}
		System.out.println(day);

	}
	
}
