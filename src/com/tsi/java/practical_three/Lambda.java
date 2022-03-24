package com.tsi.java.practical_three;

import java.util.Locale;
import java.util.function.Function;

public class Lambda {

    void greeter(Function<String, String> formatter, String name) {
      String message =  formatter.apply(name);

      System.out.println(message);
    }

    void animalTest(Animals animals) {

        animals.breath(false);
    }

    public static void main(String... args) {

        Lambda lambda = new Lambda();


        lambda.greeter( Lambda::makeUp,
                "shivam"
        );
    }

    static String makeUp(String name) {
        return name.toUpperCase(Locale.ROOT);
    }
}
