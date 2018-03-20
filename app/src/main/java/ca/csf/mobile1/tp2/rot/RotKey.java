package ca.csf.mobile1.tp2.rot;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Doge on 20-Mar-18.
 */

public class RotKey
{
	private final HashMap<Character, Character> rotMap;
	
	public RotKey()
	{
		this.rotMap = new HashMap<Character, Character>();
	}
	
	public void createMapFromArrays(List<Character> keys,
	                                List<Character> values)
	{
		for (int i = 0; i < keys.size(); i++)
		{
			rotMap.put(keys.get(i), values.get(i));
		}
	}
	
	public HashMap<Character, Character> getRotMap()
	{
		return rotMap;
	}
}
