package com.inherit;

abstract class Player
{
	String name;
	Player(String name)
	{
		this.name = name;
	}
	abstract void play();
}
class CricketPlayer extends Player
{
	CricketPlayer(String name)
	{
		super(name);
	}
	void play()
	{
		System.out.println(name + " is a cricket player.");
	}
}
class FootbalPlayer extends Player
{
	FootbalPlayer(String name)
	{
		super(name);
	}
	void play()
	{
		System.out.println(name + " is a football player.");
	}
}

public abstract class ExamplePlayer
{
	public static void main(String args[])
	{
	    Player player = new CricketPlayer("Dhoni");
		player.play();
		
		Player player1 = new FootbalPlayer("Messi");
		player1.play();
	}
}