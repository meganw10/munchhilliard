import java.util.Random;

/**
  describe this class
*/
public class User
{
    // declare private instance vars
    private Restaurant favRestaurant;
    private FoodReview lastReview;
    private int reviewCount;
    private double reviewScoreTotal;
    
    // add more
    private String name;
    
    private String password;

    /**
      describe this constructor
    */
    public User()
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = "none";
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
      describe each method
    */
    public void setFavRestaurant(Restaurant _restaurant)
    {
      restaurant = _restaurant;
    }
  
    /**
      setName(String _name)
      Sets the user's name to a string.
      @param _name the name of the user
    */
    public void setName(String _name)
    {
      name = _name;
    }
     /**
      Sets the users password
      @param _password which is the user's desired password
    */
    public void setPassword(String _password)
    {
      password = _password;
    }
  
    /**
      getName()
      Accesses the name of the user.
      @return the name of the user
    */
    public String getName()
    {
      return name;
    }
  
    
      /**
      returns the users password
      @return password whoch is the user's desired password
    */
    public String getPassword(String _password)
    {
      return password;
    }

}
