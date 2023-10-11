class Solution {
    public static int maxDivide(int a, int b) {
        while (b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int minMultiple(int a, int b) {
        return (a * b) / maxDivide(a, b);
    }
    public int[] solution(int n, int m) {
        int gcd, lcm;
    	if (n > m) {
    		gcd = maxDivide(n, m);
    		lcm = minMultiple(n, m);
    	} else {
    		gcd = maxDivide(m, n);
    		lcm = minMultiple(m, n);
    	}
    	int[] solution = new int[] { gcd, lcm };
		return solution;
    }
}
