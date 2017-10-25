package walid.aoc.yearone;

public class SymetricPair<Type> {
	private Type key1;
	private Type key2;
	
	public SymetricPair(Type key1, Type key2) {
		super();
		this.key1 = key1;
		this.key2 = key2;
	}
	
	public Type getKey1() {
		return key1;
	}
	public Type getKey2() {
		return key2;
	}

	@Override
	public int hashCode() {
		return key1.hashCode() + key2.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SymetricPair<?> other = (SymetricPair<?>) obj;
		if (!isEqualTo(other))
			return isEqualTo(new SymetricPair<Object>(other.key2, other.key1));
		return true;
	}
	
	private boolean isEqualTo(SymetricPair<?> other){
		if (key1 == null) {
			if (other.key1 != null)
				return false;
		} else if (!key1.equals(other.key1))
			return false;
		if (key2 == null) {
			if (other.key2 != null)
				return false;
		} else if (!key2.equals(other.key2))
			return false;
		return true;
	}
	
}
