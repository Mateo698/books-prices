import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		int i = -1;
		int j = -1;
		int M;
		String output = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean leave = false;
		while(!leave) {
			i = -1;
			j = -1;
			String firstEntry = br.readLine();
			if(firstEntry.equals("")) {
				firstEntry = br.readLine();
				if(firstEntry.equals("")) {
					leave = true;
				}
				else {
					int amount = Integer.parseInt(firstEntry);
					int[] array = new int[amount];
					String[] stArray = br.readLine().split(" ");
					for(int x=0;x<amount;x++) {
						array[x] = Integer.parseInt(stArray[x]);
					}
					Arrays.sort(array);
					M = Integer.parseInt(br.readLine());
					
					for(int x=0; x<array.length-1; x++){
			            
			            for(int y=x+1; y<array.length; y++){
			                
			                if(array[x]+array[y] == M ){
			                    if( i == -1 && j == -1 ){
			                        i = x;
			                        j = y;
			                    }
			                    else if(Math.abs(array[x]-array[y])<Math.abs(array[i]-array[j]) ){
			                        i=x;
			                        j=y;
			                    }
			                }
			            }
			        }
					output += "Peter should buy books whose prices are " + array[i] + " and " + array[j] + ".\n" + "\n" ;
				}
			}
			else {
				int amount = Integer.parseInt(firstEntry);
				int[] array = new int[amount];
				String[] stArray = br.readLine().split(" ");
				for(int x=0;x<amount;x++) {
					array[x] = Integer.parseInt(stArray[x]);
				}
				Arrays.sort(array);
				M = Integer.parseInt(br.readLine());
				
				for(int x=0; x<array.length-1; x++){
		            
		            for(int y=x+1; y<array.length; y++){
		                
		                if(array[x]+array[y] == M ){
		                    if( i == -1 && j == -1 ){
		                        i = x;
		                        j = y;
		                    }
		                    else if(Math.abs(array[x]-array[y])<Math.abs(array[i]-array[j]) ){
		                        i=x;
		                        j=y;
		                    }
		                }
		            }
		        }
				output += "Peter should buy books whose prices are " + array[i] + " and " + array[j] + ".\n" + "\n";
			}
		}
		
		
		bw.write(output);
		bw.flush();
		br.close();
		bw.close();
	}
}
