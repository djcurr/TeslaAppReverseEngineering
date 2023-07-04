package ti;

import ci.i;
import ti.i0;

/* loaded from: classes3.dex */
public final class r implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ak.v f52245a = new ak.v(10);

    /* renamed from: b  reason: collision with root package name */
    private ji.x f52246b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52247c;

    /* renamed from: d  reason: collision with root package name */
    private long f52248d;

    /* renamed from: e  reason: collision with root package name */
    private int f52249e;

    /* renamed from: f  reason: collision with root package name */
    private int f52250f;

    @Override // ti.m
    public void a() {
        this.f52247c = false;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        ak.a.h(this.f52246b);
        if (this.f52247c) {
            int a11 = vVar.a();
            int i11 = this.f52250f;
            if (i11 < 10) {
                int min = Math.min(a11, 10 - i11);
                System.arraycopy(vVar.d(), vVar.e(), this.f52245a.d(), this.f52250f, min);
                if (this.f52250f + min == 10) {
                    this.f52245a.O(0);
                    if (73 == this.f52245a.C() && 68 == this.f52245a.C() && 51 == this.f52245a.C()) {
                        this.f52245a.P(3);
                        this.f52249e = this.f52245a.B() + 10;
                    } else {
                        ak.o.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f52247c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a11, this.f52249e - this.f52250f);
            this.f52246b.e(vVar, min2);
            this.f52250f += min2;
        }
    }

    @Override // ti.m
    public void d() {
        int i11;
        ak.a.h(this.f52246b);
        if (this.f52247c && (i11 = this.f52249e) != 0 && this.f52250f == i11) {
            this.f52246b.f(this.f52248d, 1, i11, 0, null);
            this.f52247c = false;
        }
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        ji.x f11 = jVar.f(dVar.c(), 5);
        this.f52246b = f11;
        f11.d(new i.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f52247c = true;
        this.f52248d = j11;
        this.f52249e = 0;
        this.f52250f = 0;
    }
}