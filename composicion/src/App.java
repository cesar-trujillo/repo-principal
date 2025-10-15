public class App {
    public static void main(String[] args) throws Exception {
        House casa = new House("Rancho Alegre");
        casa.addRoom("comedor", 20);
        casa.addRoom("cocina", 10);

        casa.showRooms();
    }
}
