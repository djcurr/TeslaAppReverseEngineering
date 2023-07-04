package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import md.k;
import qf.n;
import qf.u;
import qf.v;

/* loaded from: classes3.dex */
public abstract class g extends BasePool<n> {

    /* renamed from: k  reason: collision with root package name */
    private final int[] f11290k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(pd.c cVar, u uVar, v vVar) {
        super(cVar, uVar, vVar);
        SparseIntArray sparseIntArray = (SparseIntArray) k.g(uVar.f48141c);
        this.f11290k = new int[sparseIntArray.size()];
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11290k;
            if (i11 < iArr.length) {
                iArr[i11] = sparseIntArray.keyAt(i11);
                i11++;
            } else {
                t();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: B */
    public abstract n h(int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: C */
    public void l(n nVar) {
        k.g(nVar);
        nVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: D */
    public int p(n nVar) {
        k.g(nVar);
        return nVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int E() {
        return this.f11290k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: F */
    public boolean v(n nVar) {
        k.g(nVar);
        return !nVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int o(int i11) {
        int[] iArr;
        if (i11 > 0) {
            for (int i12 : this.f11290k) {
                if (i12 >= i11) {
                    return i12;
                }
            }
            return i11;
        }
        throw new BasePool.InvalidSizeException(Integer.valueOf(i11));
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int q(int i11) {
        return i11;
    }
}