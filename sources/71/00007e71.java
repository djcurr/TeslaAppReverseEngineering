package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public final class s0 implements n00.q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34923a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: kotlin.jvm.internal.s0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public /* synthetic */ class C0648a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f34924a;

            static {
                int[] iArr = new int[n00.s.values().length];
                iArr[n00.s.INVARIANT.ordinal()] = 1;
                iArr[n00.s.IN.ordinal()] = 2;
                iArr[n00.s.OUT.ordinal()] = 3;
                f34924a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(n00.q typeParameter) {
            s.g(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i11 = C0648a.f34924a[typeParameter.k().ordinal()];
            if (i11 == 2) {
                sb2.append("in ");
            } else if (i11 == 3) {
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            String sb3 = sb2.toString();
            s.f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }
}