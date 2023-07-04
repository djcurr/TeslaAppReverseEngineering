package ui;

import ak.k0;
import ak.o;
import ak.v;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import ji.i;

/* loaded from: classes3.dex */
final class d {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f53468a;

        /* renamed from: b  reason: collision with root package name */
        public final long f53469b;

        private a(int i11, long j11) {
            this.f53468a = i11;
            this.f53469b = j11;
        }

        public static a a(i iVar, v vVar) {
            iVar.n(vVar.d(), 0, 8);
            vVar.O(0);
            return new a(vVar.m(), vVar.s());
        }
    }

    public static c a(i iVar) {
        byte[] bArr;
        ak.a.e(iVar);
        v vVar = new v(16);
        if (a.a(iVar, vVar).f53468a != 1380533830) {
            return null;
        }
        iVar.n(vVar.d(), 0, 4);
        vVar.O(0);
        int m11 = vVar.m();
        if (m11 != 1463899717) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Unsupported RIFF format: ");
            sb2.append(m11);
            o.c("WavHeaderReader", sb2.toString());
            return null;
        }
        a a11 = a.a(iVar, vVar);
        while (a11.f53468a != 1718449184) {
            iVar.g((int) a11.f53469b);
            a11 = a.a(iVar, vVar);
        }
        ak.a.f(a11.f53469b >= 16);
        iVar.n(vVar.d(), 0, 16);
        vVar.O(0);
        int u11 = vVar.u();
        int u12 = vVar.u();
        int t11 = vVar.t();
        int t12 = vVar.t();
        int u13 = vVar.u();
        int u14 = vVar.u();
        int i11 = ((int) a11.f53469b) - 16;
        if (i11 > 0) {
            byte[] bArr2 = new byte[i11];
            iVar.n(bArr2, 0, i11);
            bArr = bArr2;
        } else {
            bArr = k0.f482f;
        }
        return new c(u11, u12, t11, t12, u13, u14, bArr);
    }

    public static Pair<Long, Long> b(i iVar) {
        ak.a.e(iVar);
        iVar.d();
        v vVar = new v(8);
        a a11 = a.a(iVar, vVar);
        while (true) {
            int i11 = a11.f53468a;
            if (i11 != 1684108385) {
                if (i11 != 1380533830 && i11 != 1718449184) {
                    StringBuilder sb2 = new StringBuilder(39);
                    sb2.append("Ignoring unknown WAV chunk: ");
                    sb2.append(i11);
                    o.h("WavHeaderReader", sb2.toString());
                }
                long j11 = a11.f53469b + 8;
                if (a11.f53468a == 1380533830) {
                    j11 = 12;
                }
                if (j11 <= 2147483647L) {
                    iVar.k((int) j11);
                    a11 = a.a(iVar, vVar);
                } else {
                    int i12 = a11.f53468a;
                    StringBuilder sb3 = new StringBuilder(51);
                    sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb3.append(i12);
                    throw new ParserException(sb3.toString());
                }
            } else {
                iVar.k(8);
                long position = iVar.getPosition();
                long j12 = a11.f53469b + position;
                long length = iVar.getLength();
                if (length != -1 && j12 > length) {
                    StringBuilder sb4 = new StringBuilder(69);
                    sb4.append("Data exceeds input length: ");
                    sb4.append(j12);
                    sb4.append(", ");
                    sb4.append(length);
                    o.h("WavHeaderReader", sb4.toString());
                    j12 = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j12));
            }
        }
    }
}