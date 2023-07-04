package xj;

import ak.k0;
import ak.r;
import android.util.Pair;
import ci.o;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.z0;
import fj.u;
import fj.v;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class i extends m {

    /* renamed from: c  reason: collision with root package name */
    private a f57564c;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f57565a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f57566b;

        /* renamed from: c  reason: collision with root package name */
        private final v[] f57567c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f57568d;

        /* renamed from: e  reason: collision with root package name */
        private final int[][][] f57569e;

        a(String[] strArr, int[] iArr, v[] vVarArr, int[] iArr2, int[][][] iArr3, v vVar) {
            this.f57566b = iArr;
            this.f57567c = vVarArr;
            this.f57569e = iArr3;
            this.f57568d = iArr2;
            this.f57565a = iArr.length;
        }

        public int a(int i11, int i12, boolean z11) {
            int i13 = this.f57567c[i11].a(i12).f26350a;
            int[] iArr = new int[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                int f11 = f(i11, i12, i15);
                if (f11 == 4 || (z11 && f11 == 3)) {
                    iArr[i14] = i15;
                    i14++;
                }
            }
            return b(i11, i12, Arrays.copyOf(iArr, i14));
        }

        public int b(int i11, int i12, int[] iArr) {
            int i13 = 0;
            int i14 = 16;
            String str = null;
            boolean z11 = false;
            int i15 = 0;
            while (i13 < iArr.length) {
                String str2 = this.f57567c[i11].a(i12).a(iArr[i13]).f9205l;
                int i16 = i15 + 1;
                if (i15 == 0) {
                    str = str2;
                } else {
                    z11 |= !k0.c(str, str2);
                }
                i14 = Math.min(i14, ci.n.k(this.f57569e[i11][i12][i13]));
                i13++;
                i15 = i16;
            }
            return z11 ? Math.min(i14, this.f57568d[i11]) : i14;
        }

        public int c() {
            return this.f57565a;
        }

        public int d(int i11) {
            return this.f57566b[i11];
        }

        public v e(int i11) {
            return this.f57567c[i11];
        }

        public int f(int i11, int i12, int i13) {
            return ci.n.z(this.f57569e[i11][i12][i13]);
        }
    }

    private static int f(ci.n[] nVarArr, u uVar, int[] iArr, boolean z11) {
        int length = nVarArr.length;
        boolean z12 = true;
        int i11 = 0;
        for (int i12 = 0; i12 < nVarArr.length; i12++) {
            ci.n nVar = nVarArr[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < uVar.f26350a; i14++) {
                i13 = Math.max(i13, ci.n.z(nVar.a(uVar.a(i14))));
            }
            boolean z13 = iArr[i12] == 0;
            if (i13 > i11 || (i13 == i11 && z11 && !z12 && z13)) {
                length = i12;
                z12 = z13;
                i11 = i13;
            }
        }
        return length;
    }

    private static int[] h(ci.n nVar, u uVar) {
        int[] iArr = new int[uVar.f26350a];
        for (int i11 = 0; i11 < uVar.f26350a; i11++) {
            iArr[i11] = nVar.a(uVar.a(i11));
        }
        return iArr;
    }

    private static int[] i(ci.n[] nVarArr) {
        int length = nVarArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = nVarArr[i11].u();
        }
        return iArr;
    }

    @Override // xj.m
    public final void d(Object obj) {
        this.f57564c = (a) obj;
    }

    @Override // xj.m
    public final n e(ci.n[] nVarArr, v vVar, j.a aVar, z0 z0Var) {
        int[] h11;
        int[] iArr = new int[nVarArr.length + 1];
        int length = nVarArr.length + 1;
        u[][] uVarArr = new u[length];
        int[][][] iArr2 = new int[nVarArr.length + 1][];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = vVar.f26354a;
            uVarArr[i11] = new u[i12];
            iArr2[i11] = new int[i12];
        }
        int[] i13 = i(nVarArr);
        for (int i14 = 0; i14 < vVar.f26354a; i14++) {
            u a11 = vVar.a(i14);
            int f11 = f(nVarArr, a11, iArr, r.l(a11.a(0).f9205l) == 5);
            if (f11 == nVarArr.length) {
                h11 = new int[a11.f26350a];
            } else {
                h11 = h(nVarArr[f11], a11);
            }
            int i15 = iArr[f11];
            uVarArr[f11][i15] = a11;
            iArr2[f11][i15] = h11;
            iArr[f11] = iArr[f11] + 1;
        }
        v[] vVarArr = new v[nVarArr.length];
        String[] strArr = new String[nVarArr.length];
        int[] iArr3 = new int[nVarArr.length];
        for (int i16 = 0; i16 < nVarArr.length; i16++) {
            int i17 = iArr[i16];
            vVarArr[i16] = new v((u[]) k0.B0(uVarArr[i16], i17));
            iArr2[i16] = (int[][]) k0.B0(iArr2[i16], i17);
            strArr[i16] = nVarArr[i16].getName();
            iArr3[i16] = nVarArr[i16].d();
        }
        a aVar2 = new a(strArr, iArr3, vVarArr, i13, iArr2, new v((u[]) k0.B0(uVarArr[nVarArr.length], iArr[nVarArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> j11 = j(aVar2, iArr2, i13, aVar, z0Var);
        return new n((o[]) j11.first, (g[]) j11.second, aVar2);
    }

    public final a g() {
        return this.f57564c;
    }

    protected abstract Pair<RendererConfiguration[], ExoTrackSelection[]> j(a aVar, int[][][] iArr, int[] iArr2, j.a aVar2, z0 z0Var);
}