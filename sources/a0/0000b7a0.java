package ua;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import bb.j;
import com.bumptech.glide.load.resource.bitmap.u;

/* loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f53398a;

    public b(Resources resources) {
        this.f53398a = (Resources) j.d(resources);
    }

    @Override // ua.e
    public ja.c<BitmapDrawable> a(ja.c<Bitmap> cVar, ha.e eVar) {
        return u.d(this.f53398a, cVar);
    }
}