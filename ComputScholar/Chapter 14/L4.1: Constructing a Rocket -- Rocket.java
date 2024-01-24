class Rocket
{
    private String destination;
    private double speed;
    
    // student code here - define constructor
    public Rocket(String destination, double speed) {
        this.destination = destination;
        this.speed = speed;
    }





    public void launch()
    {
        System.out.println("Heading for " + destination + " at " + speed + " KPS");
    }
}
