package qf;

import android.graphics.Bitmap;
import java.util.Set;

/* loaded from: classes3.dex */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Bitmap> f48091a = md.m.b();

    @Override // pd.e
    /* renamed from: h */
    public Bitmap get(int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i11 / 2.0d), Bitmap.Config.RGB_565);
        this.f48091a.add(createBitmap);
        return createBitmap;
    }

    @Override // pd.e, qd.h
    /* renamed from: i */
    public void a(Bitmap bitmap) {
        md.k.g(bitmap);
        this.f48091a.remove(bitmap);
        bitmap.recycle();
    }
}