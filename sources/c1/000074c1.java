package i50;

import java.lang.reflect.Array;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class i extends k {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[][] f30057d = {new byte[]{6, -124, 112, 76, -26, 32, -64, 10, -78, -59, -2, -16, 117, -127, 123, -99}, new byte[]{-117, 102, -76, -31, -120, -13, -96, 107, 100, 15, 107, -92, 47, 8, -9, 23}, new byte[]{52, 2, -34, 45, 83, -14, -124, -104, -49, 2, -99, 96, -97, 2, -111, 20}, new byte[]{14, -42, -22, -26, 46, 123, 79, 8, -69, -13, PSSSigner.TRAILER_IMPLICIT, -81, -3, 91, 79, 121}, new byte[]{-53, -49, -80, -53, 72, 114, 68, -117, 121, -18, -51, 28, -66, 57, 112, 68}, new byte[]{126, -22, -51, -18, 110, -112, 50, -73, -115, 83, 53, -19, 43, -118, 5, 123}, new byte[]{103, -62, -113, 67, 94, 46, 124, -48, -30, 65, 39, 97, -38, 79, -17, 27}, new byte[]{41, 36, -39, -80, -81, -54, -52, 7, 103, 95, -3, -30, 31, -57, 11, 59}, new byte[]{-85, 77, 99, -15, -26, -122, Byte.MAX_VALUE, -23, -20, -37, -113, -54, -71, -44, 101, -18}, new byte[]{28, 48, -65, -124, -44, -73, -51, 100, 91, 42, 64, 79, -83, 3, 126, 51}, new byte[]{-78, -52, 11, -71, -108, 23, 35, -65, 105, 2, -117, 46, -115, -10, -104, 0}, new byte[]{-6, 4, 120, -90, -34, 111, 85, 114, 74, -86, -98, -56, 92, -99, 45, -118}, new byte[]{-33, -76, -97, 43, 107, 119, 42, 18, 14, -6, 79, 46, 41, 18, -97, -44}, new byte[]{30, -95, 3, 68, -12, 73, -94, 54, 50, -42, 17, -82, -69, 106, 18, -18}, new byte[]{-81, 4, 73, -120, 75, 5, 0, -124, 95, -106, 0, -55, -100, -88, -20, -90}, new byte[]{33, 2, 94, -40, -99, 25, -100, 79, 120, -94, -57, -29, 39, -27, -109, -20}, new byte[]{-65, 58, -86, -8, -89, 89, -55, -73, -71, 40, 46, -51, -126, -44, 1, 115}, new byte[]{98, 96, 112, 13, 97, -122, -80, 23, 55, -14, -17, -39, Tnaf.POW_2_WIDTH, 48, 125, 107}, new byte[]{90, -54, 69, -62, 33, 48, 4, 67, -127, -62, -111, 83, -10, -4, -102, -58}, new byte[]{-110, 35, -105, 60, 34, 107, 104, -69, 44, -81, -110, -24, 54, -47, -108, 58}};

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f30058b;

    /* renamed from: c  reason: collision with root package name */
    private int f30059c;

    public i() {
        this.f30058b = new byte[32];
    }

    public i(i iVar) {
        this.f30058b = org.bouncycastle.util.a.h(iVar.f30058b);
        this.f30059c = iVar.f30059c;
    }

    private int i(byte[] bArr, byte[] bArr2, int i11) {
        byte[][] bArr3 = (byte[][]) Array.newInstance(byte.class, 2, 16);
        byte[][] bArr4 = (byte[][]) Array.newInstance(byte.class, 2, 16);
        System.arraycopy(bArr, 0, bArr3[0], 0, 16);
        System.arraycopy(bArr, 16, bArr3[1], 0, 16);
        byte[] bArr5 = bArr3[0];
        byte[][] bArr6 = f30057d;
        bArr3[0] = k.a(bArr5, bArr6[0]);
        bArr3[1] = k.a(bArr3[1], bArr6[1]);
        bArr3[0] = k.a(bArr3[0], bArr6[2]);
        bArr3[1] = k.a(bArr3[1], bArr6[3]);
        j(bArr3, bArr4);
        bArr3[0] = k.a(bArr4[0], bArr6[4]);
        bArr3[1] = k.a(bArr4[1], bArr6[5]);
        bArr3[0] = k.a(bArr3[0], bArr6[6]);
        bArr3[1] = k.a(bArr3[1], bArr6[7]);
        j(bArr3, bArr4);
        bArr3[0] = k.a(bArr4[0], bArr6[8]);
        bArr3[1] = k.a(bArr4[1], bArr6[9]);
        bArr3[0] = k.a(bArr3[0], bArr6[10]);
        bArr3[1] = k.a(bArr3[1], bArr6[11]);
        j(bArr3, bArr4);
        bArr3[0] = k.a(bArr4[0], bArr6[12]);
        bArr3[1] = k.a(bArr4[1], bArr6[13]);
        bArr3[0] = k.a(bArr3[0], bArr6[14]);
        bArr3[1] = k.a(bArr3[1], bArr6[15]);
        j(bArr3, bArr4);
        bArr3[0] = k.a(bArr4[0], bArr6[16]);
        bArr3[1] = k.a(bArr4[1], bArr6[17]);
        bArr3[0] = k.a(bArr3[0], bArr6[18]);
        bArr3[1] = k.a(bArr3[1], bArr6[19]);
        j(bArr3, bArr4);
        bArr3[0] = k.g(bArr4[0], bArr, 0);
        bArr3[1] = k.g(bArr4[1], bArr, 16);
        System.arraycopy(bArr3[0], 0, bArr2, i11, 16);
        System.arraycopy(bArr3[1], 0, bArr2, i11 + 16, 16);
        return 32;
    }

    private void j(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 0, bArr2[0], 0, 4);
        System.arraycopy(bArr[1], 0, bArr2[0], 4, 4);
        System.arraycopy(bArr[0], 4, bArr2[0], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[0], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[1], 0, 4);
        System.arraycopy(bArr[1], 8, bArr2[1], 4, 4);
        System.arraycopy(bArr[0], 12, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 12, bArr2[1], 12, 4);
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        if (this.f30059c == 32) {
            if (bArr.length - i11 >= 32) {
                int i12 = i(this.f30058b, bArr, i11);
                reset();
                return i12;
            }
            throw new IllegalArgumentException("output too short to receive digest");
        }
        throw new IllegalStateException("input must be exactly 32 bytes");
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "Haraka-256";
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f30059c = 0;
        org.bouncycastle.util.a.g(this.f30058b);
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        int i11 = this.f30059c;
        if (i11 + 1 > 32) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        byte[] bArr = this.f30058b;
        this.f30059c = i11 + 1;
        bArr[i11] = b11;
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = this.f30059c;
        if (i13 + i12 > 32) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        System.arraycopy(bArr, i11, this.f30058b, i13, i12);
        this.f30059c += i12;
    }
}