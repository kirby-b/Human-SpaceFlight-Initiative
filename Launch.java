import java.util.*;

class Launch{

  Random rand = new Random();
  //int upperbound= 2;
  //int rando = rand.nextInt(upperbound);
  double fuelMode = 0;
  double pounds;
  String ans;
  Scanner s = new Scanner(System.in);
    //setting a random number 0-2


  public void launch(){

        Events event = new Events();// getting accses to events class
        event.RandoChoice();
    
  }
    public double getFuelUse(){
      return pounds;
    }

    public void setFuelMode(){
      System.out.println("How many pounds of fuel would you like to burn per second.");
      pounds = s.nextDouble();
      System.out.println("You will be going "+ pounds * 30 + " meters per second.\nIs this ok(please reply with yes, no, y, or n)");
      ans = s.nextLine();
      ans = s.nextLine();
      while (true){
        if (ans.equals("yes") || ans.equals("y")){
          break;
        }
        else if (ans.equals("no") || ans.equals("n")){
          System.out.println("How many pounds of fuel would you like to burn per second.");
          pounds = s.nextDouble();
          System.out.println("You will be going "+ pounds * 30 + " meters per second.\nIs this ok(please reply with yes, no, y, or n)");
          ans = s.nextLine();
          ans = s.nextLine();
        }
        else{
          System.out.println("Invalid input");
          ans = s.nextLine();
        }
      }
      fuelMode = pounds * 30;
    }

public double Speed(String choice){ 

  if (choice.equals("max"))
  {
    return fuelMode;
  }
  else{
    if (fuelMode < 30){
      return fuelMode;
    }
    else{
      return 30.0;
    }
    
  }

} 
}