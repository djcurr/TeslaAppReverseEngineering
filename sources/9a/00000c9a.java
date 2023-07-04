package bk;

import ak.t;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f7712a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7713b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7714c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7715d;

    /* renamed from: e  reason: collision with root package name */
    public final float f7716e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7717f;

    private a(List<byte[]> list, int i11, int i12, int i13, float f11, String str) {
        this.f7712a = list;
        this.f7713b = i11;
        this.f7714c = i12;
        this.f7715d = i13;
        this.f7716e = f11;
        this.f7717f = str;
    }

    private static byte[] a(ak.v vVar) {
        int I = vVar.I();
        int e11 = vVar.e();
        vVar.P(I);
        return ak.c.d(vVar.d(), e11, I);
    }

    public static a b(ak.v vVar) {
        float f11;
        String str;
        int i11;
        try {
            vVar.P(4);
            int C = (vVar.C() & 3) + 1;
            if (C != 3) {
                ArrayList arrayList = new ArrayList();
                int C2 = vVar.C() & 31;
                for (int i12 = 0; i12 < C2; i12++) {
                    arrayList.add(a(vVar));
                }
                int C3 = vVar.C();
                for (int i13 = 0; i13 < C3; i13++) {
                    arrayList.add(a(vVar));
                }
                int i14 = -1;
                if (C2 > 0) {
                    t.b i15 = ak.t.i((byte[]) arrayList.get(0), C, ((byte[]) arrayList.get(0)).length);
                    int i16 = i15.f530e;
                    int i17 = i15.f531f;
                    float f12 = i15.f532g;
                    str = ak.c.a(i15.f526a, i15.f527b, i15.f528c);
                    i14 = i16;
                    i11 = i17;
                    f11 = f12;
                } else {
                    f11 = 1.0f;
                    str = null;
                    i11 = -1;
                }
                return new a(arrayList, C, i14, i11, f11, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new ParserException("Error parsing AVC config", e11);
        }
    }
}