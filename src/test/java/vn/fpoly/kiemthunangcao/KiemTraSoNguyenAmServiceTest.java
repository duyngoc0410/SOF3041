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
}