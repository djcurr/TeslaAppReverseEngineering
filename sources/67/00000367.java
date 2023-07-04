package androidx.camera.core.impl;

/* loaded from: classes.dex */
public abstract class j1 {

    /* loaded from: classes.dex */
    public enum a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        
        final int mId;

        a(int i11) {
            this.mId = i11;
        }

        int getId() {
            return this.mId;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public static j1 a(b bVar, a aVar) {
        return new c(bVar, aVar);
    }

    public abstract a b();

    public abstract b c();

    public final boolean d(j1 j1Var) {
        return j1Var.b().getId() <= b().getId() && j1Var.c() == c();
    }
}