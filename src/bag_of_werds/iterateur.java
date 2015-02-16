package bag_of_werds;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class iterateur 
{
	static void iterateDirectory(File file, Set<String> global_dict, int cycle) throws IOException 
	{
	    for (File f : file.listFiles()) 
	    {
	        if (f.isDirectory()) 
	        {
	            iterateDirectory(file, global_dict, cycle);
	        } 
	        else 
	        {
	        	if (cycle < 4)
	        	{
	        		dictionary.populate_dict(file, f, global_dict);
	        	}
	        	else
	        	{
	        		//create feature vector
	        	}
	        }
	    }
	}
}