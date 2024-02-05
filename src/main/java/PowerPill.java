
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */

public class PowerPill
{
    static int DEFAULT_POWER= 10;
    // instance variables
    private String name;
    private int power;
    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */

    public PowerPill(String name){
        setName(name);
        power=DEFAULT_POWER;
    }

    public PowerPill(String name, int power){
        setName(name);
        setPower(power);
    }
     public String getName(){
        return name;
    }
     public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower(){
        return power;
    }

    public String toString(){
        return "PowerPill " + name + " = " + power;

    }


    ////  second half of questions
    // constructors

    // TODO - replace this line with instruction from step 4

    // TODO - replace this line with instruction from step 5


    // accessor methods

    // TODO - replace this line with instruction from step 6


    // mutator methods

    // TODO - replace this line with instruction from step 7

    // toString method

    // TODO - replace this line with instruction from step 8

}