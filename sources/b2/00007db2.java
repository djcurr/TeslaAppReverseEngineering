package ka;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class f implements e {
    @Override // ka.e
    public void a(int i11) {
    }

    @Override // ka.e
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // ka.e
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        return Bitmap.createBitmap(i11, i12, config);
    }

    @Override // ka.e
    public void d() {
    }

    @Override // ka.e
    public Bitmap e(int i11, int i12, Bitmap.Config config) {
        return c(i11, i12, config);
    }
}