package com.facebook.imagepipeline.memory;

import qf.u;
import qf.v;

@md.d
/* loaded from: classes3.dex */
public class NativeMemoryChunkPool extends g {
    @md.d
    public NativeMemoryChunkPool(pd.c cVar, u uVar, v vVar) {
        super(cVar, uVar, vVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.g, com.facebook.imagepipeline.memory.BasePool
    /* renamed from: G */
    public NativeMemoryChunk h(int i11) {
        return new NativeMemoryChunk(i11);
    }
}