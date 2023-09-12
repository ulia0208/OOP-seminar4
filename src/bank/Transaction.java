package bank;

public class Transaction<T extends Account<? extends PersonalData>> {
    private final T from;
    private final T to;

    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){
        if(from.getAmount()>amount){
 //           System.out.println("перевод на сумму %.2f руб\n",amount);

            System.out.println("счет списания: %s; %.2f \n Счет зачисления:s; $.2f руб\n");


        }
    }
}
