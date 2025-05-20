package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoAmHayDuongServiceTest {
    TinhToanService tt = new TinhToanService();
    @Test void testKiemTraSoAmDuong() {
        assertEquals("Dương", tt.kiemTraSoAmDuong(10));
        assertEquals("Âm", tt.kiemTraSoAmDuong(-1));
        assertEquals("Không", tt.kiemTraSoAmDuong(0));
    }
}