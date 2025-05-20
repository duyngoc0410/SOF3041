package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoAmHayDuongServiceTest {
    TinhToanService tt = new TinhToanService();

    @Test
    void testSoDuong() {
        assertEquals("Dương", tt.kiemTraSoAmDuong(10));
    }

    @Test
    void testSoAm() {
        assertEquals("Âm", tt.kiemTraSoAmDuong(-1));
    }

    @Test
    void testSoKhong() {
        assertEquals("Không", tt.kiemTraSoAmDuong(0));
    }

    @Test
    void testSoDuongBien() {
        assertEquals("Dương", tt.kiemTraSoAmDuong(1));
    }

    @Test
    void testSoAmBien() {
        assertEquals("Âm", tt.kiemTraSoAmDuong(-1));
    }
}