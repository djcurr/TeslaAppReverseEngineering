package ku;

import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0683a f35879c = new C0683a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f35880a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35881b;

    /* renamed from: ku.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0683a {
        private C0683a() {
        }

        public /* synthetic */ C0683a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String name, Object value) {
            s.g(name, "name");
            s.g(value, "value");
            Locale US = Locale.US;
            s.f(US, "US");
            String lowerCase = name.toLowerCase(US);
            s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String obj = value.toString();
            s.f(US, "US");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = obj.toLowerCase(US);
            s.f(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return new a(lowerCase, lowerCase2, null);
        }
    }

    private a(String str, String str2) {
        this.f35880a = str;
        this.f35881b = str2;
    }

    public /* synthetic */ a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public static final a c(String str, Object obj) {
        return f35879c.a(str, obj);
    }

    public final String a() {
        return this.f35880a;
    }

    public final String b() {
        return this.f35881b;
    }
}