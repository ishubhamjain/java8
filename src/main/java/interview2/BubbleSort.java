package interview2;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arg[]= {34,56,54,78,98,21,56};
		bubblesort(arg);

	}
	
	public static void bubblesort(int arg[]) {
		
		int n = arg.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++) {
				if(arg[j]>arg[j+1]) {
					
					int temp=arg[j];
					arg[j]=arg[j+1];
					arg[j+1]=temp;
					
				}
			}
		
		for(int val:arg) {
			System.out.print(val+" , ");
		}
		
	}

}
