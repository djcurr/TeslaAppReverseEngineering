package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import qh.f;
import qh.k;

@Keep
/* loaded from: classes3.dex */
public class CctBackendFactory implements qh.c {
    @Override // qh.c
    public k create(f fVar) {
        return new d(fVar.b(), fVar.e(), fVar.d());
    }
}