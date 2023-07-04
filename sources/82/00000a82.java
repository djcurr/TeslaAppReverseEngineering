package atd.f0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final f f6850a;

    /* renamed from: b  reason: collision with root package name */
    private final atd.c0.d f6851b;

    /* renamed from: c  reason: collision with root package name */
    private final d f6852c;

    public a(f fVar, atd.c0.d dVar, atd.g0.b bVar) {
        atd.d0.f f11 = fVar.f();
        this.f6850a = fVar;
        this.f6851b = dVar;
        this.f6852c = a(f11, bVar);
    }

    public h a(byte[] bArr) {
        atd.c0.b e11 = this.f6850a.e();
        byte[] b11 = e11.b();
        atd.c0.e b12 = e11.b(this.f6851b, b11, bArr, this.f6850a.b());
        return new h(this.f6850a, this.f6852c, new g(b11), new e(b12.b()), new c(b12.a()));
    }

    public byte[] a(h hVar) {
        atd.c0.b e11 = this.f6850a.e();
        byte[] b11 = hVar.c().b();
        return e11.a(this.f6851b, hVar.d().b(), hVar.b().b(), b11, hVar.a().b());
    }

    private d a(atd.d0.f fVar, atd.g0.b bVar) {
        byte[] bArr;
        if (fVar instanceof atd.d0.e) {
            atd.g0.b.a(bVar, atd.g0.d.class);
            bArr = ((atd.d0.e) fVar).a(this.f6851b, ((atd.g0.d) bVar).f());
        } else {
            bArr = null;
        }
        return new d(bArr);
    }
}