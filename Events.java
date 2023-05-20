import java.util.Random;

class Events{
    
    public void RandoChoice(){

        //decided by random rand class
        //Rando is a num between 0-100
        Random rand = new Random();

        int upperbound = 100; //making a random number
        int Rando = rand.nextInt(upperbound);
        //else if loop determine
        //what event will happen
        
        if (Rando==64 || Rando==26 || Rando==94 || Rando==38 || Rando==99){
            AlienAbduct();
        }
        else if (Rando==49 || Rando==12 || Rando==3|| Rando==55 || Rando==100){
            Explosion();
        }
        else if (Rando==39 || Rando==36 ||Rando==86 || Rando==50 || Rando==79){
            StrikingAstronauts();
        }
        else
        {
            NormalTakeOff();
        }

        }


public void AlienAbduct(){
    System.out.println("There has been a Event!");
    System.out.println("Aliens have shown up to Abduct the astronauts.");
    String asciiArt = "     ___\n ___/   \\___\n/   '---'   \\\n'--_______--'\n     / \\\n    /   \\\n    /\\O/\\\n    / | \\\n    // \\\\\n";
    System.out.println(asciiArt);
    System.exit(0);
}


public void Explosion(){
    System.out.println("There has been a Event!");
    System.out.println("There has been a explosion on the Rocket");
    System.out.println("No wonder the astronauts didnt want to be on the rocket...");
    
    String asciiArt = "      _.-^^---....,,--\n" +
    " _--                  --_\n" +
    "<                        >)\n" +
    "|                         |\n" +
    " \\._                   _./\n" +
    "    ```--. . , ; .--'''\n" +
    "          | |   |\n" +
    "       .-=||  | |=-.\n" +
    "       `-=#$%&%$#=-'\n" +
    "          | ;  :|\n" +
    " _____.,-#%&$@%#&#~,._____  ";
System.out.println(asciiArt);
System.exit(0);
}


public void StrikingAstronauts() {
    System.out.println("There has been a Event!");
    System.out.println("Some of the astronauts are Striking");
    System.out.println("They are refusing to get on the rocket.");

    
 String asciiArt = "         _                                      _\n" +
 "      __   |.|       ___________                  | \\\n" +
 "     / .|  | |      /  .  > .   \\                /   \\\n" +
 "    |.' |  |'|     / '  ..  \"    \\____          |.' ~|\n" +
 "____|  .|__| |____/ .  _________ '    \\____..---| .  |__..------_________\n" +
 "    .   _________     |  I do  |   __________   __________  '  |This is  |\n" +
 " .'     |We don't|  ' |NOT feel|  | These    | |  Rockets |  . | a  crash|\n" +
 "        |want to |    |_Safe! _|  |  People  | |  Kill my |    |__SITE!__|\n" +
 "        |__Work!_|        ||  \" . |___Suck___| |_Friends!_|        ||\n" +
 "  '   _____ ||       @@@@@||          ||           ||              ||\n" +
 "     //ovo\\\\||   .. @@*.*@@|     )))) |m .    \\\\ |m       //\"\\\\  ||\n" +
 "      \\_-_/ m|       @\\'/@/|    (~OO~)//      /^v^\\|\\\\  .  //ovo\\\\ |m\n" +
 "     //\\_/\\//| .  '  /( )/       \\--///       \\ o /_//      \\ ~ /  //\n" +
 "    //|   |/        //) (  . '  /|  |         /             //  \\\\//";
System.out.println(asciiArt);
System.exit(0);
}

public void NormalTakeOff() {
    System.out.println("Our Rocket has Successfully Launched!");

    String asciiArt = "       !\n" +
    "       !\n" +
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
    "|/   ( | )   \\|\n" +
    "    ((   ))\n" +
    "   ((  :  ))\n" +
    "   ((  :  ))\n" +
    "    ((   ))\n" +
    "     (( ))\n" +
    "      ( )\n" +
    "       .\n" +
    "       .\n" +
    "       .";
System.out.println(asciiArt);
}
}