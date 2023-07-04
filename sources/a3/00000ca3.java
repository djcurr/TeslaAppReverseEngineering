package bk;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f7747a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7748b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7749c;

    private f(List<byte[]> list, int i11, String str) {
        this.f7747a = list;
        this.f7748b = i11;
        this.f7749c = str;
    }

    public static f a(ak.v vVar) {
        try {
            vVar.P(21);
            int C = vVar.C() & 3;
            int C2 = vVar.C();
            int e11 = vVar.e();
            int i11 = 0;
            for (int i12 = 0; i12 < C2; i12++) {
                vVar.P(1);
                int I = vVar.I();
                for (int i13 = 0; i13 < I; i13++) {
                    int I2 = vVar.I();
                    i11 += I2 + 4;
                    vVar.P(I2);
                }
            }
            vVar.O(e11);
            byte[] bArr = new byte[i11];
            int i14 = 0;
            String str = null;
            for (int i15 = 0; i15 < C2; i15++) {
                int C3 = vVar.C() & 127;
                int I3 = vVar.I();
                for (int i16 = 0; i16 < I3; i16++) {
                    int I4 = vVar.I();
                    byte[] bArr2 = ak.t.f519a;
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    int length = i14 + bArr2.length;
                    System.arraycopy(vVar.d(), vVar.e(), bArr, length, I4);
                    if (C3 == 33 && i16 == 0) {
                        str = ak.c.c(new ak.w(bArr, length, length + I4));
                    }
                    i14 = length + I4;
                    vVar.P(I4);
                }
            }
            return new f(i11 == 0 ? null : Collections.singletonList(bArr), C + 1, str);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw new ParserException("Error parsing HEVC config", e12);
        }
    }
}