package operaciones;

public class Subtraction extends Operation {
	
    public Subtraction(int o1, int o2) {
		super(o1, o2);
	}
    
	@Override
	public int operar() {
		return getOperator1() - getOperator2();
	}

	@Override
	public String getSigno() {
		return "-";
	}


}

