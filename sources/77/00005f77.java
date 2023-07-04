package com.tesla.TeslaV4.reactnative.module;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.tesla.logging.TeslaLog;
import io.grpc.b;
import io.grpc.r0;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;

/* loaded from: classes6.dex */
public final class b extends io.grpc.b {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final r0.f<String> f21413c;

    /* renamed from: d */
    private static final r0.f<String> f21414d;

    /* renamed from: e */
    private static final r0.f<String> f21415e;

    /* renamed from: f */
    private static final String f21416f;

    /* renamed from: g */
    private static final com.tesla.logging.g f21417g;

    /* renamed from: a */
    private final String f21418a;

    /* renamed from: b */
    private final String f21419b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        r0.d<String> dVar = r0.f31579d;
        f21413c = r0.f.e(NetworkConstantsKt.HEADER_AUTHORIZATION, dVar);
        f21414d = r0.f.e("X-TXID", dVar);
        f21415e = r0.f.e(NetworkConstantsKt.HEADER_ACCEPT, dVar);
        f21416f = "Bearer";
        f21417g = com.tesla.logging.g.f21878b.a("PowerstreamApiGrpc_Auth");
    }

    public b(String token, String requestID) {
        kotlin.jvm.internal.s.g(token, "token");
        kotlin.jvm.internal.s.g(requestID, "requestID");
        this.f21418a = token;
        this.f21419b = requestID;
    }

    public static /* synthetic */ void b(b bVar, b.a aVar) {
        c(bVar, aVar);
    }

    public static final void c(b this$0, b.a applier) {
        Map f11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(applier, "$applier");
        try {
            r0 r0Var = new r0();
            r0.f<String> fVar = f21413c;
            q0 q0Var = q0.f34921a;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{f21416f, this$0.f21418a}, 2));
            kotlin.jvm.internal.s.f(format, "format(format, *args)");
            r0Var.o(fVar, format);
            r0Var.o(f21414d, this$0.f21419b);
            r0Var.o(f21415e, "*/*");
            applier.a(r0Var);
        } catch (Exception e11) {
            com.tesla.logging.g gVar = f21417g;
            String str = "Could not set auth headers: " + e11;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = wz.r0.f(vz.v.a(h11, str));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(str));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(str, new Object[0]);
        }
    }

    @Override // io.grpc.b
    public void a(b.AbstractC0585b requestInfo, Executor appExecutor, final b.a applier) {
        kotlin.jvm.internal.s.g(requestInfo, "requestInfo");
        kotlin.jvm.internal.s.g(appExecutor, "appExecutor");
        kotlin.jvm.internal.s.g(applier, "applier");
        appExecutor.execute(new Runnable() { // from class: com.tesla.TeslaV4.reactnative.module.a
            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.b(b.this, applier);
            }
        });
    }
}