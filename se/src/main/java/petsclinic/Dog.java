package petsclinic;

/**
 * @author k0r0tk0ff
 *
 */
public class Dog implements Animal {
    /**
     * Declare variables
     */
    String nick;
    String owner;
    int age;

    /**
     *
     * @param nick - nick of pet
     * @param owner - owner of pet
     * @param age - age of pet
     */
    public Dog(String nick, String owner, int age) {
        this.nick = nick;
        this.owner = owner;
        this.age = age;
    }

    /**
     *
     * @return nick of pet
     */
    public String getNick() {
        return this.nick;
    }

    /**
     *
     * @return owner of pet
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     *
     * @return age of pet
     */
    public int getAge() {
        return this.age;
    }
}
