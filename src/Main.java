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
            // input if menuChoice = D then
            case ("D"):
                // output "You get a Democratic Donkey!"
                System.out.println("You get a Democratic Donkey!");
                break;
            // input if menuChoice = I then
            case ("I"):
                // output "You get an Independent Eagle!"
                System.out.println("You get an Independent Eagle!");
                break;
            // input if menuChoice = R then
            case ("R"):
                // output "You get a Republican Elephant!"
                System.out.println("You get a Republican Elephant!");
                break;
            // input else
            default:
                // output "You get an Other Otter!"
                System.out.println("You get an Other Otter!");
        }
    }
}