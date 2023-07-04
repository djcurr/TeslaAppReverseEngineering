package be;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import je.i;

/* loaded from: classes.dex */
public class a implements mf.a {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f7624a;

    /* renamed from: b  reason: collision with root package name */
    private final mf.a f7625b;

    public a(Resources resources, mf.a aVar) {
        this.f7624a = resources;
        this.f7625b = aVar;
    }

    private static boolean c(nf.d dVar) {
        return (dVar.R() == 1 || dVar.R() == 0) ? false : true;
    }

    private static boolean d(nf.d dVar) {
        return (dVar.a0() == 0 || dVar.a0() == -1) ? false : true;
    }

    @Override // mf.a
    public boolean a(nf.c cVar) {
        return true;
    }

    @Override // mf.a
    public Drawable b(nf.c cVar) {
        try {
            if (tf.b.d()) {
                tf.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (cVar instanceof nf.d) {
                nf.d dVar = (nf.d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f7624a, dVar.p());
                if (d(dVar) || c(dVar)) {
                    i iVar = new i(bitmapDrawable, dVar.a0(), dVar.R());
                    if (tf.b.d()) {
                        tf.b.b();
                    }
                    return iVar;
                }
                return bitmapDrawable;
            }
            mf.a aVar = this.f7625b;
            if (aVar != null && aVar.a(cVar)) {
                Drawable b11 = this.f7625b.b(cVar);
                if (tf.b.d()) {
                    tf.b.b();
                }
                return b11;
            }
            if (tf.b.d()) {
                tf.b.b();
            }
            return null;
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }
}