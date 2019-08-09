package hxy.study.factoryModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorFactory {
	static Map<String, Operation> operationMap = new HashMap<String, Operation>();
	static {
		operationMap.put("add", new Addition());
		operationMap.put("sub",new Subtraction());
	}
	public static Optional<Operation> getOperation(String operation){
		return Optional.ofNullable(operationMap.get(operation));
	}
	public static Operation getOperationNull(String operation){
		return operationMap.get(operation);
	}
}
