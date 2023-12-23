public class yogyrt {
    public interface Function<F, T> {
        T apply(F from);
    }

    public static void main() {
        // Объявляем "функцию", присваиваем ее переменной intToString.
        Function<Integer, String> intToString = new Function<Integer, String>() {
            @Override
            public String apply(Integer from) {
                return from.toString();
            }
        };
    }
}


