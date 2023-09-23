public class Main {
    // Обобщенная функция getMax, принимающая два параметра типа T и возвращающая максимальное значение
    public static <T extends Comparable<T>> T getMax(T value1, T value2) {
        // Используем метод compareTo для сравнения значений
        int comparisonResult = value1.compareTo(value2);

        // Если comparisonResult > 0, то value1 больше value2, возвращаем value1
        if (comparisonResult > 0) {
            return value1;
        }
        // Если comparisonResult < 0, то value2 больше value1, возвращаем value2
        else if (comparisonResult < 0) {
            return value2;
        }
        // Иначе значения равны, можно вернуть любое из них
        else {
            return value1; // или value2, результат будет одинаковым
        }
    }

    public static void main(String[] args) {
        // Примеры вызова обобщенной функции getMax с разными типами данных

        // Для Integer
        Integer intResult = getMax(5, 10);
        System.out.println("Максимальное значение для Integer: " + intResult);

        // Для Double
        Double doubleResult = getMax(3.5, 2.7);
        System.out.println("Максимальное значение для Double: " + doubleResult);

        // Для String
        String strResult = getMax("apple", "banana");
        System.out.println("Максимальное значение для String: " + strResult);
    }
}


/* Честно говоря не совсем понял какой код именно брать для домашнего задания)
 * 1. В данном коде, как я понял, нарушается принцип единственной ответственности, так в классе Main существует 
 * 2 причины, по которым его можно изменить, а именно метод main и метод getMax. По хорошему их нужно разнести в разные
 * классы.
 * 2. Принцип открытости/закрытости тут не нарушается.
 * 3. Принцип подстановки лисков так же не нарушается, поскольку иерархии в этом коде нет.
 * 4. Принцип разделения интерфейсов так же не нарушается, поскольку их попросту нет, у нас единственные метод, который
 * еще и обобщенный.
 * 5. Принцип инверсий зависимостей в этом коде так же не нарушается
 * 
 * Надеюсь, я правильно понял задание, т.к. не нашел в описании дз ссылки на гит с кодом из лекции
 */