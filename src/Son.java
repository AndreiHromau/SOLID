public class Son implements Mom, Workable {

    //поля
    private int age = 18;
    private String name = "Андрей";

    //геттеры
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void washPlate() {
        System.out.println("СЫН ПОМЫЛ тарелку руками");
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