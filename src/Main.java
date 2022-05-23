public class Main {
    public static void main(String[] args) {

        // создание массива
        int[] array = new int[20];
        System.out.println("Massive before: ");
        int min = 10, max = -10, indexMin = 0, indexMax = 0, swap;
        // заполнение массива данными
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(array[i] + " ");
            if (array[i] < min && array[i] > 0) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max && array[i] < 0) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println();
        System.out.println("Max negative value array[" + (indexMax + 1) + "] = " + array[indexMax]);
        System.out.println("Min positive value array[" + (indexMin + 1) + "] = " + array[indexMin]);
        // замена местами найденых чисел
        swap = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = swap;
        // вывод измененого массива
        System.out.println("Massive after exchange values:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}