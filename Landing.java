class Landing{
    double missionTime;
    Rocket rockets=new Rocket();
    boolean parachute=false;
    
    public boolean parachute(){
        String asciiParachuteRocket = "     ___\n"+
    "  .-'   '-.\n"+
    " /         \\\n"+
    " \\^^^^|^^^^/\n"+
    "  \\   |   /\n"+
    "   \\  |  /\n"+
    "    \\ | /\n"+
    "     \\|/\n"+
    "       ^\n" +
    "      / \\\n" +
    "     /___\\\n" +
    "    |=   =|\n" +
    "    |     |\n" +
    "    |     |\n" +
    "    |     |\n" +
    "    |     |\n" +
    "    |     |\n" +
    "    |     |\n" +
    "    |     |\n" +
    "    |     |\n" +
    "    |     |\n" +
    "   /|##!##|\\\n" +
    "  / |##!##| \\\n" +
    " /  |##!##|  \\\n" +
    "|  / ^ | ^ \\  |\n" +
    "| /  ( | )  \\ |\n" +
    "|/   ( | )   \\|\n";
        System.out.println(asciiParachuteRocket);
        System.out.println("Parachute is now open");
        parachute=true;
        return parachute;
    } 
    public void landingsequnce(double totalTime){
    //The animation for landing
    missionTime = totalTime;
    int mdays = 0;
    int mhours = 0;
    int mminutes = 0;
    int mseconds = (int)missionTime;
    if (mseconds > 86400){
        mdays = mseconds / 86400;
        mseconds = mseconds % 86400;
      }
      // Do the math for hours
    if (mseconds > 3600){
        mhours = mseconds / 3600;
        mseconds = mseconds % 3600;
      }
      // Do the math for minutes
    if (mseconds > 60){
        mminutes = mseconds / 60;
        mseconds = mseconds % 60;
      }
    System.out.println("The rocket is landed");
    if(missionTime<3600){
    System.out.println("This rocket was on a mission for "  + mminutes + " minute(s), "  + mseconds + " second(s).");
    }
    if(missionTime<86400 && missionTime>=3600){
    System.out.println("This rocket was on a mission for "  + mhours + " hour(s), " + mminutes + " minute(s), "  + mseconds + " second(s).");
    }
    if(missionTime>=86400){
    System.out.println("This rocket was on a mission for " +mdays+" day(s) " + mhours + " hour(s), " + mminutes + " minute(s), "  + mseconds + " second(s).");
    }
    }

    public void getout(){
    //Astronauts leave the rocket
    System.out.println("The rocket mission was completed safe-ish");
    }


}
