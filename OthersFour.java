package interview;

public class OthersFour {

	public static void main(String[] args) {
		OthersFour three = new OthersFour();
		three.initialize();
	}

	private void initialize() {
		String string="ZOHOISHIRING";
		String string2="ZOHOOOISHIRING";
		sortPattern(string);
		sortPatternTwo(string2);
	}

	private void sortPattern(String s) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<s.length();j++) {
				if(j%4==0&&i==0) {
					System.out.print(s.charAt(j)+"   ");
				}
				if(j%2!=0&&i==1) {
					System.out.print(s.charAt(j)+" ");
				}
				if(j%2==0&&j%4!=0&&i==2) {
					System.out.print(s.charAt(j)+"   ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	public void sortPatternTwo(String s){
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<s.length();j++) {
				if(j%(n+1)==0&&i==0) {
					System.out.print(s.charAt(j));
				}else if(i==0) {
					System.out.print(" ");
				}
				if(j%2!=0&&j%3!=0&&i==1&&j>0) {
					System.out.print(s.charAt(j));
				}else if(i==1&&j>0) {
					System.out.print(" ");
				}
				if(j%2==0&&j%3!=0&&i==2&&j>1) {
					System.out.print(s.charAt(j));
				}else if(i==2&&j>1) {
					System.out.print(" ");
				}
			
				if(j%3==0&&i==3&&j%2!=0&&j>2) {
					System.out.print(s.charAt(j));
				}else if(i==3&&j>2) {
					System.out.print(" ");
				}
				
				
				
			
			}System.out.println();
		}
		
		
	}

}
