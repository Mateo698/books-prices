import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		int i = 0;
		int j;
		int M;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int amount = Integer.parseInt(br.readLine());
		j = amount - 1;
		int[] array = new int[amount];
		String[] stArray = br.readLine().split(" ");
		for(int x=0;x<amount;x++) {
			array[x] = Integer.parseInt(stArray[x]);
		}
		Arrays.sort(array);
		M = Integer.parseInt(br.readLine());
		M = M/2;
		
		boolean found = false;
		while(i <= j && !found) {
			int med = (i+j)/2;
			if(array[med] == M) {
				found = true;
			}
			else if(array[med] > M) {
				j = med - 1;
			}
			else {
				i = med + 1;
			}
		}
		if(array[i]>array[j]) {
			int temp = i;
			i = j;
			j = temp;
		}
		bw.write("Peter should buy books whose prices are " + array[i] + " and " + array[j] + ".");
		bw.flush();
		
		br.close();
		bw.close();
	}
}
