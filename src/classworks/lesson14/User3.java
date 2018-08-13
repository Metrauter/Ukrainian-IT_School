package classworks.lesson14;

/**
 * Created by Student on 13.08.2018.
 */
public class User3 {
    private static String login = "login1", password = "password1";

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        User3.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User3.password = password;
    }

    public static class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логином %s и паролем %s отправил запрос\n", login, password);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        Query query = new Query();
        query.printToLog();
    }
}