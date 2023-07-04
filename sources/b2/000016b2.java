package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import md.k;
import qf.u;
import qf.v;

/* loaded from: classes3.dex */
public class f extends BasePool<byte[]> implements pd.a {

    /* renamed from: k  reason: collision with root package name */
    private final int[] f11289k;

    public f(pd.c cVar, u uVar, v vVar) {
        super(cVar, uVar, vVar);
        SparseIntArray sparseIntArray = (SparseIntArray) k.g(uVar.f48141c);
        this.f11289k = new int[sparseIntArray.size()];
        for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
            this.f11289k[i11] = sparseIntArray.keyAt(i11);
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: B */
    public byte[] h(int i11) {
        return new byte[i11];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: C */
    public void l(byte[] bArr) {
        k.g(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: D */
    public int p(byte[] bArr) {
        k.g(bArr);
        return bArr.length;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int o(int i11) {
        int[] iArr;
        if (i11 > 0) {
            for (int i12 : this.f11289k) {
                if (i12 >= i11) {
                    return i12;
                }
            }
            return i11;
        }
        throw new BasePool.InvalidSizeException(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    public int q(int i11) {
        return i11;
    }
}