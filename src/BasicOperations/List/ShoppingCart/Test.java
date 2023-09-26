package BasicOperations.List.ShoppingCart;

public class Test {
    public static void main(String[] args) {

        //initializing the shopping cart list (calling the constructor)
        ShoppingCart myShoppingCart = new ShoppingCart();

        //testing if the shopping cart list was initialized
        System.out.println("Order value: " + myShoppingCart.getOrderValue());

        //adding an item into the shopping cart
        myShoppingCart.addItem("Jeans Pants", 59.99, 1);

        //testing if the item was added into the shopping cart
        System.out.println("Order value: " + myShoppingCart.getOrderValue());

        //adding more items into the shopping cart
        myShoppingCart.addItem("Purple Shirt", 12.89, 1);
        myShoppingCart.addItem("Black Shirt", 12.89, 2);
        myShoppingCart.addItem("White and Black Skirt", 23.99, 2);

        //testing if the items were added into the shopping cart
        System.out.println("Order value: " + myShoppingCart.getOrderValue());

        //removing an item from the shopping cart
        myShoppingCart.delItem("Black Shirt");

        //testing if the item was removed from the shopping cart
        System.out.println("Order value: " + myShoppingCart.getOrderValue());

        //printing the current shopping cart items
        myShoppingCart.printShoppingCartItems();

    }
}
