package io.sentry.protocol;

import io.sentry.d0;
import io.sentry.n0;
import io.sentry.t0;
import io.sentry.v0;
import io.sentry.x0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class l implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private String f32451a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f32452b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f32453c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f32454d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f32455e;

    /* loaded from: classes5.dex */
    public static final class a implements n0<l> {
        @Override // io.sentry.n0
        /* renamed from: b */
        public l a(t0 t0Var, d0 d0Var) {
            l lVar = new l();
            t0Var.g();
            HashMap hashMap = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case 270207856:
                        if (p02.equals("sdk_name")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case 696101379:
                        if (p02.equals("version_patchlevel")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 1111241618:
                        if (p02.equals("version_major")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 1111483790:
                        if (p02.equals("version_minor")) {
                            c11 = 3;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        lVar.f32451a = t0Var.N1();
                        break;
                    case 1:
                        lVar.f32454d = t0Var.D1();
                        break;
                    case 2:
                        lVar.f32452b = t0Var.D1();
                        break;
                    case 3:
                        lVar.f32453c = t0Var.D1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        t0Var.P1(d0Var, hashMap, p02);
                        break;
                }
            }
            t0Var.C();
            lVar.e(hashMap);
            return lVar;
        }
    }

    public void e(Map<String, Object> map) {
        this.f32455e = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32451a != null) {
            v0Var.P0("sdk_name").G0(this.f32451a);
        }
        if (this.f32452b != null) {
            v0Var.P0("version_major").F0(this.f32452b);
        }
        if (this.f32453c != null) {
            v0Var.P0("version_minor").F0(this.f32453c);
        }
        if (this.f32454d != null) {
            v0Var.P0("version_patchlevel").F0(this.f32454d);
        }
        Map<String, Object> map = this.f32455e;
        if (map != null) {
            for (String str : map.keySet()) {
                v0Var.P0(str).Q0(d0Var, this.f32455e.get(str));
            }
        }
        v0Var.C();
    }
}