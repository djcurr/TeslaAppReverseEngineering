package io.grpc;

import ch.qos.logback.core.joran.action.Action;
import com.google.common.base.o;
import io.grpc.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: k */
    public static final c f30520k = new c();

    /* renamed from: a */
    private t f30521a;

    /* renamed from: b */
    private Executor f30522b;

    /* renamed from: c */
    private String f30523c;

    /* renamed from: d */
    private b f30524d;

    /* renamed from: e */
    private String f30525e;

    /* renamed from: f */
    private Object[][] f30526f;

    /* renamed from: g */
    private List<k.a> f30527g;

    /* renamed from: h */
    private Boolean f30528h;

    /* renamed from: i */
    private Integer f30529i;

    /* renamed from: j */
    private Integer f30530j;

    /* loaded from: classes5.dex */
    public static final class a<T> {

        /* renamed from: a */
        private final String f30531a;

        /* renamed from: b */
        private final T f30532b;

        private a(String str, T t11) {
            this.f30531a = str;
            this.f30532b = t11;
        }

        public static <T> a<T> b(String str) {
            com.google.common.base.u.p(str, "debugString");
            return new a<>(str, null);
        }

        public String toString() {
            return this.f30531a;
        }
    }

    private c() {
        this.f30527g = Collections.emptyList();
        this.f30526f = (Object[][]) Array.newInstance(Object.class, 0, 2);
    }

    public String a() {
        return this.f30523c;
    }

    public String b() {
        return this.f30525e;
    }

    public b c() {
        return this.f30524d;
    }

    public t d() {
        return this.f30521a;
    }

    public Executor e() {
        return this.f30522b;
    }

    public Integer f() {
        return this.f30529i;
    }

    public Integer g() {
        return this.f30530j;
    }

    public <T> T h(a<T> aVar) {
        com.google.common.base.u.p(aVar, Action.KEY_ATTRIBUTE);
        int i11 = 0;
        while (true) {
            Object[][] objArr = this.f30526f;
            if (i11 >= objArr.length) {
                return (T) ((a) aVar).f30532b;
            }
            if (aVar.equals(objArr[i11][0])) {
                return (T) this.f30526f[i11][1];
            }
            i11++;
        }
    }

    public List<k.a> i() {
        return this.f30527g;
    }

    public boolean j() {
        return Boolean.TRUE.equals(this.f30528h);
    }

    public c k(b bVar) {
        c cVar = new c(this);
        cVar.f30524d = bVar;
        return cVar;
    }

    public c l(String str) {
        c cVar = new c(this);
        cVar.f30525e = str;
        return cVar;
    }

    public c m(t tVar) {
        c cVar = new c(this);
        cVar.f30521a = tVar;
        return cVar;
    }

    public c n(long j11, TimeUnit timeUnit) {
        return m(t.a(j11, timeUnit));
    }

    public c o(Executor executor) {
        c cVar = new c(this);
        cVar.f30522b = executor;
        return cVar;
    }

    public c p(int i11) {
        com.google.common.base.u.h(i11 >= 0, "invalid maxsize %s", i11);
        c cVar = new c(this);
        cVar.f30529i = Integer.valueOf(i11);
        return cVar;
    }

    public c q(int i11) {
        com.google.common.base.u.h(i11 >= 0, "invalid maxsize %s", i11);
        c cVar = new c(this);
        cVar.f30530j = Integer.valueOf(i11);
        return cVar;
    }

    public <T> c r(a<T> aVar, T t11) {
        com.google.common.base.u.p(aVar, Action.KEY_ATTRIBUTE);
        com.google.common.base.u.p(t11, "value");
        c cVar = new c(this);
        int i11 = 0;
        while (true) {
            Object[][] objArr = this.f30526f;
            if (i11 >= objArr.length) {
                i11 = -1;
                break;
            } else if (aVar.equals(objArr[i11][0])) {
                break;
            } else {
                i11++;
            }
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.f30526f.length + (i11 == -1 ? 1 : 0), 2);
        cVar.f30526f = objArr2;
        Object[][] objArr3 = this.f30526f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i11 == -1) {
            Object[][] objArr4 = cVar.f30526f;
            int length = this.f30526f.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = aVar;
            objArr5[1] = t11;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = cVar.f30526f;
            Object[] objArr7 = new Object[2];
            objArr7[0] = aVar;
            objArr7[1] = t11;
            objArr6[i11] = objArr7;
        }
        return cVar;
    }

    public c s(k.a aVar) {
        c cVar = new c(this);
        ArrayList arrayList = new ArrayList(this.f30527g.size() + 1);
        arrayList.addAll(this.f30527g);
        arrayList.add(aVar);
        cVar.f30527g = Collections.unmodifiableList(arrayList);
        return cVar;
    }

    public c t() {
        c cVar = new c(this);
        cVar.f30528h = Boolean.TRUE;
        return cVar;
    }

    public String toString() {
        o.b d11 = com.google.common.base.o.c(this).d("deadline", this.f30521a).d("authority", this.f30523c).d("callCredentials", this.f30524d);
        Executor executor = this.f30522b;
        return d11.d("executor", executor != null ? executor.getClass() : null).d("compressorName", this.f30525e).d("customOptions", Arrays.deepToString(this.f30526f)).e("waitForReady", j()).d("maxInboundMessageSize", this.f30529i).d("maxOutboundMessageSize", this.f30530j).d("streamTracerFactories", this.f30527g).toString();
    }

    public c u() {
        c cVar = new c(this);
        cVar.f30528h = Boolean.FALSE;
        return cVar;
    }

    private c(c cVar) {
        this.f30527g = Collections.emptyList();
        this.f30521a = cVar.f30521a;
        this.f30523c = cVar.f30523c;
        this.f30524d = cVar.f30524d;
        this.f30522b = cVar.f30522b;
        this.f30525e = cVar.f30525e;
        this.f30526f = cVar.f30526f;
        this.f30528h = cVar.f30528h;
        this.f30529i = cVar.f30529i;
        this.f30530j = cVar.f30530j;
        this.f30527g = cVar.f30527g;
    }
}