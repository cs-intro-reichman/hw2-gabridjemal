// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		double piOver4 = 0;
		if (n%2==1) {
			int denominator1 = 1;
			int denominator2 = 3;
			int i = 0;
			while (i<(n/2)) {
				double plus =  1.0/denominator1;
				double minus = 1.0/denominator2;
				denominator1 = denominator1 + 4;
				denominator2 = denominator2 + 4;
				piOver4 = piOver4+plus-minus;
				i=i+1;
			}
			piOver4 = piOver4 + 1.0 / denominator1;}
		else
			{int denominator1 = 1;
			int denominator2 = 3;
			int i = 0;
			while (i<(n/2)) {
				double plus = 1.0/denominator1;
				double minus = 1.0/denominator2;
				denominator1 = denominator1 + 4;
				denominator2 = denominator2 + 4;
				piOver4 = piOver4+plus-minus;
				i=i+1;

			}
		}
		double pi = (double) piOver4*4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);

			
			
		
	}
}
