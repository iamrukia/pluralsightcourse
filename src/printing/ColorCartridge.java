package printing;

/**
 * Created by nash on 11/06/2017.
 */
public class ColorCartridge implements ICartridge {
    @Override
    public String toString()
    {
        return "Color!";
    }

    @Override
    public String getFillPercentage(){
        return "97%";
    }
}
