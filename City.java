import java.util.HashMap;
import java.util.Map;

class City {
    private String name;
    private Map<City, Integer> paths; // Карта городов и стоимости путей к ним

    // Конструктор, позволяющий создать город только с именем
    public City(String name) {
        this.name = name;
        this.paths = new HashMap<>();
    }

    // Конструктор, позволяющий создать город с именем и набором путей
    public City(String name, Map<City, Integer> paths) {
        this.name = name;
        this.paths = paths;
    }

    // Метод для добавления пути к другому городу
    public void addPath(City city, int cost) {
        paths.put(city, cost);
    }

    // Метод для получения имени города
    public String getName() {
        return name;
    }

    // Метод для получения путей
    public Map<City, Integer> getPaths() {
        return paths;
    }

    // Метод для текстового представления города и его путей
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Город: " + name + "\nПути:\n");
        for (Map.Entry<City, Integer> entry : paths.entrySet()) {
            result.append(" - ").append(entry.getKey().getName()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}
