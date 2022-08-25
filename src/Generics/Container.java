package Generics;

import java.util.ArrayList;

/*
 * The purpose of this class is to show the effectiveness of the second Polymorphism form: Generics
 */
public class Container {
    public static class ListInt{ //Monomorphic class: Implemented only for Integers
        protected ArrayList<Integer> items;

        public ListInt(ListInt ToCopy){
            ToCopy.items.forEach(n -> items.add(n));
        }
        
        public void add(int elem){
            items.add(elem);
        }

        public void print(){
            items.forEach(n -> System.out.println(n));
        }

        public int size(){
            return items.size();
        }
    }

    public static class ListObject{ //Subtyping Polymorphism: The capacity of a parent class to be subtyped to a child one
        protected ArrayList<Object> items;

        public ListObject(ListObject ToCopy){
            ToCopy.items.forEach(o -> items.add(o));
        }

        public void add(Object elem){
            items.add(elem);
        }
        
        public void print(){
            items.forEach(o -> System.out.println(o.toString()));
        }

        public int size(){
            return items.size();
        }
    }

    public static class ListGen<T>{//Generic: A way to create custom type, used a specific type parameter, evaluated at run-time
        protected ArrayList<Object> items; 

        public ListGen(ListGen ToCopy){
            ToCopy.items.forEach(g -> items.add( (T) g));
        }
        
        public void add(Object elem){
            items.add( (T) elem);
        }

        public void print(){
            items.forEach(g -> System.out.println(g.toString()));
        }

        public int size(){
            return items.size();
        }
    }
}
