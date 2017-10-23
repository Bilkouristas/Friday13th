import java.util.Scanner;

public class friday13 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Single or Multiple year input ?");
		System.out.println("For single year input press (s)");
		System.out.println("For multiple year input press (m)");
		while (true) {
		char selector = input.next().charAt(0);
		//Selection Zone //
		if (selector=='s') {
		System.out.println("Enter the desired year:");
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
		int month = 1;
		int feb = 1;
		
		if (year%4!=0 || ( year%100==0  & year%400!=0 ) ) {
			feb = 0;
		}
			
		System.out.println("Stay in your bed at the following dates :");
		if (extraday%7 == 0 )  {
			System.out.println("13/" + month + "/" + year );	
		} 
		month++;
		extraday += 3 ;
		if (extraday%7 == 0 ) {
			System.out.println("13/" +  month + "/" + year);
		}
		month++;
		extraday += feb;
		int c = 3 ;
		for(int i= 3; i<=8 ; i++) {			
			if (extraday%7 ==0 ) {
				System.out.println("13/" +  month + "/" + year);
			}
			extraday = extraday + 3*(i%2) - 2 * ((i%2)-1)  ; 
			month++;
			c++ ;
			if (c==8) {
				i = 3;
			}
			
		}
	
		break;
	} 
		else if (selector == 'm') { 
			System.out.println("Enter the desired years:");
			int year = input.nextInt(), year2 = input.nextInt();
			int diff ;
			int distance = year2 - year ;
			System.out.println("Stay in your bed at the following dates :");
			for (int i=0 ; i<=distance-1 ; i++) { 
			diff = year-2012;
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
			int month = 1;
			int feb = 1;
			
			if (year%4!=0 || ( year%100==0  & year%400!=0 ) ) {
				feb = 0;
			}
				
			if (extraday%7 == 0 )  {
				System.out.println("13/" + month + "/" + year );	
			} 
			month++;
			extraday += 3 ;
			if (extraday%7 == 0 ) {
				System.out.println("13/" +  month + "/" + year);
			}
			month++;
			extraday += feb;
			int c = 3 ;
			for (int j =3 ;j<=8 ; j++) { 
				if (extraday%7 ==0 ) {
					System.out.println("13/" +  month + "/" + year);
				}
				extraday = extraday + 3*(j%2) - 2 * ((j%2)-1)  ;
				month++;
				c++ ;
				if (c==8) {
					j = 3;
				}
			}
		  year += 1 ;
		} 
			
			break;
		}
		else {
			System.out.println("Try again you dumb fuck !");
		 continue;
		}
	}
}
}

