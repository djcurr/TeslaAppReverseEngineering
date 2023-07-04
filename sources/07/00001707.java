package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.w;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes3.dex */
public interface k0<FETCH_STATE extends w> {

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b(InputStream inputStream, int i11);

        void onFailure(Throwable th2);
    }

    void a(FETCH_STATE fetch_state, a aVar);

    void b(FETCH_STATE fetch_state, int i11);

    boolean c(FETCH_STATE fetch_state);

    Map<String, String> d(FETCH_STATE fetch_state, int i11);

    FETCH_STATE e(l<nf.e> lVar, p0 p0Var);
}