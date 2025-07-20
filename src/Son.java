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
    public void work() {
        System.out.println("СЫН РАБОТАЕТ НА ЗАВОДЕ, ТАК КАК ВЗРОСЛЫЙ");
    }

    @Override
    public void dontWork() {
    }
}