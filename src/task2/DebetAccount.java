package task2;

public class DebetAccount<T extends PersonalData> extends Account<T>{
    public DebetAccount(T data, double amount) {
        super(data, amount);
    }


}
