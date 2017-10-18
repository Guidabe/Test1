package walid.aoc.yearone;

/**
 * House class
 *
 */
public class House 
{
	private int absciss;
	private int ordinate;
	
	public House (int absciss, int ordinate){
		this.absciss = absciss;
		this.ordinate = ordinate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + absciss;
		result = prime * result + ordinate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (absciss != other.absciss)
			return false;
		if (ordinate != other.ordinate)
			return false;
		return true;
	}
}
