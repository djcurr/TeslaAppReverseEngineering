package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpb;

/* loaded from: classes2.dex */
public final class e extends com.google.mlkit.common.sdkinternal.e {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.i f17298a;

    public e(com.google.mlkit.common.sdkinternal.i iVar) {
        this.f17298a = iVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        i jVar;
        go.b bVar = (go.b) obj;
        Context b11 = this.f17298a.b();
        zzoq zzb = zzpb.zzb(b.d());
        if (!j.b(b11) && GoogleApiAvailabilityLight.getInstance().getApkVersion(b11) < 204500000) {
            jVar = new k(b11, bVar, zzb);
        } else {
            jVar = new j(b11, bVar, zzb);
        }
        return new h(this.f17298a, bVar, jVar, zzb);
    }
}