package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {
	public static String value;
	public static String readJSONData(String keyword){
		JSONParser parser=new JSONParser();
		FileReader reader;
		try {
			reader=new FileReader(System.getProperty("user.dir") +"\\CourseSearch.json");
			JSONArray jsonArr=(JSONArray)parser.parse(reader);
			for(Object obj : jsonArr){
				JSONObject jo = (JSONObject)obj;			
				value = (String)jo.get(keyword);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(ParseException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return value;
	}
}
