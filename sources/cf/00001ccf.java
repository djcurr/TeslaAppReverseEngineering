package com.google.android.exoplayer2.upstream;

import ak.k0;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import zj.m;

/* loaded from: classes3.dex */
public final class h<T> implements Loader.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f14696a;

    /* renamed from: b  reason: collision with root package name */
    public final b f14697b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14698c;

    /* renamed from: d  reason: collision with root package name */
    private final m f14699d;

    /* renamed from: e  reason: collision with root package name */
    private final a<? extends T> f14700e;

    /* renamed from: f  reason: collision with root package name */
    private volatile T f14701f;

    /* loaded from: classes3.dex */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public h(com.google.android.exoplayer2.upstream.a aVar, Uri uri, int i11, a<? extends T> aVar2) {
        this(aVar, new b.C0259b().i(uri).b(1).a(), i11, aVar2);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        this.f14699d.r();
        zj.h hVar = new zj.h(this.f14699d, this.f14697b);
        try {
            hVar.g();
            this.f14701f = this.f14700e.a((Uri) ak.a.e(this.f14699d.m()), hVar);
        } finally {
            k0.o(hVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
    }

    public long c() {
        return this.f14699d.o();
    }

    public Map<String, List<String>> d() {
        return this.f14699d.q();
    }

    public final T e() {
        return this.f14701f;
    }

    public Uri f() {
        return this.f14699d.p();
    }

    public h(com.google.android.exoplayer2.upstream.a aVar, b bVar, int i11, a<? extends T> aVar2) {
        this.f14699d = new m(aVar);
        this.f14697b = bVar;
        this.f14698c = i11;
        this.f14700e = aVar2;
        this.f14696a = fj.g.a();
    }
}