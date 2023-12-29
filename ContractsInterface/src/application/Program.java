package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do Contrato");
		System.out.println("Número: ");
		int number = scan.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(scan.next());
		System.out.println("Valor do Contrato: ");
		double TotalValue = scan.nextDouble();
		
		Contract contract = new Contract(number, date, TotalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = scan.nextInt();
		
		
		
		
		
		scan.close();
	}

}
