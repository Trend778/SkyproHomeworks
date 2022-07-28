package skypro.course2.HW2_4;

public class LoopChecker implements Checker {

    private static final String valid_symbols = "1234567890_ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    @Override
    public void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        for (int i = 0; i < s.length(); i++) {
            if (!valid_symbols.contains(String.valueOf(s.charAt(i)))) {
                if (login) {
                    throw new WrongLoginException("Логин должен содержать только символы A-z,1-0 или знак подчеркивания");
                } else {
                    throw new WrongPasswordException("Пароль должен содержать только символы A-z,1-0 или знак подчеркивания");
                }
            }
        }
    }
}

