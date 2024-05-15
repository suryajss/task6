package com.demo.uppercase;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgecalCulator {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your birthdate (yyyy-mm-dd");
		String brthdateString = sc.next();
		LocalDate birthdate =LocalDate.parse(brthdateString);
		LocalDate currentDate =LocalDate.now();
		Period period = Period.between(birthdate, currentDate);
		
		System.out.println("your age is"+ period.getYears()+"years"+period.getMonths()+"months,and"+period.getDays()+"days");
		sc.close();
		
		
	}

}
