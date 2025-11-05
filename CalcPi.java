// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		double piOver4 = 0;
		if (n%2==1) {
			int denominator1 = 1;
			int denominator2 = 3;
			int i = 0;
			while (i<(n/2+1)) {
				double plus = (double) 1/denominator1;
				double minus = (double) 1/denominator2;
				denominator1 = denominator1 + 4;
				denominator2 = denominator2 + 4;
				piOver4 = piOver4+plus-minus;
				i=i+1;
			}}
		else
			{int denominator1 = 1;
			int denominator2 = 3;
			int i = 0;
			while (i<(n/2)) {
				double plus = (double) 1/denominator1;
				double minus = (double) 1/denominator2;
				denominator1 = denominator1 + 4;
				denominator2 = denominator2 + 4;
				piOver4 = piOver4+plus-minus;
				i=i+1;

			}
		}
		double pi = (double) piOver4*4;
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, apporximated:     " + pi);

			
			
		
	}
}
