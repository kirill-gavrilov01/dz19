
        public class Main {
            public static void main(String[] args) {
                    // Создаем объекты продуктов
                    Product p1 = new Product("iPhone 14 Pro Max", 1200); // Продукт №1
                    Product p2 = new Product("MacBook Air M2", 1700); // Продукт №2
                    Product p3 = new Product("Samsung Galaxy Watch", 300); // Продукт №3

                    // Создаем статьи
                    Article a1 = new Article("Лучшие смартфоны 2023 года", "Описание топовых смартфонов."); // Статья №1
                    Article a2 = new Article("Тест-драйв MacBook Air M2", "Подробный обзор ноутбука."); // Статья №2
                    Article a3 = new Article("Советы по выбору умных часов", "Рекомендации экспертов."); // Статья №3

                    // Создаем поисковую машину
                    SearchEngine engine = new SearchEngine(10); // Максимальная вместимость 10 элементов

                    // Добавляем все созданные объекты в поисковую машину
                    engine.add(p1);
                    engine.add(p2);
                    engine.add(p3);
                    engine.add(a1);
                    engine.add(a2);
                    engine.add(a3);

                    // Теперь демонстрируем поиск по нескольким критериям
                    System.out.println("\n=== Результаты поиска ===\n");

                    // Первый поиск: ищем "смартфон"
                    System.out.println("Поиск по запросу \"смартфон\":");
                    Searchable[] results = engine.search("смартфон");
                    printResults(results);

                    // Второй поиск: ищем "MacBook"
                    System.out.println("\nПоиск по запросу \"MacBook\":");
                    results = engine.search("MacBook");
                    printResults(results);

                    // Третий поиск: ищем "часы"
                    System.out.println("\nПоиск по запросу \"часы\":");
                    results = engine.search("часы");
                    printResults(results);
                }

                // Вспомогательный метод для печати результатов поиска
                private static void printResults(Searchable[] results) {
                    for (Searchable res : results) {
                        if (res != null) {
                            System.out.println(res.getStringRepresentation()); // Используем стандартный метод представления результата
                        }
                    }
                }
            }
