package task2;

public class DecompressString {
	//Method to return the final  output string//
	String decompress(String input)
    {
        StringBuilder sb = new StringBuilder(); //creating StringBuilder class object
        decompress(input, 0, sb);
        return sb.toString();
    }
    //Method overloading to get desired output.
    private int decompress(String input, int start, StringBuilder sb)
    {
        StringBuilder times = new StringBuilder();
        StringBuilder current = new StringBuilder();

        int i = start;

        //Repeat iteration until we hit the end of the string.
        while (i < input.length()) { 
        	        
        	
            while (Character.isDigit(input.charAt(i))) {
                times.append(input.charAt(i));
                i++;
            }

            if (input.charAt(i) == '[' && times.length() > 0) {

                if (current.length() > 0) {
                    sb.append(current);
                    current = new StringBuilder();
                }

                i = decompress(input, i + 1, current); //recursion  method call

                int repeatTimes = Integer.parseInt(times.toString());

                for (int j = 0; j < repeatTimes; j++) {
                    sb.append(current);
                }

                current = new StringBuilder();
                times = new StringBuilder();

            } else if (input.charAt(i) == ']') {
                return i + 1;

            } else {
                sb.append(input.charAt(i));
                i++;
            }
        }
        return i;
    }

}
