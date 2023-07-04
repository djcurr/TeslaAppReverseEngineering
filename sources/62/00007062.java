package gf;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public abstract class f {
    public qd.a<Bitmap> a(int i11, int i12) {
        return b(i11, i12, Bitmap.Config.ARGB_8888);
    }

    public qd.a<Bitmap> b(int i11, int i12, Bitmap.Config config) {
        return c(i11, i12, config, null);
    }

    public qd.a<Bitmap> c(int i11, int i12, Bitmap.Config config, Object obj) {
        return d(i11, i12, config);
    }

    public abstract qd.a<Bitmap> d(int i11, int i12, Bitmap.Config config);
}