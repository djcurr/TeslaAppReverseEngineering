package com.facebook.imagepipeline.memory;

import qf.u;
import qf.v;

@md.d
/* loaded from: classes3.dex */
public class AshmemMemoryChunkPool extends g {
    @md.d
    public AshmemMemoryChunkPool(pd.c cVar, u uVar, v vVar) {
        super(cVar, uVar, vVar);
    }

    @Override // com.facebook.imagepipeline.memory.g, com.facebook.imagepipeline.memory.BasePool
    /* renamed from: G */
    public a h(int i11) {
        return new a(i11);
    }
}