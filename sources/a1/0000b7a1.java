package ua;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final ka.e f53399a;

    /* renamed from: b  reason: collision with root package name */
    private final e<Bitmap, byte[]> f53400b;

    /* renamed from: c  reason: collision with root package name */
    private final e<ta.c, byte[]> f53401c;

    public c(ka.e eVar, e<Bitmap, byte[]> eVar2, e<ta.c, byte[]> eVar3) {
        this.f53399a = eVar;
        this.f53400b = eVar2;
        this.f53401c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ja.c<ta.c> b(ja.c<Drawable> cVar) {
        return cVar;
    }

    @Override // ua.e
    public ja.c<byte[]> a(ja.c<Drawable> cVar, ha.e eVar) {
        Drawable drawable = cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f53400b.a(com.bumptech.glide.load.resource.bitmap.e.d(((BitmapDrawable) drawable).getBitmap(), this.f53399a), eVar);
        }
        if (drawable instanceof ta.c) {
            return this.f53401c.a(b(cVar), eVar);
        }
        return null;
    }
}