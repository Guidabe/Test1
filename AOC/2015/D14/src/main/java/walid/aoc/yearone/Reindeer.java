package walid.aoc.yearone;

/**
 * Reindeer class
 *
 */

public class Reindeer{
	private int speed;
	private int speedTime;
	private int restTime;
	
	private int points = 0;
	public int getPoints() {
		return points;
	}

	public Reindeer(int speed, int speedTime, int restTime) {
		super();
		this.speed = speed;
		this.speedTime = speedTime;
		this.restTime = restTime;
	}
	
	public int distance(int time){
		int distance = time / (speedTime + restTime) * speedTime * speed;
		int y = time % (speedTime + restTime);
		if (y / speedTime >=1){
			distance += speedTime * speed;
		}else{
			distance += y % speedTime * speed;
		}
		return distance;
	}
	
	public void incrementPoints(){
		points ++;
	}
}
