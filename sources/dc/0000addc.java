package qf;

import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f48089a = new SparseIntArray(0);

    public static u a() {
        return new u(0, b(), f48089a);
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}