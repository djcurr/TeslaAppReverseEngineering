package re;

/* loaded from: classes3.dex */
public class d implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f49366b = d.class;

    /* renamed from: a  reason: collision with root package name */
    private final int f49367a;

    public d() {
        this(3);
    }

    @Override // re.a
    public void a(b bVar, pe.b bVar2, oe.a aVar, int i11) {
        for (int i12 = 1; i12 <= this.f49367a; i12++) {
            int a11 = (i11 + i12) % aVar.a();
            if (nd.a.u(2)) {
                nd.a.x(f49366b, "Preparing frame %d, last drawn: %d", Integer.valueOf(a11), Integer.valueOf(i11));
            }
            if (!bVar.a(bVar2, aVar, a11)) {
                return;
            }
        }
    }

    public d(int i11) {
        this.f49367a = i11;
    }
}