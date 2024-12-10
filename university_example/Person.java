public abstract class Person{

    String name;
    String address;
    String doB;
    String sin;


    public void print(){
        System.out.println("Hey, I am of class Person");
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDoB() {
        return doB;
    }
    public void setDoB(String doB) {
        this.doB = doB;
    }
    public String getSin() {
        return sin;
    }
    public void setSin(String sin) {
        this.sin = sin;
    }

    


}