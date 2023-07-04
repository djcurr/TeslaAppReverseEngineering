package gf;

import android.graphics.Bitmap;
import md.k;

/* loaded from: classes3.dex */
public class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final qf.c f27963a;

    /* renamed from: b  reason: collision with root package name */
    private final jf.a f27964b;

    public a(qf.c cVar, jf.a aVar) {
        this.f27963a = cVar;
        this.f27964b = aVar;
    }

    @Override // gf.f
    public qd.a<Bitmap> d(int i11, int i12, Bitmap.Config config) {
        Bitmap bitmap = this.f27963a.get(com.facebook.imageutils.a.d(i11, i12, config));
        k.b(Boolean.valueOf(bitmap.getAllocationByteCount() >= (i11 * i12) * com.facebook.imageutils.a.c(config)));
        bitmap.reconfigure(i11, i12, config);
        return this.f27964b.c(bitmap, this.f27963a);
    }
}