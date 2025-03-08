import java.time.*;
import java.time.format.DateTimeFormatter;



class TimeZone {
	public static void main(String [] args){
		
		String[] timeZones ={"GMT","Asia/Kolkata","America/Los_Angeles"};
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
			
			for(String zone : timeZones){
				ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zone));
				System.out.println("Current time is"+zone+": "+now.format(formatter));
				
			}
	}	
}