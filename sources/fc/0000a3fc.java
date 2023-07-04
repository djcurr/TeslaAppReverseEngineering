package org.spongycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;
import org.spongycastle.pqc.crypto.rainbow.util.RainbowUtil;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class Layer {
    private short[][][] coeff_alpha;
    private short[][][] coeff_beta;
    private short[] coeff_eta;
    private short[][] coeff_gamma;

    /* renamed from: oi  reason: collision with root package name */
    private int f43845oi;

    /* renamed from: vi  reason: collision with root package name */
    private int f43846vi;
    private int viNext;

    public Layer(byte b11, byte b12, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i11 = b11 & 255;
        this.f43846vi = i11;
        int i12 = b12 & 255;
        this.viNext = i12;
        this.f43845oi = i12 - i11;
        this.coeff_alpha = sArr;
        this.coeff_beta = sArr2;
        this.coeff_gamma = sArr3;
        this.coeff_eta = sArr4;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Layer)) {
            return false;
        }
        Layer layer = (Layer) obj;
        return this.f43846vi == layer.getVi() && this.viNext == layer.getViNext() && this.f43845oi == layer.getOi() && RainbowUtil.equals(this.coeff_alpha, layer.getCoeffAlpha()) && RainbowUtil.equals(this.coeff_beta, layer.getCoeffBeta()) && RainbowUtil.equals(this.coeff_gamma, layer.getCoeffGamma()) && RainbowUtil.equals(this.coeff_eta, layer.getCoeffEta());
    }

    public short[][][] getCoeffAlpha() {
        return this.coeff_alpha;
    }

    public short[][][] getCoeffBeta() {
        return this.coeff_beta;
    }

    public short[] getCoeffEta() {
        return this.coeff_eta;
    }

    public short[][] getCoeffGamma() {
        return this.coeff_gamma;
    }

    public int getOi() {
        return this.f43845oi;
    }

    public int getVi() {
        return this.f43846vi;
    }

    public int getViNext() {
        return this.viNext;
    }

    public int hashCode() {
        return (((((((((((this.f43846vi * 37) + this.viNext) * 37) + this.f43845oi) * 37) + Arrays.hashCode(this.coeff_alpha)) * 37) + Arrays.hashCode(this.coeff_beta)) * 37) + Arrays.hashCode(this.coeff_gamma)) * 37) + Arrays.hashCode(this.coeff_eta);
    }

    public short[][] plugInVinegars(short[] sArr) {
        int i11 = this.f43845oi;
        int i12 = 0;
        short[][] sArr2 = (short[][]) Array.newInstance(short.class, i11, i11 + 1);
        short[] sArr3 = new short[this.f43845oi];
        for (int i13 = 0; i13 < this.f43845oi; i13++) {
            for (int i14 = 0; i14 < this.f43846vi; i14++) {
                for (int i15 = 0; i15 < this.f43846vi; i15++) {
                    sArr3[i13] = GF2Field.addElem(sArr3[i13], GF2Field.multElem(GF2Field.multElem(this.coeff_beta[i13][i14][i15], sArr[i14]), sArr[i15]));
                }
            }
        }
        for (int i16 = 0; i16 < this.f43845oi; i16++) {
            for (int i17 = 0; i17 < this.f43845oi; i17++) {
                for (int i18 = 0; i18 < this.f43846vi; i18++) {
                    sArr2[i16][i17] = GF2Field.addElem(sArr2[i16][i17], GF2Field.multElem(this.coeff_alpha[i16][i17][i18], sArr[i18]));
                }
            }
        }
        for (int i19 = 0; i19 < this.f43845oi; i19++) {
            for (int i21 = 0; i21 < this.f43846vi; i21++) {
                sArr3[i19] = GF2Field.addElem(sArr3[i19], GF2Field.multElem(this.coeff_gamma[i19][i21], sArr[i21]));
            }
        }
        for (int i22 = 0; i22 < this.f43845oi; i22++) {
            for (int i23 = this.f43846vi; i23 < this.viNext; i23++) {
                short[] sArr4 = sArr2[i22];
                int i24 = this.f43846vi;
                sArr4[i23 - i24] = GF2Field.addElem(this.coeff_gamma[i22][i23], sArr2[i22][i23 - i24]);
            }
        }
        for (int i25 = 0; i25 < this.f43845oi; i25++) {
            sArr3[i25] = GF2Field.addElem(sArr3[i25], this.coeff_eta[i25]);
        }
        while (true) {
            int i26 = this.f43845oi;
            if (i12 >= i26) {
                return sArr2;
            }
            sArr2[i12][i26] = sArr3[i12];
            i12++;
        }
    }

    public Layer(int i11, int i12, SecureRandom secureRandom) {
        this.f43846vi = i11;
        this.viNext = i12;
        int i13 = i12 - i11;
        this.f43845oi = i13;
        this.coeff_alpha = (short[][][]) Array.newInstance(short.class, i13, i13, i11);
        int i14 = this.f43845oi;
        int i15 = this.f43846vi;
        this.coeff_beta = (short[][][]) Array.newInstance(short.class, i14, i15, i15);
        this.coeff_gamma = (short[][]) Array.newInstance(short.class, this.f43845oi, this.viNext);
        int i16 = this.f43845oi;
        this.coeff_eta = new short[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            for (int i18 = 0; i18 < this.f43845oi; i18++) {
                for (int i19 = 0; i19 < this.f43846vi; i19++) {
                    this.coeff_alpha[i17][i18][i19] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i21 = 0; i21 < i16; i21++) {
            for (int i22 = 0; i22 < this.f43846vi; i22++) {
                for (int i23 = 0; i23 < this.f43846vi; i23++) {
                    this.coeff_beta[i21][i22][i23] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i24 = 0; i24 < i16; i24++) {
            for (int i25 = 0; i25 < this.viNext; i25++) {
                this.coeff_gamma[i24][i25] = (short) (secureRandom.nextInt() & 255);
            }
        }
        for (int i26 = 0; i26 < i16; i26++) {
            this.coeff_eta[i26] = (short) (secureRandom.nextInt() & 255);
        }
    }
}