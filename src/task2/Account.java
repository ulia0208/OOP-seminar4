package task2;

public abstract class Account<T extends PersonalData>  {


    private final T data;
    private double amount;

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "data=" + data +
                ", amount=" + amount +
                '}';
    }
}
