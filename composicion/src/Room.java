public class Room {
    private String name;
    private double area;

    public Room(String name, double area){
        this.name = name;
        this.area = area;
    }

    public String getNombre(){
        return name;
    }

    public double getArea(){
        return area;
    }
}
