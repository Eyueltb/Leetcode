package Zend;

import java.util.stream.IntStream;

/**
 * Write a function that prints every multiple of 4 between 1 and 333. Each number should be printed on a separate line in
 * descending order (the highest number on the first line). It doesn't matter if you print to the console, to an aspx-page or
 * to a WPF textbox.
 */
public class MultipleOfFour {
    private static void PrintMultipleOfFour() {
        for (int i = 133; i >= 1; i--)
        {
           if (i % 4 == 0)
           System.out.println(i);
        }
   }
    private static void PrintMultipleOfFourStream(int from, int to) {
        IntStream.rangeClosed(from,to).map(i->to-i+from).filter(i->i % 4 == 0).forEach(System.out::println);
    }

}