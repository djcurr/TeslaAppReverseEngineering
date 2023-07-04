package ju;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import xt.h;
import xt.i;
import zu.j;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33983a = new a();

    /* renamed from: ju.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC0622a {

        /* renamed from: ju.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0623a extends AbstractC0622a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0623a f33984a = new C0623a();

            private C0623a() {
                super(null);
            }
        }

        /* renamed from: ju.a$a$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC0622a {

            /* renamed from: a  reason: collision with root package name */
            private final vu.c f33985a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(vu.c sessionInfo) {
                super(null);
                s.g(sessionInfo, "sessionInfo");
                this.f33985a = sessionInfo;
            }

            public final vu.c a() {
                return this.f33985a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.c(this.f33985a, ((b) obj).f33985a);
            }

            public int hashCode() {
                return this.f33985a.hashCode();
            }

            public String toString() {
                vu.c cVar = this.f33985a;
                return "Success(sessionInfo=" + cVar + ")";
            }
        }

        /* renamed from: ju.a$a$c */
        /* loaded from: classes6.dex */
        public static final class c extends AbstractC0622a {

            /* renamed from: a  reason: collision with root package name */
            private final Exception f33986a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Exception exception) {
                super(null);
                s.g(exception, "exception");
                this.f33986a = exception;
            }

            public final Exception a() {
                return this.f33986a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && s.c(this.f33986a, ((c) obj).f33986a);
            }

            public int hashCode() {
                return this.f33986a.hashCode();
            }

            public String toString() {
                Exception exc = this.f33986a;
                return "ThrownError(exception=" + exc + ")";
            }
        }

        private AbstractC0622a() {
        }

        public /* synthetic */ AbstractC0622a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33987a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.SESSION_INFO_STATUS_OK.ordinal()] = 1;
            iArr[i.SESSION_INFO_STATUS_KEY_NOT_ON_WHITELIST.ordinal()] = 2;
            f33987a = iArr;
        }
    }

    private a() {
    }

    public final AbstractC0622a a(h info, yt.b domain, String requestId) {
        s.g(info, "info");
        s.g(domain, "domain");
        s.g(requestId, "requestId");
        try {
            int i11 = b.f33987a[info.g().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return AbstractC0622a.C0623a.f33984a;
                }
                throw new NoWhenBranchMatchedException();
            }
            int c11 = info.c();
            return new AbstractC0622a.b(new vu.c(j.e(info.f().E(), 0, 1, null), info.d(), c11, j.e(info.e().E(), 0, 1, null), ((int) (System.currentTimeMillis() / 1000)) - c11, domain, requestId));
        } catch (Exception e11) {
            return new AbstractC0622a.c(e11);
        }
    }
}