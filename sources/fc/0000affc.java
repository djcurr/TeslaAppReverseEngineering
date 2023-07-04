package r2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.u;

/* loaded from: classes.dex */
public final class l implements Comparable<l> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49091b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final l f49092c;

    /* renamed from: d  reason: collision with root package name */
    private static final l f49093d;

    /* renamed from: e  reason: collision with root package name */
    private static final l f49094e;

    /* renamed from: f  reason: collision with root package name */
    private static final l f49095f;

    /* renamed from: g  reason: collision with root package name */
    private static final l f49096g;

    /* renamed from: h  reason: collision with root package name */
    private static final l f49097h;

    /* renamed from: i  reason: collision with root package name */
    private static final l f49098i;

    /* renamed from: j  reason: collision with root package name */
    private static final l f49099j;

    /* renamed from: k  reason: collision with root package name */
    private static final l f49100k;

    /* renamed from: l  reason: collision with root package name */
    private static final l f49101l;

    /* renamed from: m  reason: collision with root package name */
    private static final l f49102m;

    /* renamed from: n  reason: collision with root package name */
    private static final l f49103n;

    /* renamed from: o  reason: collision with root package name */
    private static final l f49104o;

    /* renamed from: p  reason: collision with root package name */
    private static final l f49105p;

    /* renamed from: q  reason: collision with root package name */
    private static final List<l> f49106q;

    /* renamed from: a  reason: collision with root package name */
    private final int f49107a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a() {
            return l.f49105p;
        }

        public final l b() {
            return l.f49101l;
        }

        public final l c() {
            return l.f49103n;
        }

        public final l d() {
            return l.f49102m;
        }

        public final l e() {
            return l.f49104o;
        }

        public final l f() {
            return l.f49095f;
        }

        public final l g() {
            return l.f49096g;
        }

        public final l h() {
            return l.f49097h;
        }
    }

    static {
        l lVar = new l(100);
        f49092c = lVar;
        l lVar2 = new l(200);
        f49093d = lVar2;
        l lVar3 = new l(300);
        f49094e = lVar3;
        l lVar4 = new l(400);
        f49095f = lVar4;
        l lVar5 = new l(500);
        f49096g = lVar5;
        l lVar6 = new l(600);
        f49097h = lVar6;
        l lVar7 = new l(700);
        f49098i = lVar7;
        l lVar8 = new l(800);
        f49099j = lVar8;
        l lVar9 = new l(900);
        f49100k = lVar9;
        f49101l = lVar3;
        f49102m = lVar4;
        f49103n = lVar5;
        f49104o = lVar6;
        f49105p = lVar7;
        f49106q = u.l(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i11) {
        this.f49107a = i11;
        boolean z11 = false;
        if (1 <= i11 && i11 < 1001) {
            z11 = true;
        }
        if (!z11) {
            throw new IllegalArgumentException(s.p("Font weight can be in range [1, 1000]. Current value: ", Integer.valueOf(k())).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f49107a == ((l) obj).f49107a;
    }

    public int hashCode() {
        return this.f49107a;
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(l other) {
        s.g(other, "other");
        return s.i(this.f49107a, other.f49107a);
    }

    public final int k() {
        return this.f49107a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f49107a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}