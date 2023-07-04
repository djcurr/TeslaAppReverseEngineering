package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class g extends y {

    /* renamed from: a  reason: collision with root package name */
    final Context f20695a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context) {
        this.f20695a = context;
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        return "content".equals(wVar.f20779d.getScheme());
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i11) {
        return new y.a(okio.r.k(j(wVar)), t.e.DISK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputStream j(w wVar) {
        return this.f20695a.getContentResolver().openInputStream(wVar.f20779d);
    }
}