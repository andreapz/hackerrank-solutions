
class TextInput {
	StringBuffer l = new StringBuffer();
	
	public TextInput() {
	}

	public void add(Character c) {
		l.append(c);
	}
	
	public String getValue() {
		return l.toString();
	}
}

class NumericInput extends TextInput {

	public void add(Character c) {
		if(Character.isDigit(c)) {
			l.append(c);
		}
	}
}

public class TestUserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
        
        TextInput inpute = new TextInput();
        inpute.add('v');
        inpute.add('2');
        inpute.add('w');
        System.out.println(inpute.getValue());
    }
}