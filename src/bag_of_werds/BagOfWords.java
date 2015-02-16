package bag_of_werds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BagOfWords 
{
		static Map<String, Integer> bag_of_words = new HashMap<>();

		public static void main(String[] args) throws IOException 
		{
			String path = "/home/matthias/Workbench/SUTD/ISTD_50.570/assignments/train/atheism";
		    File file = new File( path );
		    new BagOfWords().iterateDirectory(file);
		    
		    for (Map.Entry<String, Integer> entry : bag_of_words.entrySet()) 
		    {
		        System.out.println(entry.getKey()+" : "+entry.getValue());
		    }
		    
		}
		
		private void iterateDirectory(File file) throws IOException 
		{
		    for (File f : file.listFiles()) 
		    {
		        if (f.isDirectory()) 
		        {
		            iterateDirectory(file);
		        } 
		        else 
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
				        	if (!bag_of_words.containsKey(word))
				        	{
				        		bag_of_words.put(word, 0);
				        	}
				        	bag_of_words.put(word, bag_of_words.get(word) + 1);
				        }
		        	    	    
		        	}

		        }
		    }
		}
	}

