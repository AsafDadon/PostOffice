
public class GCD {
	
	public static int gcd1(int p, int q){
		if (p<q){
			int t = p;
			p = q;
			q = t;
		}
		int r = 1;
		while (r != 0){
			r = p%q;
			p = q;
			q = r;
		}
		return p;
	}
	public static int gcd2(int p, int q){
		int ans = 1;
		if (p<q){
			int t = p;
			p = q;
			q = t;
		}
		for (int i = q-1; i>=1; i--){
			if (p%i == 0 && q%i == 0){
				ans = i;
				break;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd1(77,7));
		System.out.println(gcd2(17,7));
		System.out.println(gcd1(1071, 462));
		System.out.println(gcd2(1071, 462));
		System.out.println(gcd1(42,36));
		System.out.println(gcd2(42,36));
	}
}