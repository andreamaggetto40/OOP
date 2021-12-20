import java.util.Vector;

public class student extends person{    
    private int ID; private String uni;

    public student(){
        super();
        ID = 0; uni = "";
    }
    
    public student(final String name, int age, final int ID, String uni){
        super(name,age);
        
        if(ID > 0 && uni != null){
            this.ID = ID;
            this.uni = uni;
        }
    }

    public int getID(){
        return ID;
    }

    public String getUni(){
        return uni;
    }

    @Override
    public String toString(){
        return super.toString() + "ID is : " + ID + " " + "Uni is : " + uni;
    }

    public int sum(int a,int b){
        return a + b;
    }

    public double sum(double a,double b){
        System.out.println("float method called!\n");

        return a + b;
    }
}
