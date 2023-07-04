package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import k20.d0;
import k20.k0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import w00.n0;

/* loaded from: classes5.dex */
public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private final t00.h f34947a;

    /* renamed from: b  reason: collision with root package name */
    private final u10.c f34948b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<u10.f, y10.g<?>> f34949c;

    /* renamed from: d  reason: collision with root package name */
    private final vz.k f34950d;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<k0> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final k0 invoke() {
            return j.this.f34947a.o(j.this.e()).n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(t00.h builtIns, u10.c fqName, Map<u10.f, ? extends y10.g<?>> allValueArguments) {
        vz.k b11;
        s.g(builtIns, "builtIns");
        s.g(fqName, "fqName");
        s.g(allValueArguments, "allValueArguments");
        this.f34947a = builtIns;
        this.f34948b = fqName;
        this.f34949c = allValueArguments;
        b11 = vz.m.b(kotlin.b.PUBLICATION, new a());
        this.f34950d = b11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public u10.c e() {
        return this.f34948b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public n0 f() {
        n0 NO_SOURCE = n0.f55303a;
        s.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map<u10.f, y10.g<?>> g() {
        return this.f34949c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public d0 getType() {
        Object value = this.f34950d.getValue();
        s.f(value, "<get-type>(...)");
        return (d0) value;
    }
}