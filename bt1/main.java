package bt1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Canbo test = new Canbo();
        ManagerOffice managerOffice = new ManagerOffice();
        System.out.println("Nhập lựa chọn");
        System.out.println("1: Thêm");
        System.out.println("2: Tìm Kiếm Theo tên");
        System.out.println("3: Hiển thị ");
        System.out.println("4: Thoát");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1: nhập tên");
                String name = sc.next();
                System.out.println("2: nhập tuổi");
                int age = sc.nextInt();
                System.out.println("3: nhập giới tính");
                String gender = sc.next();
                System.out.println();
                System.out.println("4: nhập địa chỉ");
                String address = sc.next();
                Canbo New = new Canbo(name, age, gender, address);
                managerOffice.Add(New);
                System.out.println(New.toString());
                break;
            case 2:
                System.out.println("nhập tên");
                String name1 = sc.next();
                managerOffice.Seach(name1);
                    break;
            case 3:
                System.exit(0);
            default:
                var name2 = "None";

        }
    }
}
