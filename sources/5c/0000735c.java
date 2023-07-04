package hj;

import com.google.android.exoplayer2.source.t;
import hj.f;
import ji.x;

/* loaded from: classes3.dex */
public final class c implements f.a {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f29235a;

    /* renamed from: b  reason: collision with root package name */
    private final t[] f29236b;

    public c(int[] iArr, t[] tVarArr) {
        this.f29235a = iArr;
        this.f29236b = tVarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f29236b.length];
        int i11 = 0;
        while (true) {
            t[] tVarArr = this.f29236b;
            if (i11 >= tVarArr.length) {
                return iArr;
            }
            iArr[i11] = tVarArr[i11].F();
            i11++;
        }
    }

    public void b(long j11) {
        for (t tVar : this.f29236b) {
            tVar.Y(j11);
        }
    }

    @Override // hj.f.a
    public x f(int i11, int i12) {
        int i13 = 0;
        while (true) {
            int[] iArr = this.f29235a;
            if (i13 < iArr.length) {
                if (i12 == iArr[i13]) {
                    return this.f29236b[i13];
                }
                i13++;
            } else {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("Unmatched track of type: ");
                sb2.append(i12);
                ak.o.c("BaseMediaChunkOutput", sb2.toString());
                return new ji.g();
            }
        }
    }
}