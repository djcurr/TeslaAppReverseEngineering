package f10;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import l10.m;
import t00.k;
import wz.r0;
import wz.s0;
import wz.v;

/* loaded from: classes5.dex */
public final class i extends b {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f25539h = {m0.j(new f0(m0.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    private final j20.i f25540g;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<Map<u10.f, ? extends y10.g<? extends Object>>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Map<u10.f, ? extends y10.g<? extends Object>> mo11invoke() {
            y10.g<?> gVar;
            List<? extends l10.b> d11;
            Map<u10.f, ? extends y10.g<? extends Object>> i11;
            l10.b a11 = i.this.a();
            if (a11 instanceof l10.e) {
                gVar = d.f25527a.c(((l10.e) i.this.a()).c());
            } else if (a11 instanceof m) {
                d dVar = d.f25527a;
                d11 = v.d(i.this.a());
                gVar = dVar.c(d11);
            } else {
                gVar = null;
            }
            Map<u10.f, ? extends y10.g<? extends Object>> f11 = gVar != null ? r0.f(vz.v.a(c.f25521a.d(), gVar)) : null;
            if (f11 != null) {
                return f11;
            }
            i11 = s0.i();
            return i11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l10.a annotation, h10.h c11) {
        super(c11, annotation, k.a.f51350t);
        s.g(annotation, "annotation");
        s.g(c11, "c");
        this.f25540g = c11.e().b(new a());
    }

    @Override // f10.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map<u10.f, y10.g<Object>> g() {
        return (Map) j20.m.a(this.f25540g, this, f25539h[0]);
    }
}