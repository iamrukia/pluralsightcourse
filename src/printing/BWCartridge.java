package printing;

/**
 * Created by nash on 11/06/2017.
 */
public class BWCartridge implements ICartridge{
    @Override
    public String toString()
    {
        return "BW!";
    }

    @Override
    public String getFillPercentage() {
        return "50%";
    }
}
