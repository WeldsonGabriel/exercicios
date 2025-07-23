package hardMode;

public class GroupElementsBy10 {
    public static void main(String[] args) {
        //Objective: Use a Map<String, List<String>>.
        //Group food items by type:
        //javaCopiarEditarFruits: ["Apple", "Banana"]
        //Vegetables: ["Carrot", "Broccoli"]
        //Use a Map<String, List<String>>
        //Add at least 3 categories and items
        //Print all groups
        java.util.Map<String, java.util.List<String>> foodGroups = new java.util.HashMap<>(); // Cria um HashMap para armazenar grupos de alimentos
        // Adiciona frutas ao grupo "Fruits"
        foodGroups.put("Fruits", new java.util.ArrayList<>()); // Cria uma lista para frutas
        foodGroups.get("Fruits").add("Apple"); // Adiciona "Apple" à lista de frutas
        foodGroups.get("Fruits").add("Banana"); // Adiciona "Banana" à lista de frutas
        // Adiciona vegetais ao grupo "Vegetables"
        foodGroups.put("Vegetables", new java.util.ArrayList<>()); // Cria uma lista para vegetais
        foodGroups.get("Vegetables").add("Carrot"); // Adiciona "Carrot" à lista de vegetais
        foodGroups.get("Vegetables").add("Broccoli"); // Adiciona "Broccoli" à lista de vegetais
        // Adiciona laticínios ao grupo "Dairy"
        foodGroups.put("Dairy", new java.util.ArrayList<>()); // Cria uma lista para laticínios
        foodGroups.get("Dairy").add("Milk"); // Adiciona "Milk" à lista de laticínios
        foodGroups.get("Dairy").add("Cheese"); // Adiciona "Cheese" à lista de laticínios
        // Adiciona grãos ao grupo "Grains"
        foodGroups.put("Grains", new java.util.ArrayList<>()); // Cria uma lista para grãos
        foodGroups.get("Grains").add("Rice"); // Adiciona "Rice" à lista de grãos
        foodGroups.get("Grains").add("Bread"); // Adiciona "Bread" à lista de grãos
        // Imprime todos os grupos de alimentos
        System.out.println("Food Groups:"); // Exibe o título dos grupos de alimentos
        for (java.util.Map.Entry<String, java.util.List<String>> entry : foodGroups.entrySet()) { // Itera sobre as entradas do HashMap
            String groupName = entry.getKey(); // Obtém o nome do grupo
            java.util.List<String> items = entry.getValue(); // Obtém a lista de itens do grupo
            System.out.println(groupName + ": " + items); // Imprime o nome do grupo e seus itens
        }
        System.out.println("End of the program."); // Mensagem de fim de programa
    }
}
