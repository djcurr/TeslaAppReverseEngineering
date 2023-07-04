package w5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.s;
import w5.g;

/* loaded from: classes.dex */
public final class b implements g<Bitmap> {
    @Override // w5.g
    /* renamed from: d */
    public Object c(t5.b bVar, Bitmap bitmap, c6.g gVar, v5.j jVar, zz.d<? super f> dVar) {
        Resources resources = jVar.e().getResources();
        s.f(resources, "context.resources");
        return new e(new BitmapDrawable(resources, bitmap), false, v5.b.MEMORY);
    }

    @Override // w5.g
    /* renamed from: e */
    public boolean a(Bitmap data) {
        s.g(data, "data");
        return g.a.a(this, data);
    }

    @Override // w5.g
    /* renamed from: f */
    public String b(Bitmap data) {
        s.g(data, "data");
        return null;
    }
}