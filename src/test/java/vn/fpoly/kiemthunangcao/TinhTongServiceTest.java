package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TinhTongServiceTest {
    TinhToanService tt = new TinhToanService();
    @Test void testTong_0_0() { assertEquals(0, tt.tinhTong(0, 0)); }
    @Test void testTong_1_1() { assertEquals(2, tt.tinhTong(1, 1)); }
    @Test void testTong_5_10() { assertEquals(15, tt.tinhTong(5, 10)); }
    @Test void testTong_1000_1000() { assertEquals(2000, tt.tinhTong(1000, 1000)); }
    @Test void testTong_am5_10() { assertEquals(5, tt.tinhTong(-5, 10)); }
}