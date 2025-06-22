package javaMethods;


public class SpringSeason {
	
	public static boolean isSpringSeason(int month, int day) {
		if((month == 3 && day >= 20) || (month == 6 && day <= 20)) {
			return true;
		}
		if(month == 4 || month == 5) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		if(isSpringSeason(month,day)) {
			System.out.println("It's a Sprinng Season.");
		} else {
			System.out.println("Not a Spring Season.");
		}
	}

}
