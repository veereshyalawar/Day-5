import java.io.*;
static double nthHarmonic(int N){

float harmonic=1;

for(int i=2;i<=N;i++)
{harmonic+=(float)1/i;}

return harmonic;}

public class uc_4 {

	public static void main(String[] args) {

	

	int N = 8;

	System.out.print(nthHarmonic(N));
		     
		    }
}
