package bag_of_werds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class dictionary 
{

	public static void populate_dict(File file, File f, Set<String> global_dict) throws IOException
	{
		String line; 
		BufferedReader br = new BufferedReader(new FileReader( f ));
		
		while ((line = br.readLine()) != null) 
		{
			
			String[] words = line.split(" ");//those are your words
	
			String word;
    
			for (int i = 0; i < words.length; i++) 
			{
				word = words[i];
				if (!global_dict.contains(word))
				{
					global_dict.add(word);
				}
			}	
		}
	}
}


