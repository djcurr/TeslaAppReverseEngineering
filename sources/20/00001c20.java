package com.google.android.exoplayer2.source;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.a;

/* loaded from: classes3.dex */
public final class e implements fj.p {

    /* renamed from: a  reason: collision with root package name */
    private final a.InterfaceC0258a f13939a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<fj.p> f13940b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f13941c;

    public e(Context context, ji.l lVar) {
        this(new com.google.android.exoplayer2.upstream.d(context), lVar);
    }

    private static SparseArray<fj.p> a(a.InterfaceC0258a interfaceC0258a, ji.l lVar) {
        SparseArray<fj.p> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (fj.p) DashMediaSource.Factory.class.asSubclass(fj.p.class).getConstructor(a.InterfaceC0258a.class).newInstance(interfaceC0258a));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (fj.p) SsMediaSource.Factory.class.asSubclass(fj.p.class).getConstructor(a.InterfaceC0258a.class).newInstance(interfaceC0258a));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (fj.p) HlsMediaSource.Factory.class.asSubclass(fj.p.class).getConstructor(a.InterfaceC0258a.class).newInstance(interfaceC0258a));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new r.b(interfaceC0258a, lVar));
        return sparseArray;
    }

    public e(a.InterfaceC0258a interfaceC0258a, ji.l lVar) {
        this.f13939a = interfaceC0258a;
        SparseArray<fj.p> a11 = a(interfaceC0258a, lVar);
        this.f13940b = a11;
        this.f13941c = new int[a11.size()];
        for (int i11 = 0; i11 < this.f13940b.size(); i11++) {
            this.f13941c[i11] = this.f13940b.keyAt(i11);
        }
    }
}