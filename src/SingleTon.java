
public class SingleTon {
	private SingleTon(){
		
	}
	private static SingleTon instance = new SingleTon();
	
	public static SingleTon getInstance(){
		return instance;
	}
}
