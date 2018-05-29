package LeetCode;

public class AddBinary {
	public static void main (String[] args) {
		String a = "1001";
		String b = "1";

		StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
         // testGit2_v1
        System.out.println(sb.reverse().toString());
	}
}
