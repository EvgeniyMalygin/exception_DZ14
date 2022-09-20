public class Main {

    public static boolean checkRegisterData(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
                throw new WrongLoginExeption();
            }
            if (!password.matches("[a-zA-Z0-9_]+") || !password.equals(confirmPassword) || password.length() >= 20) {
                throw new WrongPasswordExeption();
            }
        } catch (WrongLoginExeption e) {
            System.out.println("Введен некорректный логин");
            return false;
        } catch (WrongPasswordExeption e) {
            System.out.println("Введен некорректный пароль");
            return false;
        } finally {
            System.out.println("Проверка данных завершена");
        }
        return true;
    }

    public static void main(String[] args) {
        String login = "LoginAaaaaBbbbbHjyui1"; //введен 21 символ
        String password = "Aa12345678";
        String confirmPassword = "Aa12345678";

        System.out.println("checkRegisterData = " + checkRegisterData(login, password, confirmPassword));
//        System.out.println("login.matches = " + login.matches("[a-zA-Z0-9_]+"));
//        System.out.println("password.matches = " + password.matches("[a-zA-Z0-9_]+"));
    }
}