public class Decaf implements IRobotCommand
{
    private IRobotCommand component ;
    private String decaf;
    
    public Decaf(IRobotCommand c)
    {
        this.component = c ;
    }

    public String getCommand( ) 
    {
         if(decaf == null)
            return component.getCommand();
        else
        return  component.getCommand() + " Decaf["+decaf+"]" ; 
    }
    
    public void setOption(String o) 
    {
       this.decaf = o;
    }
    
    
}
