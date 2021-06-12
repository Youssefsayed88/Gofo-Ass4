public class GoFo {
    public static void main(String[] args)
    {
        Player playerObj = new Player();
        PlaygroundOwner ownerObj = new PlaygroundOwner();

        Playground playgroundObj = new Playground("Kora4All", 50, 5, 1, 11);

        ownerObj.addPlayground(playgroundObj);

        playerObj.signUp("ahmed","123","email","1","0109");
    }
}