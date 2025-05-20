package vn.fpoly.kiemthunangcao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimViTriServiceTest {
    TinhToanService tt = new TinhToanService();

    @Test
    void testTimViTri_found() {
        assertEquals(2, tt.timViTri(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    void testTimViTri_notFound() {
        assertEquals(-1, tt.timViTri(new int[]{1, 2, 3}, 5));
    }

    @Test
    void testTimViTri_emptyArray() {
        assertEquals(-1, tt.timViTri(new int[]{}, 1));
    }

    @Test
    void testTimViTri_firstPosition() {
        assertEquals(0, tt.timViTri(new int[]{7, 8, 9}, 7));
    }

    @Test
    void testTimViTri_lastPosition() {
        assertEquals(3, tt.timViTri(new int[]{10, 20, 30, 40}, 40));
    }
}