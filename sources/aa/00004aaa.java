package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class k extends g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context) {
        super(context);
    }

    static int k(Uri uri) {
        return new androidx.exifinterface.media.a(uri.getPath()).i("Orientation", 1);
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public boolean c(w wVar) {
        return Action.FILE_ATTRIBUTE.equals(wVar.f20779d.getScheme());
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public y.a f(w wVar, int i11) {
        return new y.a(null, okio.r.k(j(wVar)), t.e.DISK, k(wVar.f20779d));
    }
}