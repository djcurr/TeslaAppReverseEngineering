package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.b0;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.q;
import androidx.work.s;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f6617a = q.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        q.c().a(f6617a, "Requesting diagnostics", new Throwable[0]);
        try {
            b0.i(context).d(s.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e11) {
            q.c().b(f6617a, "WorkManager is not initialized", e11);
        }
    }
}