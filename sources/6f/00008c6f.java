package ni;

import ji.i;
import ji.q;

/* loaded from: classes3.dex */
final class c extends q {

    /* renamed from: b  reason: collision with root package name */
    private final long f41678b;

    public c(i iVar, long j11) {
        super(iVar);
        ak.a.a(iVar.getPosition() >= j11);
        this.f41678b = j11;
    }

    @Override // ji.q, ji.i
    public long f() {
        return super.f() - this.f41678b;
    }

    @Override // ji.q, ji.i
    public long getLength() {
        return super.getLength() - this.f41678b;
    }

    @Override // ji.q, ji.i
    public long getPosition() {
        return super.getPosition() - this.f41678b;
    }
}