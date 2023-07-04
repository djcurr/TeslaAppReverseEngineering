package c8;

import x7.s;

/* loaded from: classes.dex */
public class r implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f9003a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9004b;

    /* renamed from: c  reason: collision with root package name */
    private final b8.b f9005c;

    /* renamed from: d  reason: collision with root package name */
    private final b8.b f9006d;

    /* renamed from: e  reason: collision with root package name */
    private final b8.b f9007e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f9008f;

    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i11) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i11);
            }
            return SIMULTANEOUSLY;
        }
    }

    public r(String str, a aVar, b8.b bVar, b8.b bVar2, b8.b bVar3, boolean z11) {
        this.f9003a = str;
        this.f9004b = aVar;
        this.f9005c = bVar;
        this.f9006d = bVar2;
        this.f9007e = bVar3;
        this.f9008f = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new s(bVar, this);
    }

    public b8.b b() {
        return this.f9006d;
    }

    public String c() {
        return this.f9003a;
    }

    public b8.b d() {
        return this.f9007e;
    }

    public b8.b e() {
        return this.f9005c;
    }

    public a f() {
        return this.f9004b;
    }

    public boolean g() {
        return this.f9008f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f9005c + ", end: " + this.f9006d + ", offset: " + this.f9007e + "}";
    }
}