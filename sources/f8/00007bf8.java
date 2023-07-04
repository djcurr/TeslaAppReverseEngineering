package jj;

import ak.k0;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    final h f33855a;

    /* renamed from: b  reason: collision with root package name */
    final long f33856b;

    /* renamed from: c  reason: collision with root package name */
    final long f33857c;

    /* loaded from: classes3.dex */
    public static abstract class a extends j {

        /* renamed from: d  reason: collision with root package name */
        final long f33858d;

        /* renamed from: e  reason: collision with root package name */
        final long f33859e;

        /* renamed from: f  reason: collision with root package name */
        final List<d> f33860f;

        /* renamed from: g  reason: collision with root package name */
        private final long f33861g;

        /* renamed from: h  reason: collision with root package name */
        private final long f33862h;

        /* renamed from: i  reason: collision with root package name */
        final long f33863i;

        public a(h hVar, long j11, long j12, long j13, long j14, List<d> list, long j15, long j16, long j17) {
            super(hVar, j11, j12);
            this.f33858d = j13;
            this.f33859e = j14;
            this.f33860f = list;
            this.f33863i = j15;
            this.f33861g = j16;
            this.f33862h = j17;
        }

        public int c(long j11, long j12) {
            int g11 = g(j11);
            return g11 != -1 ? g11 : (int) (i((j12 - this.f33862h) + this.f33863i, j11) - d(j11, j12));
        }

        public long d(long j11, long j12) {
            if (g(j11) == -1) {
                long j13 = this.f33861g;
                if (j13 != -9223372036854775807L) {
                    return Math.max(e(), i((j12 - this.f33862h) - j13, j11));
                }
            }
            return e();
        }

        public long e() {
            return this.f33858d;
        }

        public long f(long j11, long j12) {
            if (this.f33860f != null) {
                return -9223372036854775807L;
            }
            long d11 = d(j11, j12) + c(j11, j12);
            return (j(d11) + h(d11, j11)) - this.f33863i;
        }

        public abstract int g(long j11);

        public final long h(long j11, long j12) {
            List<d> list = this.f33860f;
            if (list != null) {
                return (list.get((int) (j11 - this.f33858d)).f33869b * 1000000) / this.f33856b;
            }
            int g11 = g(j12);
            if (g11 != -1 && j11 == (e() + g11) - 1) {
                return j12 - j(j11);
            }
            return (this.f33859e * 1000000) / this.f33856b;
        }

        public long i(long j11, long j12) {
            long e11 = e();
            long g11 = g(j12);
            if (g11 == 0) {
                return e11;
            }
            if (this.f33860f == null) {
                long j13 = this.f33858d + (j11 / ((this.f33859e * 1000000) / this.f33856b));
                return j13 < e11 ? e11 : g11 == -1 ? j13 : Math.min(j13, (e11 + g11) - 1);
            }
            long j14 = (g11 + e11) - 1;
            long j15 = e11;
            while (j15 <= j14) {
                long j16 = ((j14 - j15) / 2) + j15;
                int i11 = (j(j16) > j11 ? 1 : (j(j16) == j11 ? 0 : -1));
                if (i11 < 0) {
                    j15 = j16 + 1;
                } else if (i11 <= 0) {
                    return j16;
                } else {
                    j14 = j16 - 1;
                }
            }
            return j15 == e11 ? j15 : j14;
        }

        public final long j(long j11) {
            long j12;
            List<d> list = this.f33860f;
            if (list != null) {
                j12 = list.get((int) (j11 - this.f33858d)).f33868a - this.f33857c;
            } else {
                j12 = (j11 - this.f33858d) * this.f33859e;
            }
            return k0.I0(j12, 1000000L, this.f33856b);
        }

        public abstract h k(i iVar, long j11);

        public boolean l() {
            return this.f33860f != null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        final List<h> f33864j;

        public b(h hVar, long j11, long j12, long j13, long j14, List<d> list, long j15, List<h> list2, long j16, long j17) {
            super(hVar, j11, j12, j13, j14, list, j15, j16, j17);
            this.f33864j = list2;
        }

        @Override // jj.j.a
        public int g(long j11) {
            return this.f33864j.size();
        }

        @Override // jj.j.a
        public h k(i iVar, long j11) {
            return this.f33864j.get((int) (j11 - this.f33858d));
        }

        @Override // jj.j.a
        public boolean l() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        final m f33865j;

        /* renamed from: k  reason: collision with root package name */
        final m f33866k;

        /* renamed from: l  reason: collision with root package name */
        final long f33867l;

        public c(h hVar, long j11, long j12, long j13, long j14, long j15, List<d> list, long j16, m mVar, m mVar2, long j17, long j18) {
            super(hVar, j11, j12, j13, j15, list, j16, j17, j18);
            this.f33865j = mVar;
            this.f33866k = mVar2;
            this.f33867l = j14;
        }

        @Override // jj.j
        public h a(i iVar) {
            m mVar = this.f33865j;
            if (mVar != null) {
                ci.i iVar2 = iVar.f33846a;
                return new h(mVar.a(iVar2.f9194a, 0L, iVar2.f9201h, 0L), 0L, -1L);
            }
            return super.a(iVar);
        }

        @Override // jj.j.a
        public int g(long j11) {
            List<d> list = this.f33860f;
            if (list != null) {
                return list.size();
            }
            long j12 = this.f33867l;
            if (j12 != -1) {
                return (int) ((j12 - this.f33858d) + 1);
            }
            if (j11 != -9223372036854775807L) {
                return (int) k0.m(j11, (this.f33859e * 1000000) / this.f33856b);
            }
            return -1;
        }

        @Override // jj.j.a
        public h k(i iVar, long j11) {
            long j12;
            List<d> list = this.f33860f;
            if (list != null) {
                j12 = list.get((int) (j11 - this.f33858d)).f33868a;
            } else {
                j12 = (j11 - this.f33858d) * this.f33859e;
            }
            long j13 = j12;
            m mVar = this.f33866k;
            ci.i iVar2 = iVar.f33846a;
            return new h(mVar.a(iVar2.f9194a, j11, iVar2.f9201h, j13), 0L, -1L);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final long f33868a;

        /* renamed from: b  reason: collision with root package name */
        final long f33869b;

        public d(long j11, long j12) {
            this.f33868a = j11;
            this.f33869b = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f33868a == dVar.f33868a && this.f33869b == dVar.f33869b;
        }

        public int hashCode() {
            return (((int) this.f33868a) * 31) + ((int) this.f33869b);
        }
    }

    public j(h hVar, long j11, long j12) {
        this.f33855a = hVar;
        this.f33856b = j11;
        this.f33857c = j12;
    }

    public h a(i iVar) {
        return this.f33855a;
    }

    public long b() {
        return k0.I0(this.f33857c, 1000000L, this.f33856b);
    }

    /* loaded from: classes3.dex */
    public static class e extends j {

        /* renamed from: d  reason: collision with root package name */
        final long f33870d;

        /* renamed from: e  reason: collision with root package name */
        final long f33871e;

        public e(h hVar, long j11, long j12, long j13, long j14) {
            super(hVar, j11, j12);
            this.f33870d = j13;
            this.f33871e = j14;
        }

        public h c() {
            long j11 = this.f33871e;
            if (j11 <= 0) {
                return null;
            }
            return new h(null, this.f33870d, j11);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}