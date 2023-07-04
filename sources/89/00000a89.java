package atd.f0;

import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final f f6855a;

    /* renamed from: b  reason: collision with root package name */
    private final d f6856b;

    /* renamed from: c  reason: collision with root package name */
    private final g f6857c;

    /* renamed from: d  reason: collision with root package name */
    private final e f6858d;

    /* renamed from: e  reason: collision with root package name */
    private final c f6859e;

    static {
        atd.s0.a.a(-797887623391808L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(f fVar, d dVar, g gVar, e eVar, c cVar) {
        this.f6855a = fVar;
        this.f6856b = dVar;
        this.f6857c = gVar;
        this.f6858d = eVar;
        this.f6859e = cVar;
    }

    public static h a(String str) {
        String[] split = str.split(atd.s0.a.a(-798652127570496L));
        if (split.length == 5) {
            return new h(new f(split[0]), new d(split[1]), new g(split[2]), new e(split[3]), new c(split[4]));
        }
        throw atd.y.c.CRYPTO_FAILURE.a();
    }

    public e b() {
        return this.f6858d;
    }

    public f c() {
        return this.f6855a;
    }

    public g d() {
        return this.f6857c;
    }

    public String e() {
        return String.format(Locale.US, atd.s0.a.a(-797848968686144L), this.f6855a.c(), this.f6856b.c(), this.f6857c.c(), this.f6858d.c(), this.f6859e.c());
    }

    public c a() {
        return this.f6859e;
    }
}