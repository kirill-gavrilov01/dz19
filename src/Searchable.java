public interface Searchable {
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