//QUESTION ONE -

public class QuestionOneProduct {

    String productId;
    String productName;
    String unitOfMeasure;

    public QuestionOneProduct() {

    }

    public QuestionOneProduct(String productId,String productName,String unitOfMeasure)
    {
        this.productId=productId;
        this.productName=productName;
        this.unitOfMeasure=unitOfMeasure;
    }
    public String getProductId(){
        return productId;
    }
    public void setProductId(String productId){
        this.productId=productId;
    }
    public  String getProductName(){
        return  productName;
    }
    public void setProductName(String productName)
    {
        this.productName=productName;
    }
    public  String getUnitOfMeasure()
    {
        return  unitOfMeasure;
    }
    public  void setUnitOfMeasure(String unitOfMeasure)
    {
        this.unitOfMeasure=unitOfMeasure;
    }




}
