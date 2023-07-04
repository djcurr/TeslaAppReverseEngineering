package e30;

import ch.qos.logback.core.CoreConstants;
import e30.f;
import g30.e1;
import g30.h1;
import g30.m;
import h00.l;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.v;
import wz.e0;
import wz.k0;
import wz.p;
import wz.s0;
import wz.x;

/* loaded from: classes5.dex */
public final class g implements f, m {

    /* renamed from: a  reason: collision with root package name */
    private final String f24567a;

    /* renamed from: b  reason: collision with root package name */
    private final j f24568b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24569c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Annotation> f24570d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f24571e;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f24572f;

    /* renamed from: g  reason: collision with root package name */
    private final f[] f24573g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Annotation>[] f24574h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean[] f24575i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Integer> f24576j;

    /* renamed from: k  reason: collision with root package name */
    private final f[] f24577k;

    /* renamed from: l  reason: collision with root package name */
    private final vz.k f24578l;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<Integer> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(h1.a(gVar, gVar.f24577k));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements l<Integer, CharSequence> {
        b() {
            super(1);
        }

        public final CharSequence a(int i11) {
            return g.this.e(i11) + ": " + g.this.g(i11).h();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public g(String serialName, j kind, int i11, List<? extends f> typeParameters, e30.a builder) {
        HashSet M0;
        boolean[] J0;
        Iterable<k0> F0;
        int t11;
        Map<String, Integer> t12;
        vz.k a11;
        s.g(serialName, "serialName");
        s.g(kind, "kind");
        s.g(typeParameters, "typeParameters");
        s.g(builder, "builder");
        this.f24567a = serialName;
        this.f24568b = kind;
        this.f24569c = i11;
        this.f24570d = builder.c();
        M0 = e0.M0(builder.f());
        this.f24571e = M0;
        Object[] array = builder.f().toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        this.f24572f = strArr;
        this.f24573g = e1.b(builder.e());
        Object[] array2 = builder.d().toArray(new List[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f24574h = (List[]) array2;
        J0 = e0.J0(builder.g());
        this.f24575i = J0;
        F0 = p.F0(strArr);
        t11 = x.t(F0, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (k0 k0Var : F0) {
            arrayList.add(v.a(k0Var.d(), Integer.valueOf(k0Var.c())));
        }
        t12 = s0.t(arrayList);
        this.f24576j = t12;
        this.f24577k = e1.b(typeParameters);
        a11 = vz.m.a(new a());
        this.f24578l = a11;
    }

    private final int k() {
        return ((Number) this.f24578l.getValue()).intValue();
    }

    @Override // g30.m
    public Set<String> a() {
        return this.f24571e;
    }

    @Override // e30.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // e30.f
    public int c(String name) {
        s.g(name, "name");
        Integer num = this.f24576j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // e30.f
    public int d() {
        return this.f24569c;
    }

    @Override // e30.f
    public String e(int i11) {
        return this.f24572f[i11];
    }

    public boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (s.c(h(), fVar.h()) && Arrays.equals(this.f24577k, ((g) obj).f24577k) && d() == fVar.d()) {
                int d11 = d();
                for (i11 = 0; i11 < d11; i11 = i11 + 1) {
                    i11 = (s.c(g(i11).h(), fVar.g(i11).h()) && s.c(g(i11).getKind(), fVar.g(i11).getKind())) ? i11 + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // e30.f
    public List<Annotation> f(int i11) {
        return this.f24574h[i11];
    }

    @Override // e30.f
    public f g(int i11) {
        return this.f24573g[i11];
    }

    @Override // e30.f
    public List<Annotation> getAnnotations() {
        return this.f24570d;
    }

    @Override // e30.f
    public j getKind() {
        return this.f24568b;
    }

    @Override // e30.f
    public String h() {
        return this.f24567a;
    }

    public int hashCode() {
        return k();
    }

    @Override // e30.f
    public boolean i(int i11) {
        return this.f24575i[i11];
    }

    @Override // e30.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        m00.i r11;
        String l02;
        r11 = m00.l.r(0, d());
        l02 = e0.l0(r11, ", ", h() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, null, new b(), 24, null);
        return l02;
    }
}