package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import md.k;
import qf.u;
import qf.v;

/* loaded from: classes3.dex */
public class c extends BasePool<Bitmap> implements qf.c {
    public c(pd.c cVar, u uVar, v vVar, boolean z11) {
        super(cVar, uVar, vVar, z11);
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: B */
    public Bitmap h(int i11) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i11 / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: C */
    public void l(Bitmap bitmap) {
        k.g(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: D */
    public int p(Bitmap bitmap) {
        k.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: E */
    public Bitmap r(b<Bitmap> bVar) {
        Bitmap bitmap = (Bitmap) super.r(bVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: F */
    public boolean v(Bitmap bitmap) {
        k.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int o(int i11) {
        return i11;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int q(int i11) {
        return i11;
    }
}