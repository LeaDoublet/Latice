package latice.model;

public enum Color {
	magenta("M"),
	red("R"),
	blue("B"),
	cian("C"),
	yellow("Y"),
	green("G"),
	orange("O");
	
	private final String ascii;

	Color(String ascii) {
		this.ascii = ascii;
	}

	public final String ascii() {
		return this.ascii;
	}
}
