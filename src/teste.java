import java.io.IOException;
import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n, i, j=0;

        n=input.nextInt();

        int v[] = new int[1000];

        for (i=0; i < 1000; i++) {
            if (j >= n) {
                j=0;
            }
            v[i] = j;
            System.out.println("N[" + i + "] = " + v[i]);
            j++;
        }
    }
}