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
    public void canwork() {
        if (age >= 18) {
            System.out.println("РАБОТАЕТ НА ЗАВОДЕ, ТАК КАК ВЗРОСЛЫЙ");
        } else {
            System.out.println("НЕ РАБОТАЕТ НА ЗАВОДЕ, ТАК КАК НЕ ВЗРОСЛЫЙ");
        }
    }
}