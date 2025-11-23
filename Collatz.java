// feedback 
// very good!
// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int i = 1;
		if (mode.equals("v")) {
			while (i<=n) {
				int first = i;
				int following = 0;
				System.out.print(first + " ");
				int count = 1;
				while (following != 1){
					if (first%2==1) {
						following = first*3 + 1;
				}
					else {
						following = first/2;
				}
					System.out.print(following+" ");
					count++;
					first = following; }
				
				System.out.println("("+count+")");	
				i=i+1;

			}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");

}
}
