/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package checkout.app;

import checkout.list.LinkedList;

import static checkout.utilities.StringUtils.join;
import static checkout.utilities.StringUtils.split;
import static checkout.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
