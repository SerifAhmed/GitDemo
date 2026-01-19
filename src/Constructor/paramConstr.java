package Constructor;

public class paramConstr {

	//Default Constructor
	public paramConstr() {
		System.out.println("I am the default constructor");
	}
	
	//Parameterized Constructor
	public paramConstr(int a, int b){
		System.out.println("I am in the parameterized constructor");
		int c = a+b;
		System.out.println(c);
	}
	
	public paramConstr(String str){
		System.out.println(str);
	}
	
	public void getData() {
		System.out.println("I am in the method");
	}
	
	
	public static void main(String[] args) {
		paramConstr pc = new paramConstr();
		paramConstr pc1 = new paramConstr(4,5);
		paramConstr pc2 = new paramConstr("Hello Serif!!");
		pc.getData();
		pc1.getData();
	}

}
