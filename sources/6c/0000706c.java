package gj;

import ak.k0;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g */
    public static final a f27982g = new a(null, new long[0], null, 0, -9223372036854775807L);

    /* renamed from: a */
    public final Object f27983a;

    /* renamed from: b */
    public final int f27984b;

    /* renamed from: c */
    public final long[] f27985c;

    /* renamed from: d */
    public final C0531a[] f27986d;

    /* renamed from: e */
    public final long f27987e;

    /* renamed from: f */
    public final long f27988f;

    /* renamed from: gj.a$a */
    /* loaded from: classes3.dex */
    public static final class C0531a {

        /* renamed from: a */
        public final int f27989a;

        /* renamed from: b */
        public final Uri[] f27990b;

        /* renamed from: c */
        public final int[] f27991c;

        /* renamed from: d */
        public final long[] f27992d;

        public C0531a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public int a() {
            return b(-1);
        }

        public int b(int i11) {
            int i12 = i11 + 1;
            while (true) {
                int[] iArr = this.f27991c;
                if (i12 >= iArr.length || iArr[i12] == 0 || iArr[i12] == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean c() {
            return this.f27989a == -1 || a() < this.f27989a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0531a.class != obj.getClass()) {
                return false;
            }
            C0531a c0531a = (C0531a) obj;
            return this.f27989a == c0531a.f27989a && Arrays.equals(this.f27990b, c0531a.f27990b) && Arrays.equals(this.f27991c, c0531a.f27991c) && Arrays.equals(this.f27992d, c0531a.f27992d);
        }

        public int hashCode() {
            return (((((this.f27989a * 31) + Arrays.hashCode(this.f27990b)) * 31) + Arrays.hashCode(this.f27991c)) * 31) + Arrays.hashCode(this.f27992d);
        }

        private C0531a(int i11, int[] iArr, Uri[] uriArr, long[] jArr) {
            ak.a.a(iArr.length == uriArr.length);
            this.f27989a = i11;
            this.f27991c = iArr;
            this.f27990b = uriArr;
            this.f27992d = jArr;
        }
    }

    private a(Object obj, long[] jArr, C0531a[] c0531aArr, long j11, long j12) {
        this.f27983a = obj;
        this.f27985c = jArr;
        this.f27987e = j11;
        this.f27988f = j12;
        int length = jArr.length;
        this.f27984b = length;
        if (c0531aArr == null) {
            c0531aArr = new C0531a[length];
            for (int i11 = 0; i11 < this.f27984b; i11++) {
                c0531aArr[i11] = new C0531a();
            }
        }
        this.f27986d = c0531aArr;
    }

    private boolean c(long j11, long j12, int i11) {
        if (j11 == Long.MIN_VALUE) {
            return false;
        }
        long j13 = this.f27985c[i11];
        return j13 == Long.MIN_VALUE ? j12 == -9223372036854775807L || j11 < j12 : j11 < j13;
    }

    public int a(long j11, long j12) {
        if (j11 != Long.MIN_VALUE) {
            if (j12 == -9223372036854775807L || j11 < j12) {
                int i11 = 0;
                while (true) {
                    long[] jArr = this.f27985c;
                    if (i11 >= jArr.length || jArr[i11] == Long.MIN_VALUE || (j11 < jArr[i11] && this.f27986d[i11].c())) {
                        break;
                    }
                    i11++;
                }
                if (i11 < this.f27985c.length) {
                    return i11;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public int b(long j11, long j12) {
        int length = this.f27985c.length - 1;
        while (length >= 0 && c(j11, j12, length)) {
            length--;
        }
        if (length < 0 || !this.f27986d[length].c()) {
            return -1;
        }
        return length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return k0.c(this.f27983a, aVar.f27983a) && this.f27984b == aVar.f27984b && this.f27987e == aVar.f27987e && this.f27988f == aVar.f27988f && Arrays.equals(this.f27985c, aVar.f27985c) && Arrays.equals(this.f27986d, aVar.f27986d);
    }

    public int hashCode() {
        int i11 = this.f27984b * 31;
        Object obj = this.f27983a;
        return ((((((((i11 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f27987e)) * 31) + ((int) this.f27988f)) * 31) + Arrays.hashCode(this.f27985c)) * 31) + Arrays.hashCode(this.f27986d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f27983a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f27987e);
        sb2.append(", adGroups=[");
        for (int i11 = 0; i11 < this.f27986d.length; i11++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f27985c[i11]);
            sb2.append(", ads=[");
            for (int i12 = 0; i12 < this.f27986d[i11].f27991c.length; i12++) {
                sb2.append("ad(state=");
                int i13 = this.f27986d[i11].f27991c[i12];
                if (i13 == 0) {
                    sb2.append('_');
                } else if (i13 == 1) {
                    sb2.append(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                } else if (i13 == 2) {
                    sb2.append('S');
                } else if (i13 == 3) {
                    sb2.append('P');
                } else if (i13 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f27986d[i11].f27992d[i12]);
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (i12 < this.f27986d[i11].f27991c.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i11 < this.f27986d.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}