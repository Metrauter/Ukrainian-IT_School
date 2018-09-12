package classworks.lesson14;

/**
 * Created by Student on 13.08.2018.
 */
public class User {
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

    public User(String login, String password) {

        this.login = login;
        this.password = password;
    }

    public User (){

    }


    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.printf("Пользователь с логином %s и паролем %s отправил запрос\n", login, password);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("Василий", "123456");
        user.createQuery();
    }
}