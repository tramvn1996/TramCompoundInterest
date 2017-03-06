
import java.util.Scanner;

public class Calculation
{
	
	float m, parenthesis,EXIT, P, A, r, t, I;
	
	private Scanner scT;
	private Scanner scA;
	private Scanner scR;
	private Scanner scI;
	
	public Calculation() {
		
	}
	
	public void CalcPrincipal(int A, int r, int t, int m) //method doesn't start with capital case

		{	
			
			parenthesis = (float) Math.pow((1 + 0.01*r / m), (m * t));
			P= A / parenthesis;
			System.out.println("Your principal is: " + P);
			
		}
	
	public void CalcTime()
	{
		scT = new Scanner(System.in);
		System.out.println("Please enter your principal:");
		P = scT.nextInt();
		System.out.println("Please enter your total amount: ");
		A = scT.nextInt();
		System.out.println("Please enter your interest rate (as in percentage)");
		r = scT.nextInt();
		System.out.println("Please enter how many times compounded per year: ");
		m = scT.nextInt();
		
		scT.close();
		t = (float) ((float) Math.log(A / P) / (m * Math.log(1 + 0.01*r / m)));
		System.out.println("Your time (years): " + t);
		
	}
	
	public void CaclTotalAmount()
	{
		scA = new Scanner(System.in);
		System.out.println("Please enter your principal:");
		P = scA.nextInt();
		
		System.out.println("Please enter your interest rate (as in percentage)");
		r = scA.nextInt();
		System.out.println("Please enter how many times compounded per year: ");
		m = scA.nextInt();
		System.out.println("Please enter your time (as number of years):");
		t= scA.nextInt();
		
		
		parenthesis = (float) Math.pow((1 + 0.01*r / m), (m * t));
		A = P * parenthesis;
		System.out.println("Your total amount is: " + A);
	}
	
	public void CalcInterestRate()
	{
		scR = new Scanner(System.in);
		System.out.println("Please enter your principal:");
		P = scR.nextInt();
		
		
		System.out.println("Please enter how many times compounded per year: ");
		m = scR.nextInt();
		System.out.println("Please enter your time (as number of years):");
		t= scR.nextInt();
		System.out.println("Please enter your total amount: ");
		A = scR.nextInt();
		
		
		r = (float) (Math.pow((A / P), (1 / (m * t)) - 1) * m)*100;
		System.out.println("Your interest rate is: " + r);
	}
	
	public void CaclProfit()
	{
		scI = new Scanner(System.in);
		System.out.println("Please enter your principal:");
		P = scI.nextInt();
		System.out.println("Please enter how many times compounded per year: ");
		m = scI.nextInt();
		System.out.println("Please enter your time (as number of years):");
		t= scI.nextInt();
		System.out.println("Please enter your interest rate (as in percentage)");
		r = scI.nextInt();
		
		parenthesis = (float) Math.pow((1 + 0.01*r / m), (m * t));
		float I = P*parenthesis - P;
		System.out.println("Your profit is " + I);	
			
		}
	
		
	}
