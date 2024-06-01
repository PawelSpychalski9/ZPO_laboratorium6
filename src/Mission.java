public class Mission implements Observer {
    private String itemName;
    private int requiredCount;
    private Inventory inventory;

    public Mission(String itemName, int requiredCount, Inventory inventory) {
        this.itemName = itemName;
        this.requiredCount = requiredCount;
        this.inventory = inventory;
        inventory.addObserver(this);
    }

    @Override
    public void update(String item, int count) {
        if (item.equals(itemName) && count >= requiredCount) {
            System.out.println("Mission complete: Collected " + requiredCount + " " + itemName + "(s).");
            inventory.removeObserver(this);
        }
    }
}
