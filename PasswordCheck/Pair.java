public class Pair {
	private String key;
	private char[] value;

	public Pair(String someKey, char[] someValue) {
		value = someValue;
		key = someKey;
	}

	public String key()
	{
		return key;
	}
	public char[] value()
	{
		return value;
	}

}
