package PseudoFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * The class purpose is to showcase one of the Java most advanced feature: Pseudo Functional Programming 
 * Generally speaking, through the Functional Programming, all the functions are considered as values.
 */
public class FunctionalProgramming {
    /*
     * Simple method that maps: String -> String length, through a Function
     */
    public static List<Integer> map(Iterable<String> c, Function<String,Integer> f){
        List<Integer> output = new ArrayList<>();
        
        for(String it : c){
            output.add(f.apply(it));
        }
        return output;
    }
    public static class SimpleAmounter<T> implements Function<T,Integer>{
        private static int counter = 10;
        @Override
        public Integer apply(T t) {
            return ++counter;
        }
    }
    /*
     * Testing main
     */
    public static void main(String[] args) {
        Iterable<Integer> items = new ArrayList<>(List.of(1,2,3,4,5));

        items.forEach(new Consumer<Integer>() { //Anonynous class
            @Override
            public void accept(Integer t) {
                System.out.println(t);
            }
        });

        items.forEach((n) -> System.out.println(n)); //Lambda function: Consumer

        List<Integer> lengths = map(new Iterable<>(List.of("Hello","World","I'm","John","Doe")),new Function<String,Integer>() {
            @Override
            public Integer apply(String t) {
                return t.length();
            }  
        }); //Function called through map method


        List<Integer> amounter = new ArrayList<>();
        
        for(int it : items){
            amounter.add(new SimpleAmounter<>().apply(it));
        } //Function called through a static inner class
    }
}
