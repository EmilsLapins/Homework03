import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Random rnd1 = new Random();
		
		int arraySize;
		
		
		do {
			System.out.println("Ludzu ievadiet masiva izmeru robezas no 20 līdz 40");
				arraySize = sc.nextInt();
				}
		while (arraySize < 20 || arraySize > 40);
			
		int[] array1 = new int [arraySize]; // array size from input
		
		// assign random numbers
		for (int i = 0; i < array1.length; i++) {
			int randomNumbers = 10 + rnd1.nextInt(90);
			array1[i] = randomNumbers;
		}
		
		System.out.print("Array holds: ");
		for (int i : array1) {
			System.out.print( i + ", ");
		}
		
		int Temp;
		for (int i = 0; i < array1.length ; i++)
		{
			for (int j = i + 1; j < array1.length; j++)
			{
				if(array1[i] > array1[j])
				{
					Temp = array1[i];
					array1[i] = array1[j];
					array1[j] = Temp;
				}
				
			}
		}
		System.out.printf("%n");
		System.out.print("Array holds: ");
		for (int i : array1) {
			System.out.print( i + ", ");
		}
	
		
//		Uzrakstīt programmu klasē SortArray, kas aicina lietoāju ievadīt masīva izmēru robežās no
//		20 līdz 40
//		1) Programma izveido int masīvu ar izmēru, ko saņēma no lietotāja
//		2) Masīvs tiek aizpildīts ar gadījuma skaitļiem(int) robežās no 10 līdz 99
//		3) Izvadam uz ekrāna visus masīvā esošos skaitļus atdalītus ar komatu un atstarpi
//		4) Veicam masīvā esošo elementu kārtošanu augošā secībā(neveidojam jaunu masīvu)
//		5) Izvadam uz ekrāna sakārtotos masīva elementus	
		
		
		
	}

}