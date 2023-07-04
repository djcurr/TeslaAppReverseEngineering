package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.zzpb;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final e f17296a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.d f17297b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e eVar, com.google.mlkit.common.sdkinternal.d dVar) {
        this.f17296a = eVar;
        this.f17297b = dVar;
    }

    public final BarcodeScannerImpl a(go.b bVar) {
        return new BarcodeScannerImpl(bVar, (h) this.f17296a.get(bVar), this.f17297b.a(bVar.b()), zzpb.zzb(b.d()));
    }
}