package javaMethods;
import java.util.HashSet;

public class OTPGenerator {
	
	 public static int generateOTP() {
	        return (int) (Math.random() * 900000) + 100000;
	    }

	    public static int[] generateMultipleOTPs(int count) {
	        int[] otps = new int[count];
	        for (int i = 0; i < count; i++) {
	            otps[i] = generateOTP();
	        }
	        return otps;
	    }

	    public static boolean areOTPsUnique(int[] otps) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int otp : otps) {
	            if (!set.add(otp)) {
	                return false;
	            }
	        }
	        return true;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] otps = generateMultipleOTPs(10);
        for (int otp : otps) {
            System.out.println(otp);
        }
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
	}

}
