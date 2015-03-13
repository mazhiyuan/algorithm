/**
 * 
 */
package zhiyuan.algorithm.c1;

/**
 * @author mazhiyuan
 * 最大公约数 -- 欧几里得算法
 */
public class GCD {
	public static int gcd(int i,int j){
		if(j==0)
			return i;
		return gcd(j,i%j);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(10,6));
		System.out.println((int)10.1d);
	}

}
