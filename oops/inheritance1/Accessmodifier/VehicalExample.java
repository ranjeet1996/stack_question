package oops.inheritance1.Accessmodifier;

public class VehicalExample {
    int gears;     // default
    public int seats;

    private String Model="seltos";

    public String getModel(){
        return Model;
    }
    public void setModel(String Model){
        this.Model=Model;
    }

    protected String Brand;

    public void print(){
        System.out.println(gears+" "+seats+ " "+Brand+" "+Model);
    }







    
}
