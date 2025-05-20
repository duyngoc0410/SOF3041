package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimViTriServiceTest {
    TinhToanService tt = new TinhToanService();
    @Test void testTimViTri_found() {
        assertEquals(2, tt.timViTri(new int[]{1, 2, 3, 4}, 3));
    }
    @Test void testTimViTri_notFound() {
        assertEquals(-1, tt.timViTri(new int[]{1, 2, 3}, 5));
    }
}