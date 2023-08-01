public class MessageDecoder {
	public int decodeCharacter(char ch) {
		return (int) ch;
	}

	MessageDecoder decoder = new MessageDecoder();
	int unicodeValue = decoder.decodeCharacter('A');
	{
	System.out.println(unicodeValue);
}
}