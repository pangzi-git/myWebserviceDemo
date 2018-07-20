import javax.jws.WebService;

/**
 * Hello world!
 *
 */
@WebService 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //new LinkedList
    }
    
    public String queryName(String name) {  
        System.out.println("webservice--> queryName:" + name);  
        return "hello " + name;  
    }  
      
    public String queryName(String name, String title) {  
        System.out.println("webservice--> queryTile:" + name);  
        return "hello " + name + ",title is " + title;  
    }  
}
