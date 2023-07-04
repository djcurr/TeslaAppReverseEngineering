package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.text.g;
import wz.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Matcher f35203a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f35204b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f35205c;

    /* loaded from: classes5.dex */
    public static final class a extends wz.c<String> {
        a() {
        }

        @Override // wz.a
        public int b() {
            return h.this.e().groupCount() + 1;
        }

        public /* bridge */ int c(String str) {
            return super.indexOf(str);
        }

        @Override // wz.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        public /* bridge */ int e(String str) {
            return super.lastIndexOf(str);
        }

        @Override // wz.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return c((String) obj);
            }
            return -1;
        }

        @Override // wz.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((a) str);
        }

        @Override // wz.c, java.util.List
        public String get(int i11) {
            String group = h.this.e().group(i11);
            return group == null ? "" : group;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends wz.a<f> {

        /* loaded from: classes5.dex */
        static final class a extends kotlin.jvm.internal.u implements h00.l<Integer, f> {
            a() {
                super(1);
            }

            public final f a(int i11) {
                return b.this.e(i11);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ f invoke(Integer num) {
                return a(num.intValue());
            }
        }

        b() {
        }

        @Override // wz.a
        public int b() {
            return h.this.e().groupCount() + 1;
        }

        public /* bridge */ boolean c(f fVar) {
            return super.contains(fVar);
        }

        @Override // wz.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return c((f) obj);
            }
            return false;
        }

        public f e(int i11) {
            m00.i h11;
            h11 = j.h(h.this.e(), i11);
            if (h11.m().intValue() >= 0) {
                String group = h.this.e().group(i11);
                kotlin.jvm.internal.s.f(group, "matchResult.group(index)");
                return new f(group, h11);
            }
            return null;
        }

        @Override // wz.a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<f> iterator() {
            m00.i j11;
            u20.h S;
            u20.h B;
            j11 = wz.w.j(this);
            S = e0.S(j11);
            B = u20.p.B(S, new a());
            return B.iterator();
        }
    }

    public h(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.s.g(matcher, "matcher");
        kotlin.jvm.internal.s.g(input, "input");
        this.f35203a = matcher;
        this.f35204b = input;
        new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult e() {
        return this.f35203a;
    }

    @Override // kotlin.text.g
    public g.b a() {
        return g.a.a(this);
    }

    @Override // kotlin.text.g
    public List<String> b() {
        if (this.f35205c == null) {
            this.f35205c = new a();
        }
        List<String> list = this.f35205c;
        kotlin.jvm.internal.s.e(list);
        return list;
    }

    @Override // kotlin.text.g
    public m00.i c() {
        m00.i g11;
        g11 = j.g(e());
        return g11;
    }

    @Override // kotlin.text.g
    public String getValue() {
        String group = e().group();
        kotlin.jvm.internal.s.f(group, "matchResult.group()");
        return group;
    }

    @Override // kotlin.text.g
    public g next() {
        g e11;
        int end = e().end() + (e().end() == e().start() ? 1 : 0);
        if (end <= this.f35204b.length()) {
            Matcher matcher = this.f35203a.pattern().matcher(this.f35204b);
            kotlin.jvm.internal.s.f(matcher, "matcher.pattern().matcher(input)");
            e11 = j.e(matcher, end, this.f35204b);
            return e11;
        }
        return null;
    }
}