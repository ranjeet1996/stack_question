package oops.inheritance1.Accessmodifier;

public class samepakagesubclass extends VehicalExample{
    String driver;
    String conductor;
    int noOfPassengers;

    public void print(){
        setModel("kia seltos");
        System.out.println(getModel()+" "+gears+" "+driver+" "+conductor+" "+noOfPassengers+" "+Brand);
    }
}
