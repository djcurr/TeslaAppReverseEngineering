package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.b;
import java.io.InputStream;
import na.g;
import wa.c;

/* loaded from: classes.dex */
public final class a extends c {
    @Override // wa.c
    public void registerComponents(Context context, com.bumptech.glide.c cVar, Registry registry) {
        registry.r(g.class, InputStream.class, new b.a());
    }
}