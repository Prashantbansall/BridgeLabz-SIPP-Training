package level1ControlFlowPrograms;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
            System.out.println("Please provide two integer arguments: month and day.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid month or day. Please provide valid inputs.");
            return;
        }

        boolean isSpring = false;

        if (month == 3) {
            if (day >= 20) {
                isSpring = true;
            }
        } else if (month == 4 || month == 5) {
            isSpring = true;
        } else if (month == 6) {
            if (day <= 20) {
                isSpring = true;
            }
        }

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
	}

}
