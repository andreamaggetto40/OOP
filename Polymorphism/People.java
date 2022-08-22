package Polymorphism;

public class People {
    public static class Person{ 
        @NotNull protected String name;
        @NotNull protected int age;

        public Person(){};
        public Person(String name,int age){
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "Name is : " + name + " " + "Age is : " + age;
        }
    }
    public static class Student extends Person{
        @NotNull protected String college;

        public Student(){super();}
        public Student(String name, int age, String college){
            super(name,age);
            this.college = college;
        }
        @Override
        public String toString() {
            return super.toString() + "College is : " + college;
        }
        /*
         * A testing main for showcasing how Polymorphism works
         */
        public static void main(String[] args) {
            Person p1 = new Student("Jon Doe",21,"UCLA"); //Subsumption: First Polymorphism form

            System.out.println(p1); //At run-time, the Student ToString method is invoked; This occurs due to Dynamic Dispatching 
        }
    }
}
