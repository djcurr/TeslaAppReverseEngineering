package t2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51561b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final g f51562a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return new e(i.a().a().get(0));
        }
    }

    public e(g platformLocale) {
        s.g(platformLocale, "platformLocale");
        this.f51562a = platformLocale;
    }

    public final g a() {
        return this.f51562a;
    }

    public final String b() {
        return this.f51562a.b();
    }

    public final String c() {
        return this.f51562a.a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof e)) {
            if (this == obj) {
                return true;
            }
            return s.c(c(), ((e) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String languageTag) {
        this(i.a().b(languageTag));
        s.g(languageTag, "languageTag");
    }
}