package bt1;

public class ManagerOffice   {
    static Canbo[] arr = new Canbo[5];
    static int size =0;


    public void Add(Canbo Canbo){
        arr[size] =Canbo;
        size++;
    }
    public static String Seach(String name){
        for(int i =0;i<size ;i++){
            if(name.equals(arr[i].getName()) ){
                return arr[i].toString();
            }
        }
        return "none" ;
    }
    public void Prink(Canbo canbo){
        for(int i =0; i<size;i++){
            System.out.println(arr[i].toString());
        }
    }
}
