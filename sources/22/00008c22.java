package net.time4j.tz;

/* loaded from: classes5.dex */
class i implements net.time4j.base.f {

    /* renamed from: a  reason: collision with root package name */
    private final long f41532a;

    /* renamed from: b  reason: collision with root package name */
    private final int f41533b;

    private i(long j11, int i11) {
        this.f41532a = j11;
        this.f41533b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static net.time4j.base.f b(long j11, int i11) {
        if (i11 == 0) {
            j11--;
        }
        return new i(j11, i11 == 0 ? 999999999 : i11 - 1);
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f41533b;
    }

    @Override // net.time4j.base.f
    public long g() {
        return this.f41532a;
    }
}