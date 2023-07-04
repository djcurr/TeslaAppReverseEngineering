package v6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v6.a;

/* loaded from: classes.dex */
public enum c {
    NONE,
    POSTAL_CODE,
    FULL_ADDRESS;
    
    public static final a Companion = new a(null);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: v6.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C1219a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f54103a;

            static {
                int[] iArr = new int[e7.a.values().length];
                iArr[e7.a.POSTAL_CODE.ordinal()] = 1;
                iArr[e7.a.NONE.ordinal()] = 2;
                f54103a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(v6.a addressConfiguration) {
            kotlin.jvm.internal.s.g(addressConfiguration, "addressConfiguration");
            if (addressConfiguration instanceof a.C1214a) {
                return c.FULL_ADDRESS;
            }
            if (addressConfiguration instanceof a.c) {
                return c.POSTAL_CODE;
            }
            if (addressConfiguration instanceof a.b) {
                return c.NONE;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final c b(e7.a addressVisibility) {
            kotlin.jvm.internal.s.g(addressVisibility, "addressVisibility");
            int i11 = C1219a.f54103a[addressVisibility.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return c.NONE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return c.POSTAL_CODE;
        }
    }
}