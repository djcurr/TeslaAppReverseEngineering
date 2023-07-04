package f10;

import j20.m;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import t00.k;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes5.dex */
public final class h extends b {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f25536h = {m0.j(new f0(m0.b(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    private final j20.i f25537g;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<Map<u10.f, ? extends y10.g<?>>> {
        a() {
            super(0);
        }

        @Override // h00.a
        public final Map<u10.f, ? extends y10.g<?>> invoke() {
            Map<u10.f, ? extends y10.g<?>> i11;
            y10.g<?> a11 = d.f25527a.a(h.this.a());
            Map<u10.f, ? extends y10.g<?>> f11 = a11 == null ? null : r0.f(v.a(c.f25521a.c(), a11));
            if (f11 != null) {
                return f11;
            }
            i11 = s0.i();
            return i11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l10.a annotation, h10.h c11) {
        super(c11, annotation, k.a.f51353w);
        s.g(annotation, "annotation");
        s.g(c11, "c");
        this.f25537g = c11.e().b(new a());
    }

    @Override // f10.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map<u10.f, y10.g<?>> g() {
        return (Map) m.a(this.f25537g, this, f25536h[0]);
    }
}