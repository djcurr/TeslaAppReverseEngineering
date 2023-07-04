package r5;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.e0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<x5.b> f49174a;

    /* renamed from: b  reason: collision with root package name */
    private final List<p<y5.b<? extends Object, ?>, Class<? extends Object>>> f49175b;

    /* renamed from: c  reason: collision with root package name */
    private final List<p<w5.g<? extends Object>, Class<? extends Object>>> f49176c;

    /* renamed from: d  reason: collision with root package name */
    private final List<v5.f> f49177d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<x5.b> f49178a;

        /* renamed from: b  reason: collision with root package name */
        private final List<p<y5.b<? extends Object, ?>, Class<? extends Object>>> f49179b;

        /* renamed from: c  reason: collision with root package name */
        private final List<p<w5.g<? extends Object>, Class<? extends Object>>> f49180c;

        /* renamed from: d  reason: collision with root package name */
        private final List<v5.f> f49181d;

        public a(b registry) {
            List<x5.b> Q0;
            List<p<y5.b<? extends Object, ?>, Class<? extends Object>>> Q02;
            List<p<w5.g<? extends Object>, Class<? extends Object>>> Q03;
            List<v5.f> Q04;
            s.g(registry, "registry");
            Q0 = e0.Q0(registry.c());
            this.f49178a = Q0;
            Q02 = e0.Q0(registry.d());
            this.f49179b = Q02;
            Q03 = e0.Q0(registry.b());
            this.f49180c = Q03;
            Q04 = e0.Q0(registry.a());
            this.f49181d = Q04;
        }

        public final a a(v5.f decoder) {
            s.g(decoder, "decoder");
            this.f49181d.add(decoder);
            return this;
        }

        public final <T> a b(w5.g<T> fetcher, Class<T> type) {
            s.g(fetcher, "fetcher");
            s.g(type, "type");
            this.f49180c.add(v.a(fetcher, type));
            return this;
        }

        public final <T> a c(y5.b<T, ?> mapper, Class<T> type) {
            s.g(mapper, "mapper");
            s.g(type, "type");
            this.f49179b.add(v.a(mapper, type));
            return this;
        }

        public final b d() {
            List O0;
            List O02;
            List O03;
            List O04;
            O0 = e0.O0(this.f49178a);
            O02 = e0.O0(this.f49179b);
            O03 = e0.O0(this.f49180c);
            O04 = e0.O0(this.f49181d);
            return new b(O0, O02, O03, O04, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(List<? extends x5.b> list, List<? extends p<? extends y5.b<? extends Object, ?>, ? extends Class<? extends Object>>> list2, List<? extends p<? extends w5.g<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends v5.f> list4) {
        this.f49174a = list;
        this.f49175b = list2;
        this.f49176c = list3;
        this.f49177d = list4;
    }

    public final List<v5.f> a() {
        return this.f49177d;
    }

    public final List<p<w5.g<? extends Object>, Class<? extends Object>>> b() {
        return this.f49176c;
    }

    public final List<x5.b> c() {
        return this.f49174a;
    }

    public final List<p<y5.b<? extends Object, ?>, Class<? extends Object>>> d() {
        return this.f49175b;
    }

    public final a e() {
        return new a(this);
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b() {
        /*
            r4 = this;
            java.util.List r0 = wz.u.i()
            java.util.List r1 = wz.u.i()
            java.util.List r2 = wz.u.i()
            java.util.List r3 = wz.u.i()
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.b.<init>():void");
    }
}