package t10;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class d {

    /* loaded from: classes5.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final String f51545a;

        /* renamed from: b  reason: collision with root package name */
        private final String f51546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String desc) {
            super(null);
            s.g(name, "name");
            s.g(desc, "desc");
            this.f51545a = name;
            this.f51546b = desc;
        }

        @Override // t10.d
        public String a() {
            return c() + CoreConstants.COLON_CHAR + b();
        }

        @Override // t10.d
        public String b() {
            return this.f51546b;
        }

        @Override // t10.d
        public String c() {
            return this.f51545a;
        }

        public final String d() {
            return c();
        }

        public final String e() {
            return b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(c(), aVar.c()) && s.c(b(), aVar.b());
            }
            return false;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final String f51547a;

        /* renamed from: b  reason: collision with root package name */
        private final String f51548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name, String desc) {
            super(null);
            s.g(name, "name");
            s.g(desc, "desc");
            this.f51547a = name;
            this.f51548b = desc;
        }

        @Override // t10.d
        public String a() {
            return s.p(c(), b());
        }

        @Override // t10.d
        public String b() {
            return this.f51548b;
        }

        @Override // t10.d
        public String c() {
            return this.f51547a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return s.c(c(), bVar.c()) && s.c(b(), bVar.b());
            }
            return false;
        }

        public int hashCode() {
            return (c().hashCode() * 31) + b().hashCode();
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}