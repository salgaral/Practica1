package operaciones;

public abstract class Operation {
	private final int operator1, operator2;

    public Operation(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return this.operator1;
    }

    public int getOperator2() {
        return this.operator2;
    }

    public abstract int operar();
    
    public abstract String getSigno();

    @Override
    public String toString() {
        return "[" + operator1 + getSigno() + operator2 + "]";
    }

}
