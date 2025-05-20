package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoLeServiceTest {
    TinhToanService tt = new TinhToanService();

    @Test
    void testTongLe_MixChanLe() {
        assertEquals(9, tt.tongSoLe(new int[]{1, 2, 3, 4, 5})); // 1 + 3 + 5
    }

    @Test
    void testTongLe_ChiLe() {
        assertEquals(15, tt.tongSoLe(new int[]{1, 3, 5, 1, 5}));
    }

    @Test
    void testTongLe_KhongCoLe() {
        assertEquals(0, tt.tongSoLe(new int[]{2, 4, 6, 8}));
    }

    @Test
    void testTongLe_MangRong() {
        assertEquals(0, tt.tongSoLe(new int[]{}));
    }

    @Test
    void testTongLe_AmDuongChanLe() {
        assertEquals(3, tt.tongSoLe(new int[]{-3, -2, 0, 1, 5})); // -3 + 1 + 5 = 3 (nếu tính đúng với định nghĩa số lẻ)
    }
}
