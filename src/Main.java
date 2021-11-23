public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        swap(a, b);
    }

    public static void swap(int a, int b) {
        // Вводим временную переменную, которая на время придержит значение из одной переменной
//        int tmp = a;
//        a = b;
//        b = tmp;

        // обмен значениями без использования временной переменной.
        a = a + b; // a = 8, b = 5
        b = a - b; // a = 8, b = 3
        a = a - b; // a = 5, b = 3

        //Третья переменная не вводится, обмен достигается путем сложения и вычитания.
        System.out.println("a = 3 => a = " + a + "\nb = 5 => b = " + b);
    }
}