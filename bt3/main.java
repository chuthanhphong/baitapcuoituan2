package bt3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tuyensinh tuyensinh = new Tuyensinh();
        System.out.println("Nhập lựa chọn");
        System.out.println("1:Thêm mới thí sinh");
        System.out.println("2:Hiển thị thông tin");
        System.out.println("3: Tìm kiếm theo số báo danh");
        System.out.println("4:Thoát");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("1: Nhập số báo danh");
                int sbd = sc.nextInt();
                System.out.println("2: nhập tên");
                String name = sc.next();
                System.out.println("3: Nhập địa chỉ");
                String add = sc.next();

                System.out.println("4: nhập địa chỉ");
                String address = sc.next();
                Hocsinh hocsinh = new Hocsinh(1,"Chương","NĐ",3);
                tuyensinh.themmoithisinh(hocsinh);
                System.out.println(tuyensinh.toString());
                break;
            case 2:
                System.out.println("Thông tin thí sinh là");

        }
    }
}
