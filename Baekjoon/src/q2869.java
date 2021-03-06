import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2869 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		int cnt = 0;
		
		V -= A;
		cnt += V/(A-B);
		
		if(V%(A-B)==0)
			cnt ++;
		else
			cnt += 2;
		
		System.out.println(cnt);
	}
}
