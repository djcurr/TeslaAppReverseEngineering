package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l extends a<ImageView> {

    /* renamed from: m  reason: collision with root package name */
    e f20718m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(t tVar, ImageView imageView, w wVar, int i11, int i12, int i13, Drawable drawable, String str, Object obj, e eVar, boolean z11) {
        super(tVar, imageView, wVar, i11, i12, i13, drawable, str, obj, z11);
        this.f20718m = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.a
    public void a() {
        super.a();
        if (this.f20718m != null) {
            this.f20718m = null;
        }
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f20618c.get();
            if (imageView == null) {
                return;
            }
            t tVar = this.f20616a;
            u.c(imageView, tVar.f20741e, bitmap, eVar, this.f20619d, tVar.f20749m);
            e eVar2 = this.f20718m;
            if (eVar2 != null) {
                eVar2.a();
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f20618c.get();
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i11 = this.f20622g;
        if (i11 != 0) {
            imageView.setImageResource(i11);
        } else {
            Drawable drawable2 = this.f20623h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        e eVar = this.f20718m;
        if (eVar != null) {
            eVar.onError(exc);
        }
    }
}