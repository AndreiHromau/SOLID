public class Main {
    public static void main(String[] args) {

        Mom son = new Son();
        Mom daughter = new Daughter();

        son.washPlate(); //СЫН ПОМЫЛ тарелку руками
        daughter.washPlate(); //ДОЧЬ ПОМЫЛА тарелку в посудомоечной машине

        son.canwork(); //РАБОТАЕТ НА ЗАВОДЕ, ТАК КАК ВЗРОСЛЫЙ
        daughter.canwork(); //НЕ РАБОТАЕТ НА ЗАВОДЕ, ТАК КАК НЕ ВЗРОСЛЫЙ
    }
}