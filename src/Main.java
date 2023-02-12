public class Main {
    public static void main(String[] args) {
        // String with valid choices
        String menuChoice = "";
        String menu = "D - Democrat I - Independent R - Republican";
        // Display for menu
        System.out.println(menu);
        // Initial output/prompt for input from user
        System.out.println("Please enter your party affiliation: " + menuChoice);
        // Simulated Input
        menuChoice = "l";
        menuChoice = menuChoice.toUpperCase();

        switch (menuChoice){
            case ("D"):
                System.out.println("You get a Democratic Donkey!");
                break;
            case ("I"):
                System.out.println("You get an Independent Eagle!");
                break;
            case ("R"):
                System.out.println("You get a Republican Elephant!");
                break;
            default:
                System.out.println("You get an Other Otter!");
        }
    }
}