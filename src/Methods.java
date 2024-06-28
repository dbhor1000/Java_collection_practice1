public class Methods {

    public static <T> T[] filter(T[] array, Filter filter) {
        T[] result = array.clone(); // Создаем новый массив для хранения результатов
        for (int i = 0; i < array.length; i++) {
            // Применяем метод apply ко всем элементам исходного массива
            @SuppressWarnings("unchecked")
            T element = (T) filter.apply(array[i]);
            result[i] = element;
        }
        return result; // Возвращаем новый массив с примененными изменениями
    }

}
