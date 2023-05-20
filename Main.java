import java.util.*;
class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Launch l = new Launch();
        MissionControl m = new MissionControl();
        String answer = "";
        //Creates objects
        while (true){
            System.out.println("Continuing to launch and rocket set up process.");
            m.initation();
            l.launch();
            m.displayInfo();
            // Does the launch process
            System.out.println("Would you like to continue or exit");
            answer = sc.nextLine();
            if (answer == "exit"){
                sc.close();
                System.exit(0);
            }
            else if (answer == "continue"){
                ;
            }
            else{
                System.out.println("Incorrect input please put in a number");
                answer = sc.nextLine();
                //Checks input
            }
        }
    }
}