package ta;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class f implements ha.h<c> {

    /* renamed from: b  reason: collision with root package name */
    private final ha.h<Bitmap> f51831b;

    public f(ha.h<Bitmap> hVar) {
        this.f51831b = (ha.h) bb.j.d(hVar);
    }

    @Override // ha.h
    public ja.c<c> a(Context context, ja.c<c> cVar, int i11, int i12) {
        c cVar2 = cVar.get();
        ja.c<Bitmap> eVar = new com.bumptech.glide.load.resource.bitmap.e(cVar2.e(), com.bumptech.glide.c.e(context).h());
        ja.c<Bitmap> a11 = this.f51831b.a(context, eVar, i11, i12);
        if (!eVar.equals(a11)) {
            eVar.recycle();
        }
        cVar2.m(this.f51831b, a11.get());
        return cVar;
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        this.f51831b.b(messageDigest);
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f51831b.equals(((f) obj).f51831b);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        return this.f51831b.hashCode();
    }
}