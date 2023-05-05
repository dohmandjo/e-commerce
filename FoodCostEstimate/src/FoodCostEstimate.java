//import needed packages
import java.util.HashMap;
import java.util.Map;
//Create the main class
public class FoodCostEstimate {
    
    // create the main function
    public static void main(String[] args) {
        // create a new dictionary to store the meal item and their quantity
        HashMap<String,Integer> Description = new HashMap<>();
        Description.put("grind cassava",1);
        Description.put("fried tuna fish",2);
        Description.put("sliced Onion",3);
        Description.put("sliced tomato",3);
        Description.put("sliced pepper",2);
        Description.put("oil",1);
        Description.put("salt",1);
        Description.put("drink",1);

        // create an instance of the MealItem class and add the values i want to it
        MealItem Garba = new MealItem(18.5, "Garba", Description);
        System.out.println("");
        // print the food chosen by the client, the price, and its description
        System.out.printf("%s $%.2f\n",Garba.Title,Garba.Price);
        System.out.println(Garba.Description);
        System.out.println("");

        //create a dictionary that store the meal item and their cost per unit
        HashMap<String,Double> mealItemCost = new HashMap<>();
        mealItemCost.put("grind cassava",1.5);
        mealItemCost.put("fried tuna fish",1.2);
        mealItemCost.put("sliced Onion",.25);
        mealItemCost.put("sliced tomato",.35);
        mealItemCost.put("sliced pepper",.15);
        mealItemCost.put("oil",.20);
        mealItemCost.put("salt",.05);
        mealItemCost.put("drink",.6);
        
        // create a variable to store the total cost of the meal
        double totalCost = 0;

        // loop through the meal description dictionary 
        // and store the key and values in two separate variables
        for (Map.Entry<String,Integer> entry1:Description.entrySet()){
            // get the keys/food item
            String key = entry1.getKey();
            // get the values/quantity of the food item
            Integer value = entry1.getValue();

            // loop through the meal item cost per unit dictionary 
            // and store the key and values in two separate variables
            for (Map.Entry<String,Double> entry2:mealItemCost.entrySet()){
                // get the keys/the food item
                // get the values/food item price per unit
                String key1 = entry2.getKey();
                Double value1 = entry2.getValue();

                // multiply the cost of the item per unit by the quantity needed for each food item
                if (key == key1){
                    // create a variable to store the cost of each food item
                    double cost = value * value1;
                    // print each food item and their total cost fro the meal
                    System.out.printf("The total cost for %s: $%.2f\n", key ,cost);
                    // add up cost of each item to get the total food cost
                    totalCost+=cost;
                }
                //System.out.println("Key: " + key1 + ", Value: " + value1);
            }
        }
        // print the total cost of the meal
        System.out.println("");
        System.out.printf("The total of cost of the meal is $%.2f\n",totalCost);
    }
}
