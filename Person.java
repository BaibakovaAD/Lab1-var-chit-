public class Person {
    // Поля класса
    private String name;
    private Name name1;
    private int height;

    // Конструктор
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Person(Name name, int height) {
        this.name1 = name;
        this.height = height;
    }

    // Метод для возврата текстового представления объекта
    @Override
    public String toString() {
        if (name != null)
        return name + ", рост: " + height;
        else return name1 + ", рост: " + height;
    }
}
