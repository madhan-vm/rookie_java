package OOPs.Inheritance.Instances;



public class Car {
    private String make = "Tesla";
    private String model = " Model X";
    private String color = "blue"; 
    private int doors =2;
    private boolean convertible = true;
    public String getModel(){
        return model;
    }
    public int getDoors(){
        return doors;
    }


    public void setMake(String make){
        this.make = make;
    }


    

    public void describecar() {
        System.out
                .println(doors + "Door " + color + " " + make + " " + model + " " + (convertible ? " Convertible" : " "));
    }
    public void setModel(String model){
        this.model = model;
    }

}
