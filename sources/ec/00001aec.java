package com.facebook.yoga;

/* loaded from: classes3.dex */
public class f extends e {
    public void c() {
        long j11 = this.f12953a;
        if (j11 != 0) {
            this.f12953a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j11);
        }
    }

    protected void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}