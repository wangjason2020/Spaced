public class Main {

    public static void main(String[] args) {
	// write your code here
        double distanceAB=Math.sqrt((Math.pow((2.0d-9.0d),2.0d))+Math.pow((5.0d-4.0d),2.0d)+Math.pow((-5.0d-2.0d),2.0d));
        double distanceAC=Math.sqrt((Math.pow((2.0d-2.0d),2.0d))+Math.pow((5.0d+3.0d),2.0d)+Math.pow((-5.0d-6.0d),2.0d));
        double distanceBC=Math.sqrt((Math.pow((9.0d-2.0d),2.0d))+Math.pow((4.0d+3.0d),2.0d)+Math.pow((2.0d-6.0d),2.0d));
        double longest1=Math.max(distanceAB,distanceAC);
        double longest2=Math.max(longest1,distanceBC);
        double shortest1=Math.min(distanceAB,distanceAC);
        double shortest2=Math.min(shortest1,distanceBC);

        System.out.println("The longest distance between drones is "+longest2);
        System.out.println("The shortest distance between drones is "+shortest2);
    }
}
