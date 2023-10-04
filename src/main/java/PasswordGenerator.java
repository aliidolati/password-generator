import java.util.Random;

public class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String OTHER_CHAR = "!@#$%&*()_+-=[]";
    public String generatePassword(int passwordLength) {
        String chars = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR ;
        Random random = new Random() ;
        String password = "" ;
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(chars.length());
            password += chars.charAt(randomIndex) ;
        }
        return password ;
    }
}
