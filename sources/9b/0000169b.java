package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public abstract class b extends com.facebook.datasource.b<qd.a<nf.c>> {
    protected abstract void onNewResultImpl(Bitmap bitmap);

    @Override // com.facebook.datasource.b
    public void onNewResultImpl(com.facebook.datasource.c<qd.a<nf.c>> cVar) {
        if (cVar.a()) {
            qd.a<nf.c> g11 = cVar.g();
            Bitmap bitmap = null;
            if (g11 != null && (g11.J() instanceof nf.b)) {
                bitmap = ((nf.b) g11.J()).p();
            }
            try {
                onNewResultImpl(bitmap);
            } finally {
                qd.a.C(g11);
            }
        }
    }
}