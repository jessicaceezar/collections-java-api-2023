package BasicOperations.List.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    //Attribute
    private List<Item> shoppingCart;

    //Constructor
    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    //Add a new item into the shopping cart
    public void addItem(String name, double price, int quantity){
        shoppingCart.add(new Item(name, price, quantity));
    }

    //Remove an item from the shopping cart (in the future can be used the product id to do this)
    public void delItem(String name){
        List<Item> removeItems = new ArrayList<>();
        for(Item i : shoppingCart){
            if(i.getName().equalsIgnoreCase(name)){
                removeItems.add(i);
            }
        }
        shoppingCart.removeAll(removeItems);
    }

    //Get the order value from the shopping cart
    public double getOrderValue(){
        double value = 0;
        for(Item i : shoppingCart) {
            value = value + (i.getPrice() * i.getQuantity());
        }
        return value;
    }

    //Print all the items in the shopping cart (name, price and quantity)
    public void printShoppingCartItems(){
        System.out.println(shoppingCart);
    }

}
