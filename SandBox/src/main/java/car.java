import java.util.Scanner;


public class car {
    public static void main(String[] args) {
        System.out.println("Введите Скорость движения Машины");
        Scanner Mysor = new Scanner(System.in);
        int speed = Mysor.nextInt();
        if (speed <= 60) {
            System.out.println("Мусор не тормозит");
        } else if (speed >= 60) {
            System.out.println("Мусор  тормозит");
        }

    }
}
