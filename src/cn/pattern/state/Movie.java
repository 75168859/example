package cn.pattern.state;
// Movie: 纯数据类，代表一个影片
public class Movie 
{
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private Price price;
    private String _title;
    private int _priceCode;
    
    public Movie(String title, int priceCode)
    {
        _title = title;
        _priceCode = priceCode;
    }
    
    public int getPriceCode()
    {
        return _priceCode;
    }
    
    public void setPriceCode(int priceCode)
    {
        _priceCode = priceCode;
    }
    
    public String getTitle()
    {
        return _title;
    }
    public double getPrice(int days){
    	switch (_priceCode) {
		case REGULAR :
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildPrice();
			break;
		case NEW_RELEASE:
			price = new NewPrice();
			break;
		}
    	
    	return price.getCharge(days);
    }
}