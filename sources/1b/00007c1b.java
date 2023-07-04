package js;

import android.os.Looper;
import com.tesla.logging.a;
import js.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f33946b;

    /* renamed from: a  reason: collision with root package name */
    private final b f33947a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f33946b = com.tesla.logging.g.f21878b.a("RefreshAuthToken");
    }

    public d(b repository) {
        s.g(repository, "repository");
        this.f33947a = repository;
    }

    public final k a() {
        if (!s.c(Looper.getMainLooper(), Looper.myLooper())) {
            if (this.f33947a.b() == null) {
                com.tesla.logging.a.d(a.EnumC0395a.AUTH_FAILURE, null, 2, null);
                return new k.a(new IllegalStateException("cannot fetch new token with null refresh token"));
            }
            String issuer = this.f33947a.getIssuer();
            if (issuer == null) {
                com.tesla.logging.a.d(a.EnumC0395a.AUTH_FAILURE, null, 2, null);
                return new k.a(new IllegalStateException("cannot fetch new token with null issuer"));
            }
            try {
                k b11 = this.f33947a.f(issuer, true).b();
                s.f(b11, "{\n      repository\n     …     .blockingGet()\n    }");
                return b11;
            } catch (Exception e11) {
                f33946b.d("Exception thrown refreshing token!", e11);
                return new k.a(e11);
            }
        }
        throw new IllegalStateException("Cannot refresh token on UI thread!");
    }
}