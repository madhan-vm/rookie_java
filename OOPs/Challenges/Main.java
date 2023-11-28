package OOPs.Challenges;

public class Main{
    public static void main(String[] args) {
        Burger burger = new Burger( "Regular", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.getAdjustedPrice();
        burger.printItem();


        MealOrder regMeal = new MealOrder();
        
        regMeal.addBurgerToppings("bacon", "cheese", "mayo");
        regMeal.printItemizedList();
    }
}