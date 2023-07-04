package com.google.mlkit.vision.face.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final d f17350a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.d f17351b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(d dVar, com.google.mlkit.common.sdkinternal.d dVar2) {
        this.f17350a = dVar;
        this.f17351b = dVar2;
    }

    public final FaceDetectorImpl a(mo.e eVar) {
        Preconditions.checkNotNull(eVar, "You must provide a valid FaceDetectorOptions.");
        return new FaceDetectorImpl((g) this.f17350a.get(eVar), this.f17351b, eVar, null);
    }
}