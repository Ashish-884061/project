package java;

public class MethodBackbone {

	void Print() {
		Print(5);
	}
	
	void Print(int a) {
		Print(a,1,10);
	}
	
	void Print(int a,int b,int c) {
		
		for(int i=b;i<=c;i++){
			System.out.printf("%d x %d = %d",a,i,a*i).println();
		}

	}

}
