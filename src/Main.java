import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String output = "";
		
		Scanner in = new Scanner(System.in);
		boolean leave = false;
		while(!leave) {
			int x = -1;
			int y = -1;
			String firstEntry = in.nextLine();
			if(firstEntry.equals("")) {
				firstEntry = in.nextLine();
				if(firstEntry.equals("")) {
					leave = true;
				}
				else {
					
					int amount = Integer.parseInt(firstEntry);
		            int[] array = new int[amount];
		            String numbers = in.nextLine();
		            String[] stArray = numbers.split(" ");
		            for (int i = 0; i < amount; i++) {
		                array[i] = Integer.parseInt(stArray[i]);
		            }
		            Arrays.sort(array);
		            int money = in.nextInt();
		            in.nextLine();
		            x = -1;
		            y = -1;
		            for (int i = 0; i < amount; i++) {
		                int req = money - array[i];
		                int res = Arrays.binarySearch(array,i+1,amount,req);
		                if (res >= 0 && (array[res] - array[i] < y - x || (x == -1 && y == -1))) {
		                    x = array[i];
		                    y = array[res];
		                }
		            }
		            output += "Peter should buy books whose prices are " + x + " and " + y + ".\n" + "\n" ;
				}
					
					
			}
			else {
				int amount = Integer.parseInt(firstEntry);
	            int[] array = new int[amount];
	            String numbers = in.nextLine();
	            String[] stArray = numbers.split(" ");
	            for (int i = 0; i < amount; i++) {
	                array[i] = Integer.parseInt(stArray[i]);
	            }
	            Arrays.sort(array);
	            int money = in.nextInt();
	            in.nextLine();
	            x = -1;
	            y = -1;
	            for (int i = 0; i < amount; i++) {
	                int req = money - array[i];
	                int res = Arrays.binarySearch(array,i+1,amount,req);
	                if (res >= 0 && (array[res] - array[i] < y - x || (x == -1 && y == -1))) {
	                    x = array[i];
	                    y = array[res];
	                }
	            }
	            output += "Peter should buy books whose prices are " + x + " and " + y + ".\n" + "\n" ;
			}
			}
		System.out.println(output);
	}
}
				

