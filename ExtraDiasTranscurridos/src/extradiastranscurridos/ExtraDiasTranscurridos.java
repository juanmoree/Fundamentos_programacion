package extradiastranscurridos;

import java.util.Scanner;

public class ExtraDiasTranscurridos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un dia, un mes y un año DD-MM-YYYY");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		int res = 0;
		int jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov;
		jan = mar = may = jul = aug = oct = 31;
		if (year % 4 == 0)
			feb = 29;
		else
			feb = 28;
		apr = jun = sep = nov = 30;
		if (day > 0 && day < 32) {
			if (month > 0 && month <= 12) {
				if (year > 1900) {
					switch (month) {
					case 1:
						res = day;
						break;
					case 2:
						res = day + (jan);
						if (day > feb) {
							month++;
							day = day - feb;
						}
						break;
					case 3:
						res += day + (jan + feb);
						break;
					case 4:
						res = day + (jan + feb + mar);
						if (day > apr) {
							month++;
							day = day - apr;
						}
						break;
					case 5:
						res = day + (jan + feb + mar + apr);
						break;
					case 6:
						res = day + (jan + feb + mar + apr + may);
						if (day > jun) {
							month++;
							day = day - jun;
						}
						break;
					case 7:
						res += day + (jan + feb + mar + apr + may + jun);
						break;
					case 8:
						res += day + (jan + feb + mar + apr + may + jun + jul);
						break;
					case 9:
						res = day + (jan + feb + mar + apr + may + jun + jul + aug);
						if (day > sep) {
							month++;
							day = day - sep;
						}
						break;
					case 10:
						res += day + (jan + feb + mar + apr + may + jun + jul + aug + sep);
						break;
					case 11:
						res = day + (jan + feb + mar + apr + may + jun + jul + aug + sep + oct);
						if (day > nov) {
							month++;
							day = day - nov;
						}
						break;
					case 12:
						res = day + (jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov);
						break;
					}
					System.out.println("Entre el 1/1/" + year + " y el " + day + "/" + month + "/" + year
							+ " han transcurrido " + res + " días");
				} else
					System.out.println("Año muy antiguo");
			} else
				System.out.println("Ese mes no existe");
		} else
			System.out.println("Ese día no existe");
		sc.close();
	}
}