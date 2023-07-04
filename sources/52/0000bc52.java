package w5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.s;
import w5.g;

/* loaded from: classes.dex */
public final class d implements g<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    private final v5.g f55607a;

    public d(v5.g drawableDecoder) {
        s.g(drawableDecoder, "drawableDecoder");
        this.f55607a = drawableDecoder;
    }

    @Override // w5.g
    /* renamed from: d */
    public Object c(t5.b bVar, Drawable drawable, c6.g gVar, v5.j jVar, zz.d<? super f> dVar) {
        boolean k11 = g6.e.k(drawable);
        if (k11) {
            Bitmap a11 = this.f55607a.a(drawable, jVar.d(), gVar, jVar.i(), jVar.a());
            Resources resources = jVar.e().getResources();
            s.f(resources, "context.resources");
            drawable = new BitmapDrawable(resources, a11);
        }
        return new e(drawable, k11, v5.b.MEMORY);
    }

    @Override // w5.g
    /* renamed from: e */
    public boolean a(Drawable data) {
        s.g(data, "data");
        return g.a.a(this, data);
    }

    @Override // w5.g
    /* renamed from: f */
    public String b(Drawable data) {
        s.g(data, "data");
        return null;
    }
}