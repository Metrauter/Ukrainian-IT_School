package homeworks.lesson17.task2;

public class Authentication {
    public boolean isAuthenticated(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login" + login + " is wrong");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Password " + password + " is wrong");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("Логин %s пароль %s подтверждение пароля %s%n", login, password, confPassword);
        }
        return true;
    }
}

