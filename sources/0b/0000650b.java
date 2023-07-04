package d20;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.w;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f23446c;

    /* renamed from: d  reason: collision with root package name */
    private static int f23447d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f23448e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f23449f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f23450g;

    /* renamed from: h  reason: collision with root package name */
    private static final int f23451h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f23452i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f23453j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f23454k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f23455l;

    /* renamed from: m  reason: collision with root package name */
    private static final int f23456m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f23457n;

    /* renamed from: o  reason: collision with root package name */
    public static final d f23458o;

    /* renamed from: p  reason: collision with root package name */
    public static final d f23459p;

    /* renamed from: q  reason: collision with root package name */
    public static final d f23460q;

    /* renamed from: r  reason: collision with root package name */
    public static final d f23461r;

    /* renamed from: s  reason: collision with root package name */
    public static final d f23462s;

    /* renamed from: t  reason: collision with root package name */
    private static final List<a.C0451a> f23463t;

    /* renamed from: u  reason: collision with root package name */
    private static final List<a.C0451a> f23464u;

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f23465a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23466b;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: d20.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        private static final class C0451a {

            /* renamed from: a  reason: collision with root package name */
            private final int f23467a;

            /* renamed from: b  reason: collision with root package name */
            private final String f23468b;

            public C0451a(int i11, String name) {
                s.g(name, "name");
                this.f23467a = i11;
                this.f23468b = name;
            }

            public final int a() {
                return this.f23467a;
            }

            public final String b() {
                return this.f23468b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int j() {
            int i11 = d.f23447d;
            a aVar = d.f23446c;
            d.f23447d <<= 1;
            return i11;
        }

        public final int b() {
            return d.f23454k;
        }

        public final int c() {
            return d.f23455l;
        }

        public final int d() {
            return d.f23452i;
        }

        public final int e() {
            return d.f23448e;
        }

        public final int f() {
            return d.f23451h;
        }

        public final int g() {
            return d.f23449f;
        }

        public final int h() {
            return d.f23450g;
        }

        public final int i() {
            return d.f23453j;
        }
    }

    static {
        a.C0451a c0451a;
        a.C0451a c0451a2;
        a aVar = new a(null);
        f23446c = aVar;
        f23447d = 1;
        int j11 = aVar.j();
        f23448e = j11;
        int j12 = aVar.j();
        f23449f = j12;
        int j13 = aVar.j();
        f23450g = j13;
        int j14 = aVar.j();
        f23451h = j14;
        int j15 = aVar.j();
        f23452i = j15;
        int j16 = aVar.j();
        f23453j = j16;
        int j17 = aVar.j() - 1;
        f23454k = j17;
        int i11 = j11 | j12 | j13;
        f23455l = i11;
        int i12 = j12 | j15 | j16;
        f23456m = i12;
        int i13 = j15 | j16;
        f23457n = i13;
        f23458o = new d(j17, null, 2, null);
        f23459p = new d(i13, null, 2, null);
        new d(j11, null, 2, null);
        new d(j12, null, 2, null);
        new d(j13, null, 2, null);
        f23460q = new d(i11, null, 2, null);
        new d(j14, null, 2, null);
        f23461r = new d(j15, null, 2, null);
        f23462s = new d(j16, null, 2, null);
        new d(i12, null, 2, null);
        Field[] fields = d.class.getFields();
        s.f(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int m11 = dVar.m();
                String name = field2.getName();
                s.f(name, "field.name");
                c0451a2 = new a.C0451a(m11, name);
            } else {
                c0451a2 = null;
            }
            if (c0451a2 != null) {
                arrayList2.add(c0451a2);
            }
        }
        f23463t = arrayList2;
        Field[] fields2 = d.class.getFields();
        s.f(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (s.c(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                s.f(name2, "field.name");
                c0451a = new a.C0451a(intValue, name2);
            } else {
                c0451a = null;
            }
            if (c0451a != null) {
                arrayList5.add(c0451a);
            }
        }
        f23464u = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i11, List<? extends c> excludes) {
        s.g(excludes, "excludes");
        this.f23465a = excludes;
        for (c cVar : excludes) {
            i11 &= ~cVar.a();
        }
        this.f23466b = i11;
    }

    public final boolean a(int i11) {
        return (i11 & this.f23466b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (s.c(d.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
            d dVar = (d) obj;
            return s.c(this.f23465a, dVar.f23465a) && this.f23466b == dVar.f23466b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f23465a.hashCode() * 31) + this.f23466b;
    }

    public final List<c> l() {
        return this.f23465a;
    }

    public final int m() {
        return this.f23466b;
    }

    public final d n(int i11) {
        int i12 = i11 & this.f23466b;
        if (i12 == 0) {
            return null;
        }
        return new d(i12, this.f23465a);
    }

    public String toString() {
        Object obj;
        boolean z11;
        Iterator<T> it2 = f23463t.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((a.C0451a) obj).a() == m()) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        a.C0451a c0451a = (a.C0451a) obj;
        String b11 = c0451a == null ? null : c0451a.b();
        if (b11 == null) {
            List<a.C0451a> list = f23464u;
            ArrayList arrayList = new ArrayList();
            for (a.C0451a c0451a2 : list) {
                String b12 = a(c0451a2.a()) ? c0451a2.b() : null;
                if (b12 != null) {
                    arrayList.add(b12);
                }
            }
            b11 = e0.l0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + b11 + ", " + this.f23465a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ d(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? w.i() : list);
    }
}