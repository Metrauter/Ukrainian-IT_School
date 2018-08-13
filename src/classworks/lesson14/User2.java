package classworks.lesson14;

/**
 * Created by Student on 13.08.2018.
 */
public class User2 {
    private String login, password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User2(String login, String password) {

        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логином %s и паролем %s отправил запрос\n", login, password);
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User2 user = new User2("Василий", "123456");
        user.createQuery();

        User2.Query query1 = user.new Query();
        User2.Query query2 = new User2("Петро", "123456").new Query();
    }
}