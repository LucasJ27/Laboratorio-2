package Ejercicio1;

public class OperableInteger implements Operable<Integer> {
    private Integer value;

    public OperableInteger(Integer value) {
        this.value = value;
    }

    @Override
    public Integer suma(Integer other) {
        return this.value + other;
    }

    @Override
    public Integer resta(Integer other) {
        return this.value - other;
    }

    @Override
    public Integer producto(Integer other) {
        return this.value * other;
    }

    @Override
    public Integer division(Integer other) {
        if (other == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return this.value / other;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
