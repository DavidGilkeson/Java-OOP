
public class SearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Product arr[] = new Product[5];
		arr[0] = new Product(101, "Nike", "Runners");
		arr[1] = new Product(102, "Rayban", "Sunglasses");
		arr[2] = new Product(103, "Samsung", "Phone");
		arr[3] = new Product(104, "Adidas", "Runners");
		arr[4] = new Product(105, "Dining table", "Furniture");
		
		
		int searchKey = 104;
		
		for(Product p:arr)
		{
			
			if(p.getProductId() == searchKey)
			{
				
				System.out.println("Product Id : " + p.getProductId());
				System.out.println("Product Id : " + p.getProductName());
				System.out.println("Product Id : " + p.getProductCategory());

			}
		}
	}

}

class Product
{
	
	int productId;
	String productName;
	String productCategory;
	
	Product(int pId, String pName, String pCategory)
	{
		productId = pId;
		productName = pName;
		productCategory = pCategory;
		
	}
	
	public int getProductId()
	{
		
		return productId;
	}
	
	public String getProductName()
	{
		
		return productName;
	}
	
	public String getProductCategory()
	{
	return productCategory;
	
	}
		
	
	
	
}
