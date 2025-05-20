package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhHieuServiceTest {
    TinhToanService tt = new TinhToanService();

    @Test void testHieu_10_5() { assertEquals(5, tt.tinhHieu(10, 5)); }
    @Test void testHieu_5_10() { assertEquals(-5, tt.tinhHieu(5, 10)); }
    @Test void testHieu_0_0() { assertEquals(0, tt.tinhHieu(0, 0)); }
    @Test void testHieu_100_50() { assertEquals(50, tt.tinhHieu(100, 50)); }
    @Test void testHieu_am10_am5() { assertEquals(-5, tt.tinhHieu(-10, -5)); }
}