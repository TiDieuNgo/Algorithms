package LeetCode;

public class LCS {
	static String A = "ABCDE";
	static String B = "ABCDEF";
	static int n = A.length(); // 5
	static int m = B.length(); // 6

	public static void main (String[] args){
		System.out.println(LCS());
	}

	static int LCS(){
		int[][] L = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m ;j++)
				L[i][j] = -1;
		}

		return memorizedLCS(A,B,n-1,m-1,L);
	}

	private static int memorizedLCS(String A, String B, int n, int m, int[][] L) {
		if (L[n][m] < 0){
			if (n == 0)
				L[0][m] = 0;
			else if (m == 0)
				L[n][0] = 0;
			else if (A.charAt(n) == B.charAt(m))
				L[n][m] = memorizedLCS(A, B, n - 1, m -1 , L) + 1;
			else
				L[n][m] = Math.max(memorizedLCS(A, B, n -1, m, L), memorizedLCS(A, B, n, m -1 , L));
		}
		return L[n][m];
	}

}
