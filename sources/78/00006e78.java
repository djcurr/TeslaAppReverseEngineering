package fp;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a */
    private final uo.a f26695a;

    /* renamed from: b */
    private final s f26696b;

    public j(uo.a aVar) {
        this.f26695a = aVar;
        this.f26696b = new s(aVar);
    }

    public static j a(uo.a aVar) {
        if (aVar.c(1)) {
            return new g(aVar);
        }
        if (!aVar.c(2)) {
            return new k(aVar);
        }
        int g11 = s.g(aVar, 1, 4);
        if (g11 != 4) {
            if (g11 != 5) {
                int g12 = s.g(aVar, 1, 5);
                if (g12 != 12) {
                    if (g12 != 13) {
                        switch (s.g(aVar, 1, 7)) {
                            case 56:
                                return new e(aVar, "310", "11");
                            case 57:
                                return new e(aVar, "320", "11");
                            case 58:
                                return new e(aVar, "310", "13");
                            case 59:
                                return new e(aVar, "320", "13");
                            case 60:
                                return new e(aVar, "310", "15");
                            case 61:
                                return new e(aVar, "320", "15");
                            case 62:
                                return new e(aVar, "310", "17");
                            case 63:
                                return new e(aVar, "320", "17");
                            default:
                                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
                        }
                    }
                    return new d(aVar);
                }
                return new c(aVar);
            }
            return new b(aVar);
        }
        return new a(aVar);
    }

    public final s b() {
        return this.f26696b;
    }

    public final uo.a c() {
        return this.f26695a;
    }

    public abstract String d();
}