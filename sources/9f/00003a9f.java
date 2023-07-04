package com.google.mlkit.vision.text.internal;

import com.google.android.gms.internal.mlkit_vision_text_common.zzog;
import com.google.android.gms.internal.mlkit_vision_text_common.zzor;

/* loaded from: classes2.dex */
public final class k extends com.google.mlkit.common.sdkinternal.e {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.i f17401a;

    public k(com.google.mlkit.common.sdkinternal.i iVar) {
        this.f17401a = iVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        oo.d dVar = (oo.d) obj;
        zzog zzb = zzor.zzb(dVar.b());
        return new b(zzb, b.m(this.f17401a.b(), dVar, zzb), dVar);
    }
}