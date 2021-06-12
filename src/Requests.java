public class Requests {
    private Player user;
    private int startHour, endHour;

    /**
     * parametrized constructor
     * @param user
     * @param startHour
     * @param endHour
     */
    public Requests(Player user, int startHour, int endHour)
    {
        this.user = user;
        this.startHour = startHour;
        this.endHour = endHour;
    }
}