public abstract class User
{

    protected String name;
    protected String password;
    protected String email;
    protected String id;
    protected String phone;

    /**
     * Sign Up method for both players and playground owners
     * @param name
     * @param password
     * @param email
     * @param id
     * @param phone
     */
    public void signUp (String name, String password, String email, String id, String phone)
    {
        this.name = name;
        this.password = password;
        this.email = email;
        this.id = id;
        this.phone = phone;
    }
}