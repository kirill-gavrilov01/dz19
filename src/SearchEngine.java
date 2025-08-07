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
            throw new IllegalStateException("Array is full");
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
        Searchable[] result = new Searchable[5]; // Максимум 5 элементов
        int foundCount = 0;

        for (Searchable s : data) {
            if (s != null && s.getSearchTerm().contains(query)) { // Проверяем наличие query в терминале поиска
                result[foundCount++] = s;

                if (foundCount == 5) break; // Прерваться, если найдены 5 элементов
            }
        }

        return result;
    }
}