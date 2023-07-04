package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class RainbowParameterSpec implements AlgorithmParameterSpec {
    private static final int[] DEFAULT_VI = {6, 12, 17, 22, 33};

    /* renamed from: vi  reason: collision with root package name */
    private int[] f43867vi;

    public RainbowParameterSpec() {
        this.f43867vi = DEFAULT_VI;
    }

    private void checkParams() {
        int[] iArr;
        int i11;
        int[] iArr2 = this.f43867vi;
        if (iArr2 != null) {
            if (iArr2.length > 1) {
                int i12 = 0;
                do {
                    iArr = this.f43867vi;
                    if (i12 >= iArr.length - 1) {
                        return;
                    }
                    i11 = iArr[i12];
                    i12++;
                } while (i11 < iArr[i12]);
                throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
            }
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        throw new IllegalArgumentException("no layers defined.");
    }

    public int getDocumentLength() {
        int[] iArr = this.f43867vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f43867vi.length - 1;
    }

    public int[] getVi() {
        return Arrays.clone(this.f43867vi);
    }

    public RainbowParameterSpec(int[] iArr) {
        this.f43867vi = iArr;
        try {
            checkParams();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}