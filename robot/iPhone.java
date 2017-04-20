public class iPhone
{
    String decaf;
    IRobotCommand robot;
    String milk;
    String shots;
    String drink;
   
    
    public iPhone( ) { 
    robot = new Robot();
}

    public void setDecaf(String s)
    {
       
       decaf = s;
    }
    
    public void setShots(String s)
    {
       
        shots =s;
    }

    public void setMilk(String s)
    {
        
        milk =s;
    }
    
    public void setDrink(String s)
    {
        
        drink =s;
    }
    
    public String sendCommand()
    {
        // return command string for robot  
       
        IRobotCommand decafObj = new Decaf(robot);
        decafObj.setOption(decaf);        
        IRobotCommand shotsObj = new Shots(decafObj);
        shotsObj.setOption(shots);
        IRobotCommand milkObj = new Milk(shotsObj);
        milkObj.setOption(milk);
        IRobotCommand drinkObj = new Drink(milkObj);
        drinkObj.setOption(drink);
        
        return drinkObj.getCommand() ; // replace with your code
    }
}                        
