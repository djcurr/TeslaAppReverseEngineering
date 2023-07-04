package com.google.android.exoplayer2.upstream;

import ak.k0;
import ak.o;
import android.content.Context;
import android.net.Uri;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import zj.n;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14652a;

    /* renamed from: b  reason: collision with root package name */
    private final List<n> f14653b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final a f14654c;

    /* renamed from: d  reason: collision with root package name */
    private a f14655d;

    /* renamed from: e  reason: collision with root package name */
    private a f14656e;

    /* renamed from: f  reason: collision with root package name */
    private a f14657f;

    /* renamed from: g  reason: collision with root package name */
    private a f14658g;

    /* renamed from: h  reason: collision with root package name */
    private a f14659h;

    /* renamed from: i  reason: collision with root package name */
    private a f14660i;

    /* renamed from: j  reason: collision with root package name */
    private a f14661j;

    /* renamed from: k  reason: collision with root package name */
    private a f14662k;

    public c(Context context, a aVar) {
        this.f14652a = context.getApplicationContext();
        this.f14654c = (a) ak.a.e(aVar);
    }

    private void o(a aVar) {
        for (int i11 = 0; i11 < this.f14653b.size(); i11++) {
            aVar.b(this.f14653b.get(i11));
        }
    }

    private a p() {
        if (this.f14656e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f14652a);
            this.f14656e = assetDataSource;
            o(assetDataSource);
        }
        return this.f14656e;
    }

    private a q() {
        if (this.f14657f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f14652a);
            this.f14657f = contentDataSource;
            o(contentDataSource);
        }
        return this.f14657f;
    }

    private a r() {
        if (this.f14660i == null) {
            zj.g gVar = new zj.g();
            this.f14660i = gVar;
            o(gVar);
        }
        return this.f14660i;
    }

    private a s() {
        if (this.f14655d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f14655d = fileDataSource;
            o(fileDataSource);
        }
        return this.f14655d;
    }

    private a t() {
        if (this.f14661j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f14652a);
            this.f14661j = rawResourceDataSource;
            o(rawResourceDataSource);
        }
        return this.f14661j;
    }

    private a u() {
        if (this.f14658g == null) {
            try {
                a aVar = (a) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f14658g = aVar;
                o(aVar);
            } catch (ClassNotFoundException unused) {
                o.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating RTMP extension", e11);
            }
            if (this.f14658g == null) {
                this.f14658g = this.f14654c;
            }
        }
        return this.f14658g;
    }

    private a v() {
        if (this.f14659h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f14659h = udpDataSource;
            o(udpDataSource);
        }
        return this.f14659h;
    }

    private void w(a aVar, n nVar) {
        if (aVar != null) {
            aVar.b(nVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void b(n nVar) {
        ak.a.e(nVar);
        this.f14654c.b(nVar);
        this.f14653b.add(nVar);
        w(this.f14655d, nVar);
        w(this.f14656e, nVar);
        w(this.f14657f, nVar);
        w(this.f14658g, nVar);
        w(this.f14659h, nVar);
        w(this.f14660i, nVar);
        w(this.f14661j, nVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> c() {
        a aVar = this.f14662k;
        return aVar == null ? Collections.emptyMap() : aVar.c();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        a aVar = this.f14662k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f14662k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(b bVar) {
        ak.a.f(this.f14662k == null);
        String scheme = bVar.f14632a.getScheme();
        if (k0.r0(bVar.f14632a)) {
            String path = bVar.f14632a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f14662k = p();
            } else {
                this.f14662k = s();
            }
        } else if ("asset".equals(scheme)) {
            this.f14662k = p();
        } else if ("content".equals(scheme)) {
            this.f14662k = q();
        } else if ("rtmp".equals(scheme)) {
            this.f14662k = u();
        } else if ("udp".equals(scheme)) {
            this.f14662k = v();
        } else if (MessageExtension.FIELD_DATA.equals(scheme)) {
            this.f14662k = r();
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.f14662k = this.f14654c;
        } else {
            this.f14662k = t();
        }
        return this.f14662k.i(bVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        a aVar = this.f14662k;
        if (aVar == null) {
            return null;
        }
        return aVar.m();
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        return ((a) ak.a.e(this.f14662k)).read(bArr, i11, i12);
    }
}