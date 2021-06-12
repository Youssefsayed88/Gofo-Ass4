import java.util.ArrayList;


public class Playground {
    static int ID = 0;
    public String playgroundName;
    public int playgroundSize, playgroundPrice,availableHoursStart,availableHoursEnd,id;
    public ArrayList<Integer> availableHours;

    /**
     * constructor
     */
    public Playground()
    {
        ID += 1;
        id = ID;
        playgroundName = " ";
        playgroundSize =  0;
        playgroundPrice = 0;
        availableHoursStart = 0;
        availableHoursEnd = 0;
    }

    public Playground(String playgroundName,int playgroundPrice, int playgroundSize, int availableHoursStart, int availableHoursEnd)
    {
        ID += 1;
        id = ID;
        this.playgroundName = playgroundName;
        this.playgroundPrice = playgroundPrice;
        this.playgroundSize = playgroundSize;
        this.availableHoursStart = availableHoursStart;
        this.availableHoursEnd = availableHoursEnd;
    }
    /**
     * playground name getter
     * @return playground name
     */
    public String getPlaygroundName() {
        return playgroundName;
    }

    /**
     * available hours setter
     * @param availableHours
     */
    public void setAvailableHours(ArrayList<Integer> availableHours)
    {
        for(int i = availableHoursStart; i <= availableHoursEnd; i++)
        {
            availableHours.add(i);
        }
    }

    /**
     * method used to remove the busy hours
     * @param startHour
     * @param endHour
     */
    public void removeHours(int startHour, int endHour)
    {
        for(int i = 0; i <availableHours.size(); i++)
        {
            if(availableHours.indexOf(i) == startHour)
            {
                for(int j = startHour; j <= endHour; j++)
                {
                    availableHours.remove(j);
                }
            }
        }
    }
}