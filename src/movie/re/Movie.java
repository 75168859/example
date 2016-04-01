package movie.re;

// Movie: �������࣬����һ��ӰƬ
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
    public double getPrice(){
    	//�жϣ��������price��ʼ��
    	switch (_priceCode) {
		case NEW_RELEASE:
			price = new New1Price();
			break;
		case CHILDRENS:
			price = new ChildPrice();
			break;
		case REGULAR:
			price = new RegularPrice();
			break;
		}
    	
		return price.getPrice();
    }
    
}