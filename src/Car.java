public class Car {

	private String color;
	private int speed;
	private int maxSpeed;

	
	/**
	 * Creates a new car instance
	 * @param color
	 * @param maxSpeed
	 */
	public Car(String color, int maxSpeed){
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	
	/**
	 * Return the current speed of the car.
	 */
	public int getSpeed(){
		return(this.speed);
	};
	
	/**
	 * Return the current color of the car
	 */
	public String getColor(){
		return(this.color);
	}
	
	/**
	 * Accelerates the car up to the maximum amount
	 * set in the object constructor.
	 * @param amount	The amount the car will accelerate
	 */
	public void accelerate(int amount){
		int limit = this.maxSpeed - this.speed;
		if(amount >= limit){
		  this.speed = limit;
		}else{
		  this.speed+= amount;
		}
	}
	
	/**
	 * Decelerates the car to a specified speed.
	 * Cannot be lower than 0.
	 * 
	 * @param amount	The amount the car will decelerate
	 */
	public void decelerate(int amount) {
		if(amount >= this.speed){
		  this.speed = 0;
		}else{
		  this.speed-= amount;
		}
	}
	
	/**
	 * Displays the object as a string in the format
	 * "Color: red, Speed: 100"
	 */
	public String toString(){
		return("Color: " + getColor() + ", Speed: " + getSpeed());
	}

}
