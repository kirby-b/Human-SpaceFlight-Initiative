import java.util.*;

class MissionControl{
  boolean flight;//is the rocket in flight or in free fall
  boolean para = false; // Boolean to tell if parachute is open yet
  Random rand = new Random();
  int upperbound = 100; //making a random number
  int rando = 0 ; // For holding random numbers
  int itemsFound = 0; // Counts how many items have been found
  long height;// how far the rocket is from the ground
  double fuel;//how much fuel the rocket has
  long velocity;//how fast the rocket is going
  double airtime;//how long its been in air
  double fallingtime;//how long has it been falling
  double Missiontime; // How long the mission has been going
  int days = 0;
  int hours = 0;// Minutes, hours, and days in air
  int minutes = 0;
  int fdays = 0;
  int fhours = 0; // Minutes, hours, and days falling
  int fminutes = 0;
  String heightString;
  String velocityString;
  String[] countDown = {"5","4","3","2","1","LIFTOFF"};  //what is says on countdown
  Rocket rocket = new Rocket(); // able to call methods from rocket file
  Launch launch=new Launch();//able to call methods from Launch file


  public void initation(){
      /* Makes sure Astronauts are on the rocket, makes sure fuel is in the rocket
      "makes sure the inventroy " Start countDown */ 
      //System.out.println(/*the name of the rocket */);
      //for(){System.out.print(astro.getName +  astro.getBirth)}   //display it for all astronauts
      Scanner s = new Scanner(System.in);
      System.out.println("How much fuel would you like to put in the rocket?");
      while (true){
        try{
          fuel = s.nextInt();
          break;
        }
        catch(InputMismatchException e){
          System.out.println("Incorrect input! Try again.");
        }
      }
      //Gets fuel
      
      System.out.printf("The rocket has this much fuel the rocket has before Liftoff: %,.2f pounds\n", fuel);//how much fuel before Blastoff
      launch.setFuelMode(); 
      // Gets fuel use
      count(); // starts countdown 
      s.close();
  }
  public void displayInfo(){
      // displays information about the rocket
      
      
      velocity = velocity + (long)launch.Speed("speed");
      while(true){

          if (fuel > 0){
              fuel = fuel - launch.getFuelUse();
              height = (long)rocket.calheight(velocity);
              if (velocity < launch.Speed("max")){
                velocity = velocity + (long)launch.Speed("speed");
              }
              else{
                velocity = (long)launch.Speed("max");
              }
              //Gets speed while you have fuel
          }
          else {
            if (flight == false && height < 10000){
              Landing l = new Landing();
              if (para == false){
                para = l.parachute();
                //Activates parachute
              }
              velocity = (long)(velocity + 100);
              if (velocity > -7){
                velocity = -7;
                //Lowers falling speed to 7 meters per second
              }
              height = (long)rocket.calheight(velocity);
              if (height <= 0){
                height = 0;
                l.landingsequnce(rocket.missiontime());
                //Displays landing
                break;
              }
              // Determines parachute and landing
            }
            else{
              fuel = 0;
              velocity = (long)(velocity - 9.81);
              height = (long)rocket.calheight(velocity);
            }
          }
              // Makes rocket fall at -9.81 meters per second

          flight = rocket.inFlight(velocity);
          flight = rocket.freeFall(velocity);
          //how fast the rocket is going   

          
          int seconds = (int)rocket.flighttime();
        
      
          //Does math for days
          if (seconds > 86400){
              days = seconds / 86400;
              seconds = seconds % 86400;
            }
            // Do the math for hours
            if (seconds > 3600){
              hours = seconds / 3600;
              seconds = seconds % 3600;
            }
            // Do the math for minutes
            if (seconds > 60){
              minutes = seconds / 60;
              seconds = seconds % 60;
            }
      
          int fseconds = (int)rocket.falltime();
          
          //Does math for days
          if (fseconds > 86400){
              fdays = fseconds / 86400;
              fseconds = fseconds % 86400;
            }
            // Do the math for hours
            if (fseconds > 3600){
              fhours = fseconds / 3600;
              fseconds = fseconds % 3600;
            }
            // Do the math for minutes
            if (fseconds > 60){
              fminutes = fseconds / 60;
              fseconds = fseconds % 60;
            }
          try {
              if(flight == true){
                  Thread.sleep(999);
                  System.out.print("The rocket is in flight.\n"+"The rocket is "+height+" meter(s) above the ground\n"+
                  "The rocket has this much fuel left "+fuel+"\nThe rocket is going "+velocity+" meter(s) per seconds.\n");
                  if(airtime<3600){
                  System.out.println("Rocket has been flying for "  + minutes + " minute(s), "  + seconds + " second(s).");
                  }
              
                  if(airtime<86400 && airtime>=3600){ 
                  System.out.println("Rocket has been flying for "  + hours + " hour(s), " + minutes + " minute(s), "  + seconds + " second(s).");
                  }
              
                  if(airtime>=86400){
                  System.out.println("Rocket has been flying for " +days+" day(s) " + hours + " hour(s), " + minutes + " minute(s), "  + seconds + " second(s).");
                  }
              }
              // Prints out flight information

              if(flight == false){
                  Thread.sleep(999);
                  
                  System.out.print("The rocket is falling.\n"+"The rocket is ~"+height+" meter(s) above the ground\n"+
                  "The rocket has this much fuel left "+fuel+"\nThe rocket is falling at ~"+Math.abs(velocity)+" meters per second\n");
                  if(fallingtime<3600){
                  System.out.println("Rocket has been falling for "  + fminutes + " minute(s), "  + fseconds + " second(s).");
                  }
                  if(fallingtime<86400 && fallingtime>=3600){ 
                  System.out.println("Rocket has been falling for "  + fhours + " hour(s), " + fminutes + " minute(s), "  + fseconds + " second(s).");
                  }
                  if(fallingtime>=86400){
                  System.out.println("Rocket has been falling for " +fdays+" day(s) " + fhours + " hour(s), " + fminutes + " minute(s), "  + fseconds + " second(s).");
                  }
              }
              // Displays free fall information
          }
          catch (InterruptedException e) {
              // catch error
              e.printStackTrace();
          }
        }
  }
  public void count(){
    for(int i=0;i<countDown.length;i++){/*steps through every index of array */ 
      try {
          Thread.sleep(1000);// waits 1 second
      } 
      catch (InterruptedException e) {
          // catch  error
          e.printStackTrace();
      }
      System.out.println(countDown[i]);  //prints the countdown
    }
  }
}
