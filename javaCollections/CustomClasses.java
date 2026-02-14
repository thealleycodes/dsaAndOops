package javaCollections;
class Data{
    private  int number;
    private  String name;
    private InternalData internalData;
    Data(int _number , String _name,int _revenue){
        this.number=_number;
        this.name=_name;
        this.internalData = new InternalData(_revenue);
    }
    public void printData(){
        System.out.println(number+" "+name+" "+internalData.revenue);
    }

    public void setName(String _name) {
        this.name = _name;
    }
    public void setNumber(Integer _number){
        this.number=_number;
    }
    public String getName(){
        return name;
    }
    public Integer getNumber(){
        return number;
    }
    
}
class InternalData{
    public Integer revenue;

    public InternalData(Integer _revenue) {
        this.revenue=_revenue;
    }
    
}

    

public class CustomClasses {
    public static void main(String[] args) {
        Data data = new Data(12,"raj",9000) ;
        data.printData();
        // data.setName("rajadsd");
        // data.printData();
        // int[] numbers = {10,2,3,4,5};
        // SortingArrays sc = new SortingArrays(numbers);
        // sc.printArray();
    }
}
