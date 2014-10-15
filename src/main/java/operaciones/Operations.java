package operaciones;

public class Operations {
    private Operation[] operators = new Operation[10];
    //private ArrayList<Operation> operators = new ArrayList<Operation>();

    public void add(Operation operator) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == null) {
                operators[i] = operator;
                return;
            }
        }
        return;
    }

    public void reset() {
        for (int i = 0; i < operators.length; i++) {
            operators[i] = null;
        }
    }
    
    public Operation[] getOperators(){
    	return this.operators;
    }

    // MAL DISEÑADO... MAL CODIFICADO
    public int total() {
        int result = 0;
        String separador = "";
        for (Operation operacion : operators) {
            if (operacion != null) {
                System.out.print(separador + operacion.toString());
                result += operacion.operar();
            }
            separador = "+";
        }
        System.out.print(">>> ");
        return result;
    }
}
