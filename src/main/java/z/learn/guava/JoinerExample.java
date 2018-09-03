package z.learn.guava;

import com.google.common.base.Joiner;

public class JoinerExample {

    public void example() {
        Joiner joiner = Joiner.on("; ").skipNulls();
        Joiner joiner2 = Joiner.on("; ");
        String str = joiner.join("Harry", null, "Ron", "Hermione");
        System.out.println(str);
        try {
            String str2 = joiner2.join("Harry", null, "Ron", "Hermione");
            System.out.println(str2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        }
    }
}
/**
 * Exception
 *     public String toString() {
 *         String s = getClass().getName();
 *         String message = getLocalizedMessage();
 *         return (message != null) ? (s + ": " + message) : s;
 *     }
 */
