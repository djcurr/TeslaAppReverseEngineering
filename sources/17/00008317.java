package li;

import java.util.Objects;
import ji.a;
import ji.i;
import ji.m;
import ji.p;

/* loaded from: classes3.dex */
final class b extends ji.a {

    /* renamed from: li.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0703b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final p f37184a;

        /* renamed from: b  reason: collision with root package name */
        private final int f37185b;

        /* renamed from: c  reason: collision with root package name */
        private final m.a f37186c;

        private long c(i iVar) {
            while (iVar.f() < iVar.getLength() - 6 && !m.h(iVar, this.f37184a, this.f37185b, this.f37186c)) {
                iVar.g(1);
            }
            if (iVar.f() >= iVar.getLength() - 6) {
                iVar.g((int) (iVar.getLength() - iVar.f()));
                return this.f37184a.f33756j;
            }
            return this.f37186c.f33743a;
        }

        @Override // ji.a.f
        public a.e b(i iVar, long j11) {
            long position = iVar.getPosition();
            long c11 = c(iVar);
            long f11 = iVar.f();
            iVar.g(Math.max(6, this.f37184a.f33749c));
            long c12 = c(iVar);
            long f12 = iVar.f();
            if (c11 > j11 || c12 <= j11) {
                if (c12 <= j11) {
                    return a.e.f(c12, f12);
                }
                return a.e.d(c11, position);
            }
            return a.e.e(f11);
        }

        private C0703b(p pVar, int i11) {
            this.f37184a = pVar;
            this.f37185b = i11;
            this.f37186c = new m.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final p pVar, int i11, long j11, long j12) {
        super(new a.d() { // from class: li.a
            @Override // ji.a.d
            public final long a(long j13) {
                return p.this.j(j13);
            }
        }, new C0703b(pVar, i11), pVar.g(), 0L, pVar.f33756j, j11, j12, pVar.e(), Math.max(6, pVar.f33749c));
        Objects.requireNonNull(pVar);
    }
}