class product{
    // objects
    private String itemNo;
    private String name;
    private float price;
    private int qty;

    //constructors
   public product(String itemno){
       itemNo=itemno;
   }
   public product(String itemno,String name){
       itemNo=itemno;
       this.name=name;
   }
   public product(String itemno,String name,float price,int qty){
       itemNo=itemno;
       setPrice(price);
       setQty(qty);
   }


    // getter & settter.
    public String getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
       return price;
    }
    public int getQty(){
       return qty;
    }
    public void setPrice(float price){
       this.price=price;
    }
    public void setQty(int qty ){
       this.qty=qty;

    }
}
class Customer{

    private String custId;
    private String name;
    private String phoneno;
    private String address;

    public Customer(String custId){
        this.custId=custId;
    }
    public Customer(String custId,String name){
        this.custId=custId;
        this.name=name;
    }
    public Customer(String custId,String name,String address,String phoneno ){
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhoneno(phoneno);
    }

    public String getCustId(){
        return custId;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNo(){
        return phoneno;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setPhoneno(String phoneno){
        this.phoneno=phoneno;
    }
    
}
public class product_customer {
    public static void main(String[] args){

    }
}
