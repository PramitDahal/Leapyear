package javaintro;

public class Leapyear {

	public static void main(String[] args) {
		int year = 2024;
		
		if (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println(year+" is an leap year");
		}else {
			System.out.println(year+" is not ans leap year");
		}
	}

}
