package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class b0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    private final AssetManager f11339c;

    public b0(Executor executor, pd.g gVar, AssetManager assetManager) {
        super(executor, gVar);
        this.f11339c = assetManager;
    }

    private static String g(com.facebook.imagepipeline.request.a aVar) {
        return aVar.s().getPath().substring(1);
    }

    private int h(com.facebook.imagepipeline.request.a aVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f11339c.openFd(g(aVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (IOException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected nf.e d(com.facebook.imagepipeline.request.a aVar) {
        return e(this.f11339c.open(g(aVar), 2), h(aVar));
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalAssetFetchProducer";
    }
}