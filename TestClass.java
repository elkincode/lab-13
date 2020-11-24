import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Ваш пароль должен содерджать строчные и прописные буквы латинского алфавита, а также цифры.\n");
        Scanner scanner = new Scanner(System.in);
        String password;
        String check = "(?=.*[a-z])(?=.*[_])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,}";
        boolean a = true;
        while (a) {
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();

        if (password.matches(check)) {
            System.out.println("Пароль установлен.");
            a=false;
        }
        else {
            System.out.println("Пароль слишком простой! Попробуйте ещё раз.");
        }
    }
    }
}
