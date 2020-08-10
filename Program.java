public class Program {
    
    public static void main(String[] args) {
        
        // constant
        final String SPACE = " ";
        
        String recipe = "12 $12.72 Beef\n" +
                        "04 Carrots will cost $03.64\n" +
                        "99 I think $00.05 for Herbs";
        // get quantity of A
        int index = recipe.indexOf(SPACE);
        String quantityAStr = recipe.substring(0, index);
        int quantityAInt = Integer.parseInt(quantityAStr);
        // get price of A
        index = recipe.indexOf("$");
        String priceAStr = recipe.substring(index+1, index+5);
        double priceADouble = Double.parseDouble(priceAStr);
        index = recipe.indexOf("\n");
        recipe = recipe.substring(index);
        
        // get quantity of B
        index = recipe.indexOf(SPACE);
        String quantityBStr = recipe.substring(0, index);
        int quantityBInt = Integer.parseInt(quantityBStr);

        // get price of B
        index = recipe.indexOf("$");
        String priceBStr = recipe.substring(index+1, index+5);
        double priceBDouble = Double.parseDouble(priceBStr);
        index = recipe.indexOf("\n");
        recipe = recipe.substring(index);
    }
}