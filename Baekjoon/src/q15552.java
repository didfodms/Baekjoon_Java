// 10952 ���� �����
// ������ ��ô�ȸ������ �Է·��� ��·��� ū ������ ��κ��̹Ƿ� 
// �̷� ����� ������ �����α� �ٶ���.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q15552 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// ����� ����
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());   // �� �� �а�
			int a = Integer.parseInt(st.nextToken());	// �� ������ �ϳ���
			int b = Integer.parseInt(st.nextToken());
			if (a==0 && b==0) break;
			sb.append(a+b+"\n");		// StringBuilder�� ��Ƴ���
		}	
		System.out.println(sb.toString());	// ��� ���� �� �ѹ��� ���
	}
}