package n00;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: c */
    public static final a f40137c = new a(null);

    /* renamed from: d */
    public static final r f40138d = new r(null, null);

    /* renamed from: a */
    private final s f40139a;

    /* renamed from: b */
    private final p f40140b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(p type) {
            kotlin.jvm.internal.s.g(type, "type");
            return new r(s.IN, type);
        }

        public final r b(p type) {
            kotlin.jvm.internal.s.g(type, "type");
            return new r(s.OUT, type);
        }

        public final r c() {
            return r.f40138d;
        }

        public final r d(p type) {
            kotlin.jvm.internal.s.g(type, "type");
            return new r(s.INVARIANT, type);
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40141a;

        static {
            int[] iArr = new int[s.values().length];
            iArr[s.INVARIANT.ordinal()] = 1;
            iArr[s.IN.ordinal()] = 2;
            iArr[s.OUT.ordinal()] = 3;
            f40141a = iArr;
        }
    }

    public r(s sVar, p pVar) {
        String str;
        this.f40139a = sVar;
        this.f40140b = pVar;
        if ((sVar == null) == (pVar == null)) {
            return;
        }
        if (sVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + sVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final s a() {
        return this.f40139a;
    }

    public final p b() {
        return this.f40140b;
    }

    public final p c() {
        return this.f40140b;
    }

    public final s d() {
        return this.f40139a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f40139a == rVar.f40139a && kotlin.jvm.internal.s.c(this.f40140b, rVar.f40140b);
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f40139a;
        int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        p pVar = this.f40140b;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        s sVar = this.f40139a;
        int i11 = sVar == null ? -1 : b.f40141a[sVar.ordinal()];
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return "in " + this.f40140b;
                } else if (i11 == 3) {
                    return "out " + this.f40140b;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return String.valueOf(this.f40140b);
        }
        return Marker.ANY_MARKER;
    }
}