import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yes = "y";
        String userChoice;
        do {
            System.out.println("Nhập họ và tên sinh viên: ");
            String name = sc.nextLine();
            System.out.println("Nhập địa chỉ sinh viên: ");
            String address = sc.nextLine();
            System.out.println("Nhập tuổi sinh viên: ");
            int age = Integer.parseInt(sc.nextLine());
            switch (name + address + age) {
                case "Duy" + "Chính Kinh" + "23":
                    System.out.println("Thông tin của sinh viên Nguyễn Hoàng Duy:" + "\n" + "...");
                    break;
                case "Tú" + "Cầu Giấy" + "20":
                    System.out.println("Thông tin của sinh viên Nguyễn Văn Tú:" + "\n" + "...");
                    break;
                default:
                    System.out.println("Error");
            }
            System.out.println("Bạn có muốn tiếp tục: ");
            System.out.println("y - Để tiếp tục nhập thông tin!");
            System.out.println("n - Để dừng lại!");
            userChoice = sc.nextLine();
        }
        while (Objects.equals(userChoice, yes));
        System.out.println("Thanks you!");;
    }
}