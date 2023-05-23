

public class IntsCalculator implements Ints {
    public final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    protected int calculateInt(int a, int b, Calculator.Operation operation) {
        return Double.valueOf(target.newFormula().addOperand(a).addOperand(b).calculate(operation).result()).intValue();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return calculateInt(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calculateInt(arg0, arg1, Calculator.Operation.MULT);

    }

    @Override
    public int pow(int a, int b) {
        return calculateInt(a, b, Calculator.Operation.POW);
    }
}