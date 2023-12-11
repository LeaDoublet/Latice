package latice.model;

public  class Tile {
	private  Color color;
	private  Symbol symbol;
	private Position position;

	public static final Tile NO =null;
	
	public static Tile getNo() {
		return NO;
	}
	
	public Tile(Color color, Symbol symbol, Position position) {
		this.color=color;
		this.symbol=symbol;
		this.position=position;
	}
	public Tile(Color color, Symbol symbol) {
		this.color=color;
		this.symbol=symbol;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public Tile(Color color) {
		this.color = color;
	}
	
	public String ascii() {
		return color.ascii();

	}
	
	public Symbol getSymbol() {
		return symbol;
	}
	
	@Override
	public String toString() {
		return color + " tile ";
	}

	public Position getPosition() {
		return this.position;
	}
}
