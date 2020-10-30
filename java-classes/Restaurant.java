/**
  describe this class
*/
public class Restaurant
{
    // declare private instance vars
    private int reviewCount;
    private double reviewScoreTotal;
    private String name;
    // add more
    private int capacity;

    /**
      describe this constructor
    */
    public Restaurant(String _name)
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = _name;
    }

    // accessors and mutators here

    /**
      describe each method
    */
    public double getAverageReview()
    {
      // needs completed
      return 0.0;
    }
  
    /**
      sets the restaurant capacity
      @param _capacity , the amount of people the restraunt can hold
      */
    public void setCapacity(int _capacity){
      cpacity = _capacity;
    }
  
   /**
      returns the restaurant capacity
      @return capacity , the amount of people the restraunt can hold
      */
    public int getCapacity(){
      return cpacity;
    }
}
