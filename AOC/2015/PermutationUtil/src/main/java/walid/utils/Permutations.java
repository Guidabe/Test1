package walid.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations<Type>{

	private Type[] original;
	private List<Type[]> permutations = new ArrayList<Type[]>();
	
	public Permutations(Type[] original) {
		super();
		this.original = original;
	}

    @SuppressWarnings("unchecked")
	public List<Type[]> getPermutations() {
    	if (permutations.isEmpty()){
        	Type[] permuted = (Type[]) Array.newInstance(original.getClass().getComponentType(), original.length);      	
            boolean used[] = {false, false, false, false, false};
        	permute(0, permuted, used);
    	}
		return permutations;
	}

	void permute(int level, Type[] permuted, boolean[] used) {
        int length = original.length;
        if (level == length) {
            permutations.add(Arrays.copyOf(permuted, permuted.length));
        } else {
            for (int i = 0; i < length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    permuted[level] = original[i];
                    permute(level + 1, permuted, used);
                    used[i] = false;
                }
            }
        }
    }
}
