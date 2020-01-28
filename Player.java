public class Player
{
	private int position;
	private String name;
	private int age;
	private String race;

	public Player(int p, String n, int a, String r)
	{
		position = p;
		name = n;
		age = a;
		race = r;
	}
	public int getPosition()
	{
		return position;
	}
	public void setPosition(int p)
	{
		position = p;
	}
	public String toString()
	{
		String s = "Hi my name is " + name + ". My age is " + age + " and my race is " + race;
		return s;
	}
}