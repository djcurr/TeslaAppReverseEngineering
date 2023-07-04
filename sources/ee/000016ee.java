package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class f0 extends e0 {
    public f0(Executor executor, pd.g gVar) {
        super(executor, gVar);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected nf.e d(com.facebook.imagepipeline.request.a aVar) {
        return e(new FileInputStream(aVar.r().toString()), (int) aVar.r().length());
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalFileFetchProducer";
    }
}