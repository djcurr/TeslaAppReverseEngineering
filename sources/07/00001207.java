package ci;

/* loaded from: classes3.dex */
public interface n {
    static int i(int i11) {
        return i11 & 32;
    }

    static int k(int i11) {
        return i11 & 24;
    }

    static int l(int i11) {
        return r(i11, 0, 0);
    }

    static int r(int i11, int i12, int i13) {
        return i11 | i12 | i13;
    }

    static int z(int i11) {
        return i11 & 7;
    }

    int a(i iVar);

    int d();

    String getName();

    int u();
}