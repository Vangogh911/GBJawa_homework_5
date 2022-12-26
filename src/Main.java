import java.io.*;

public class Main {
    public static void triangle_func(int n){
        int triangle_number = (n * (n + 1)) / 2;
        System.out.println("-Результат решения через функцию-");
        System.out.println("Ваше число: ");
        System.out.println(triangle_number);
    }

    public static void triangle_cycle(int n){
        int triangle_number_1 = 0;
        for (int i = 0; i < n; i++){
            triangle_number_1 += i + 1;
        }
        System.out.println("-Результат решения через цикл-");
        System.out.println("Ваше число: ");
        System.out.println(triangle_number_1);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Какое по счету треугольное число вы хотите увидеть?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n_str = reader.readLine();
        while (!n_str.chars().allMatch( Character::isDigit )){
            System.out.println("Введите цифру!");
            n_str = reader.readLine();
        }
        int n = Integer.parseInt(n_str);

        triangle_func(n);
        triangle_cycle(n);
    }
}
