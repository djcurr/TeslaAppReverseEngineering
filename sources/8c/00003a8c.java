package com.google.mlkit.vision.face.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzon;

/* loaded from: classes2.dex */
public final class d extends com.google.mlkit.common.sdkinternal.e {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.i f17352a;

    public d(com.google.mlkit.common.sdkinternal.i iVar) {
        this.f17352a = iVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        b aVar;
        mo.e eVar = (mo.e) obj;
        Context b11 = this.f17352a.b();
        zzoc zzb = zzon.zzb(h.b());
        if (!a.b(b11) && GoogleApiAvailabilityLight.getInstance().getApkVersion(b11) < 204500000) {
            aVar = new j(b11, eVar, zzb);
        } else {
            aVar = new a(b11, eVar, zzb);
        }
        return new g(zzon.zzb(h.b()), eVar, aVar);
    }
}