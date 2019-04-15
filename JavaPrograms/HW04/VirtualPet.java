/**
* HW04 Virtual Pet
*@author Kevin Murphy
*@version 3/24/2019
*
* Top: This Virtual Pet application simulates caring for a pet by providing
* it with basic necessities of life. It responds to what actions you carry
* out and will run away if neglected for too long.
*/
import java.util.Scanner;
// Declare Class Variables to represent pet attributes.
public class VirtualPet
{
    public static final int LOW_STAT_THRESHOLD = 5;
    public static final int MED_STAT_THRESHOLD = 10;
    public static final int HIGH_STAT_THRESHOLD = 14;
    public static final int RUNAWAY_STAT_THRESHOLD = 17;// Initialize the attributes to the "good" starting values;

    static int currentHunger;
    static int currentBoredom;
    static int currentTemperature;
    // Initialize the atrribute rates to the "good" starting values;
    static int hungerRate;
    static int boredomRate;
    static int temperatureRate;

    static String name;
    static int age;
    // Create a variable to represent if the pet has run away. Initialize it to false.
    static boolean escapee = false;

    public static void main(String[] args)
    {
        initialPrompt();
        newPet();

        while(!escapee) {
            // Let the player decide how to interact with the pet.
            System.out.println("It's time to do something with " + name);
            // Display options for the player (1: feed 2: mudbath 3: play);
            System.out.println("What would you like to do with him?");
            System.out.println("");
            // Prompt the user for input to decide which action to do
            System.out.println("Enter 1: To feed " + name);
            System.out.println("Enter 2: To put " + name + " in his mud bath.");
            System.out.println("Enter 3: To play with " + name);

            // Read in the players choice and store it in a "decision" variable
            Scanner input = new Scanner(System.in);
            int interact = input.nextInt();
            // feed the Pet
            if (interact == 1) {
                // Decrease currentHunger by hungerRate
                currentHunger = currentHunger - hungerRate;
                // Increase currentBoredom by boredomeRate
                currentBoredom = currentBoredom + boredomRate;
                // Display to the user what happened
                System.out.println("Your hippo is not as hungry but is a little bored and could\n use some exercise.");
            }

            // put pet in mudbath
            if (interact == 2) {
                // Decrease currentTemperature by hungerRate
                currentTemperature = currentTemperature - hungerRate;
                // Increase currentDirtiness by dirtinessRate
                currentHunger = currentHunger + hungerRate;
                // Display to the user what happened
                System.out.println("Your hippo has cooled off. He does look like\n he could use a bite to eat though.");
            }

            // play with pet
            if (interact == 3) {
                // Decrease currentBoredom by boredomeRate
                currentBoredom = currentBoredom - boredomRate;
                // Increase currentTemperatur by temperatureRate
                currentTemperature = currentTemperature + temperatureRate;
                // Display to the user what happened
                System.out.println("Your hippo worked off some pent up energy, but\n has gotten a little warmer in the process.");
            }
            petBirthday();
            runawayPet();
        }

        //getStatus
        gameStatus();
        System.out.println("Thank you for playing!");
    }

    public static void initialPrompt() {
        System.out.println();
        System.out.println();
        System.out.println("Just as you start to wake up, a higher power determines");
        System.out.println("that today you will be blessed with the task of raising");
        System.out.println("a purse sized pet hippo. He comes with very basic");
        System.out.println("instructions that must be followed to ensure he lives");
        System.out.println("a long enough life to meet a woman hippo his size that");
        System.out.println("he can get down with. Let's see how long you can take");
        System.out.println("care of this exotipottomus.");
        System.out.println();
        System.out.println();
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.println();
        System.out.println();
    }

    // Create a pet to give to the player
    public static void newPet() {
        // Initialize age to 0;
        age = 0;
        // Prompt user to enter the pet name;
        System.out.println("What would you like your hippo's name to be?");
        System.out.println("");
        // Read in the name of the pet and store it in the appropriate variable;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();

        //Initialize attributes
        currentHunger= LOW_STAT_THRESHOLD;
        currentTemperature=LOW_STAT_THRESHOLD;
        currentBoredom=LOW_STAT_THRESHOLD;

        //Initialize rates
        boredomRate=0;
        hungerRate=0;
        temperatureRate=0;

        System.out.println("You have created you pet "+name+". Take good care of him.\n");
    }

