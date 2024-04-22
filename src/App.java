public class App {

    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;

        System.out.println("Loai tam giac: " + triangle(a, b, c));
       
    }
    public static String triangle(int a, int b, int c){
        String loaiTamGiac;
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || a + c <= b) {
            loaiTamGiac = "notATriangle"; // Không phải tam giác
        } else {
            if (a == b && b == c) {
                loaiTamGiac = "Equilateral"; // Tam giác đều
            } else if (a == b || b == c || a == c) {
                loaiTamGiac = "Isosceles"; // Tam giác cân
            } 
            else if ((a*a + b*b == c*c) || (-a*a + b*b == c*c) || (a*a == b*b + c*c)){
                loaiTamGiac = "rightTriangle";
            }
            else {
                loaiTamGiac = "Scalene"; // Tam giác thường
            }
        }

        // Hiển thị kết quả
        return loaiTamGiac;
    }
}
