package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTrungBinhServiceTest {
    TinhToanService tt = new TinhToanService();
    @Test void testTBC_10_20() { assertEquals(15.0, tt.tinhTrungBinhCong(10, 20)); }
    @Test void testTBC_0_0() { assertEquals(0.0, tt.tinhTrungBinhCong(0, 0)); }
    @Test void testTBC_am10_10() { assertEquals(0.0, tt.tinhTrungBinhCong(-10, 10)); }
    @Test void testTBC_1_2() { assertEquals(1.5, tt.tinhTrungBinhCong(1, 2)); }
    @Test void testTBC_50_100() { assertEquals(75.0, tt.tinhTrungBinhCong(50, 100)); }
}