
public class CurrentTimeCalculation {

	
	public static void main(String[] args) {
		
		byte utc = 3;
		
		long currentTimeInMillisecond = System.currentTimeMillis(); // from 1 January,1970 
		
		System.out.println(currentTimeInMillisecond);
		
		long totalSeconds = currentTimeInMillisecond / 1000;
		
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHours = ( totalHours % 24 ) + utc;
		// UTC 
		
		System.out.println(currentHours + ":" + currentMinutes + ":" + currentSeconds );
		
	}
}
