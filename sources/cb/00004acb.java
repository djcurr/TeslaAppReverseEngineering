package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class z extends y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20830a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Context context) {
        this.f20830a = context;
    }

    private static Bitmap j(Resources resources, int i11, w wVar) {
        BitmapFactory.Options d11 = y.d(wVar);
        if (y.g(d11)) {
            BitmapFactory.decodeResource(resources, i11, d11);
            y.b(wVar.f20783h, wVar.f20784i, d11, wVar);
        }
        return BitmapFactory.decodeResource(resources, i11, d11);
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        if (wVar.f20780e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f20779d.getScheme());
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i11) {
        Resources m11 = d0.m(this.f20830a, wVar);
        return new y.a(j(m11, d0.l(m11, wVar), wVar), t.e.DISK);
    }
}