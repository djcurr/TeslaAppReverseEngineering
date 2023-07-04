package b6;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.s0;

/* loaded from: classes.dex */
public final class j implements Iterable<p<? extends String, ? extends c>>, i00.a {

    /* renamed from: b  reason: collision with root package name */
    public static final j f7499b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c> f7500a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, c> f7501a;

        public a(j parameters) {
            Map<String, c> y11;
            s.g(parameters, "parameters");
            y11 = s0.y(parameters.f7500a);
            this.f7501a = y11;
        }

        public final j a() {
            Map v11;
            v11 = s0.v(this.f7501a);
            return new j(v11, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f7502a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7503b;

        public final String a() {
            return this.f7503b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return s.c(this.f7502a, cVar.f7502a) && s.c(this.f7503b, cVar.f7503b);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f7502a;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f7503b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Entry(value=" + this.f7502a + ", cacheKey=" + this.f7503b + ")";
        }
    }

    static {
        new b(null);
        f7499b = new j();
    }

    private j(Map<String, c> map) {
        this.f7500a = map;
    }

    public final Map<String, String> c() {
        Map<String, String> i11;
        if (isEmpty()) {
            i11 = s0.i();
            return i11;
        }
        Map<String, c> map = this.f7500a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, c> entry : map.entrySet()) {
            String a11 = entry.getValue().a();
            if (a11 != null) {
                linkedHashMap.put(entry.getKey(), a11);
            }
        }
        return linkedHashMap;
    }

    public final a e() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof j) && s.c(this.f7500a, ((j) obj).f7500a));
    }

    public int hashCode() {
        return this.f7500a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f7500a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<p<? extends String, ? extends c>> iterator() {
        Map<String, c> map = this.f7500a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, c> entry : map.entrySet()) {
            arrayList.add(v.a(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(map=" + this.f7500a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ j(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j() {
        /*
            r1 = this;
            java.util.Map r0 = wz.p0.i()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.j.<init>():void");
    }
}