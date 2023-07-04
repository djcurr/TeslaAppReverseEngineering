package org.spongycastle.pqc.crypto.rainbow;

import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class RainbowParameters implements CipherParameters {
    private final int[] DEFAULT_VI;

    /* renamed from: vi  reason: collision with root package name */
    private int[] f43851vi;

    public RainbowParameters() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.DEFAULT_VI = iArr;
        this.f43851vi = iArr;
    }

    private void checkParams() {
        int[] iArr;
        int i11;
        int[] iArr2 = this.f43851vi;
        if (iArr2 != null) {
            if (iArr2.length > 1) {
                int i12 = 0;
                do {
                    iArr = this.f43851vi;
                    if (i12 >= iArr.length - 1) {
                        return;
                    }
                    i11 = iArr[i12];
                    i12++;
                } while (i11 < iArr[i12]);
                throw new Exception("v[i] has to be smaller than v[i+1]");
            }
            throw new Exception("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        throw new Exception("no layers defined.");
    }

    public int getDocLength() {
        int[] iArr = this.f43851vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f43851vi.length - 1;
    }

    public int[] getVi() {
        return this.f43851vi;
    }

    public RainbowParameters(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.f43851vi = iArr;
        try {
            checkParams();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}