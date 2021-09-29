package pattern;

public class ShapePattern {
	public static void main(String args[]) {
		int i,j,n=5;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {		//increm use to print opp side 
				System.out.print("@ ");
			}	
				//Right angle Triangle & Pramid
				
//			for(j=i;j<=n;j++) {
//				System.out.print(" "); //enter null for empty space
//			}for(j=1;j<=i;j++) {
//				System.out.print("* "); //if "*" print right triangle
//										//if "* " print triangle
			System.out.println("");
		}
		
	}

}
