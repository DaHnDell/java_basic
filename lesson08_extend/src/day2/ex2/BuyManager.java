package day2.ex2;

public class BuyManager extends Manager{
	@Override
	void work() {	
		System.out.println("구매");
	}

	public BuyManager(String name) {
		super(name);
	}
	
}
