package qf;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public class j implements c {
    @Override // pd.e
    /* renamed from: h */
    public Bitmap get(int i11) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i11 / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // pd.e, qd.h
    /* renamed from: i */
    public void a(Bitmap bitmap) {
        md.k.g(bitmap);
        bitmap.recycle();
    }
}