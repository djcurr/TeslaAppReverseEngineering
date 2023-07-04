package l1;

import c1.e1;
import c1.r;
import c1.x0;
import c1.y;
import c1.z;
import h00.l;
import h00.p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import wz.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements l1.c {

    /* renamed from: d  reason: collision with root package name */
    public static final c f36345d = new c(null);

    /* renamed from: e  reason: collision with root package name */
    private static final i<d, ?> f36346e = j.a(a.f36350a, b.f36351a);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, Map<String, List<Object>>> f36347a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Object, C0695d> f36348b;

    /* renamed from: c  reason: collision with root package name */
    private l1.f f36349c;

    /* loaded from: classes.dex */
    static final class a extends u implements p<k, d, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36350a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Map<Object, Map<String, List<Object>>> invoke(k Saver, d it2) {
            s.g(Saver, "$this$Saver");
            s.g(it2, "it");
            return it2.h();
        }
    }

    /* loaded from: classes.dex */
    static final class b extends u implements l<Map<Object, Map<String, ? extends List<? extends Object>>>, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f36351a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final d invoke(Map<Object, Map<String, List<Object>>> it2) {
            s.g(it2, "it");
            return new d(it2);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i<d, ?> a() {
            return d.f36346e;
        }
    }

    /* renamed from: l1.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0695d {

        /* renamed from: a  reason: collision with root package name */
        private final Object f36352a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f36353b;

        /* renamed from: c  reason: collision with root package name */
        private final l1.f f36354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f36355d;

        /* renamed from: l1.d$d$a */
        /* loaded from: classes.dex */
        static final class a extends u implements l<Object, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f36356a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f36356a = dVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final Boolean invoke(Object it2) {
                s.g(it2, "it");
                l1.f g11 = this.f36356a.g();
                return Boolean.valueOf(g11 == null ? true : g11.a(it2));
            }
        }

        public C0695d(d this$0, Object key) {
            s.g(this$0, "this$0");
            s.g(key, "key");
            this.f36355d = this$0;
            this.f36352a = key;
            this.f36353b = true;
            this.f36354c = h.a((Map) this$0.f36347a.get(key), new a(this$0));
        }

        public final l1.f a() {
            return this.f36354c;
        }

        public final void b(Map<Object, Map<String, List<Object>>> map) {
            s.g(map, "map");
            if (this.f36353b) {
                map.put(this.f36352a, this.f36354c.b());
            }
        }

        public final void c(boolean z11) {
            this.f36353b = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends u implements l<z, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f36358b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0695d f36359c;

        /* loaded from: classes.dex */
        public static final class a implements y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0695d f36360a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f36361b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f36362c;

            public a(C0695d c0695d, d dVar, Object obj) {
                this.f36360a = c0695d;
                this.f36361b = dVar;
                this.f36362c = obj;
            }

            @Override // c1.y
            public void dispose() {
                this.f36360a.b(this.f36361b.f36347a);
                this.f36361b.f36348b.remove(this.f36362c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, C0695d c0695d) {
            super(1);
            this.f36358b = obj;
            this.f36359c = c0695d;
        }

        @Override // h00.l
        public final y invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            boolean z11 = !d.this.f36348b.containsKey(this.f36358b);
            Object obj = this.f36358b;
            if (z11) {
                d.this.f36347a.remove(this.f36358b);
                d.this.f36348b.put(this.f36358b, this.f36359c);
                return new a(this.f36359c, d.this, this.f36358b);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends u implements p<c1.i, Integer, b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f36364b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<c1.i, Integer, b0> f36365c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36366d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Object obj, p<? super c1.i, ? super Integer, b0> pVar, int i11) {
            super(2);
            this.f36364b = obj;
            this.f36365c = pVar;
            this.f36366d = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            d.this.a(this.f36364b, this.f36365c, iVar, this.f36366d | 1);
        }
    }

    public d() {
        this(null, 1, null);
    }

    public d(Map<Object, Map<String, List<Object>>> savedStates) {
        s.g(savedStates, "savedStates");
        this.f36347a = savedStates;
        this.f36348b = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> h() {
        Map<Object, Map<String, List<Object>>> y11;
        y11 = s0.y(this.f36347a);
        for (C0695d c0695d : this.f36348b.values()) {
            c0695d.b(y11);
        }
        return y11;
    }

    @Override // l1.c
    public void a(Object key, p<? super c1.i, ? super Integer, b0> content, c1.i iVar, int i11) {
        s.g(key, "key");
        s.g(content, "content");
        c1.i h11 = iVar.h(-111644091);
        h11.x(-1530021272);
        h11.F(207, key);
        h11.x(1516495192);
        h11.x(-3687241);
        Object y11 = h11.y();
        if (y11 == c1.i.f8486a.a()) {
            l1.f g11 = g();
            if (g11 == null ? true : g11.a(key)) {
                y11 = new C0695d(this, key);
                h11.p(y11);
            } else {
                throw new IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        h11.N();
        C0695d c0695d = (C0695d) y11;
        r.a(new x0[]{h.b().c(c0695d.a())}, content, h11, (i11 & 112) | 8);
        c1.b0.a(b0.f54756a, new e(key, c0695d), h11, 0);
        h11.N();
        h11.w();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new f(key, content, i11));
    }

    @Override // l1.c
    public void b(Object key) {
        s.g(key, "key");
        C0695d c0695d = this.f36348b.get(key);
        if (c0695d != null) {
            c0695d.c(false);
        } else {
            this.f36347a.remove(key);
        }
    }

    public final l1.f g() {
        return this.f36349c;
    }

    public final void i(l1.f fVar) {
        this.f36349c = fVar;
    }

    public /* synthetic */ d(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map);
    }
}