    public static void petBirthday() {
    // Increment the age of the pet by 1;
    age++;
    // Print out current age of pet
    System.out.println("You and " + name + " live to see another day!");
    System.out.println("");
    System.out.println(name + " is now " + age + " days old");

        // If the age is evenly divisible by 2 (every other day)
        if (age % 2 == 0) {
            // Increase hungerRate by 1;
            hungerRate++;
            // Inform player that the hungerRate is increased
            System.out.println(name + " gets a little hungrier a little faster.");
        }
        // If age is divisible by 3
        if (age % 3 == 0) {
            // Increase temperatureRate by 1
            temperatureRate++;
            // Inform player that the temperatureRate has been increased;
            System.out.println(name + " is getting a bit hot and would love to cool off in\n a mud bath.");
        }
        // If the age is evenly divisiable by 5
        if (age % 5 == 0) {
            // Increase boredomRate by 1;
            boredomRate++;
            // Inform player that boredomeRate is increased;
            System.out.println(name + " is starting to get a little antsy and is harder\n to keep entertained.");
        }
    }

        public static void getStatus() {
            hungerDescription();
            temperatureDescription();
            boredDescription();
        }
        // Create a String variable hungerDescription, and assign it the value "Hunger Level"
        public static void hungerDescription() {

            // Get a textual description of how well the pet is doing based on the hunger attributes
            if (currentHunger < LOW_STAT_THRESHOLD) {
                System.out.println("Hippo is FULL\n");
            }
            else if (currentHunger < MED_STAT_THRESHOLD) {
                System.out.println("Hippo is getting hungry!\n");
            }
            else if (currentHunger < HIGH_STAT_THRESHOLD) {
                System.out.println("Hippo is starving. Feed him before he JETS!\n");
            }
        // Display the concatenation of hungerDescription and the above textual hungerDescription
        }
        // Create a String variable temperateDescription, and assign it in the value "Temperature Level"
        public static void temperatureDescription() {
            // Get a textual description of how well the pet is doing based on the dirtiness attributes
            if (currentTemperature < LOW_STAT_THRESHOLD) {
                System.out.println("Hippo is HOT\n");
            }
            else if (currentTemperature < MED_STAT_THRESHOLD) {
                System.out.println("Hippo is getting hotter!\n");
            }
            else if (currentTemperature < HIGH_STAT_THRESHOLD) {
                System.out.println("Hippo is getting overheated. He needs a mudbath NOW!\n");
            }
            // Display the concatenation of dirtDescription and the above textual hungerDescription
        }
        // Create a String variable boredDescription, and assign it in the value "Boredom Level"
        public static void boredDescription() {

            // Get a textual description of how well the pet is doing based on the boredom attributes
            if (currentBoredom < LOW_STAT_THRESHOLD) {
                System.out.println("Hippo is BORED\n");
            }
            else if (currentBoredom < MED_STAT_THRESHOLD) {
                System.out.println("Hippo is getting way bored!\n");
            }
            else if (currentBoredom < HIGH_STAT_THRESHOLD) {
                System.out.println("Hippo needs to be entertained ASAP!\n");
            }

        }
    // Create a string variable to store the message

    // If the value provided as input is less than the "LOW_STAT_THRESHOLD" value

        // Set the message variable to be something very positive

    // Else if the value provided as input is less than the "MED_STAT_THRESHOLD"

        // Set the message variable to be slightly concerning

    // Else if the value provided as input is less than the "HIGH_STAT_THRESHOLD"

        // Set the message variable to be somthing urgent

    // Else

        // Set the message variable to be something indivcating there is a serious problem

    // Return the String message variable



        // Figure out if the pet has run away
        public static void runawayPet() {
            // if currentHunger is > runaway threshold
            if (currentHunger > RUNAWAY_STAT_THRESHOLD|| currentTemperature > RUNAWAY_STAT_THRESHOLD ||currentBoredom > RUNAWAY_STAT_THRESHOLD) {
                // Display to the user that the pet ran way because it was too hungry
                System.out.println("I am sorry to have to inform you that" + name + "is on the run with no plan to return home.");
                // Return the boolean literal true
                escapee = true;
            }
        }
    // Let the player know how they did

    //endgamestatus
        public static void gameStatus() {
            // If the player spent< 5 days with Pet
            if (age < 5) {
                // Display a message "Do a better job handling up on your pet's needs fool!"
                System.out.println("Do a better job handling up on your pet's needs fool!");
            }
            // If the player spent > 4 && < 16 days wit the Pet
            else if (age > 4 && age< 16) {
                // Displaay a message "Your pet enjoyed hanging out with you for quite a few days. You must have done something right..."
                System.out.println("Your pet enjoyed hanging out with you for quite a few days. You must have done something right...");
            }
            // If the player spent > 15 && < 26 days with the Pet
            else if (age > 15 && age <= 25) {
                // Display a message "Hot Damn! You must have done a great job caring for your pet!"
                System.out.println("Hot Damn! You must have done a great job caring for your pet!");
            }
            // If the player spent > 25 days with the pet
            else {
                // Display the message "It's time you get yerself a real live pet. Have you considered becoming a vetrinarian?"
                    System.out.println("It's time you get yerself a real live pet. Have you considered becoming a vetrinarian?");
            }
        }


} //end class
