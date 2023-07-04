package qf;

import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f48090a = Runtime.getRuntime().availableProcessors();

    public static SparseIntArray a(int i11, int i12, int i13) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i11 <= i12) {
            sparseIntArray.put(i11, i13);
            i11 *= 2;
        }
        return sparseIntArray;
    }

    public static u b() {
        int i11 = f48090a;
        return new u(4194304, i11 * 4194304, a(131072, 4194304, i11), 131072, 4194304, i11);
    }
}