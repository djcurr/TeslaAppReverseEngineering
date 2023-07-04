package h30;

import ch.qos.logback.core.CoreConstants;
import e30.j;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public class d0 extends f30.a implements kotlinx.serialization.json.g {

    /* renamed from: a  reason: collision with root package name */
    private final kotlinx.serialization.json.a f28818a;

    /* renamed from: b  reason: collision with root package name */
    private final kotlinx.serialization.json.internal.a f28819b;

    /* renamed from: c  reason: collision with root package name */
    public final h30.a f28820c;

    /* renamed from: d  reason: collision with root package name */
    private final i30.c f28821d;

    /* renamed from: e  reason: collision with root package name */
    private int f28822e;

    /* renamed from: f  reason: collision with root package name */
    private final kotlinx.serialization.json.e f28823f;

    /* renamed from: g  reason: collision with root package name */
    private final n f28824g;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28825a;

        static {
            int[] iArr = new int[kotlinx.serialization.json.internal.a.values().length];
            iArr[kotlinx.serialization.json.internal.a.LIST.ordinal()] = 1;
            iArr[kotlinx.serialization.json.internal.a.MAP.ordinal()] = 2;
            iArr[kotlinx.serialization.json.internal.a.POLY_OBJ.ordinal()] = 3;
            iArr[kotlinx.serialization.json.internal.a.OBJ.ordinal()] = 4;
            f28825a = iArr;
        }
    }

    public d0(kotlinx.serialization.json.a json, kotlinx.serialization.json.internal.a mode, h30.a lexer, e30.f descriptor) {
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(mode, "mode");
        kotlin.jvm.internal.s.g(lexer, "lexer");
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        this.f28818a = json;
        this.f28819b = mode;
        this.f28820c = lexer;
        this.f28821d = json.a();
        this.f28822e = -1;
        kotlinx.serialization.json.e e11 = json.e();
        this.f28823f = e11;
        this.f28824g = e11.f() ? null : new n(descriptor);
    }

    private final void J() {
        if (this.f28820c.D() != 4) {
            return;
        }
        h30.a.x(this.f28820c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean K(e30.f fVar, int i11) {
        String E;
        kotlinx.serialization.json.a aVar = this.f28818a;
        e30.f g11 = fVar.g(i11);
        if (g11.b() || !(!this.f28820c.L())) {
            if (!kotlin.jvm.internal.s.c(g11.getKind(), j.b.f24589a) || (E = this.f28820c.E(this.f28823f.l())) == null || p.d(g11, aVar, E) != -3) {
                return false;
            }
            this.f28820c.p();
        }
        return true;
    }

    private final int L() {
        boolean K = this.f28820c.K();
        if (!this.f28820c.f()) {
            if (K) {
                h30.a.x(this.f28820c, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return -1;
        }
        int i11 = this.f28822e;
        if (i11 != -1 && !K) {
            h30.a.x(this.f28820c, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i12 = i11 + 1;
        this.f28822e = i12;
        return i12;
    }

    private final int M() {
        int i11;
        int i12;
        int i13 = this.f28822e;
        boolean z11 = false;
        boolean z12 = i13 % 2 != 0;
        if (!z12) {
            this.f28820c.n(CoreConstants.COLON_CHAR);
        } else if (i13 != -1) {
            z11 = this.f28820c.K();
        }
        if (!this.f28820c.f()) {
            if (z11) {
                h30.a.x(this.f28820c, "Expected '}', but had ',' instead", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return -1;
        }
        if (z12) {
            if (this.f28822e == -1) {
                h30.a aVar = this.f28820c;
                boolean z13 = !z11;
                i12 = aVar.f28788a;
                if (!z13) {
                    h30.a.x(aVar, "Unexpected trailing comma", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                h30.a aVar2 = this.f28820c;
                i11 = aVar2.f28788a;
                if (!z11) {
                    h30.a.x(aVar2, "Expected comma after the key-value pair", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i14 = this.f28822e + 1;
        this.f28822e = i14;
        return i14;
    }

    private final int N(e30.f fVar) {
        boolean z11;
        boolean K = this.f28820c.K();
        while (this.f28820c.f()) {
            String O = O();
            this.f28820c.n(CoreConstants.COLON_CHAR);
            int d11 = p.d(fVar, this.f28818a, O);
            boolean z12 = false;
            if (d11 == -3) {
                z12 = true;
                z11 = false;
            } else if (this.f28823f.d() && K(fVar, d11)) {
                z11 = this.f28820c.K();
            } else {
                n nVar = this.f28824g;
                if (nVar != null) {
                    nVar.c(d11);
                }
                return d11;
            }
            K = z12 ? P(O) : z11;
        }
        if (!K) {
            n nVar2 = this.f28824g;
            if (nVar2 != null) {
                return nVar2.d();
            }
            return -1;
        }
        h30.a.x(this.f28820c, "Unexpected trailing comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String O() {
        if (this.f28823f.l()) {
            return this.f28820c.s();
        }
        return this.f28820c.k();
    }

    private final boolean P(String str) {
        if (this.f28823f.g()) {
            this.f28820c.G(this.f28823f.l());
        } else {
            this.f28820c.z(str);
        }
        return this.f28820c.K();
    }

    private final void Q(e30.f fVar) {
        do {
        } while (p(fVar) != -1);
    }

    @Override // f30.a, f30.e
    public String B() {
        if (this.f28823f.l()) {
            return this.f28820c.s();
        }
        return this.f28820c.p();
    }

    @Override // f30.a, f30.e
    public boolean D() {
        n nVar = this.f28824g;
        return !(nVar != null ? nVar.b() : false) && this.f28820c.L();
    }

    @Override // f30.a, f30.e
    public byte F() {
        long o11 = this.f28820c.o();
        byte b11 = (byte) o11;
        if (o11 == b11) {
            return b11;
        }
        h30.a aVar = this.f28820c;
        h30.a.x(aVar, "Failed to parse byte for input '" + o11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // f30.a, f30.e
    public int G(e30.f enumDescriptor) {
        kotlin.jvm.internal.s.g(enumDescriptor, "enumDescriptor");
        kotlinx.serialization.json.a aVar = this.f28818a;
        String B = B();
        return p.e(enumDescriptor, aVar, B, " at path " + this.f28820c.f28789b.a());
    }

    @Override // f30.c
    public i30.c a() {
        return this.f28821d;
    }

    @Override // f30.a, f30.e
    public f30.c b(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlinx.serialization.json.internal.a b11 = k0.b(this.f28818a, descriptor);
        this.f28820c.f28789b.c(descriptor);
        this.f28820c.n(b11.begin);
        J();
        int i11 = a.f28825a[b11.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return new d0(this.f28818a, b11, this.f28820c, descriptor);
        }
        return (this.f28819b == b11 && this.f28818a.e().f()) ? this : new d0(this.f28818a, b11, this.f28820c, descriptor);
    }

    @Override // kotlinx.serialization.json.g
    public final kotlinx.serialization.json.a c() {
        return this.f28818a;
    }

    @Override // f30.a, f30.c
    public void d(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        if (this.f28818a.e().g() && descriptor.d() == 0) {
            Q(descriptor);
        }
        this.f28820c.n(this.f28819b.end);
        this.f28820c.f28789b.b();
    }

    @Override // f30.a, f30.c
    public <T> T e(e30.f descriptor, int i11, c30.a<T> deserializer, T t11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        boolean z11 = this.f28819b == kotlinx.serialization.json.internal.a.MAP && (i11 & 1) == 0;
        if (z11) {
            this.f28820c.f28789b.d();
        }
        T t12 = (T) super.e(descriptor, i11, deserializer, t11);
        if (z11) {
            this.f28820c.f28789b.f(t12);
        }
        return t12;
    }

    @Override // kotlinx.serialization.json.g
    public JsonElement f() {
        return new a0(this.f28818a.e(), this.f28820c).e();
    }

    @Override // f30.a, f30.e
    public int g() {
        long o11 = this.f28820c.o();
        int i11 = (int) o11;
        if (o11 == i11) {
            return i11;
        }
        h30.a aVar = this.f28820c;
        h30.a.x(aVar, "Failed to parse int for input '" + o11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // f30.a, f30.e
    public Void h() {
        return null;
    }

    @Override // f30.a, f30.e
    public long k() {
        return this.f28820c.o();
    }

    @Override // f30.a, f30.e
    public <T> T m(c30.a<T> deserializer) {
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        try {
            return (T) b0.d(this, deserializer);
        } catch (MissingFieldException e11) {
            throw new MissingFieldException(e11.getMessage() + " at path: " + this.f28820c.f28789b.a(), e11);
        }
    }

    @Override // f30.c
    public int p(e30.f descriptor) {
        int M;
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        int i11 = a.f28825a[this.f28819b.ordinal()];
        if (i11 == 2) {
            M = M();
        } else if (i11 != 4) {
            M = L();
        } else {
            M = N(descriptor);
        }
        if (this.f28819b != kotlinx.serialization.json.internal.a.MAP) {
            this.f28820c.f28789b.g(M);
        }
        return M;
    }

    @Override // f30.a, f30.e
    public short s() {
        long o11 = this.f28820c.o();
        short s11 = (short) o11;
        if (o11 == s11) {
            return s11;
        }
        h30.a aVar = this.f28820c;
        h30.a.x(aVar, "Failed to parse short for input '" + o11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // f30.a, f30.e
    public float t() {
        h30.a aVar = this.f28820c;
        String r11 = aVar.r();
        try {
            float parseFloat = Float.parseFloat(r11);
            if (!this.f28818a.e().a()) {
                if (!((Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) ? false : true)) {
                    o.j(this.f28820c, Float.valueOf(parseFloat));
                    throw new KotlinNothingValueException();
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            h30.a.x(aVar, "Failed to parse type 'float' for input '" + r11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // f30.a, f30.e
    public double v() {
        h30.a aVar = this.f28820c;
        String r11 = aVar.r();
        try {
            double parseDouble = Double.parseDouble(r11);
            if (!this.f28818a.e().a()) {
                if (!((Double.isInfinite(parseDouble) || Double.isNaN(parseDouble)) ? false : true)) {
                    o.j(this.f28820c, Double.valueOf(parseDouble));
                    throw new KotlinNothingValueException();
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            h30.a.x(aVar, "Failed to parse type 'double' for input '" + r11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // f30.a, f30.e
    public f30.e w(e30.f inlineDescriptor) {
        kotlin.jvm.internal.s.g(inlineDescriptor, "inlineDescriptor");
        return f0.a(inlineDescriptor) ? new m(this.f28820c, this.f28818a) : super.w(inlineDescriptor);
    }

    @Override // f30.a, f30.e
    public boolean y() {
        if (this.f28823f.l()) {
            return this.f28820c.i();
        }
        return this.f28820c.g();
    }

    @Override // f30.a, f30.e
    public char z() {
        String r11 = this.f28820c.r();
        if (r11.length() == 1) {
            return r11.charAt(0);
        }
        h30.a aVar = this.f28820c;
        h30.a.x(aVar, "Expected single char, but got '" + r11 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}