package h30;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.util.Objects;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public final class e0 extends f30.b implements kotlinx.serialization.json.k {

    /* renamed from: a  reason: collision with root package name */
    private final g f28830a;

    /* renamed from: b  reason: collision with root package name */
    private final kotlinx.serialization.json.a f28831b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.serialization.json.internal.a f28832c;

    /* renamed from: d  reason: collision with root package name */
    private final kotlinx.serialization.json.k[] f28833d;

    /* renamed from: e  reason: collision with root package name */
    private final i30.c f28834e;

    /* renamed from: f  reason: collision with root package name */
    private final kotlinx.serialization.json.e f28835f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28836g;

    /* renamed from: h  reason: collision with root package name */
    private String f28837h;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28838a;

        static {
            int[] iArr = new int[kotlinx.serialization.json.internal.a.values().length];
            iArr[kotlinx.serialization.json.internal.a.LIST.ordinal()] = 1;
            iArr[kotlinx.serialization.json.internal.a.MAP.ordinal()] = 2;
            iArr[kotlinx.serialization.json.internal.a.POLY_OBJ.ordinal()] = 3;
            f28838a = iArr;
        }
    }

    public e0(g composer, kotlinx.serialization.json.a json, kotlinx.serialization.json.internal.a mode, kotlinx.serialization.json.k[] kVarArr) {
        kotlin.jvm.internal.s.g(composer, "composer");
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(mode, "mode");
        this.f28830a = composer;
        this.f28831b = json;
        this.f28832c = mode;
        this.f28833d = kVarArr;
        this.f28834e = c().a();
        this.f28835f = c().e();
        int ordinal = mode.ordinal();
        if (kVarArr != null) {
            if (kVarArr[ordinal] == null && kVarArr[ordinal] == this) {
                return;
            }
            kVarArr[ordinal] = this;
        }
    }

    private final void J(e30.f fVar) {
        this.f28830a.c();
        String str = this.f28837h;
        kotlin.jvm.internal.s.e(str);
        E(str);
        this.f28830a.e(CoreConstants.COLON_CHAR);
        this.f28830a.o();
        E(fVar.h());
    }

    @Override // f30.b, f30.f
    public void A(int i11) {
        if (this.f28836g) {
            E(String.valueOf(i11));
        } else {
            this.f28830a.h(i11);
        }
    }

    @Override // f30.b, f30.d
    public <T> void D(e30.f descriptor, int i11, c30.h<? super T> serializer, T t11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(serializer, "serializer");
        if (t11 != null || this.f28835f.f()) {
            super.D(descriptor, i11, serializer, t11);
        }
    }

    @Override // f30.b, f30.f
    public void E(String value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f28830a.m(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f30.b, f30.f
    public <T> void F(c30.h<? super T> serializer, T t11) {
        kotlin.jvm.internal.s.g(serializer, "serializer");
        if ((serializer instanceof g30.b) && !c().e().k()) {
            g30.b bVar = (g30.b) serializer;
            String c11 = b0.c(serializer.getDescriptor(), c());
            Objects.requireNonNull(t11, "null cannot be cast to non-null type kotlin.Any");
            c30.h b11 = c30.e.b(bVar, this, t11);
            b0.a(bVar, b11, c11);
            b0.b(b11.getDescriptor().getKind());
            this.f28837h = c11;
            b11.serialize(this, t11);
            return;
        }
        serializer.serialize(this, t11);
    }

    @Override // f30.b
    public boolean G(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        int i12 = a.f28838a[this.f28832c.ordinal()];
        if (i12 != 1) {
            boolean z11 = false;
            if (i12 != 2) {
                if (i12 != 3) {
                    if (!this.f28830a.a()) {
                        this.f28830a.e(CoreConstants.COMMA_CHAR);
                    }
                    this.f28830a.c();
                    E(descriptor.e(i11));
                    this.f28830a.e(CoreConstants.COLON_CHAR);
                    this.f28830a.o();
                } else {
                    if (i11 == 0) {
                        this.f28836g = true;
                    }
                    if (i11 == 1) {
                        this.f28830a.e(CoreConstants.COMMA_CHAR);
                        this.f28830a.o();
                        this.f28836g = false;
                    }
                }
            } else if (!this.f28830a.a()) {
                if (i11 % 2 == 0) {
                    this.f28830a.e(CoreConstants.COMMA_CHAR);
                    this.f28830a.c();
                    z11 = true;
                } else {
                    this.f28830a.e(CoreConstants.COLON_CHAR);
                    this.f28830a.o();
                }
                this.f28836g = z11;
            } else {
                this.f28836g = true;
                this.f28830a.c();
            }
        } else {
            if (!this.f28830a.a()) {
                this.f28830a.e(CoreConstants.COMMA_CHAR);
            }
            this.f28830a.c();
        }
        return true;
    }

    @Override // f30.f
    public i30.c a() {
        return this.f28834e;
    }

    @Override // f30.b, f30.f
    public f30.d b(e30.f descriptor) {
        kotlinx.serialization.json.k kVar;
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlinx.serialization.json.internal.a b11 = k0.b(c(), descriptor);
        char c11 = b11.begin;
        if (c11 != 0) {
            this.f28830a.e(c11);
            this.f28830a.b();
        }
        if (this.f28837h != null) {
            J(descriptor);
            this.f28837h = null;
        }
        if (this.f28832c == b11) {
            return this;
        }
        kotlinx.serialization.json.k[] kVarArr = this.f28833d;
        return (kVarArr == null || (kVar = kVarArr[b11.ordinal()]) == null) ? new e0(this.f28830a, c(), b11, this.f28833d) : kVar;
    }

    @Override // kotlinx.serialization.json.k
    public kotlinx.serialization.json.a c() {
        return this.f28831b;
    }

    @Override // f30.b, f30.d
    public void d(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        if (this.f28832c.end != 0) {
            this.f28830a.p();
            this.f28830a.c();
            this.f28830a.e(this.f28832c.end);
        }
    }

    @Override // f30.b, f30.f
    public void e(double d11) {
        if (this.f28836g) {
            E(String.valueOf(d11));
        } else {
            this.f28830a.f(d11);
        }
        if (this.f28835f.a()) {
            return;
        }
        if (!((Double.isInfinite(d11) || Double.isNaN(d11)) ? false : true)) {
            throw o.b(Double.valueOf(d11), this.f28830a.f28843a.toString());
        }
    }

    @Override // f30.b, f30.f
    public void g(byte b11) {
        if (this.f28836g) {
            E(String.valueOf((int) b11));
        } else {
            this.f28830a.d(b11);
        }
    }

    @Override // f30.b, f30.f
    public f30.f i(e30.f inlineDescriptor) {
        kotlin.jvm.internal.s.g(inlineDescriptor, "inlineDescriptor");
        if (f0.a(inlineDescriptor)) {
            return new e0(new h(this.f28830a.f28843a), c(), this.f28832c, (kotlinx.serialization.json.k[]) null);
        }
        return super.i(inlineDescriptor);
    }

    @Override // f30.b, f30.d
    public boolean k(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return this.f28835f.e();
    }

    @Override // f30.b, f30.f
    public void m(long j11) {
        if (this.f28836g) {
            E(String.valueOf(j11));
        } else {
            this.f28830a.i(j11);
        }
    }

    @Override // f30.b, f30.f
    public void o() {
        this.f28830a.j(Address.ADDRESS_NULL_PLACEHOLDER);
    }

    @Override // f30.b, f30.f
    public void r(short s11) {
        if (this.f28836g) {
            E(String.valueOf((int) s11));
        } else {
            this.f28830a.k(s11);
        }
    }

    @Override // f30.b, f30.f
    public void s(boolean z11) {
        if (this.f28836g) {
            E(String.valueOf(z11));
        } else {
            this.f28830a.l(z11);
        }
    }

    @Override // f30.b, f30.f
    public void t(float f11) {
        if (this.f28836g) {
            E(String.valueOf(f11));
        } else {
            this.f28830a.g(f11);
        }
        if (this.f28835f.a()) {
            return;
        }
        if (!((Float.isInfinite(f11) || Float.isNaN(f11)) ? false : true)) {
            throw o.b(Float.valueOf(f11), this.f28830a.f28843a.toString());
        }
    }

    @Override // f30.b, f30.f
    public void u(char c11) {
        E(String.valueOf(c11));
    }

    @Override // f30.b, f30.f
    public void x(e30.f enumDescriptor, int i11) {
        kotlin.jvm.internal.s.g(enumDescriptor, "enumDescriptor");
        E(enumDescriptor.e(i11));
    }

    @Override // kotlinx.serialization.json.k
    public void z(JsonElement element) {
        kotlin.jvm.internal.s.g(element, "element");
        F(kotlinx.serialization.json.i.f35650a, element);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(t output, kotlinx.serialization.json.a json, kotlinx.serialization.json.internal.a mode, kotlinx.serialization.json.k[] modeReuseCache) {
        this(j.a(output, json), json, mode, modeReuseCache);
        kotlin.jvm.internal.s.g(output, "output");
        kotlin.jvm.internal.s.g(json, "json");
        kotlin.jvm.internal.s.g(mode, "mode");
        kotlin.jvm.internal.s.g(modeReuseCache, "modeReuseCache");
    }
}