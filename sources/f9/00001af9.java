package com.facebook.yoga;

/* loaded from: classes3.dex */
public class r extends YogaNodeJNIBase {
    public r() {
    }

    protected void finalize() {
        try {
            o0();
        } finally {
            super.finalize();
        }
    }

    public void o0() {
        long j11 = this.f12949e;
        if (j11 != 0) {
            this.f12949e = 0L;
            YogaNative.jni_YGNodeFreeJNI(j11);
        }
    }

    public r(c cVar) {
        super(cVar);
    }
}