public class module9_8 {
   
    static class fan {
        // constants for fan speed
        final static int Slow = 1;
        final static int Medium = 2;
        final static int Fast = 3;
        
        //create data fields
        private int speed;
        private boolean on;
        private double radius;
        String color;
    
        // accessor and mutator for speed data field
        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        //accesor and mutator for boolean data field
        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        //accesor and mutator for double data field
        public double getRadius() {
            return radius;
        }
        
        public void setRadius(double radius) {
            this.radius = radius;
        }

        //accesor and mutator for string data field
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // no-arg constructor for a default fan
        public fan() {
            speed = Slow;
            on = false;
            radius = 5;
            color = "Blue";
        }

        //string method to print out the description of the fan
        public String toString() {
            if (on) {
                return "The fan is on " + speed + ", the color is " + color + ", and the radius is " + radius;
            } else {
                return "The fan is on " + speed + ", the color is " + color + ", and the radius is " + radius;
            }
        }
    }
     
    public static void main(String[] args) {

    // code signature
    System.out.println(" ");
    System.out.println("2024/11/20_EspinosaJonathan_Exercise9.8");
    System.out.println(" ");

    //test program that creates two objects then 
    fan fan1 = new fan ();
    fan1.setSpeed(fan.Fast);
    fan1.setRadius(10);
    fan1.setOn(true);
    fan1.setColor("yellow");
    System.out.println(fan1.toString());

    fan fan2 = new fan ();
    fan2.setSpeed(fan.Medium);
    fan2.setRadius(5);
    fan2.setOn(false);
    fan2.setColor("blue");
    System.out.println(fan2.toString());
    }    
}       
