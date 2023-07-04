package xh;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class a implements v {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57385a;

    /* renamed from: b  reason: collision with root package name */
    private final yh.d f57386b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f57387c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.c f57388d;

    /* renamed from: e  reason: collision with root package name */
    private final ai.a f57389e;

    public a(Context context, yh.d dVar, ai.a aVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, cVar);
    }

    @Override // xh.v
    public void a(ph.o oVar, int i11) {
        b(oVar, i11, false);
    }

    @Override // xh.v
    public void b(ph.o oVar, int i11, boolean z11) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", oVar.b());
        builder.appendQueryParameter("priority", String.valueOf(bi.a.a(oVar.d())));
        if (oVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(oVar.c(), 0));
        }
        Intent intent = new Intent(this.f57385a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i11);
        if (!z11 && c(intent)) {
            uh.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long S = this.f57386b.S(oVar);
        long g11 = this.f57388d.g(oVar.d(), S, i11);
        uh.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", oVar, Long.valueOf(g11), Long.valueOf(S), Integer.valueOf(i11));
        this.f57387c.set(3, this.f57389e.a() + g11, PendingIntent.getBroadcast(this.f57385a, 0, intent, 0));
    }

    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f57385a, 0, intent, PKIFailureInfo.duplicateCertReq) != null;
    }

    a(Context context, yh.d dVar, AlarmManager alarmManager, ai.a aVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar) {
        this.f57385a = context;
        this.f57386b = dVar;
        this.f57387c = alarmManager;
        this.f57389e = aVar;
        this.f57388d = cVar;
    }
}