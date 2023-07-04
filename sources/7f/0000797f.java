package io.sentry;

import com.adyen.checkout.components.model.payments.response.SdkAction;
import io.sentry.c4;
import io.sentry.protocol.m;
import io.sentry.protocol.o;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class j2 implements x0 {

    /* renamed from: a */
    private final io.sentry.protocol.o f32305a;

    /* renamed from: b */
    private final io.sentry.protocol.m f32306b;

    /* renamed from: c */
    private final c4 f32307c;

    /* renamed from: d */
    private Map<String, Object> f32308d;

    /* loaded from: classes5.dex */
    public static final class a implements n0<j2> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public j2 a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            io.sentry.protocol.o oVar = null;
            io.sentry.protocol.m mVar = null;
            c4 c4Var = null;
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case 113722:
                        if (p02.equals(SdkAction.ACTION_TYPE)) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 110620997:
                        if (p02.equals("trace")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 278118624:
                        if (p02.equals("event_id")) {
                            c11 = 2;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        mVar = (io.sentry.protocol.m) t0Var.M1(d0Var, new m.a());
                        break;
                    case 1:
                        c4Var = (c4) t0Var.M1(d0Var, new c4.a());
                        break;
                    case 2:
                        oVar = (io.sentry.protocol.o) t0Var.M1(d0Var, new o.a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        t0Var.P1(d0Var, hashMap, p02);
                        break;
                }
            }
            j2 j2Var = new j2(oVar, mVar, c4Var);
            j2Var.d(hashMap);
            t0Var.C();
            return j2Var;
        }
    }

    public j2(io.sentry.protocol.o oVar, io.sentry.protocol.m mVar) {
        this(oVar, mVar, null);
    }

    public io.sentry.protocol.o a() {
        return this.f32305a;
    }

    public io.sentry.protocol.m b() {
        return this.f32306b;
    }

    public c4 c() {
        return this.f32307c;
    }

    public void d(Map<String, Object> map) {
        this.f32308d = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32305a != null) {
            v0Var.P0("event_id").Q0(d0Var, this.f32305a);
        }
        if (this.f32306b != null) {
            v0Var.P0(SdkAction.ACTION_TYPE).Q0(d0Var, this.f32306b);
        }
        if (this.f32307c != null) {
            v0Var.P0("trace").Q0(d0Var, this.f32307c);
        }
        Map<String, Object> map = this.f32308d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32308d.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    public j2(io.sentry.protocol.o oVar, io.sentry.protocol.m mVar, c4 c4Var) {
        this.f32305a = oVar;
        this.f32306b = mVar;
        this.f32307c = c4Var;
    }

    public j2(io.sentry.protocol.o oVar) {
        this(oVar, null);
    }

    public j2() {
        this(new io.sentry.protocol.o());
    }
}