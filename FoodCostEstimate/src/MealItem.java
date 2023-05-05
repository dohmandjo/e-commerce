import java.util.HashMap;

public class MealItem {
    // attributes of the MealItem class
    // create a variable to store and show price of the meal as a double
    double Price;
    // create a variable to store and show name of the meal as a string
    String Title;
    // create a variable to store and show a description of the meal in a dictionary
    HashMap<String,Integer> Description = new HashMap<>();
    
    // create a constructor
    public MealItem(Double Price, String Title, HashMap<String,Integer> Description){
        this.Price = Price;
        this.Title = Title;
        this.Description = Description;
    }
}
