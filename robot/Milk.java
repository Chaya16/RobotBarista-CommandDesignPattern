public class Milk implements IRobotCommand
{

    private IRobotCommand component ;
    private String milk;

    public Milk(IRobotCommand c)
    {
        this.component = c ;
    }

    public String getCommand( ) 
    {
         return  component.getCommand() + " Milk["+milk+"]" ;
    }
    
    public void setOption(String o) 
    {
        this.milk = o ; 
    }
    
}
