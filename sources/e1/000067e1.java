package ei;

import ak.v;
import ci.i;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f25123a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f25124a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25125b;

        /* renamed from: c  reason: collision with root package name */
        public final int f25126c;

        /* renamed from: d  reason: collision with root package name */
        public final int f25127d;

        private b(int i11, int i12, int i13, int i14, int i15) {
            this.f25125b = i12;
            this.f25124a = i13;
            this.f25126c = i14;
            this.f25127d = i15;
        }
    }

    public static void a(int i11, v vVar) {
        vVar.K(7);
        byte[] d11 = vVar.d();
        d11[0] = -84;
        d11[1] = 64;
        d11[2] = -1;
        d11[3] = -1;
        d11[4] = (byte) ((i11 >> 16) & 255);
        d11[5] = (byte) ((i11 >> 8) & 255);
        d11[6] = (byte) (i11 & 255);
    }

    public static ci.i b(v vVar, String str, String str2, com.google.android.exoplayer2.drm.e eVar) {
        vVar.P(1);
        return new i.b().S(str).e0("audio/ac4").H(2).f0(((vVar.C() & 32) >> 5) == 1 ? 48000 : 44100).L(eVar).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new ak.u(bArr)).f25127d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
        if (r10 != 11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        if (r10 != 11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
        if (r10 != 8) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ei.c.b d(ak.u r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.h(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.h(r0)
            r3 = 3
            if (r1 != r3) goto L2f
            int r4 = f(r10, r0)
            int r1 = r1 + r4
        L2f:
            r4 = r1
            r1 = 10
            int r1 = r10.h(r1)
            boolean r5 = r10.g()
            if (r5 == 0) goto L45
            int r5 = r10.h(r3)
            if (r5 <= 0) goto L45
            r10.r(r0)
        L45:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r8
        L54:
            int r10 = r10.h(r2)
            r5 = 0
            if (r9 != r8) goto L65
            r8 = 13
            if (r10 != r8) goto L65
            int[] r0 = ei.c.f25123a
            r10 = r0[r10]
            r8 = r10
            goto L91
        L65:
            if (r9 != r6) goto L90
            int[] r6 = ei.c.f25123a
            int r8 = r6.length
            if (r10 >= r8) goto L90
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L8a
            r8 = 11
            if (r1 == r0) goto L85
            if (r1 == r3) goto L8a
            if (r1 == r2) goto L7e
            goto L90
        L7e:
            if (r10 == r3) goto L8e
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
            goto L89
        L85:
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
        L89:
            goto L8e
        L8a:
            if (r10 == r3) goto L8e
            if (r10 != r6) goto L90
        L8e:
            int r5 = r5 + 1
        L90:
            r8 = r5
        L91:
            ei.c$b r10 = new ei.c$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.c.d(ak.u):ei.c$b");
    }

    public static int e(byte[] bArr, int i11) {
        int i12 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i13 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i13 == 65535) {
            i13 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i12 = 4;
        }
        if (i11 == 44097) {
            i12 += 2;
        }
        return i13 + i12;
    }

    private static int f(ak.u uVar, int i11) {
        int i12 = 0;
        while (true) {
            int h11 = i12 + uVar.h(i11);
            if (!uVar.g()) {
                return h11;
            }
            i12 = (h11 + 1) << i11;
        }
    }
}