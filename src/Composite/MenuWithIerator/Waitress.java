package Composite.MenuWithIerator;

import java.util.Iterator;

public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
            MenuComponent component = iterator.next();
            component.print();
        }
    }
}
