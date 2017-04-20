public class Drink implements IRobotCommand
{
    
    private IRobotCommand component ;
    private String drink;
    
    public Drink(IRobotCommand c)
    {
        this.component = c ;
    }

    public String getCommand( ) 
    {
        if(drink == null)
            return component.getCommand();
        else
        return  component.getCommand() + " Drink["+drink+"]" ; 
    }
    public void setOption(String o) 
    {
         drink = o;
    }    
}
