
public class FindMinCommonMultiple {
	public static void main(String[] args) {
		
		System.out.println(findMinCommonMultiple(17, 3));
	
	}
	
	public static int findMinCommonMultiple(int m, int n){
		int result = Math.max(m, n);
		
		while(true){
			if((result % m == 0) && (result % n == 0)){
				break;
			}
			
			result++;
		}
		
		return result;
	}
}
