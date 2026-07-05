public class staticVariable{
	static int v =10;
		void result() {
			System.out.println("class"+v);
		}
	public static void main(String[] args) {
		staticVariable a=new staticVariable();
		System.out.println(staticVariable.v);
		a.result();
	}
}
