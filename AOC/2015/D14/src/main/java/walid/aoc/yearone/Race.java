package walid.aoc.yearone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Race {
	
	private static List<Reindeer> reindeers = new ArrayList<>();

	public static List<Reindeer> getReindeers() {
		return reindeers;
	}
	
	public static int maxDistance(int time){
		return reindeers.stream().mapToInt(c -> c.distance(time)).max().getAsInt();
	}
	public static int maxPoints(int time){
		IntStream.rangeClosed(1, time).forEach(c -> {
			int m = Race.maxDistance(c);
			reindeers.forEach( r -> {
				if (r.distance(c) == m) r.incrementPoints();
			});});
		
		return reindeers.stream().mapToInt(r -> r.getPoints()).max().getAsInt();
	}
}
