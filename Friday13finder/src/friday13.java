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
		    if(diff%4 != 0) {
			   k = 1;
		    }
		    extraday = (diff/4)*5 + (diff%4 + k) ;
				extraday = extraday - ((diff+11)/100); // αφαιρει τα δισεκτα που μπηκαν λαθος πριν
				extraday = extraday + ((diff+11)/400); // προσθετη αυτα που εβγαλε λαθος η προηγουμενη εντολη 
					extraday = extraday % 7 ;        // αφου τελειωσει με τις πραξεις κανει το % 7 για να βρει την εξτρα μερα 
		}
		else {
			if(diff%4 != 3) {
				k = -1;
			}
			extraday = ((diff/4)*5)+(diff%4 + k) ;
			extraday = extraday + ((diff-77)/100); // -77 ωστε η διαφορα να γινει - 100
			extraday = extraday - ((diff-377)/400); // -377 διοτι πρεπει να μετραει το 2000 σαν δισεκτο
			extraday = extraday % 7;
			extraday = 8 + extraday ;
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
		
		int month = 1;
		int feb = 1;
			if (year%4!=0 || ( year%100==0  & year%400!=0 ) ) {
			feb = 0;
		}
			
		System.out.println(extraday%7);
	
			if (extraday%7 == 0 )  {
			System.out.println("13/" + month + "/" + year );
			month++;
		} 
		extraday += feb;
			if (extraday%7 == 0 ) {
			System.out.println("13/" +  month + "/" + year);
			month++;
		}
			for(int i= 3; i<=8 ; i++) {
				int c = 3 ;
				extraday = extraday + (-1)^(i) + (5/2) + (1/2) * (-1)^(i+1) ;
					if (extraday%7 ==0 ) {
						System.out.println("13/" +  month + "/" + year);
						month++;
			}
			c++ ;
			if (c==8) {
				i = 3;
			}
			
		}
	
		
		System.out.println(day);
		System.out.println(extraday);
		
	}
	
}
