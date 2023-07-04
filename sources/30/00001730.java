package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class t0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f11546c;

    public t0(Executor executor, pd.g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f11546c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected nf.e d(com.facebook.imagepipeline.request.a aVar) {
        InputStream openInputStream = this.f11546c.openInputStream(aVar.s());
        md.k.h(openInputStream, "ContentResolver returned null InputStream");
        return e(openInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}