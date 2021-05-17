package bt3;

public class Tuyensinh {
    static Hocsinh[]hocsinhs = new Hocsinh[5];
    static int size =0;
    public void themmoithisinh(Hocsinh hocsinh){
        hocsinhs[size]=hocsinh;
        size++;
    }
    public void hienthithongtin(Hocsinh hocsinh){
        for(int i =0;i<size;i++){
            System.out.println(hocsinhs[i]+ " , ");
        }
    }
    public static int timkiemtheosobaodanh(int Sobaodanh){
        for(int i =0;i<size;i++){
            if(Sobaodanh == hocsinhs[i].getSobaodanh()){
                return i;
            }
        }
        return -1;
    }
}
