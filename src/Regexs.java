import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regexs {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("andika", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Saya Andika");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
