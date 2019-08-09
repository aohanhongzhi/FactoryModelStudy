package hxy.study.factoryModel;

public class FactoryTest {
	
	/**
	 * @see https://www.jianshu.com/p/79dff3102fa4
	 * @param args
	 */
	
	public static void main(String[] args) {
		FactoryTest factoryTest =new FactoryTest();
		int result = factoryTest.calculateUsingFactory(2, 3, "add");
		System.out.println(result);
		int result2 = factoryTest.calculateUsingFactory(2, 3, "sub");
		System.out.println(result2);
		int result3 = factoryTest.calculateUsingFactory(2, 3, "c");
		System.out.println(result3);
		
	}
	public int calculateUsingFactory(int a ,int b ,String operator) {
//		Operation targetOperation = OperatorFactory.getOperation(operator).orElseThrow(()->new IllegalArgumentException("Invalid Operator"));
		Operation targetOperation = OperatorFactory.getOperationNull(operator);
		if(targetOperation instanceof Addition) {
			System.out.println("Addiction Object");
		}else if(targetOperation instanceof Subtraction) {
			System.out.println("Subtraction Object");
		}
		return targetOperation.apply(a, b);
	}
}
