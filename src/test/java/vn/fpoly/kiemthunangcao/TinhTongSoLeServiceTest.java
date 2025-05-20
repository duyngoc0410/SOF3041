package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoLeServiceTest {
    TinhToanService tt = new TinhToanService();
    @Test void testTongLe() {
        assertEquals(9, tt.tongSoLe(new int[]{1, 2, 3, 4, 5}));
    }
}