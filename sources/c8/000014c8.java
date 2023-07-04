package com.brentvatne.exoplayer;

import android.content.Context;
import zj.j;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final j f10372a;

    public c(Context context) {
        this.f10372a = new j.b(context).a();
    }

    @Override // com.brentvatne.exoplayer.e
    public com.google.android.exoplayer2.upstream.g a(int i11) {
        return new com.google.android.exoplayer2.upstream.f(i11);
    }

    @Override // com.brentvatne.exoplayer.e
    public j b() {
        return this.f10372a;
    }
}