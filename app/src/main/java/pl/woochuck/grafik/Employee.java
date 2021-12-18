package pl.woochuck.grafik;

import java.util.*;

public class Employee
{
	public static final int HOURS = 16;
	public static final String CC = "CC";
	public static final String BC = "BC";
	public static final String X = "X";
	
	private String name;
	private boolean present;
	private boolean onPushout;
	private boolean individual;
	private List<String> harmonogram;

	public Employee(String name)
	{
		this.name = name;
		this.present = true;
		this.onPushout = false;
		this.individual = false;
		this.harmonogram = new ArrayList<>(HOURS);
		
		for (int i = 0; i < HOURS; i++)
		{
			harmonogram.add("");
		}
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setPresent(boolean present)
	{
		this.present = present;
	}

	public boolean isPresent()
	{
		return present;
	}

	public void setOnPushout(boolean onPushout)
	{
		this.onPushout = onPushout;
	}

	public boolean isOnPushout()
	{
		return onPushout;
	}

	public void setIndividual(boolean individual)
	{
		this.individual = individual;
	}

	public boolean isIndividual()
	{
		return individual;
	}
	
	public boolean isAvailable()
	{
		return present && !onPushout && !individual;
	}
	
	public void setCC(int hour)
	{
		this.harmonogram.set(hour, CC);
	}
	
	public void setBC(int hour)
	{
		this.harmonogram.set(hour, BC);
	}
	
	public void setHarmonogram(int hour, String word)
	{
		this.harmonogram.set(hour, word);
	}
	
	public List<String> getHarmonogram()
	{
		return harmonogram;
	}
	
	public String getHarmonogram(int hour)
	{
		return harmonogram.get(hour);
	}
	
	public void clearHarmonogram()
	{
		for (int i = 0; i < harmonogram.size(); i++)
		{
			setHarmonogram(i, "");
		}
	}
	
	public void setOnPushoutHarmonogram()
	{
		setHarmonogram(4, "P");
		setHarmonogram(5, "U");
		setHarmonogram(6, "S");
		setHarmonogram(7, "H");
		setHarmonogram(8, "O");
		setHarmonogram(9, "U");
		setHarmonogram(10, "T");
	}
	
	public void setAbsentHarmonogram()
	{
		for (int i = 0; i < HOURS; i++)
		{
			setHarmonogram(i, X);
		}
	}
	
	public void setIndividualHarmonogram(int hourBC, int hourCC)
	{
		setHarmonogram(hourBC, BC);
		setHarmonogram(hourCC, CC);
	}
}
