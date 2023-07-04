package com.tesla.command;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.m;
import com.tesla.logging.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ot.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tesla/command/CommandRequestBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "command_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CommandRequestBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final g f21474a;

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
        f21474a = g.f21878b.a("CommandRequestBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        g gVar = f21474a;
        gVar.i("Received intent...");
        m e11 = m.e(context);
        vs.a aVar = vs.a.f54611a;
        e11.b(aVar.c(intent));
        c a11 = aVar.a(intent);
        if (a11 == null) {
            return;
        }
        String b11 = uu.c.b(a11);
        gVar.i("Scheduling " + b11 + " to be executed");
        ExecuteCommandWorker.f21475b.a(context, a11);
    }
}