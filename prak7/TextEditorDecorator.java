interface Text {
	String display();
}

class PlainText implements Text {
	private String content;

	public PlainText(String content) {
		this.content = content;
	}

	@Override
	public String display() {
		return content;
	}
}

abstract class TextDecorator implements Text {
	protected Text decoratedText;

	public TextDecorator(Text decoratedText) {
		this.decoratedText = decoratedText;
	}

	@Override
	public String display() {
		return decoratedText.display();
	}
}

class BoldTextDecorator extends TextDecorator {
	public BoldTextDecorator(Text decoratedText) {
		super(decoratedText);
	}

	@Override
	public String display() {
		return "<b>" + decoratedText.display() + "</b>";
	}
}

class ItalicTextDecorator extends TextDecorator {
	public ItalicTextDecorator(Text decoratedText) {
		super(decoratedText);
	}

	@Override
	public String display() {
		return "<i>" + decoratedText.display() + "</i>";
	}
}

class UnderlineTextDecorator extends TextDecorator {
	public UnderlineTextDecorator(Text decoratedText) {
		super(decoratedText);
	}

	@Override
	public String display() {
		return "<u>" + decoratedText.display() + "</u>";
	}
}

public class TextEditorDecorator {
	public static void main(String[] args) {
		Text text = new PlainText("Hello world");
		System.out.println(text.display());

		Text boldText = new BoldTextDecorator(new PlainText("Hello world"));
		System.out.println(boldText.display());

		Text italicText = new ItalicTextDecorator(new PlainText("Hello world"));
		System.out.println(italicText.display());

		Text underlinedText = new UnderlineTextDecorator(new PlainText("Hello world"));
		System.out.println(underlinedText.display());

		Text allInclusive = new BoldTextDecorator(
				new ItalicTextDecorator(new UnderlineTextDecorator(new PlainText("Hello world"))));
		System.out.println(allInclusive.display());
	}
}
