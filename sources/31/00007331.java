package hf;

import android.net.Uri;

/* loaded from: classes3.dex */
public class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private static k f29178a;

    protected k() {
    }

    public static synchronized k f() {
        k kVar;
        synchronized (k.class) {
            if (f29178a == null) {
                f29178a = new k();
            }
            kVar = f29178a;
        }
        return kVar;
    }

    @Override // hf.f
    public gd.d a(com.facebook.imagepipeline.request.a aVar, Object obj) {
        return new b(e(aVar.s()).toString(), aVar.o(), aVar.q(), aVar.f(), null, null, obj);
    }

    @Override // hf.f
    public gd.d b(com.facebook.imagepipeline.request.a aVar, Uri uri, Object obj) {
        return new gd.i(e(uri).toString());
    }

    @Override // hf.f
    public gd.d c(com.facebook.imagepipeline.request.a aVar, Object obj) {
        gd.d dVar;
        String str;
        sf.b i11 = aVar.i();
        if (i11 != null) {
            gd.d a11 = i11.a();
            str = i11.getClass().getName();
            dVar = a11;
        } else {
            dVar = null;
            str = null;
        }
        return new b(e(aVar.s()).toString(), aVar.o(), aVar.q(), aVar.f(), dVar, str, obj);
    }

    @Override // hf.f
    public gd.d d(com.facebook.imagepipeline.request.a aVar, Object obj) {
        return b(aVar, aVar.s(), obj);
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}