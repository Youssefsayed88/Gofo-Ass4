import javax.naming.Context;
import java.util.ArrayList;

public class PlaygroundOwner extends User {
    public Playground myPlayground;
    private ArrayList<Requests> myRequests;

    /**
     * Method that adds a playground
     * @param myPlayground the playground added
     */
    public void addPlayground(Playground myPlayground) {
        this.myPlayground = myPlayground;
    }
    /**
     * Method that prints the booking request of the playground owner
     */
    void showMyBockings(){
        for(int i = 0;i < myRequests.size(); i++)
        System.out.print(myRequests.get(i));
    }

    /**
     * Method that prints the info of the playground selected
     */
    void showInfo(Playground playground){
        System.out.print(playground);
    }


    /**
     * Method that prints the booking request of the playground owner
     */
    void updateInfo(Playground playground){

    }

}