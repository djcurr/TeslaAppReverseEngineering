package com.google.mlkit.vision.text.internal;

import com.google.android.gms.internal.mlkit_vision_text_common.zzor;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final k f17399a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.d f17400b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar, com.google.mlkit.common.sdkinternal.d dVar) {
        this.f17399a = kVar;
        this.f17400b = dVar;
    }

    public final oo.c a(oo.d dVar) {
        return new TextRecognizerImpl((b) this.f17399a.get(dVar), this.f17400b.a(dVar.a()), zzor.zzb(dVar.b()), dVar);
    }
}