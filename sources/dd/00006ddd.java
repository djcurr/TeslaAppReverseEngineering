package f8;

import android.graphics.Color;
import g8.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class o implements m0<c8.d> {

    /* renamed from: a  reason: collision with root package name */
    private int f26097a;

    public o(int i11) {
        this.f26097a = i11;
    }

    private void b(c8.d dVar, List<Float> list) {
        int i11 = this.f26097a * 4;
        if (list.size() <= i11) {
            return;
        }
        int size = (list.size() - i11) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i12 = 0;
        while (i11 < list.size()) {
            if (i11 % 2 == 0) {
                dArr[i12] = list.get(i11).floatValue();
            } else {
                dArr2[i12] = list.get(i11).floatValue();
                i12++;
            }
            i11++;
        }
        for (int i13 = 0; i13 < dVar.c(); i13++) {
            int i14 = dVar.a()[i13];
            dVar.a()[i13] = Color.argb(c(dVar.b()[i13], dArr, dArr2), Color.red(i14), Color.green(i14), Color.blue(i14));
        }
    }

    private int c(double d11, double[] dArr, double[] dArr2) {
        double d12;
        int i11 = 1;
        while (true) {
            if (i11 < dArr.length) {
                int i12 = i11 - 1;
                double d13 = dArr[i12];
                double d14 = dArr[i11];
                if (dArr[i11] >= d11) {
                    d12 = h8.g.j(dArr2[i12], dArr2[i11], h8.g.b((d11 - d13) / (d14 - d13), 0.0d, 1.0d));
                    break;
                }
                i11++;
            } else {
                d12 = dArr2[dArr2.length - 1];
                break;
            }
        }
        return (int) (d12 * 255.0d);
    }

    @Override // f8.m0
    /* renamed from: d */
    public c8.d a(g8.c cVar, float f11) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = cVar.e0() == c.b.BEGIN_ARRAY;
        if (z11) {
            cVar.g();
        }
        while (cVar.p()) {
            arrayList.add(Float.valueOf((float) cVar.D()));
        }
        if (z11) {
            cVar.l();
        }
        if (this.f26097a == -1) {
            this.f26097a = arrayList.size() / 4;
        }
        int i11 = this.f26097a;
        float[] fArr = new float[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f26097a * 4; i14++) {
            int i15 = i14 / 4;
            double floatValue = arrayList.get(i14).floatValue();
            int i16 = i14 % 4;
            if (i16 == 0) {
                if (i15 > 0) {
                    float f12 = (float) floatValue;
                    if (fArr[i15 - 1] >= f12) {
                        fArr[i15] = f12 + 0.01f;
                    }
                }
                fArr[i15] = (float) floatValue;
            } else if (i16 == 1) {
                i12 = (int) (floatValue * 255.0d);
            } else if (i16 == 2) {
                i13 = (int) (floatValue * 255.0d);
            } else if (i16 == 3) {
                iArr[i15] = Color.argb(255, i12, i13, (int) (floatValue * 255.0d));
            }
        }
        c8.d dVar = new c8.d(fArr, iArr);
        b(dVar, arrayList);
        return dVar;
    }
}