package qf;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class d extends m<Bitmap> {
    @Override // qf.m, qf.r
    /* renamed from: c */
    public Bitmap get(int i11) {
        Bitmap bitmap = (Bitmap) super.get(i11);
        if (bitmap == null || !f(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // qf.r
    /* renamed from: d */
    public int a(Bitmap bitmap) {
        return com.facebook.imageutils.a.e(bitmap);
    }

    protected boolean f(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            nd.a.N("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            nd.a.N("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    @Override // qf.m, qf.r
    /* renamed from: g */
    public void e(Bitmap bitmap) {
        if (f(bitmap)) {
            super.e(bitmap);
        }
    }
}