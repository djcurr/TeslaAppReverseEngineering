package bx;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tesla.domain.model.DataRestrictedCountry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends cx.b {

    /* renamed from: b */
    private final boolean f8333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String serviceName) {
        super(context, serviceName);
        s.g(context, "context");
        s.g(serviceName, "serviceName");
        this.f8333b = DataRestrictedCountry.Companion.b(context);
    }

    public static /* synthetic */ Void b(d dVar, String str, Bundle bundle) {
        return f(dVar, str, bundle);
    }

    public static /* synthetic */ Void c(d dVar, Boolean bool) {
        return h(dVar, bool);
    }

    public static /* synthetic */ Void d(d dVar, Bundle bundle) {
        return j(dVar, bundle);
    }

    public static final Void f(d this$0, String str, Bundle bundle) {
        s.g(this$0, "this$0");
        if (this$0.f8333b) {
            return null;
        }
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this$0.a());
        s.e(str);
        firebaseAnalytics.a(str, bundle);
        return null;
    }

    public static final Void h(d this$0, Boolean bool) {
        s.g(this$0, "this$0");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this$0.a());
        s.e(bool);
        boolean z11 = true;
        firebaseAnalytics.b(bool.booleanValue() && !this$0.f8333b);
        com.google.firebase.d k11 = com.google.firebase.d.k();
        if (!bool.booleanValue() || this$0.f8333b) {
            z11 = false;
        }
        k11.z(z11);
        return null;
    }

    public static final Void j(d this$0, Bundle properties) {
        s.g(this$0, "this$0");
        s.g(properties, "$properties");
        if (this$0.f8333b) {
            return null;
        }
        Set<String> keySet = properties.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this$0.a());
        s.f(firebaseAnalytics, "getInstance(context)");
        for (String str : keySet) {
            Object obj = properties.get(str);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            firebaseAnalytics.d(str, (String) obj);
        }
        return null;
    }

    public final Task<Void> e(final String str, final Bundle bundle) {
        Task<Void> call = Tasks.call(new Callable() { // from class: bx.c
            {
                d.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.b(d.this, str, bundle);
            }
        });
        s.f(call, "call {\n      if (isDataR…   return@call null\n    }");
        return call;
    }

    public final Task<Void> g(final Boolean bool) {
        Task<Void> call = Tasks.call(new Callable() { // from class: bx.b
            {
                d.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.c(d.this, bool);
            }
        });
        s.f(call, "call {\n      FirebaseAna…   return@call null\n    }");
        return call;
    }

    public final Task<Void> i(final Bundle properties) {
        s.g(properties, "properties");
        Task<Void> call = Tasks.call(new Callable() { // from class: bx.a
            {
                d.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.d(d.this, properties);
            }
        });
        s.f(call, "call {\n      if (isDataR…   return@call null\n    }");
        return call;
    }
}