package t20;

/* loaded from: classes5.dex */
final class c<V> {

    /* renamed from: f  reason: collision with root package name */
    static final c<Object> f51575f = new c<>();

    /* renamed from: a  reason: collision with root package name */
    private final long f51576a;

    /* renamed from: b  reason: collision with root package name */
    private final V f51577b;

    /* renamed from: c  reason: collision with root package name */
    private final c<V> f51578c;

    /* renamed from: d  reason: collision with root package name */
    private final c<V> f51579d;

    /* renamed from: e  reason: collision with root package name */
    private final int f51580e;

    private c() {
        this.f51580e = 0;
        this.f51576a = 0L;
        this.f51577b = null;
        this.f51578c = null;
        this.f51579d = null;
    }

    private static <V> c<V> c(long j11, V v11, c<V> cVar, c<V> cVar2) {
        int i11 = ((c) cVar).f51580e;
        int i12 = ((c) cVar2).f51580e;
        if (i11 + i12 > 1) {
            if (i11 >= i12 * 5) {
                c<V> cVar3 = ((c) cVar).f51578c;
                c<V> cVar4 = ((c) cVar).f51579d;
                if (((c) cVar4).f51580e < ((c) cVar3).f51580e * 2) {
                    long j12 = ((c) cVar).f51576a;
                    return new c<>(j12 + j11, ((c) cVar).f51577b, cVar3, new c(-j12, v11, cVar4.e(((c) cVar4).f51576a + j12), cVar2));
                }
                c<V> cVar5 = ((c) cVar4).f51578c;
                c<V> cVar6 = ((c) cVar4).f51579d;
                long j13 = ((c) cVar4).f51576a;
                long j14 = ((c) cVar).f51576a + j13 + j11;
                V v12 = ((c) cVar4).f51577b;
                c cVar7 = new c(-j13, ((c) cVar).f51577b, cVar3, cVar5.e(((c) cVar5).f51576a + j13));
                long j15 = ((c) cVar).f51576a;
                long j16 = ((c) cVar4).f51576a;
                return new c<>(j14, v12, cVar7, new c((-j15) - j16, v11, cVar6.e(((c) cVar6).f51576a + j16 + j15), cVar2));
            } else if (i12 >= i11 * 5) {
                c<V> cVar8 = ((c) cVar2).f51578c;
                c<V> cVar9 = ((c) cVar2).f51579d;
                if (((c) cVar8).f51580e < ((c) cVar9).f51580e * 2) {
                    long j17 = ((c) cVar2).f51576a;
                    return new c<>(j17 + j11, ((c) cVar2).f51577b, new c(-j17, v11, cVar, cVar8.e(((c) cVar8).f51576a + j17)), cVar9);
                }
                c<V> cVar10 = ((c) cVar8).f51578c;
                c<V> cVar11 = ((c) cVar8).f51579d;
                long j18 = ((c) cVar8).f51576a;
                long j19 = ((c) cVar2).f51576a;
                long j21 = j18 + j19 + j11;
                V v13 = ((c) cVar8).f51577b;
                c cVar12 = new c((-j19) - j18, v11, cVar, cVar10.e(((c) cVar10).f51576a + j18 + j19));
                long j22 = ((c) cVar8).f51576a;
                return new c<>(j21, v13, cVar12, new c(-j22, ((c) cVar2).f51577b, cVar11.e(((c) cVar11).f51576a + j22), cVar9));
            }
        }
        return new c<>(j11, v11, cVar, cVar2);
    }

    private c<V> d(c<V> cVar, c<V> cVar2) {
        return (cVar == this.f51578c && cVar2 == this.f51579d) ? this : c(this.f51576a, this.f51577b, cVar, cVar2);
    }

    private c<V> e(long j11) {
        return (this.f51580e == 0 || j11 == this.f51576a) ? this : new c<>(j11, this.f51577b, this.f51578c, this.f51579d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V a(long j11) {
        if (this.f51580e == 0) {
            return null;
        }
        long j12 = this.f51576a;
        if (j11 < j12) {
            return this.f51578c.a(j11 - j12);
        }
        if (j11 > j12) {
            return this.f51579d.a(j11 - j12);
        }
        return this.f51577b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<V> b(long j11, V v11) {
        if (this.f51580e == 0) {
            return new c<>(j11, v11, this, this);
        }
        long j12 = this.f51576a;
        if (j11 < j12) {
            return d(this.f51578c.b(j11 - j12, v11), this.f51579d);
        }
        if (j11 > j12) {
            return d(this.f51578c, this.f51579d.b(j11 - j12, v11));
        }
        return v11 == this.f51577b ? this : new c<>(j11, v11, this.f51578c, this.f51579d);
    }

    private c(long j11, V v11, c<V> cVar, c<V> cVar2) {
        this.f51576a = j11;
        this.f51577b = v11;
        this.f51578c = cVar;
        this.f51579d = cVar2;
        this.f51580e = cVar.f51580e + 1 + cVar2.f51580e;
    }
}