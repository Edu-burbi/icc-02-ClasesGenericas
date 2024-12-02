package services;

import java.util.ArrayList;
import java.util.List;

public class InventarioGenerico<T> {
    private List<T> items;

    public InventarioGenerico() {
        this.items = new ArrayList<>();
    }

    public void agregar(T item) {
        items.add(item);
    }

    public List<T> obtenerTodos() {
        return items;
    }
}
