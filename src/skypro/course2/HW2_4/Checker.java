package skypro.course2.HW2_4;

public interface Checker {
    void check (String s, boolean login) throws WrongLoginException, WrongPasswordException;
}
