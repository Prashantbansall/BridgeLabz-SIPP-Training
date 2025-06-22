package javaBuiltInFunction;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class TimeZones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("GMT: " + gmt.format(formatter));
        System.out.println("IST: " + ist.format(formatter));
        System.out.println("PST: " + pst.format(formatter));
	}

}
