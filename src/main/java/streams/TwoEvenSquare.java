package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoEvenSquare {

    public static void main(String[] args) {
        TwoEvenSquare twoEvenSquare=new TwoEvenSquare();
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String> words=Arrays.asList("Oracle","Java","Magazine");
        List<Integer> result=twoEvenSquare.evenSquare(numbers);
        result.stream().forEach(System.out::println);
        result=twoEvenSquare.geWordLength(words);
        result.stream().forEach(System.out::println);

    }
                                                                                                                                                                                                                                                                                                                                                                                                               
    private  List<Integer> evenSquare1(List<Integer> numbers) {
           return numbers.stream()
                    .filter(n->{
                        System.out.println("filter"+n);
                        return n%2==0;
                    }).map(n->{
                        System.out.println("filter"+n);
                        return n*n;
                    }).limit(3).collect(Collectors.toList());
    }
    /** To print only 3 square of even numbers form list- filter(to filter only even numbers) then  map n into n*n then limit(3) then collect to list */
    private  List<Integer> evenSquare(List<Integer> numbers) {
        return numbers.stream()
                        .filter(n-> n%2==0)
                        .map(n->n*n).limit(4)
                        .collect(Collectors.toList());
    }
    /** return a list of length of each word in the list
     * @param words*/
    public List<Integer> geWordLength(List<String> words){
        return words.stream()
                .map(String::length)
                .collect(Collectors.toList());
   }
}
