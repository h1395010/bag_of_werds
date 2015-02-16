package bag_of_werds;

import java.util.HashSet;
import java.util.Set;
import java.io.File;
import java.io.IOException;

public class BagOfWords 
{
	
		static Set<String> global_dict = new HashSet<String>();
	
		static String path = "/home/matthias/Workbench/SUTD/ISTD_50.570/assignments/data/train";

		public static void main(String[] args) throws IOException 
		{
			//each of the diferent categories
			String[] categories = { "/atheism", "/politics", "/science", "/sports"};
			
			for(int cycle = 0; cycle < 4; cycle++)
			{
				String general_data_partition = path + categories[cycle]; 
				
				File file = new File( general_data_partition );
				iterateur.iterateDirectory(file, global_dict, cycle);
				
				//print the data struc				
				for (String s : global_dict)
				    System.out.println( s );
			}
		    
		}
		

	}

