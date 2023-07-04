package h30;

import e30.j;
import e30.k;
import g30.z0;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class d extends z0 implements kotlinx.serialization.json.k {

    /* renamed from: b  reason: collision with root package name */
    private final kotlinx.serialization.json.a f28810b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<JsonElement, vz.b0> f28811c;

    /* renamed from: d  reason: collision with root package name */
    protected final kotlinx.serialization.json.e f28812d;

    /* renamed from: e  reason: collision with root package name */
    private String f28813e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<JsonElement, vz.b0> {
        a() {
            super(1);
        }

        public final void a(JsonElement node) {
            kotlin.jvm.internal.s.g(node, "node");
            d dVar = d.this;
            dVar.r0(d.d0(dVar), node);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(JsonElement jsonElement) {
            a(jsonElement);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends f30.b {

        /* renamed from: a  reason: collision with root package name */
        private final i30.c f28815a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28817c;

        b(String str) {
            this.f28817c = str;
            this.f28815a = d.this.c().a();
        }

        @Override // f30.b, f30.f
        public void A(int i11) {
            J(vz.x.e(vz.x.b(i11)));
        }

        public final void J(String s11) {
            kotlin.jvm.internal.s.g(s11, "s");
            d.this.r0(this.f28817c, new kotlinx.serialization.json.n(s11, false));
        }

        @Override // f30.f
        public i30.c a() {
            return this.f28815a;
        }

        @Override // f30.b, f30.f
        public void g(byte b11) {
            J(vz.w.e(vz.w.b(b11)));
        }

        @Override // f30.b, f30.f
        public void m(long j11) {
            J(vz.y.e(vz.y.b(j11)));
        }

        @Override // f30.b, f30.f
        public void r(short s11) {
            J(vz.a0.e(vz.a0.b(s11)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(kotlinx.serialization.json.a aVar, h00.l<? super JsonElement, vz.b0> lVar) {
        this.f28810b = aVar;
        this.f28811c = lVar;
        this.f28812d = aVar.e();
    }

    public /* synthetic */ d(kotlinx.serialization.json.a aVar, h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, lVar);
    }

    public static final /* synthetic */ String d0(d dVar) {
        return dVar.U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g30.w1, f30.f
    public <T> void F(c30.h<? super T> serializer, T t11) {
        kotlin.jvm.internal.s.g(serializer, "serializer");
        if (V() == null && j0.a(k0.a(serializer.getDescriptor(), a()))) {
            s sVar = new s(this.f28810b, this.f28811c);
            sVar.F(serializer, t11);
            sVar.T(serializer.getDescriptor());
        } else if ((serializer instanceof g30.b) && !c().e().k()) {
            g30.b bVar = (g30.b) serializer;
            String c11 = b0.c(serializer.getDescriptor(), c());
            Objects.requireNonNull(t11, "null cannot be cast to non-null type kotlin.Any");
            c30.h b11 = c30.e.b(bVar, this, t11);
            b0.a(bVar, b11, c11);
            b0.b(b11.getDescriptor().getKind());
            this.f28813e = c11;
            b11.serialize(this, t11);
        } else {
            serializer.serialize(this, t11);
        }
    }

    @Override // g30.w1
    protected void T(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        this.f28811c.invoke(q0());
    }

    @Override // g30.z0
    protected String Z(String parentName, String childName) {
        kotlin.jvm.internal.s.g(parentName, "parentName");
        kotlin.jvm.internal.s.g(childName, "childName");
        return childName;
    }

    @Override // f30.f
    public final i30.c a() {
        return this.f28810b.a();
    }

    @Override // f30.f
    public f30.d b(e30.f descriptor) {
        d vVar;
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        h00.l aVar = V() == null ? this.f28811c : new a();
        e30.j kind = descriptor.getKind();
        if (kotlin.jvm.internal.s.c(kind, k.b.f24591a) ? true : kind instanceof e30.d) {
            vVar = new x(this.f28810b, aVar);
        } else if (kotlin.jvm.internal.s.c(kind, k.c.f24592a)) {
            kotlinx.serialization.json.a aVar2 = this.f28810b;
            e30.f a11 = k0.a(descriptor.g(0), aVar2.a());
            e30.j kind2 = a11.getKind();
            if (!(kind2 instanceof e30.e) && !kotlin.jvm.internal.s.c(kind2, j.b.f24589a)) {
                if (aVar2.e().b()) {
                    vVar = new x(this.f28810b, aVar);
                } else {
                    throw o.d(a11);
                }
            } else {
                vVar = new z(this.f28810b, aVar);
            }
        } else {
            vVar = new v(this.f28810b, aVar);
        }
        String str = this.f28813e;
        if (str != null) {
            kotlin.jvm.internal.s.e(str);
            vVar.r0(str, kotlinx.serialization.json.h.c(descriptor.h()));
            this.f28813e = null;
        }
        return vVar;
    }

    @Override // kotlinx.serialization.json.k
    public final kotlinx.serialization.json.a c() {
        return this.f28810b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: e0 */
    public void I(String tag, boolean z11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, kotlinx.serialization.json.h.a(Boolean.valueOf(z11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: f0 */
    public void J(String tag, byte b11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, kotlinx.serialization.json.h.b(Byte.valueOf(b11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: g0 */
    public void K(String tag, char c11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, kotlinx.serialization.json.h.c(String.valueOf(c11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: h0 */
    public void L(String tag, double d11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, kotlinx.serialization.json.h.b(Double.valueOf(d11)));
        if (this.f28812d.a()) {
            return;
        }
        if (!((Double.isInfinite(d11) || Double.isNaN(d11)) ? false : true)) {
            throw o.c(Double.valueOf(d11), tag, q0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: i0 */
    public void M(String tag, e30.f enumDescriptor, int i11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(enumDescriptor, "enumDescriptor");
        r0(tag, kotlinx.serialization.json.h.c(enumDescriptor.e(i11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: j0 */
    public void N(String tag, float f11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, kotlinx.serialization.json.h.b(Float.valueOf(f11)));
        if (this.f28812d.a()) {
            return;
        }
        if (!((Float.isInfinite(f11) || Float.isNaN(f11)) ? false : true)) {
            throw o.c(Float.valueOf(f11), tag, q0().toString());
        }
    }

    @Override // f30.d
    public boolean k(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return this.f28812d.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: k0 */
    public f30.f O(String tag, e30.f inlineDescriptor) {
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(inlineDescriptor, "inlineDescriptor");
        return f0.a(inlineDescriptor) ? new b(tag) : super.O(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: l0 */
    public void P(String tag, int i11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, kotlinx.serialization.json.h.b(Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: m0 */
    public void Q(String tag, long j11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, kotlinx.serialization.json.h.b(Long.valueOf(j11)));
    }

    protected void n0(String tag) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, JsonNull.f35610a);
    }

    @Override // f30.f
    public void o() {
        String V = V();
        if (V == null) {
            this.f28811c.invoke(JsonNull.f35610a);
        } else {
            n0(V);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: o0 */
    public void R(String tag, short s11) {
        kotlin.jvm.internal.s.g(tag, "tag");
        r0(tag, kotlinx.serialization.json.h.b(Short.valueOf(s11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: p0 */
    public void S(String tag, String value) {
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(value, "value");
        r0(tag, kotlinx.serialization.json.h.c(value));
    }

    public abstract JsonElement q0();

    public abstract void r0(String str, JsonElement jsonElement);

    @Override // kotlinx.serialization.json.k
    public void z(JsonElement element) {
        kotlin.jvm.internal.s.g(element, "element");
        F(kotlinx.serialization.json.i.f35650a, element);
    }
}