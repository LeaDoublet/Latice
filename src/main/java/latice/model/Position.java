package latice.model;

import java.util.Objects;

public class Position {
	@Override
	public int hashCode() {
		return Objects.hash(column, row);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		return Objects.equals(column, other.column) && Objects.equals(row, other.row);
	}

	private final Integer column;
	private final Integer row;

	public Position(Integer row, Integer column) {
		this.column = column;
		this.row = row;
	}

	public Integer row() {
		return row;
	}

	public Integer column() {
		return column;
	}

	@Override
	public String toString() {
		return row.toString() + "," + column.toString();
	}

	public Integer getColumn() {
		return column;
	}

	public Integer getRow() {
		return row;
	}
}
