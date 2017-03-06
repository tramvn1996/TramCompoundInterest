import java.util.Scanner;

public class CompoundInterestTram
{
	public static void main(String[] args)
	{
		System.out.println("1. Principal");
		System.out.println("2. Total Amount");
		System.out.println("3. Interest rate (as in percentage)");
		System.out.println("4. Time (number of years)");
		System.out.println("5. Profit ");
		System.out.println("6. Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to use this Compound Interest tool? (true/false)");
		boolean conductCalculation = sc.nextBoolean();

		while (conductCalculation)
		{
			System.out.println("What do you want to calculate? (1-6)");
			int value = sc.nextInt();

			if (value == 1)
			{ doPrincipal();
			
				
				conductCalculation = sc.nextBoolean();
				//value = sc.nextInt();
			} else if (value == 2)
			{
				Calculation calculate = new Calculation();
				calculate.CaclTotalAmount();
				System.out.println("Do you want to continue to calculate?");
				conductCalculation = sc.nextBoolean();
				//value = sc.nextInt();
			} else if (value == 3)
			{

				Calculation calculate = new Calculation();
				calculate.CalcInterestRate();
				System.out.println("Do you want to continue to calculate?");
				conductCalculation = sc.nextBoolean();
				//value = sc.nextInt();

			} else if (value == 4)
			{
				Calculation calculate = new Calculation();
				calculate.CalcTime();
				System.out.println("Do you want to continue to calculate?");
				conductCalculation = sc.nextBoolean();
				//value = sc.nextInt();
			} else if (value == 5)
			{
				Calculation calculate = new Calculation();
				calculate.CaclProfit();
				System.out.println("Do you want to continue to calculate?");
				conductCalculation = sc.nextBoolean();
				//value = sc.nextInt();
			} else if (value == 6)
			{
				System.out.println("Goodbye");
				System.out.println("Do you want to continue to calculate?");
				conductCalculation = sc.nextBoolean();

			}
			/*
			 * when user enters value != (1-6)
			 */
			else 
			{
				System.out.println("Please enter a number from 1 to 6 and 'true' if you want to calculate your value");
				value = sc.nextInt();
				conductCalculation = sc.nextBoolean();
				if (value == 1)
				{
					doPrincipal();
					conductCalculation = sc.nextBoolean();
					//value = sc.nextInt();
				} else if (value == 2)
				{
					Calculation calculate = new Calculation();
					calculate.CaclTotalAmount();
					System.out.println("Do you want to continue to calculate?");
					conductCalculation = sc.nextBoolean();
					//value = sc.nextInt();
				} else if (value == 3)
				{

					Calculation calculate = new Calculation();
					calculate.CalcInterestRate();
					System.out.println("Do you want to continue to calculate?");
					conductCalculation = sc.nextBoolean();
					//value = sc.nextInt();

				} else if (value == 4)
				{
					Calculation calculate = new Calculation();
					calculate.CalcTime();
					System.out.println("Do you want to continue to calculate?");
					conductCalculation = sc.nextBoolean();
					//value = sc.nextInt();
				} else if (value == 5)
				{
					Calculation calculate = new Calculation();
					calculate.CaclProfit();
					System.out.println("Do you want to continue to calculate?");
					conductCalculation = sc.nextBoolean();
					//value = sc.nextInt();
				} else if (value == 6)
				{
					System.out.println("Goodbye");
					System.out.println("Do you want to continue to calculate?");
					conductCalculation = sc.nextBoolean();

				}
				
			
			}

		}
		if (!conductCalculation)
		{
			System.out.println("Goodbye");
		}
	}
	public static void doPrincipal()
	{
		Scanner	scP = new Scanner(System.in); 
		int A, r, t, m;
		

		
		System.out.println("Please enter your total amount: ");
		A = scP.nextInt();
	
		System.out.println("Please enter your interest rate (as in percentage)");
		r = scP.nextInt();
		
		System.out.println("Please enter your time (as number of years):");
		t= scP.nextInt();
		System.out.println("Please enter how many times compounded per year: ");
		m = scP.nextInt();
		
		Calculation calculate = new Calculation();
		calculate.CalcPrincipal(A, r, t, m);
		System.out.println("Do you want to continue to calculate?");
	}

}