import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory implements Observable {
    private List<Observer> observers;
    private Map<String, Integer> items;

    public Inventory() {
        this.observers = new ArrayList<>();
        this.items = new HashMap<>();
    }

    public void addItem(String item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
        notifyObservers(item, items.get(item));
    }

    public void removeItem(String item) {
        if (items.containsKey(item) && items.get(item) > 0) {
            items.put(item, items.get(item) - 1);
            notifyObservers(item, items.get(item));
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String item, int count) {
        for (Observer observer : observers) {
            observer.update(item, count);
        }
    }
}
