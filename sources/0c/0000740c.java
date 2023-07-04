package i1;

/* loaded from: classes.dex */
public final class d {
    static {
        new d();
    }

    private d() {
    }

    public static final void a(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }
    }

    public static final void b(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
        }
    }

    public static final void c(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12 + ", size: " + i13);
        } else if (i11 <= i12) {
        } else {
            throw new IllegalArgumentException("fromIndex: " + i11 + " > toIndex: " + i12);
        }
    }
}