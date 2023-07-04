package u2;

import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r2.d;
import r2.j;
import r2.l;
import r2.n;
import r2.o;
import r2.p;

/* loaded from: classes.dex */
public class j {

    /* renamed from: c  reason: collision with root package name */
    public static final b f53025c = new b(null);

    /* renamed from: d  reason: collision with root package name */
    private static final l f53026d = l.f49091b.h();

    /* renamed from: e  reason: collision with root package name */
    private static final androidx.collection.e<a, Typeface> f53027e = new androidx.collection.e<>(16);

    /* renamed from: a  reason: collision with root package name */
    private final r2.i f53028a;

    /* renamed from: b  reason: collision with root package name */
    private final d.a f53029b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final r2.e f53030a;

        /* renamed from: b  reason: collision with root package name */
        private final l f53031b;

        /* renamed from: c  reason: collision with root package name */
        private final int f53032c;

        /* renamed from: d  reason: collision with root package name */
        private final int f53033d;

        private a(r2.e eVar, l lVar, int i11, int i12) {
            this.f53030a = eVar;
            this.f53031b = lVar;
            this.f53032c = i11;
            this.f53033d = i12;
        }

        public /* synthetic */ a(r2.e eVar, l lVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(eVar, lVar, i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f53030a, aVar.f53030a) && s.c(this.f53031b, aVar.f53031b) && r2.j.f(this.f53032c, aVar.f53032c) && r2.k.h(this.f53033d, aVar.f53033d);
            }
            return false;
        }

        public int hashCode() {
            r2.e eVar = this.f53030a;
            return ((((((eVar == null ? 0 : eVar.hashCode()) * 31) + this.f53031b.hashCode()) * 31) + r2.j.g(this.f53032c)) * 31) + r2.k.i(this.f53033d);
        }

        public String toString() {
            return "CacheKey(fontFamily=" + this.f53030a + ", fontWeight=" + this.f53031b + ", fontStyle=" + ((Object) r2.j.h(this.f53032c)) + ", fontSynthesis=" + ((Object) r2.k.l(this.f53033d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(boolean z11, boolean z12) {
            if (z12 && z11) {
                return 3;
            }
            if (z11) {
                return 1;
            }
            return z12 ? 2 : 0;
        }

        public final int b(l fontWeight, int i11) {
            s.g(fontWeight, "fontWeight");
            return a(fontWeight.compareTo(j.f53026d) >= 0, r2.j.f(i11, r2.j.f49081b.a()));
        }

        public final Typeface c(Typeface typeface, r2.d font, l fontWeight, int i11, int i12) {
            int k11;
            boolean f11;
            s.g(typeface, "typeface");
            s.g(font, "font");
            s.g(fontWeight, "fontWeight");
            boolean z11 = true;
            boolean z12 = r2.k.k(i12) && fontWeight.compareTo(j.f53026d) >= 0 && font.a().compareTo(j.f53026d) < 0;
            boolean z13 = r2.k.j(i12) && !r2.j.f(i11, font.c());
            if (z13 || z12) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (!z13 || !r2.j.f(i11, r2.j.f49081b.a())) {
                        z11 = false;
                    }
                    Typeface create = Typeface.create(typeface, a(z12, z11));
                    s.f(create, "{\n                val ta…argetStyle)\n            }");
                    return create;
                }
                if (z12) {
                    k11 = fontWeight.k();
                } else {
                    k11 = font.a().k();
                }
                if (z13) {
                    f11 = r2.j.f(i11, r2.j.f49081b.a());
                } else {
                    f11 = r2.j.f(font.c(), r2.j.f49081b.a());
                }
                return k.f53034a.a(typeface, k11, f11);
            }
            return typeface;
        }
    }

    public j(r2.i fontMatcher, d.a resourceLoader) {
        s.g(fontMatcher, "fontMatcher");
        s.g(resourceLoader, "resourceLoader");
        this.f53028a = fontMatcher;
        this.f53029b = resourceLoader;
    }

    public static /* synthetic */ Typeface c(j jVar, r2.e eVar, l lVar, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 1) != 0) {
                eVar = null;
            }
            if ((i13 & 2) != 0) {
                lVar = l.f49091b.d();
            }
            if ((i13 & 4) != 0) {
                i11 = r2.j.f49081b.b();
            }
            if ((i13 & 8) != 0) {
                i12 = r2.k.f49085b.a();
            }
            return jVar.b(eVar, lVar, i11, i12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-DPcqOEQ");
    }

    private final Typeface d(String str, l lVar, int i11) {
        Typeface familyTypeface;
        Typeface create;
        j.a aVar = r2.j.f49081b;
        boolean z11 = true;
        if (r2.j.f(i11, aVar.b()) && s.c(lVar, l.f49091b.d())) {
            if (str == null || str.length() == 0) {
                Typeface DEFAULT = Typeface.DEFAULT;
                s.f(DEFAULT, "DEFAULT");
                return DEFAULT;
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            int b11 = f53025c.b(lVar, i11);
            if (str != null && str.length() != 0) {
                z11 = false;
            }
            if (z11) {
                create = Typeface.defaultFromStyle(b11);
            } else {
                create = Typeface.create(str, b11);
            }
            s.f(create, "{\n            val target…)\n            }\n        }");
            return create;
        }
        if (str == null) {
            familyTypeface = Typeface.DEFAULT;
        } else {
            familyTypeface = Typeface.create(str, 0);
        }
        k kVar = k.f53034a;
        s.f(familyTypeface, "familyTypeface");
        return kVar.a(familyTypeface, lVar.k(), r2.j.f(i11, aVar.a()));
    }

    private final Typeface e(int i11, l lVar, r2.h hVar, int i12) {
        Typeface b11;
        r2.d b12 = this.f53028a.b(hVar, lVar, i11);
        try {
            if (b12 instanceof p) {
                b11 = (Typeface) this.f53029b.a(b12);
            } else if (!(b12 instanceof r2.a)) {
                throw new IllegalStateException(s.p("Unknown font type: ", b12));
            } else {
                b11 = ((r2.a) b12).b();
            }
            Typeface typeface = b11;
            return (r2.k.h(i12, r2.k.f49085b.b()) || (s.c(lVar, b12.a()) && r2.j.f(i11, b12.c()))) ? typeface : f53025c.c(typeface, b12, lVar, i11, i12);
        } catch (Exception e11) {
            throw new IllegalStateException(s.p("Cannot create Typeface from ", b12), e11);
        }
    }

    public Typeface b(r2.e eVar, l fontWeight, int i11, int i12) {
        Typeface a11;
        s.g(fontWeight, "fontWeight");
        a aVar = new a(eVar, fontWeight, i11, i12, null);
        androidx.collection.e<a, Typeface> eVar2 = f53027e;
        Typeface typeface = eVar2.get(aVar);
        if (typeface != null) {
            return typeface;
        }
        if (eVar instanceof r2.h) {
            a11 = e(i11, fontWeight, (r2.h) eVar, i12);
        } else if (eVar instanceof n) {
            a11 = d(((n) eVar).c(), fontWeight, i11);
        } else {
            boolean z11 = true;
            if (!(eVar instanceof r2.b) && eVar != null) {
                z11 = false;
            }
            if (z11) {
                a11 = d(null, fontWeight, i11);
            } else if (eVar instanceof o) {
                a11 = ((h) ((o) eVar).c()).a(fontWeight, i11, i12);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        eVar2.put(aVar, a11);
        return a11;
    }

    public /* synthetic */ j(r2.i iVar, d.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new r2.i() : iVar, aVar);
    }
}