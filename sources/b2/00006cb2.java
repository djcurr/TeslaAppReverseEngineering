package f10;

import j20.m;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import t00.k;
import wz.r0;
import y10.v;

/* loaded from: classes5.dex */
public final class e extends b {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f25531h = {m0.j(new f0(m0.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    private final j20.i f25532g;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<Map<u10.f, ? extends v>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25533a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        public final Map<u10.f, ? extends v> invoke() {
            Map<u10.f, ? extends v> f11;
            f11 = r0.f(vz.v.a(c.f25521a.b(), new v("Deprecated in Java")));
            return f11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l10.a aVar, h10.h c11) {
        super(c11, aVar, k.a.f51344n);
        s.g(c11, "c");
        this.f25532g = c11.e().b(a.f25533a);
    }

    @Override // f10.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map<u10.f, y10.g<?>> g() {
        return (Map) m.a(this.f25532g, this, f25531h[0]);
    }
}