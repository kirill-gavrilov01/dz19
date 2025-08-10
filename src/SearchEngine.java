public class SearchEngine {
    private final Searchable[] data;
    private int size; // Текущий размер заполненного массива

    /**
     * Конструктор класса SearchEngine.
     *
     * @param capacity емкость массива (количество возможных элементов)
     */
    public SearchEngine(int capacity) {
        this.data = new Searchable[capacity];
        this.size = 0;
    }

    /**
     * Добавляет новый объект Searchable в массив.
     *
     * @param item добавляемый объект
     */
    public void add(Searchable item) {
        if (size >= data.length) {
            throw new IllegalStateException("Search engine is full");
        }
        data[size++] = item;
    }

    /**
     * Поиск по строковому термину среди объектов Searchable.
     *
     * @param query искомое слово/строка
     * @return массив найденных объектов длиной 5 (или меньше, если найдено менее 5 элементов)
     */
    public Searchable[] search(String query) {
        Searchable[] result = new Searchable[5]; // Массив фиксированного размера для хранения максимум 5 элементов
        int index = 0;                           // Индекс для вставки новых элементов

        for (Searchable user : data) {
            if (user != null && user.getSearchTerm().contains(query)) {
                result[index++] = user;           // Добавляем найденный элемент

                if (index >= result.length) {    // Проверяем количество заполненных элементов относительно длины массива
                    break;                       // Прерываем цикл, если достигли лимита
                }
            }
        }

        return result;
    }
}
