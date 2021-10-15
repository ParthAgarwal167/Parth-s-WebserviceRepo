package com.assessment;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ScoreCard
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of batsmen: ");
		int num = sc.nextInt();
		int count=0, total=0;
		Map<String, Integer> scorelist = new HashMap<String, Integer>();
		while (count < num)
		{
			System.out.println("Name and Runs scored by batsman " + (count+1));
			String name = sc.next();
			int runs = sc.nextInt();
			scorelist.put(name, runs);
			count++;
		}
		
		System.out.println("\nPlayers who batted: ");
		Iterator<String> itr = scorelist.keySet().iterator();
		while (itr.hasNext())
		{
			String keyname = itr.next();
			Integer valueruns = scorelist.get(keyname);
			if (valueruns > 0)
				System.out.println(keyname);
		}
		
		System.out.println("\nScores by players: ");
		Iterator<String> itr1 = scorelist.keySet().iterator();
		while (itr1.hasNext())
		{
			String keyname = itr1.next();
			Integer valueruns = scorelist.get(keyname);
			System.out.println(keyname + " : " + valueruns);
			total += valueruns;
		}
		
		System.out.println("\nTotal Scores: " + total);
		
		Iterator<String> itr2 = scorelist.keySet().iterator();
		int maximumruns = Collections.max(scorelist.values());
		while (itr2.hasNext())
		{
			String keyname = itr2.next();
			Integer valueruns = scorelist.get(keyname);
			Integer temp = scorelist.get(keyname+1);
			if (valueruns == maximumruns)
				System.out.println("Highest scorer: " + keyname);
		}
	}
}
