package gq;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.shaded.asm.Accessor;
import java.lang.reflect.Method;
import java.util.HashMap;
import mq.b0;
import mq.r;
import mq.s;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: i */
    private static String f28066i = b0.g(d.class);

    /* renamed from: a */
    final b[] f28067a;

    /* renamed from: b */
    final i f28068b;

    /* renamed from: c */
    final String f28069c;

    /* renamed from: d */
    final String f28070d;

    /* renamed from: e */
    final String f28071e;

    /* renamed from: f */
    final String f28072f;

    /* renamed from: g */
    final HashMap<Class<?>, Method> f28073g = new HashMap<>();

    /* renamed from: h */
    Class<? extends Exception> f28074h = NoSuchFieldException.class;

    public e(Class<?> cls, Accessor[] accessorArr, i iVar) {
        this.f28067a = accessorArr;
        this.f28068b = iVar;
        String name = cls.getName();
        this.f28069c = name;
        if (name.startsWith("java.")) {
            this.f28070d = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            this.f28070d = name.concat("AccAccess");
        }
        this.f28071e = this.f28070d.replace(CoreConstants.DOT, '/');
        this.f28072f = name.replace(CoreConstants.DOT, '/');
    }

    private void d(s sVar, int i11, int i12, r rVar) {
        sVar.E(21, i11);
        if (i12 == 0) {
            sVar.n(154, rVar);
        } else if (i12 == 1) {
            sVar.j(4);
            sVar.n(160, rVar);
        } else if (i12 == 2) {
            sVar.j(5);
            sVar.n(160, rVar);
        } else if (i12 == 3) {
            sVar.j(6);
            sVar.n(160, rVar);
        } else if (i12 == 4) {
            sVar.j(7);
            sVar.n(160, rVar);
        } else if (i12 == 5) {
            sVar.j(8);
            sVar.n(160, rVar);
        } else if (i12 >= 6) {
            sVar.l(16, i12);
            sVar.n(160, rVar);
        } else {
            throw new RuntimeException("non supported negative values");
        }
    }

    private void e(s sVar, b bVar) {
        Method method;
        sVar.E(25, 1);
        sVar.D(192, this.f28072f);
        sVar.E(25, 3);
        b0 m11 = b0.m(bVar.c());
        Class<?> c11 = bVar.c();
        String g11 = b0.g(c11);
        Method method2 = this.f28073g.get(c11);
        if (method2 != null) {
            sVar.v(184, b0.g(method2.getDeclaringClass()), method2.getName(), b0.h(method2), false);
        } else if (bVar.d()) {
            r rVar = new r();
            sVar.n(198, rVar);
            sVar.E(25, 3);
            sVar.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            sVar.v(184, g11, CoreConstants.VALUE_OF, "(Ljava/lang/String;)L" + g11 + ";", false);
            sVar.E(58, 3);
            sVar.o(rVar);
            sVar.h(3, 0, null, 0, null);
            sVar.E(25, 1);
            sVar.D(192, this.f28072f);
            sVar.E(25, 3);
            sVar.D(192, g11);
        } else if (c11.equals(String.class)) {
            r rVar2 = new r();
            sVar.n(198, rVar2);
            sVar.E(25, 3);
            sVar.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            sVar.E(58, 3);
            sVar.o(rVar2);
            sVar.h(3, 0, null, 0, null);
            sVar.E(25, 1);
            sVar.D(192, this.f28072f);
            sVar.E(25, 3);
            sVar.D(192, g11);
        } else {
            sVar.D(192, g11);
        }
        if (!bVar.e() && (method = bVar.f28057b) != null) {
            sVar.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, this.f28072f, bVar.f28057b.getName(), b0.h(method), false);
        } else {
            sVar.g(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, this.f28072f, bVar.b(), m11.d());
        }
        sVar.j(CipherSuite.TLS_PSK_WITH_NULL_SHA384);
    }

    private void f(s sVar, Class<?> cls) {
        String g11 = b0.g(cls);
        sVar.D(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, g11);
        sVar.j(89);
        sVar.p("mapping " + this.f28069c + " failed to map field:");
        sVar.E(21, 2);
        sVar.v(184, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
        sVar.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        sVar.v(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, g11, "<init>", "(Ljava/lang/String;)V", false);
        sVar.j(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256);
    }

    private void g(s sVar, Class<?> cls) {
        String g11 = b0.g(cls);
        sVar.D(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, g11);
        sVar.j(89);
        sVar.p("mapping " + this.f28069c + " failed to map field:");
        sVar.E(25, 2);
        sVar.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        sVar.v(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, g11, "<init>", "(Ljava/lang/String;)V", false);
        sVar.j(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256);
    }

    public void a(Class<?> cls) {
        Method[] methods;
        if (cls == null) {
            return;
        }
        for (Method method : cls.getMethods()) {
            if ((method.getModifiers() & 8) != 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(Object.class)) {
                    Class<?> returnType = method.getReturnType();
                    if (!returnType.equals(Void.TYPE)) {
                        this.f28073g.put(returnType, method);
                    }
                }
            }
        }
    }

    public void b(Iterable<Class<?>> iterable) {
        if (iterable == null) {
            return;
        }
        for (Class<?> cls : iterable) {
            a(cls);
        }
    }

    public Class<?> c() {
        b[] bVarArr;
        Method method;
        Method method2;
        int i11;
        int i12;
        Method method3;
        b[] bVarArr2;
        b[] bVarArr3;
        int i13 = 1;
        mq.g gVar = new mq.g(1);
        boolean z11 = this.f28067a.length > 10;
        gVar.a(50, 33, this.f28071e, "Lnet/minidev/asm/BeansAccess<L" + this.f28072f + ";>;", f28066i, null);
        s g11 = gVar.g(1, "<init>", "()V", null, null);
        g11.e();
        g11.E(25, 0);
        g11.v(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, f28066i, "<init>", "()V", false);
        g11.j(CipherSuite.TLS_PSK_WITH_NULL_SHA384);
        g11.u(1, 1);
        g11.f();
        s g12 = gVar.g(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        g12.e();
        b[] bVarArr4 = this.f28067a;
        if (bVarArr4.length != 0) {
            if (bVarArr4.length > 14) {
                g12.E(21, 2);
                r[] f11 = a.f(this.f28067a.length);
                r rVar = new r();
                g12.z(0, f11.length - 1, rVar, f11);
                b[] bVarArr5 = this.f28067a;
                int length = bVarArr5.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    b bVar = bVarArr5[i14];
                    int i16 = i15 + 1;
                    g12.o(f11[i15]);
                    if (!bVar.h()) {
                        g12.j(CipherSuite.TLS_PSK_WITH_NULL_SHA384);
                    } else {
                        e(g12, bVar);
                    }
                    i14++;
                    i15 = i16;
                }
                g12.o(rVar);
            } else {
                r[] f12 = a.f(bVarArr4.length);
                int i17 = 0;
                for (b bVar2 : this.f28067a) {
                    d(g12, 2, i17, f12[i17]);
                    e(g12, bVar2);
                    g12.o(f12[i17]);
                    g12.h(3, 0, null, 0, null);
                    i17++;
                }
            }
        }
        Class<? extends Exception> cls = this.f28074h;
        if (cls != null) {
            f(g12, cls);
        } else {
            g12.j(CipherSuite.TLS_PSK_WITH_NULL_SHA384);
        }
        g12.u(0, 0);
        g12.f();
        s g13 = gVar.g(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        g13.e();
        b[] bVarArr6 = this.f28067a;
        int i18 = 192;
        if (bVarArr6.length == 0) {
            g13.h(3, 0, null, 0, null);
        } else if (bVarArr6.length > 14) {
            g13.E(21, 2);
            r[] f13 = a.f(this.f28067a.length);
            r rVar2 = new r();
            g13.z(0, f13.length - 1, rVar2, f13);
            b[] bVarArr7 = this.f28067a;
            int length2 = bVarArr7.length;
            int i19 = 0;
            int i21 = 0;
            while (i19 < length2) {
                b bVar3 = bVarArr7[i19];
                int i22 = i21 + 1;
                g13.o(f13[i21]);
                g13.h(3, 0, null, 0, null);
                if (!bVar3.f()) {
                    g13.j(i13);
                    g13.j(176);
                } else {
                    g13.E(25, i13);
                    g13.D(i18, this.f28072f);
                    b0 m11 = b0.m(bVar3.c());
                    if (!bVar3.e() && (method2 = bVar3.f28058c) != null) {
                        g13.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, this.f28072f, bVar3.f28058c.getName(), b0.h(method2), false);
                    } else {
                        g13.g(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, this.f28072f, bVar3.b(), m11.d());
                    }
                    a.a(g13, m11);
                    g13.j(176);
                }
                i19++;
                i21 = i22;
                i18 = 192;
                i13 = 1;
            }
            g13.o(rVar2);
            g13.h(3, 0, null, 0, null);
        } else {
            r[] f14 = a.f(bVarArr6.length);
            int i23 = 0;
            for (b bVar4 : this.f28067a) {
                d(g13, 2, i23, f14[i23]);
                g13.E(25, 1);
                g13.D(192, this.f28072f);
                b0 m12 = b0.m(bVar4.c());
                if (bVar4.e() || (method = bVar4.f28058c) == null) {
                    g13.g(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, this.f28072f, bVar4.b(), m12.d());
                } else if (method != null) {
                    g13.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, this.f28072f, bVar4.f28058c.getName(), b0.h(method), false);
                } else {
                    throw new RuntimeException("no Getter for field " + bVar4.b() + " in class " + this.f28069c);
                }
                a.a(g13, m12);
                g13.j(176);
                g13.o(f14[i23]);
                g13.h(3, 0, null, 0, null);
                i23++;
            }
        }
        Class<? extends Exception> cls2 = this.f28074h;
        if (cls2 != null) {
            f(g13, cls2);
        } else {
            g13.j(1);
            g13.j(176);
        }
        g13.u(0, 0);
        g13.f();
        int i24 = 153;
        if (z11) {
            i11 = 176;
            i12 = 192;
        } else {
            i11 = 176;
            i12 = 192;
            s g14 = gVar.g(1, "set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
            g14.e();
            r[] f15 = a.f(this.f28067a.length);
            int i25 = 0;
            for (b bVar5 : this.f28067a) {
                g14.E(25, 2);
                g14.p(bVar5.f28061f);
                g14.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                g14.n(153, f15[i25]);
                e(g14, bVar5);
                g14.o(f15[i25]);
                g14.h(3, 0, null, 0, null);
                i25++;
            }
            Class<? extends Exception> cls3 = this.f28074h;
            if (cls3 != null) {
                g(g14, cls3);
            } else {
                g14.j(CipherSuite.TLS_PSK_WITH_NULL_SHA384);
            }
            g14.u(0, 0);
            g14.f();
        }
        if (!z11) {
            s g15 = gVar.g(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
            g15.e();
            r[] f16 = a.f(this.f28067a.length);
            b[] bVarArr8 = this.f28067a;
            int length3 = bVarArr8.length;
            int i26 = 0;
            int i27 = 0;
            while (i26 < length3) {
                b bVar6 = bVarArr8[i26];
                g15.E(25, 2);
                g15.p(bVar6.f28061f);
                g15.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                g15.n(i24, f16[i27]);
                g15.E(25, 1);
                g15.D(i12, this.f28072f);
                b0 m13 = b0.m(bVar6.c());
                if (!bVar6.e() && (method3 = bVar6.f28058c) != null) {
                    g15.v(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, this.f28072f, bVar6.f28058c.getName(), b0.h(method3), false);
                } else {
                    g15.g(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, this.f28072f, bVar6.b(), m13.d());
                }
                a.a(g15, m13);
                g15.j(i11);
                g15.o(f16[i27]);
                g15.h(3, 0, null, 0, null);
                i27++;
                i26++;
                i24 = 153;
            }
            Class<? extends Exception> cls4 = this.f28074h;
            if (cls4 != null) {
                g(g15, cls4);
            } else {
                g15.j(1);
                g15.j(i11);
            }
            g15.u(0, 0);
            g15.f();
        }
        s g16 = gVar.g(1, "newInstance", "()Ljava/lang/Object;", null, null);
        g16.e();
        g16.D(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, this.f28072f);
        g16.j(89);
        g16.v(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, this.f28072f, "<init>", "()V", false);
        g16.j(i11);
        g16.u(2, 1);
        g16.f();
        gVar.d();
        return this.f28068b.a(this.f28070d, gVar.t());
    }
}