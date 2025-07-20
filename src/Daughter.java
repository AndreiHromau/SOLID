public class Daughter implements Mom, Workable {

    //поля
    private int age = 10;
    private String name = "Арина";

    //геттеры
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void washPlate() {
        System.out.println("ДОЧЬ ПОМЫЛА тарелку в посудомоечной машине");
    }

    @Override
    public void work() {
    }

    @Override
    public void dontWork() {
        if (age <= 10) {
            System.out.println("ДОЧЬ НЕ РАБОТАЕТ НА ЗАВОДЕ, ТАК КАК 10 лет");
        }
    }
}