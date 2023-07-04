package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b extends y {

    /* renamed from: d  reason: collision with root package name */
    private static final int f20645d = 22;

    /* renamed from: a  reason: collision with root package name */
    private final Context f20646a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f20647b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f20648c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f20646a = context;
    }

    static String j(w wVar) {
        return wVar.f20779d.toString().substring(f20645d);
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        Uri uri = wVar.f20779d;
        return Action.FILE_ATTRIBUTE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i11) {
        if (this.f20648c == null) {
            synchronized (this.f20647b) {
                if (this.f20648c == null) {
                    this.f20648c = this.f20646a.getAssets();
                }
            }
        }
        return new y.a(okio.r.k(this.f20648c.open(j(wVar))), t.e.DISK);
    }
}