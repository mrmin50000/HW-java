public interface Button {
	void draw();

	void click();
}

public interface Checkbox {
	void draw();

	void check();

}

public class WindowsButton implements Button {
	private boolean isPressed = false;

	@Override
	public void draw() {
		System.out.println("Windows-button was drawn");
	}

	@Override
	public void click() {
		this.isPressed = true;
		System.out.println("Windows-button is clicked");
	}

}

public class WindowsCheckbox implements Checkbox {
	public boolean checked = false;

	@Override
	public void draw() {
		System.out.println("Windows-checkbox was drawn");
	}

	@Override
	public void check() {
		this.checked = true;
		System.out.println("Windows-checkbox is activated");
	}

}

public class MacOSButton implements Button {
	private boolean isPressed = false;

	@Override
	public void draw() {
		System.out.println("MacOS-button was drawn");
	}

	@Override
	public void click() {
		this.isPressed = true;
		System.out.println("MacOS-button is clicked");
	}

}

public class MacOSCheckbox implements Checkbox {
	private boolean checked = false;

	@Override
	public void draw() {
		System.out.println("MacOS-checkbox was drawn");
	}

	@Override
	public void check() {
		this.checked = true;
		System.out.println("MacOS-checkbox is activated");
	}

}

public interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}

public class WinGUIFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}

public class MacGUIFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}

public class UI {
	public static void main(String[] args) {
		Button macButton = new MacOSButton();
		Button winButton = new WindowsButton();
		Checkbox macCheckbox = new MacOSCheckbox();
		Checkbox winCheckbox = new WindowsCheckbox();

		macButton.draw();
		macButton.click();
		winButton.draw();
		winButton.click();
		macCheckbox.draw();
		macCheckbox.check();
		winCheckbox.draw();
		winCheckbox.check();
	}
}
