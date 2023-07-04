package g30;

import ch.qos.logback.core.CoreConstants;
import e30.f;
import e30.k;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public class g1 implements e30.f, m {

    /* renamed from: a  reason: collision with root package name */
    private final String f27579a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<?> f27580b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27581c;

    /* renamed from: d  reason: collision with root package name */
    private int f27582d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f27583e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Annotation>[] f27584f;

    /* renamed from: g  reason: collision with root package name */
    private List<Annotation> f27585g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f27586h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, Integer> f27587i;

    /* renamed from: j  reason: collision with root package name */
    private final vz.k f27588j;

    /* renamed from: k  reason: collision with root package name */
    private final vz.k f27589k;

    /* renamed from: l  reason: collision with root package name */
    private final vz.k f27590l;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Integer> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Integer invoke() {
            g1 g1Var = g1.this;
            return Integer.valueOf(h1.a(g1Var, g1Var.n()));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<KSerializer<?>[]> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final KSerializer<?>[] invoke() {
            KSerializer<?>[] childSerializers;
            b0 b0Var = g1.this.f27580b;
            return (b0Var == null || (childSerializers = b0Var.childSerializers()) == null) ? i1.f27601a : childSerializers;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<Integer, CharSequence> {
        c() {
            super(1);
        }

        public final CharSequence a(int i11) {
            return g1.this.e(i11) + ": " + g1.this.g(i11).h();
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.a<SerialDescriptor[]> {
        d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final e30.f[] invoke() {
            ArrayList arrayList;
            c30.b[] typeParametersSerializers;
            b0 b0Var = g1.this.f27580b;
            if (b0Var == null || (typeParametersSerializers = b0Var.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (c30.b bVar : typeParametersSerializers) {
                    arrayList.add(bVar.getDescriptor());
                }
            }
            return e1.b(arrayList);
        }
    }

    public g1(String serialName, b0<?> b0Var, int i11) {
        Map<String, Integer> i12;
        vz.k b11;
        vz.k b12;
        vz.k b13;
        kotlin.jvm.internal.s.g(serialName, "serialName");
        this.f27579a = serialName;
        this.f27580b = b0Var;
        this.f27581c = i11;
        this.f27582d = -1;
        String[] strArr = new String[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            strArr[i13] = "[UNINITIALIZED]";
        }
        this.f27583e = strArr;
        int i14 = this.f27581c;
        this.f27584f = new List[i14];
        this.f27586h = new boolean[i14];
        i12 = wz.s0.i();
        this.f27587i = i12;
        kotlin.b bVar = kotlin.b.PUBLICATION;
        b11 = vz.m.b(bVar, new b());
        this.f27588j = b11;
        b12 = vz.m.b(bVar, new d());
        this.f27589k = b12;
        b13 = vz.m.b(bVar, new a());
        this.f27590l = b13;
    }

    private final Map<String, Integer> l() {
        HashMap hashMap = new HashMap();
        int length = this.f27583e.length;
        for (int i11 = 0; i11 < length; i11++) {
            hashMap.put(this.f27583e[i11], Integer.valueOf(i11));
        }
        return hashMap;
    }

    private final KSerializer<?>[] m() {
        return (c30.b[]) this.f27588j.getValue();
    }

    private final int o() {
        return ((Number) this.f27590l.getValue()).intValue();
    }

    @Override // g30.m
    public Set<String> a() {
        return this.f27587i.keySet();
    }

    @Override // e30.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // e30.f
    public int c(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        Integer num = this.f27587i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // e30.f
    public final int d() {
        return this.f27581c;
    }

    @Override // e30.f
    public String e(int i11) {
        return this.f27583e[i11];
    }

    public boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            e30.f fVar = (e30.f) obj;
            if (kotlin.jvm.internal.s.c(h(), fVar.h()) && Arrays.equals(n(), ((g1) obj).n()) && d() == fVar.d()) {
                int d11 = d();
                for (i11 = 0; i11 < d11; i11 = i11 + 1) {
                    i11 = (kotlin.jvm.internal.s.c(g(i11).h(), fVar.g(i11).h()) && kotlin.jvm.internal.s.c(g(i11).getKind(), fVar.g(i11).getKind())) ? i11 + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // e30.f
    public List<Annotation> f(int i11) {
        List<Annotation> i12;
        List<Annotation> list = this.f27584f[i11];
        if (list == null) {
            i12 = wz.w.i();
            return i12;
        }
        return list;
    }

    @Override // e30.f
    public e30.f g(int i11) {
        return m()[i11].getDescriptor();
    }

    @Override // e30.f
    public List<Annotation> getAnnotations() {
        List<Annotation> i11;
        List<Annotation> list = this.f27585g;
        if (list == null) {
            i11 = wz.w.i();
            return i11;
        }
        return list;
    }

    @Override // e30.f
    public e30.j getKind() {
        return k.a.f24590a;
    }

    @Override // e30.f
    public String h() {
        return this.f27579a;
    }

    public int hashCode() {
        return o();
    }

    @Override // e30.f
    public boolean i(int i11) {
        return this.f27586h[i11];
    }

    @Override // e30.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public final void k(String name, boolean z11) {
        kotlin.jvm.internal.s.g(name, "name");
        String[] strArr = this.f27583e;
        int i11 = this.f27582d + 1;
        this.f27582d = i11;
        strArr[i11] = name;
        this.f27586h[i11] = z11;
        this.f27584f[i11] = null;
        if (i11 == this.f27581c - 1) {
            this.f27587i = l();
        }
    }

    public final e30.f[] n() {
        return (e30.f[]) this.f27589k.getValue();
    }

    public String toString() {
        m00.i r11;
        String l02;
        r11 = m00.l.r(0, this.f27581c);
        l02 = wz.e0.l0(r11, ", ", h() + CoreConstants.LEFT_PARENTHESIS_CHAR, ")", 0, null, new c(), 24, null);
        return l02;
    }

    public /* synthetic */ g1(String str, b0 b0Var, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : b0Var, i11);
    }
}