package io.sentry;

import io.sentry.e3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class a3 implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f32020a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32021b;

    /* renamed from: c  reason: collision with root package name */
    private final e3 f32022c;

    /* renamed from: d  reason: collision with root package name */
    private final int f32023d;

    /* renamed from: e  reason: collision with root package name */
    private final Callable<Integer> f32024e;

    /* renamed from: f  reason: collision with root package name */
    private final String f32025f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f32026g;

    /* loaded from: classes5.dex */
    public static final class a implements n0<a3> {
        private Exception c(String str, d0 d0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            d0Var.b(f3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.n0
        /* renamed from: b */
        public a3 a(t0 t0Var, d0 d0Var) {
            t0Var.g();
            HashMap hashMap = null;
            int i11 = 0;
            e3 e3Var = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (t0Var.G0() == io.sentry.vendor.gson.stream.b.NAME) {
                String p02 = t0Var.p0();
                p02.hashCode();
                char c11 = 65535;
                switch (p02.hashCode()) {
                    case -1106363674:
                        if (p02.equals("length")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -734768633:
                        if (p02.equals("filename")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -672977706:
                        if (p02.equals("attachment_type")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 3575610:
                        if (p02.equals("type")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 831846208:
                        if (p02.equals("content_type")) {
                            c11 = 4;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        i11 = t0Var.e0();
                        break;
                    case 1:
                        str2 = t0Var.N1();
                        break;
                    case 2:
                        str3 = t0Var.N1();
                        break;
                    case 3:
                        e3Var = (e3) t0Var.M1(d0Var, new e3.a());
                        break;
                    case 4:
                        str = t0Var.N1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        t0Var.P1(d0Var, hashMap, p02);
                        break;
                }
            }
            if (e3Var != null) {
                a3 a3Var = new a3(e3Var, i11, str, str2, str3);
                a3Var.c(hashMap);
                t0Var.C();
                return a3Var;
            }
            throw c("type", d0Var);
        }
    }

    @ApiStatus.Internal
    public a3(e3 e3Var, int i11, String str, String str2, String str3) {
        this.f32022c = (e3) rz.j.a(e3Var, "type is required");
        this.f32020a = str;
        this.f32023d = i11;
        this.f32021b = str2;
        this.f32024e = null;
        this.f32025f = str3;
    }

    public int a() {
        Callable<Integer> callable = this.f32024e;
        if (callable != null) {
            try {
                return callable.call().intValue();
            } catch (Throwable unused) {
                return -1;
            }
        }
        return this.f32023d;
    }

    public e3 b() {
        return this.f32022c;
    }

    public void c(Map<String, Object> map) {
        this.f32026g = map;
    }

    @Override // io.sentry.x0
    public void serialize(v0 v0Var, d0 d0Var) {
        v0Var.l();
        if (this.f32020a != null) {
            v0Var.P0("content_type").G0(this.f32020a);
        }
        if (this.f32021b != null) {
            v0Var.P0("filename").G0(this.f32021b);
        }
        v0Var.P0("type").Q0(d0Var, this.f32022c);
        if (this.f32025f != null) {
            v0Var.P0("attachment_type").G0(this.f32025f);
        }
        v0Var.P0("length").C0(a());
        Map<String, Object> map = this.f32026g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f32026g.get(str);
                v0Var.P0(str);
                v0Var.Q0(d0Var, obj);
            }
        }
        v0Var.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3(e3 e3Var, Callable<Integer> callable, String str, String str2, String str3) {
        this.f32022c = (e3) rz.j.a(e3Var, "type is required");
        this.f32020a = str;
        this.f32023d = -1;
        this.f32021b = str2;
        this.f32024e = callable;
        this.f32025f = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3(e3 e3Var, Callable<Integer> callable, String str, String str2) {
        this(e3Var, callable, str, str2, (String) null);
    }
}