package Composite.MenuComponent;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println(getName() + ": " + getDescription());
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
