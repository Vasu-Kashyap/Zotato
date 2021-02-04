import java.util.ArrayList;

public class cart  {
    private ArrayList<fooditem> current;
    private  ArrayList<fooditem> previous;


    public cart()
    {
        this.current = new ArrayList<>();
        this.previous = new ArrayList<>();


    }

    public ArrayList<fooditem> getCurrent() {
        return current;
    }

    public void setCurrent(ArrayList<fooditem> current) {
        this.current = current;
    }

    public void addCurrent(fooditem x, int q , String n)
    {
        this.current.add(new fooditem(x.getName(),x.getPrice(),q,x.getDiscount(),x.getCategory(),n));

    }
    public void addPrevious(fooditem x)
    {
        this.previous.add(x);
    }
    public ArrayList<fooditem> getPrevious() {
        return previous;
    }

    public void setPrevious(ArrayList<fooditem> previous) {
        this.previous = previous;
    }

}
