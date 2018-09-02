package classworks.lesson18;

public class Authentication {
    public static void main(String[] args) {
        try {
            isCorrect("login1", "password1", "password1");
            isCorrect("login1login1login1login1login1", "password1", "password1");
            isCorrect("login1", "password1password1password1password1password1", "password1");
            isCorrect("login1", "password1", "password2");
            isCorrect("login1", "password1password1password1", "password1password1password1");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }
        System.out.println("Конец");
    }

    public static boolean isCorrect(String login, String password, String confPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Login" + login + " is wrong");
        }
        if (password.length() > 20 || !password.equals(confPassword)) {
            throw new WrongPasswordException("Password " + password + " is wrong");
        }
        return true;
    }
}

