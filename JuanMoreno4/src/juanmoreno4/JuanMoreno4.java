package juanmoreno4;

public class JuanMoreno4 {

	public static void main(String[] args) {
		byte seconds, minutes, hours;
		seconds = 0;
		minutes = 0;
		hours = 0;
		boolean ok = true;
		
		while (ok) {
			if (seconds > 59) {
				minutes++;
				seconds = 0;
			}
			if (minutes > 59) {
				hours++;
				minutes = 0;
			}
			System.out.println(hours + ":" + minutes + ":" + seconds);
			seconds++;
			if (seconds == 59 && minutes == 59 && hours == 23)
				ok = false;
		}
	}
}
