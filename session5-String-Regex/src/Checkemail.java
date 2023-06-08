import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Checkemail {
    public static void main(String[] args) {
        String email = "rikeiacademy@rikkeisoft.com";
        boolean isValid = isValidEmail(email);
        if (isValid) {
            System.out.println("Địa chỉ email hợp lệ");
        } else {
            System.out.println("Địa chỉ email không hợp lệ");
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
