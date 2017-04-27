import java.util.Scanner;

public class SqrtCbrtAssignment1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceClass refClass = new ReferenceClass();
		
		System.out.println("Enter the number for which the square root and cube root are to be cauculated\n");
		Scanner sc = new Scanner(System.in);
		refClass.setNum(sc.nextInt());
		sc.close();
		System.out.println("value1 entered is :"+refClass.getNum());
		
		//Square root calculation
		System.out.println("The square root of the given number "+refClass.getNum()+ " is : "+refClass.sqrtCalculate(refClass.getNum()));
		
		//Cube root Calculation
		System.out.println("The cube root of the given number "+refClass.getNum()+" is : "+refClass.cubeCalculate(refClass.getNum()));
		
		//Prime number Calculation
		if(refClass.isPrime(refClass.getNum()))
			System.out.println("The given number "+refClass.getNum()+" is True");
		else
			System.out.println("The given number "+refClass.getNum()+" is False");
		
		//Random Number Generator
		System.out.println("The Random number generated is "+refClass.randNum(refClass.getNum()));
	}

}
