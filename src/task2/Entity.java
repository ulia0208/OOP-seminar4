package task2;

public class Entity implements PersonalData{
    private final String name;
    private final String inn;

    @Override
    public String getInn() {
        return inn;
    }


    public String getName() {
        return name;
    }

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("ИНН: %s; Наименование: %s", inn, name);
    }

}
