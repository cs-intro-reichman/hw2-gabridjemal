//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0].toUpperCase();
            int count1 = 0;
            int count2 = 0;
            int repeat = Integer.parseInt(args[1]);
            while (count1<word.length()) {
                boolean useAn = "AEFHILMNORSX".indexOf(word.charAt(count1)) >= 0;
                String sentence = useAn ? "Give me an "+ word.charAt(count1)+": "+word.charAt(count1)+"!" : "Give me a  "+ word.charAt(count1)+": "+word.charAt(count1)+"!";
                System.out.println(sentence);
                count1++;  }
            System.out.println("What does that spell?");    
            while (count2<repeat) {System.out.print(word+"!!!\n");
                count2++;}


}

}
