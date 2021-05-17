package bt2;

import java.util.Scanner;

public class BookManagement {
    static Library[] List;


    static int size = 0;


    public BookManagement() {
    }

    public BookManagement(Library[] list) {
        List = list;
    }

    public BookManagement(int size) {
        this.size = size;
    }

    public static void addDocument(Library library) {
        List[size] = library;
        size++;
    }

    public void deleteDocument(Library[] List) {
        System.out.println("Nhập tài liệu cần xóa");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean check = true;
        Library[] arr = new Library[size - 1];
        for (int i = 0; i < List.length; i++) {
            if (name == List[i].getDocumentcode()) {
                for (int j = 0; j < i; j++) {
                    arr[j] = arr[i];
                }
                for (int k = i + 1; k < size; k++) {
                    arr[i - 1] = arr[i];
                }
                check = true;
                break;

            }
            break;
        }
        if (check == true) {
            System.out.println("Các phần tử sau khi xóa là");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " , ");
            }
        }
    }
    public void prink(){
        for(int i =0;i<size;i++){
            System.out.println(List[i].toString());
        }
    }
}