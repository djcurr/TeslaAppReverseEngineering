package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import zj.n;

/* loaded from: classes3.dex */
public interface a extends zj.f {

    /* renamed from: com.google.android.exoplayer2.upstream.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0258a {
        a a();
    }

    void b(n nVar);

    default Map<String, List<String>> c() {
        return Collections.emptyMap();
    }

    void close();

    long i(b bVar);

    Uri m();
}