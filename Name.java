public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    // Конструктор для всех трёх параметров
    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    // Конструктор для двух параметров (без отчества)
    public Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    // Конструктор для одного параметра (только личное имя)
    public Name(String firstName) {
        this(null, firstName, null);
    }

    // Переопределение метода toString для корректного вывода
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (sb.length() > 0) sb.append(" "); // Добавляем пробел, если есть фамилия
            sb.append(firstName);
        }
        if (middleName != null && !middleName.isEmpty()) {
            if (sb.length() > 0) sb.append(" "); // Добавляем пробел, если есть фамилия и/или имя
            sb.append(middleName);
        }
        return sb.toString();
    }
}
