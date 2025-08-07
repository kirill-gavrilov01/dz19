
// Базовый класс продуктов
public class Product implements Searchable {
    protected final String name;
    protected final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getName() {
        return name;
    }

    // Переопределение toString отдельно для отображения цены и прочего
    @Override
    public String toString() {
        return name + ", цена: " + price;
    }
}
interface Searchable {
    // Термин для поиска
    String getSearchTerm();

    // Тип контента
    String getContentType();

    // Имя объекта
    String getName();

    // Строковое представление объекта
    default String getStringRepresentation() {
        return getName() + " — " + getContentType();
    }
}

