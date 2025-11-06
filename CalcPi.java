// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int length = Integer.parseInt(args[0]);
		boolean ispositive = true;
		int divide = 1;
		double sum = 0;
		for(int i = 0; i<length; i++)
		{
			if (ispositive)
			{
				sum = sum + 1.0 / divide;
				ispositive = false;
			}
			else
			{
				sum = sum - 1.0 / divide;
				ispositive = true;
			}
			divide = divide+2;
		}
		System.out.println("% java CalcPi "+ length);
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated: "+ sum*4);
	}
}
