package classworks.lesson18;

public class WrongLoginException extends Exception {
    private String login;

    public WrongLoginException(String login) {
        this.login = login;
    }

    public WrongLoginException(String login, String message) {
        super(message);
        this.login = login;
    }

    @Override
    public String toString() {
        return "MyException{"
                + "detail=" + login
                + ", message=" + getMessage()
                + "} ";
    }

}