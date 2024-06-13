package domino_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dominos_pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//button[normalize-space()='ORDER ONLINE NOW']")
	private WebElement clickorderonline;
	
	@FindBy(xpath="//input[@placeholder='Enter your delivery address']")
	private WebElement enterdeliveryaddress;
	
	@FindBy(xpath="//input[@placeholder='Enter Area / Locality']")
	private WebElement enterarea;
	
	@FindBy(xpath="//button[@data-label='Locate_Me']")
	private WebElement locate;
	
	@FindBy(xpath="//div[@class='lst-wrpr']")
	private WebElement suggestions;
	
	@FindBy(xpath="//span[normalize-space()='VEG PIZZA']")
	private WebElement vegpizza;
	
	@FindBy(xpath="//div[@data-label='Recommended']//div[@data-label='Primavera Gourmet-Pizza']//button[@data-label='addTocart']")
	private WebElement gourmetpizza;
	
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[1]")
	private WebElement gourmet2;
	
	@FindBy(xpath="//div[@data-label='Recommended']//div[@data-label='Margherita']//button[@data-label='addTocart']")
	private WebElement margherita;
	
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[2]")
	private WebElement margherita2;
	
	@FindBy(xpath="//div[@data-label='Recommended']//div[@data-label='Peppy Paneer']//span[contains(text(),'ADD TO CART')]")
	private WebElement peppypanner;
	
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[3]")
	private WebElement paneer2;
	
	@FindBy(xpath="//span[normalize-space()='BEVERAGES']")
	private WebElement beverages;
	
	@FindBy(xpath="//div[@data-label='Pepsi 295 ml']//span[contains(text(),'ADD TO CART')]")
	private WebElement pepsi;
	
	@FindBy(xpath="(//div[@class='injectStyles-sc-1jy9bcf-0 gwKvJy'])[9]")
	private WebElement pespiqty;
	
	@FindBy(xpath="//div[@data-label='Pepsi 475ml']//div[@data-label='decrease']")
	private WebElement pepsiremove;
	
	@FindBy(xpath="//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//div[@data-label='decrease']")
	private WebElement marghrem;
	
	@FindBy(xpath="//div[@class='ftr-img']//img[@alt='dominos logo']")
	private WebElement scroll;

	public WebElement getClickorderonline() {
		return clickorderonline;
	}

	public WebElement getEnterdeliveryaddress() {
		return enterdeliveryaddress;
	}

	public WebElement getEnterarea() {
		return enterarea;
	}

	public WebElement getLocate() {
		return locate;
	}

	public WebElement getSuggestions() {
		return suggestions;
	}

	public WebElement getVegpizza() {
		return vegpizza;
	}

	public WebElement getGourmetpizza() {
		return gourmetpizza;
	}

	public WebElement getGourmet2() {
		return gourmet2;
	}

	public WebElement getMargherita() {
		return margherita;
	}

	public WebElement getMargherita2() {
		return margherita2;
	}

	public WebElement getPeppypanner() {
		return peppypanner;
	}

	public WebElement getPaneer2() {
		return paneer2;
	}

	public WebElement getBeverages() {
		return beverages;
	}

	public WebElement getPepsi() {
		return pepsi;
	}

	public WebElement getPespiqty() {
		return pespiqty;
	}

	public WebElement getPepsiremove() {
		return pepsiremove;
	}

	public WebElement getMarghrem() {
		return marghrem;
	}

	public WebElement getScroll() {
		return scroll;
	}
	public dominos_pom(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	

}
