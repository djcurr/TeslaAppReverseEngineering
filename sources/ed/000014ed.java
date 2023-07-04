package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.integration.okhttp3.b;
import java.io.InputStream;
import na.g;

@Deprecated
/* loaded from: classes.dex */
public class OkHttpGlideModule implements wa.b {
    @Override // wa.b
    public void a(Context context, d dVar) {
    }

    @Override // wa.b
    public void b(Context context, c cVar, Registry registry) {
        registry.r(g.class, InputStream.class, new b.a());
    }
}