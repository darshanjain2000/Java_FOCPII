import java.lang.*;

class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		try {
			if (hour>23 || hour<0 || minute>59 || minute<0 || second>59 || second<0)
				throw new IllegalArgumentException("Invalid Hour, Minute or Seconds");
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		try {
			if (hour>23 || hour<0)
				throw new IllegalArgumentException("Invalid Hours");
			this.hour = hour;
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public void setMinute(int minute) {
		try {
			if (minute>59 || minute<0)
				throw new IllegalArgumentException("Invalid Minutes");
			this.minute = minute;
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public void setSecond(int second) {
		try {
			if (second>59 || second<0)
				throw new IllegalArgumentException("Invalid Seconds");
			this.second = second;
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public String toString() {
		String time = Integer.toString(hour) + ":" + Integer.toString(minute) + ":" + Integer.toString(second);
		return time;
	}

	public MyTime nextSecond() {
		MyTime m = new MyTime();
		++m.second;
		if (m.second >= 60) {
		  	m.second = 0;
		  	++m.minute;
		}
		if (m.minute >= 60) {
		  	m.minute = 0;
		  	++m.hour;
		}
		if (m.hour >= 24) {
		  	m.hour = 0;
		}
		return m;
	}

	public MyTime nextMinute() {
		MyTime m = new MyTime();
		if (m.minute >= 60) {
		  	m.minute = 0;
		  	++m.hour;
		}
		if (m.hour >= 24) {
		  	m.hour = 0;
		}
		return m;
	}

	public MyTime nextHour() {
		MyTime m = new MyTime();
		if (m.hour >= 24) {
		  	m.hour = 0;
		}
		return m;
	}

	public MyTime previousSecond() {
		MyTime m = new MyTime();
		--m.second;
		if (m.second < 0) {
		  	m.second = 59;
		  	--m.minute;
		}
		if (m.minute < 0) {
		  	m.minute = 59;
		  	--m.hour;
		}
		if (m.hour < 0) {
		  	m.hour = 23;
		}
		return m;
	}

	public MyTime previousMinute() {
		MyTime m = new MyTime();
		if (m.minute < 0) {
		  	m.minute = 59;
		  	--m.hour;
		}
		if (m.hour < 0) {
		  	m.hour = 23;
		}
		return m;
	}

	public MyTime previousHour() {
		MyTime m = new MyTime();
		if (m.hour < 0) {
		  	m.hour = 23;
		}
		return m;
	}

}