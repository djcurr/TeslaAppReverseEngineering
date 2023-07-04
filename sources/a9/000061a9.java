package com.tesla.temp;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b0;
import androidx.work.c;
import androidx.work.e;
import androidx.work.h;
import androidx.work.r;
import androidx.work.rxjava3.RxWorker;
import androidx.work.s;
import at.e;
import at.j;
import ch.qos.logback.core.CoreConstants;
import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.k;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.temp.RemoteLogWorker;
import hy.m;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.i18n.ErrorBundle;
import vz.p;
import vz.v;
import wz.r0;
import yu.f;
import yu.m;
import yu.y;
import zu.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/temp/RemoteLogWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "d", "a", "temp_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RemoteLogWorker extends RxWorker {

    /* renamed from: d */
    public static final a f21980d = new a(null);

    /* renamed from: e */
    private static final g f21981e = g.f21878b.a("RemoteLogWorker");

    /* renamed from: c */
    private final g f21982c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a(JSONArray jSONArray, Context context) {
            Map f11;
            Map<String, ?> f12;
            u uVar = u.f60790a;
            f11 = r0.f(v.a("batched", jSONArray));
            f12 = r0.f(v.a(ErrorBundle.DETAIL_ENTRY, f11));
            JSONObject d11 = uVar.d(f12);
            String str = "RemoteLogWorker-lookup-key-" + jSONArray.hashCode();
            j.a aVar = j.f6730b;
            Context applicationContext = context.getApplicationContext();
            s.f(applicationContext, "context.applicationContext");
            e a11 = aVar.a(applicationContext);
            String jSONObject = d11.toString();
            s.f(jSONObject, "data.toString()");
            a11.a(str, jSONObject);
            return str;
        }

        public final void b(Context context, JSONArray logs) {
            s.g(context, "context");
            s.g(logs, "logs");
            try {
                String a11 = a(logs, context);
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                teslaLog.i("RemoteLogWorker", "Persisted remote logs under key " + a11);
                int i11 = 0;
                p[] pVarArr = {v.a("RemoteLogWorker-lookup-key", a11)};
                e.a aVar = new e.a();
                while (i11 < 1) {
                    p pVar = pVarArr[i11];
                    i11++;
                    aVar.b((String) pVar.c(), pVar.d());
                }
                androidx.work.e a12 = aVar.a();
                s.f(a12, "dataBuilder.build()");
                c.a c11 = new c.a().c(r.CONNECTED);
                s.f(c11, "Builder().setRequiredNet…pe(NetworkType.CONNECTED)");
                androidx.work.s b11 = new s.a(RemoteLogWorker.class).f(c11.b()).e(androidx.work.a.EXPONENTIAL, 30L, TimeUnit.SECONDS).h(a12).b();
                kotlin.jvm.internal.s.f(b11, "OneTimeWorkRequestBuilde…tData)\n          .build()");
                b0.i(context).g(a11, h.KEEP, b11);
            } catch (Exception e11) {
                RemoteLogWorker.f21981e.d("Failed to schedule remote log worker", e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLogWorker(Context context, WorkerParameters workerParams) {
        super(context.getApplicationContext(), workerParams);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(workerParams, "workerParams");
        this.f21982c = g.f21878b.a("RemoteLogWorker");
    }

    public static /* synthetic */ ListenableWorker.a d(RemoteLogWorker remoteLogWorker, Throwable th2) {
        return i(remoteLogWorker, th2);
    }

    public static /* synthetic */ ListenableWorker.a e(RemoteLogWorker remoteLogWorker, at.e eVar, String str, k kVar) {
        return h(remoteLogWorker, eVar, str, kVar);
    }

    public static final ListenableWorker.a h(RemoteLogWorker this$0, at.e local, String str, k kVar) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(local, "$local");
        if (kVar.i()) {
            this$0.f21982c.i("Successfully uploaded remote OAPI logs");
            local.b(str);
            return ListenableWorker.a.c();
        }
        this$0.f21982c.i("Failed to upload remote OAPI logs");
        return ListenableWorker.a.b();
    }

    public static final ListenableWorker.a i(RemoteLogWorker this$0, Throwable th2) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f21982c.d("Error uploading remote logs", th2);
        return ListenableWorker.a.b();
    }

    private final m<ListenableWorker.a> j() {
        return m.n(ListenableWorker.a.a());
    }

    @Override // androidx.work.rxjava3.RxWorker
    public m<ListenableWorker.a> a() {
        boolean w11;
        final String k11 = getInputData().k("RemoteLogWorker-lookup-key");
        if (k11 == null) {
            String str = "Cannot remotely log, key not found " + k11;
            this.f21982c.d(str, new Throwable(str));
            m<ListenableWorker.a> j11 = j();
            kotlin.jvm.internal.s.f(j11, "onFailure()");
            return j11;
        }
        j.a aVar = j.f6730b;
        Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "applicationContext");
        final at.e a11 = aVar.a(applicationContext);
        String string = a11.getString(k11);
        if (string == null) {
            this.f21982c.d("Cannot remotely log, data is null, nothing to upload.", new Throwable("Cannot remotely log, data is null, nothing to upload."));
            m<ListenableWorker.a> j12 = j();
            kotlin.jvm.internal.s.f(j12, "onFailure()");
            return j12;
        }
        w11 = kotlin.text.v.w(string);
        if (w11) {
            this.f21982c.d("Cannot remotely log, data is blank, nothing to upload.", new Throwable("Cannot remotely log, data is blank, nothing to upload."));
            m<ListenableWorker.a> j13 = j();
            kotlin.jvm.internal.s.f(j13, "onFailure()");
            return j13;
        } else if (getRunAttemptCount() > 3) {
            this.f21982c.i("Max retries reached for remote OAPI logs");
            m<ListenableWorker.a> j14 = j();
            kotlin.jvm.internal.s.f(j14, "onFailure()");
            return j14;
        } else {
            this.f21982c.i("Uploading remote OAPI logs");
            y.a aVar2 = y.f59842h;
            Context applicationContext2 = getApplicationContext();
            kotlin.jvm.internal.s.f(applicationContext2, "applicationContext");
            y a12 = aVar2.a(applicationContext2);
            HttpMethodType httpMethodType = HttpMethodType.POST;
            m.a aVar3 = yu.m.f59801c;
            Context applicationContext3 = getApplicationContext();
            kotlin.jvm.internal.s.f(applicationContext3, "applicationContext");
            hy.m<ListenableWorker.a> r11 = f.a.b(a12, httpMethodType, aVar3.c(applicationContext3).getUri(), null, string, null, null, null, false, false, 500, null).o(new ky.h() { // from class: yu.o
                @Override // ky.h
                public final Object apply(Object obj) {
                    return RemoteLogWorker.e(RemoteLogWorker.this, a11, k11, (com.tesla.data.oapi.k) obj);
                }
            }).r(new ky.h() { // from class: yu.n
                @Override // ky.h
                public final Object apply(Object obj) {
                    return RemoteLogWorker.d(RemoteLogWorker.this, (Throwable) obj);
                }
            });
            kotlin.jvm.internal.s.f(r11, "SendOwnerRequest\n      .…   Result.retry()\n      }");
            return r11;
        }
    }
}