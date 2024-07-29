import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print(
                """
                Добро пожаловать в панель управления! v 1.0.1 beta
                
                Вы можете выбрать следующие действия:
                1. Создать профиль
                2. Посмотреть профиль
                3. Изменить имя профиля
                4. Изменить фамилию
                5. Изменить возраст (скоро)
                
                0. Назад
                
                """
        );
        Scanner actionInput = new Scanner(System.in);
        System.out.print("ДЛЯ ВЫБОРА ВВЕДИТЕ ПОРЯДКОВЫЙ НОМЕР ДЕЙСТВИЯ: ");
        int action = actionInput.nextInt();
    }
}
