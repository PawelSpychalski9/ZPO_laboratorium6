public class GameSimulation {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Mission mission1 = new Mission("Gold Coin", 5, inventory);
        Mission mission2 = new Mission("Silver Coin", 3, inventory);

        inventory.addItem("Gold Coin");
        inventory.addItem("Gold Coin");
        inventory.addItem("Gold Coin");
        inventory.addItem("Gold Coin");

        //jak widać działa i misja nie zostanie zakończona jeśli nie zostanie zebrane 5 złotych monet
        //inventory.addItem("Gold Coin");

        inventory.addItem("Silver Coin");
        inventory.addItem("Silver Coin");
        inventory.addItem("Silver Coin");

        inventory.removeItem("Gold Coin");
        inventory.addItem("Gold Coin");
    }
}
