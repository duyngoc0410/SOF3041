package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoNguyenAmServiceTest {

    TinhToanService tt = new TinhToanService();
    @Test void testSoAm() {
        assertTrue(tt.laSoAm(-5));
        assertFalse(tt.laSoAm(0));
        assertFalse(tt.laSoAm(3));
    }
    @Test
    void testSoAm_amBinhThuong() {
        assertTrue(tt.laSoAm(-5));
    }

    @Test
    void testSoAm_zero() {
        assertFalse(tt.laSoAm(0));
    }

    @Test
    void testSoAm_soDuongNho() {
        assertFalse(tt.laSoAm(1));
    }

    @Test
    void testSoAm_soDuongLon() {
        assertFalse(tt.laSoAm(9999));
    }
}