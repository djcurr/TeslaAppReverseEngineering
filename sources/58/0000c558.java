package zu;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes6.dex */
public interface c {

    /* renamed from: g3  reason: collision with root package name */
    public static final a f60760g3 = a.f60761a;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f60761a = new a();

        private a() {
        }

        public final c a(Context context) {
            kotlin.jvm.internal.s.g(context, "context");
            Context applicationContext = context.getApplicationContext();
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type com.tesla.utils.AppState");
            return (c) applicationContext;
        }
    }

    boolean e();

    hy.i<Boolean> h();
}