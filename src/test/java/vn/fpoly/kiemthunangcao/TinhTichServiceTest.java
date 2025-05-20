package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTichServiceTest {
    TinhToanService tt = new TinhToanService();

    @Test void testTich_5_5() { assertEquals(25, tt.tinhTich(5, 5)); }
    @Test void testTich_0_10() { assertEquals(0, tt.tinhTich(0, 10)); }
    @Test void testTich_am2_3() { assertEquals(-6, tt.tinhTich(-2, 3)); }
    @Test void testTich_am5_am2() { assertEquals(10, tt.tinhTich(-5, -2)); }
    @Test void testTich_100_0() { assertEquals(0, tt.tinhTich(100, 0)); }
}