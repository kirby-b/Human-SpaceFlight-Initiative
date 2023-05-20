class Rocket{
   double height;// how far the rocket is from the ground
   double MaxHeight=0;// what is the farthest point where the rocket is away from the ground
   double velocity;// how fast the rocket is going
   boolean flight=false;//is the rocket in flight or in free fall
   
   double fuel;// how much fuel the rocket has
   double airtime;// how much time rocket has been in air 
   double fallingtime;//how long its been falling
   Launch launch=new Launch();//able to call methods from launch

   //method caluclates max height
   public double calmax(){
      
      if(height>MaxHeight){MaxHeight=height;}    //caluclate MaxHeight
      
      return MaxHeight;
      
   }

   // method that caluclate hieght
   public double calheight(double velocity){
         
      height=height+velocity;


      return height;
   }

   public boolean inFlight(double velocity ){
      
      if(velocity > 0)/* and launch happens */
      {flight=true;}
      return flight;
   }
   //checks for these then returns if  flight is true

   public boolean freeFall(double velocity){

   if(velocity < 0)/*if rocket runs out of gas mid air */
   {flight=false;}
   return flight;
   }
   //checks for these then returns if fall is true
   
   //method for counting once rocket launches 
   public double flighttime(){
   if(flight==true){
      airtime++;
   }
   
   return airtime;
   }
   public double falltime(){
      if(flight==false){
      fallingtime++;
      }
      return fallingtime;
      }



   double missionTime;
   public double missiontime(){
      missionTime = airtime + fallingtime;
      return missionTime;
   }
}