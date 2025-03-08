import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateComparison {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter date 1 (dd-MM-yyyy) :");
		String date1 = sc.nextLine();
		LocalDate dateOne = LocalDate.parse(date1,formatter);
		System.out.println("Enter date 2 (dd-MM-yyyy) :");
		String date2 = sc.nextLine();
		LocalDate dateTwo = LocalDate.parse(date2,formatter);
		
		
		boolean ifbefore = dateOne.isBefore(dateTwo);
		boolean ifafter = dateOne.isAfter(dateTwo);
		boolean ifequal = dateOne.isEqual(dateTwo);
		
		System.out.println("Is date 1  before the date 2 ?:"+ifbefore);
		System.out.println("Is date 1 after the date 2 ?:"+ifafter);
		System.out.println("Is date 1 equal to the date 2 ?:"+ifequal);
		
	}
}