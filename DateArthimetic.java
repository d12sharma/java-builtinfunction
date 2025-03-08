import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateArthimetic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter a date(dd-MM-yyyy) :");
		String input =sc.nextLine();
		LocalDate date = LocalDate.parse(input,formatter);
		LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
		
		LocalDate finalresult =modifiedDate.minusWeeks(3);
		
		System.out.println("The result of date after modification is :"+finalresult.format(formatter));
		
		
	}
}	