
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//饿汉模式
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		if(s1==s2){
			System.out.println("s1和s2是同一个实例");
		}else{
			System.out.println("s1和s2不是同一个实例");
		}
		
		//懒汉模式
		SingleTon2 s3 = SingleTon2.getInstance();
		SingleTon2 s4 = SingleTon2.getInstance();
		if(s3==s4){
			System.out.println("s3和s4是同一个实例");
		}else{
			System.out.println("s3和s4不是同一个实例");
		}
	}

}
