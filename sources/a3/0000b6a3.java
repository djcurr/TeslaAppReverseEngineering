package u00;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t00.k;
import u10.f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum KFunction uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    public static final c KFunction;
    public static final c KSuspendFunction;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final u10.c packageFqName;
    public static final c Function = new c("Function", 0, k.f51317l, "Function", false, false);
    public static final c SuspendFunction = new c("SuspendFunction", 1, k.f51309d, "SuspendFunction", true, false);

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: u00.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1189a {

            /* renamed from: a  reason: collision with root package name */
            private final c f52884a;

            /* renamed from: b  reason: collision with root package name */
            private final int f52885b;

            public C1189a(c kind, int i11) {
                s.g(kind, "kind");
                this.f52884a = kind;
                this.f52885b = i11;
            }

            public final c a() {
                return this.f52884a;
            }

            public final int b() {
                return this.f52885b;
            }

            public final c c() {
                return this.f52884a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C1189a) {
                    C1189a c1189a = (C1189a) obj;
                    return this.f52884a == c1189a.f52884a && this.f52885b == c1189a.f52885b;
                }
                return false;
            }

            public int hashCode() {
                return (this.f52884a.hashCode() * 31) + this.f52885b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f52884a + ", arity=" + this.f52885b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Integer d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                char charAt = str.charAt(i11);
                i11++;
                int i13 = charAt - '0';
                if (!(i13 >= 0 && i13 <= 9)) {
                    return null;
                }
                i12 = (i12 * 10) + i13;
            }
            return Integer.valueOf(i12);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[LOOP:0: B:3:0x0011->B:13:0x0032, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final u00.c a(u10.c r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "packageFqName"
                kotlin.jvm.internal.s.g(r9, r0)
                java.lang.String r0 = "className"
                kotlin.jvm.internal.s.g(r10, r0)
                u00.c[] r0 = u00.c.values()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L11:
                r4 = 0
                if (r3 >= r1) goto L35
                r5 = r0[r3]
                u10.c r6 = r5.getPackageFqName()
                boolean r6 = kotlin.jvm.internal.s.c(r6, r9)
                if (r6 == 0) goto L2d
                java.lang.String r6 = r5.getClassNamePrefix()
                r7 = 2
                boolean r4 = kotlin.text.m.H(r10, r6, r2, r7, r4)
                if (r4 == 0) goto L2d
                r4 = 1
                goto L2e
            L2d:
                r4 = r2
            L2e:
                if (r4 == 0) goto L32
                r4 = r5
                goto L35
            L32:
                int r3 = r3 + 1
                goto L11
            L35:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: u00.c.a.a(u10.c, java.lang.String):u00.c");
        }

        public final c b(String className, u10.c packageFqName) {
            s.g(className, "className");
            s.g(packageFqName, "packageFqName");
            C1189a c11 = c(className, packageFqName);
            if (c11 == null) {
                return null;
            }
            return c11.c();
        }

        public final C1189a c(String className, u10.c packageFqName) {
            s.g(className, "className");
            s.g(packageFqName, "packageFqName");
            c a11 = a(packageFqName, className);
            if (a11 == null) {
                return null;
            }
            String substring = className.substring(a11.getClassNamePrefix().length());
            s.f(substring, "(this as java.lang.String).substring(startIndex)");
            Integer d11 = d(substring);
            if (d11 == null) {
                return null;
            }
            return new C1189a(a11, d11.intValue());
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    static {
        u10.c cVar = k.f51314i;
        KFunction = new c("KFunction", 2, cVar, "KFunction", false, true);
        KSuspendFunction = new c("KSuspendFunction", 3, cVar, "KSuspendFunction", true, true);
        $VALUES = $values();
        Companion = new a(null);
    }

    private c(String str, int i11, u10.c cVar, String str2, boolean z11, boolean z12) {
        this.packageFqName = cVar;
        this.classNamePrefix = str2;
        this.isSuspendType = z11;
        this.isReflectType = z12;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final u10.c getPackageFqName() {
        return this.packageFqName;
    }

    public final f numberedClassName(int i11) {
        f f11 = f.f(s.p(this.classNamePrefix, Integer.valueOf(i11)));
        s.f(f11, "identifier(\"$classNamePrefix$arity\")");
        return f11;
    }
}