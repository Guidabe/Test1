package walid.aoc.yearone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation<Type>{

	private List<Type[]> permutations = new ArrayList<Type[]>();
	
    public List<Type[]> getPermutations() {
		return permutations;
	}

	void permute(int level, Type[] permuted, boolean[] used, Type[] original) {
        int length = original.length;
        if (level == length) {
            permutations.add(Arrays.copyOf(permuted, permuted.length));
        } else {
            for (int i = 0; i < length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    permuted[level] = original[i];
                    permute(level + 1, permuted, used, original);
                    used[i] = false;
                }
            }
        }
    }
}
