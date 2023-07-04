package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class q implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32473a;

    /* renamed from: b  reason: collision with root package name */
    private String f32474b;

    /* renamed from: c  reason: collision with root package name */
    private String f32475c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Object> f32476d;

    /* loaded from: classes5.dex */
    public static final class a implements n0<q> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public q a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            q qVar = new q();
            ConcurrentHashMap concurrentHashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -339173787:
                        if (p02.equals("raw_description")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (p02.equals("name")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 351608024:
                        if (p02.equals("version")) {
                            c11 = 2;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        qVar.f32475c = t0Var.N1();
                        break;
                    case 1:
                        qVar.f32473a = t0Var.N1();
                        break;
                    case 2:
                        qVar.f32474b = t0Var.N1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        t0Var.P1(d0Var, concurrentHashMap, p02);
                        break;
                }
            }
            qVar.g(concurrentHashMap);
            t0Var.C();
            return qVar;
        }
    }

    public q() {
    }

    public String d() {
        return this.f32473a;
    }

    public String e() {
        return this.f32474b;
    }

    public void f(String str) {
        this.f32473a = str;
    }

    public void g(Map<String, Object> map) {
        this.f32476d = map;
    }

    public void h(String str) {
        this.f32474b = str;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32473a != null) {
            v0Var.P0("name").G0(this.f32473a);
        }
        if (this.f32474b != null) {
            v0Var.P0("version").G0(this.f32474b);
        }
        if (this.f32475c != null) {
            v0Var.P0("raw_description").G0(this.f32475c);
        }
        Map<String, Object> map = this.f32476d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32476d.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(q qVar) {
        this.f32473a = qVar.f32473a;
        this.f32474b = qVar.f32474b;
        this.f32475c = qVar.f32475c;
        this.f32476d = rz.a.b(qVar.f32476d);
    }
}