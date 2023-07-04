package ta;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class h implements ha.f<fa.a, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final ka.e f51856a;

    public h(ka.e eVar) {
        this.f51856a = eVar;
    }

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Bitmap> b(fa.a aVar, int i11, int i12, ha.e eVar) {
        return com.bumptech.glide.load.resource.bitmap.e.d(aVar.getNextFrame(), this.f51856a);
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(fa.a aVar, ha.e eVar) {
        return true;
    }
}