import java.util.List;
import interfaces.Print;
import loader.PluginLoader;

public class Main {
     public static void main(String[] args) {
    	 List<Print> printList = PluginLoader.load(Print.class);
    	 
    	 for(Print p : printList)
    		 p.print();
     }
}
