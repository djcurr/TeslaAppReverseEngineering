package com.facebook.drawee.view;

import android.net.Uri;
import md.n;

/* loaded from: classes3.dex */
public class e extends d {

    /* renamed from: h  reason: collision with root package name */
    private static n<? extends ge.b> f11106h;

    /* renamed from: g  reason: collision with root package name */
    private ge.b f11107g;

    public static void g(n<? extends ge.b> nVar) {
        f11106h = nVar;
    }

    protected ge.b getControllerBuilder() {
        return this.f11107g;
    }

    public void h(int i11, Object obj) {
        i(ud.d.d(i11), obj);
    }

    public void i(Uri uri, Object obj) {
        setController(this.f11107g.A(obj).a(uri).b(getController()).build());
    }

    public void j(String str, Object obj) {
        i(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(int i11) {
        h(i11, null);
    }

    public void setImageRequest(com.facebook.imagepipeline.request.a aVar) {
        setController(this.f11107g.C(aVar).b(getController()).build());
    }

    @Override // com.facebook.drawee.view.c, android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
    }

    @Override // com.facebook.drawee.view.c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        i(uri, null);
    }

    public void setImageURI(String str) {
        j(str, null);
    }
}