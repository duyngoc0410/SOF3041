package vn.fpoly.kiemthunangcao;

public class TinhToanService {
    public static int tinhTong(int a, int b) {
        return a + b;
    }
    public int tinhHieu(int a, int b) {
        return a - b;
    }

    public int tinhTich(int a, int b) {
        return a * b;
    }
    public int tinhThuong(int a, int b) {
        if (b == 0) throw new ArithmeticException("Không chia được cho 0");
        return a / b;
    }

    public double tinhTrungBinhCong(int a, int b) {
        return (a + b) / 2.0;
    }
    public int timViTri(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public int tongNguyen(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }
    public int tongSoLe(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 != 0) sum += i;
        }
        return sum;
    }

    public boolean laSoAm(int n) {
        return n < 0;
    }
    public String kiemTraSoAmDuong(int n) {
        return (n > 0) ? "Dương" : (n < 0 ? "Âm" : "Không");
    }
}
