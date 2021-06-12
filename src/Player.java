public class Player extends User
{
    /**
     *method used by the player to book a playground
     * @param obj
     * @param start
     * @param end
     */
    public void booking(Playground obj, int start, int end)
    {

        if(start >= obj.availableHoursStart && end <= obj.availableHoursEnd)
        {
            obj.removeHours(start,end);
        }
        else
        {
            System.out.println("The duration you want to book is not available");
        }
    }
}