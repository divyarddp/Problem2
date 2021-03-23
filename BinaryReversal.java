public class BinaryReversal {
	public static void main(String[] args) {
		System.out.println(binaryReversal("47"));
}
	
	 public static String binaryReversal(String str) {
		 String result = "";
		 int n = Integer.parseInt(str);
		 while(n >0){
			 int a = n%2;
			 result += a ;
			 n = n/2;
		 }
		 result = String.format("%1$-"+8+"s", result).replace(' ', '0');
		 return Integer.parseInt(result, 2)+"";
	 }
	 
} 

