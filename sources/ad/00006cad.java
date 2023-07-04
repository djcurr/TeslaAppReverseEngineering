package f10;

import j20.m;
import java.util.Collection;
import java.util.Map;
import k20.k0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import w00.n0;
import wz.s0;

/* loaded from: classes5.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, g10.g {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f25513f = {m0.j(new f0(m0.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a  reason: collision with root package name */
    private final u10.c f25514a;

    /* renamed from: b  reason: collision with root package name */
    private final n0 f25515b;

    /* renamed from: c  reason: collision with root package name */
    private final j20.i f25516c;

    /* renamed from: d  reason: collision with root package name */
    private final l10.b f25517d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f25518e;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<k0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h10.h f25519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f25520b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h10.h hVar, b bVar) {
            super(0);
            this.f25519a = hVar;
            this.f25520b = bVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final k0 invoke() {
            k0 n11 = this.f25519a.d().l().o(this.f25520b.e()).n();
            s.f(n11, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return n11;
        }
    }

    public b(h10.h c11, l10.a aVar, u10.c fqName) {
        Collection<l10.b> f11;
        s.g(c11, "c");
        s.g(fqName, "fqName");
        this.f25514a = fqName;
        l10.b bVar = null;
        n0 NO_SOURCE = aVar == null ? null : c11.a().t().a(aVar);
        if (NO_SOURCE == null) {
            NO_SOURCE = n0.f55303a;
            s.f(NO_SOURCE, "NO_SOURCE");
        }
        this.f25515b = NO_SOURCE;
        this.f25516c = c11.e().b(new a(c11, this));
        if (aVar != null && (f11 = aVar.f()) != null) {
            bVar = (l10.b) wz.u.c0(f11);
        }
        this.f25517d = bVar;
        boolean z11 = false;
        if (aVar != null && aVar.d()) {
            z11 = true;
        }
        this.f25518e = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final l10.b a() {
        return this.f25517d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: b */
    public k0 getType() {
        return (k0) m.a(this.f25516c, this, f25513f[0]);
    }

    @Override // g10.g
    public boolean d() {
        return this.f25518e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public u10.c e() {
        return this.f25514a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public n0 f() {
        return this.f25515b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map<u10.f, y10.g<?>> g() {
        Map<u10.f, y10.g<?>> i11;
        i11 = s0.i();
        return i11;
    }
}