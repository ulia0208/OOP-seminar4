package task2;

public class Program {

    public static void main(String[] args) {
//        Account<Person> account = new Account<>(new Person("AAAAA", "3456543"), 20000);

        Entity entity=new Entity("OOO Roga&Ko","45676654");
        DebetAccount<Entity> entityDebetAccount1=new DebetAccount<>(entity, 2000000);

        Person person1=new Person("Иван Иванович","7890980");

        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1,395);
        Transaction<Account<?>> transaction=new Transaction<>(entityDebetAccount1,creditAccount1,10000);
        transaction.execute();



    }


}
