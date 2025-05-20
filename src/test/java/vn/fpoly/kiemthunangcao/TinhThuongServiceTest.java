package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhThuongServiceTest {
    TinhToanService tt = new TinhToanService();
    @Test void testThuong_10_2() { assertEquals(5, tt.tinhThuong(10, 2)); }
    @Test void testThuong_9_2() { assertEquals(4, tt.tinhThuong(9, 2)); }
    @Test void testThuong_0_1() { assertEquals(0, tt.tinhThuong(0, 1)); }
    @Test void testThuong_am6_2() { assertEquals(-3, tt.tinhThuong(-6, 2)); }
    @Test void testThuong_10_0_throws() {
        assertThrows(ArithmeticException.class, () -> tt.tinhThuong(10, 0));
    }
}