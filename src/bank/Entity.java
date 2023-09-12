package bank;

public class Entity implements PersonalData{


    private final String name;
    private final String inn;
    @Override
    public String getInn() {
        return inn;
    }


    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("ИНН:%s;name:%s",inn,name);
    }
}
