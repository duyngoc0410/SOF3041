package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoNguyenServiceTest {
    TinhToanService tt = new TinhToanService();

    @Test
    void testTongNguyenSoDuong() {
        assertEquals(15, tt.tongNguyen(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testTongNguyenMangRong() {
        assertEquals(0, tt.tongNguyen(new int[]{}));
    }

    @Test
    void testTongNguyenCoSoAm() {
        assertEquals(0, tt.tongNguyen(new int[]{-3, 1, 2}));
    }

    @Test
    void testTongNguyenToanSoAm() {
        assertEquals(-15, tt.tongNguyen(new int[]{-5, -4, -6}));
    }

    @Test
    void testTongNguyenCoSo0() {
        assertEquals(6, tt.tongNguyen(new int[]{0, 1, 2, 3}));
    }
}
