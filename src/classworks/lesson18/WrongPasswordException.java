package classworks.lesson18;

public class WrongPasswordException extends Exception {
    private String password;

    public WrongPasswordException(String password) {
        this.password = password;
    }

    public WrongPasswordException(String password, String message) {
        super(message);
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyException{"
                + "detail=" + password
                + ", message=" + getMessage()
                + "} ";
    }

}