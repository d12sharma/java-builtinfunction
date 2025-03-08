import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

	class DateFormatting {
		public static void main(String[] args){
			
			LocalDate date = LocalDate.now();
			DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.println("format 1:"+date.format(formatter1));
			DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			System.out.println("format 2 :"+date.format(formatter2));
			DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy ");
			System.out.println("format 3 :"+date.format(formatter3));
			
			
		}
	}