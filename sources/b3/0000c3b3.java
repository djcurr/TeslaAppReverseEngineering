package yz;

import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class c extends b {
    public static float c(float f11, float... other) {
        s.g(other, "other");
        for (float f12 : other) {
            f11 = Math.max(f11, f12);
        }
        return f11;
    }

    public static <T extends Comparable<? super T>> T d(T a11, T b11) {
        s.g(a11, "a");
        s.g(b11, "b");
        return a11.compareTo(b11) >= 0 ? a11 : b11;
    }

    public static float e(float f11, float... other) {
        s.g(other, "other");
        for (float f12 : other) {
            f11 = Math.min(f11, f12);
        }
        return f11;
    }
}