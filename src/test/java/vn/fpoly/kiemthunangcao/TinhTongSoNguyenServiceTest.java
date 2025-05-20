package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoNguyenServiceTest {
    TinhToanService tt = new TinhToanService();
    @Test void testTongNguyen() {
        assertEquals(15, tt.tongNguyen(new int[]{1, 2, 3, 4, 5}));
    }
}