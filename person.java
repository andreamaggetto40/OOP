public class person{
    private String name; private int age;

    public person(){
        name = ""; age = 0;
    }

    public person(final String name, int age){
        if(name != null && age > 0){
            this.name = name; 
            this.age = age;
        }
    }

    protected String getName(){
        return name;
    }

    protected int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Name is : " + name + " " + "Age is : " + age + "\n";
    }

    @Override
    public boolean equals(Object obj){
        boolean check = true;

        if(obj == null) check = false;
        else{
            if(this != obj) check = false;
            else{
                person toCompare = (person) obj;

                check &= ((name == toCompare.name) && (age == toCompare.age));
            }
        }

        return check;
    }

    @Override
    protected person clone(){
        return new person(name,age);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}