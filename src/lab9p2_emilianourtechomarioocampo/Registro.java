package lab9p2_emilianourtechomarioocampo;
public class Registro {
    private String OrderID;
    private String ShipMode;
    private String Segment;
    private String State;
    private String ProductID;
    private String OrderDate;
    private String CustomerID;
    private String Country;
    private int PostalCode;
    private String Category;
    private int ShipDate;
    private String CustomerName;
    private String City;
    private String Region;
    private String SubCategory;
    private Double Sales;
    private int Quantity;
    private int Discount;

    public Registro() {
    }

    public Registro(String OrderID, String ShipMode, String Segment, String State, String ProductID, String OrderDate, String CustomerID, String Country, int PostalCode, String Category, int ShipDate, String CustomerName, String City, String Region, String SubCategory, Double Sales, int Quantity, int Discount) {
        this.OrderID = OrderID;
        this.ShipMode = ShipMode;
        this.Segment = Segment;
        this.State = State;
        this.ProductID = ProductID;
        this.OrderDate = OrderDate;
        this.CustomerID = CustomerID;
        this.Country = Country;
        this.PostalCode = PostalCode;
        this.Category = Category;
        this.ShipDate = ShipDate;
        this.CustomerName = CustomerName;
        this.City = City;
        this.Region = Region;
        this.SubCategory = SubCategory;
        this.Sales = Sales;
        this.Quantity = Quantity;
        this.Discount = Discount;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getShipMode() {
        return ShipMode;
    }

    public void setShipMode(String ShipMode) {
        this.ShipMode = ShipMode;
    }

    public String getSegment() {
        return Segment;
    }

    public void setSegment(String Segment) {
        this.Segment = Segment;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getShipDate() {
        return ShipDate;
    }

    public void setShipDate(int ShipDate) {
        this.ShipDate = ShipDate;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getSubCategory() {
        return SubCategory;
    }

    public void setSubCategory(String SubCategory) {
        this.SubCategory = SubCategory;
    }

    public Double getSales() {
        return Sales;
    }

    public void setSales(Double Sales) {
        this.Sales = Sales;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }
    
    
    
}
