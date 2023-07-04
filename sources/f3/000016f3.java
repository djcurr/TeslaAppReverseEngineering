package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class g0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    private final Resources f11390c;

    public g0(Executor executor, pd.g gVar, Resources resources) {
        super(executor, gVar);
        this.f11390c = resources;
    }

    private int g(com.facebook.imagepipeline.request.a aVar) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f11390c.openRawResourceFd(h(aVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
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

    private static int h(com.facebook.imagepipeline.request.a aVar) {
        return Integer.parseInt(aVar.s().getPath().substring(1));
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected nf.e d(com.facebook.imagepipeline.request.a aVar) {
        return e(this.f11390c.openRawResource(h(aVar)), g(aVar));
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalResourceFetchProducer";
    }
}