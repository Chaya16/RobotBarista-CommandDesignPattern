
public class Shots implements IRobotCommand
{

    private IRobotCommand component ;
    private String shots;
    
    public Shots(IRobotCommand c)
    {
        this.component = c ;
    }

    public String getCommand( ) 
    {
        if(shots == null)
            return component.getCommand();
        else
        return  component.getCommand() + " Shots["+shots+"]" ; 
        
    }
    
    public void setOption(String o) 
    {
         shots = o;
    }
    
}
