package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.q;
import java.util.Collections;
import java.util.List;
import l5.l;
import l5.p;

/* loaded from: classes.dex */
public class d implements g5.c, d5.b, p.b {

    /* renamed from: j  reason: collision with root package name */
    private static final String f6586j = q.f("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f6587a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6588b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6589c;

    /* renamed from: d  reason: collision with root package name */
    private final e f6590d;

    /* renamed from: e  reason: collision with root package name */
    private final g5.d f6591e;

    /* renamed from: h  reason: collision with root package name */
    private PowerManager.WakeLock f6594h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6595i = false;

    /* renamed from: g  reason: collision with root package name */
    private int f6593g = 0;

    /* renamed from: f  reason: collision with root package name */
    private final Object f6592f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, int i11, String str, e eVar) {
        this.f6587a = context;
        this.f6588b = i11;
        this.f6590d = eVar;
        this.f6589c = str;
        this.f6591e = new g5.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f6592f) {
            this.f6591e.e();
            this.f6590d.h().c(this.f6589c);
            PowerManager.WakeLock wakeLock = this.f6594h;
            if (wakeLock != null && wakeLock.isHeld()) {
                q.c().a(f6586j, String.format("Releasing wakelock %s for WorkSpec %s", this.f6594h, this.f6589c), new Throwable[0]);
                this.f6594h.release();
            }
        }
    }

    private void g() {
        synchronized (this.f6592f) {
            if (this.f6593g < 2) {
                this.f6593g = 2;
                q c11 = q.c();
                String str = f6586j;
                c11.a(str, String.format("Stopping work for WorkSpec %s", this.f6589c), new Throwable[0]);
                Intent g11 = b.g(this.f6587a, this.f6589c);
                e eVar = this.f6590d;
                eVar.k(new e.b(eVar, g11, this.f6588b));
                if (this.f6590d.d().g(this.f6589c)) {
                    q.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f6589c), new Throwable[0]);
                    Intent f11 = b.f(this.f6587a, this.f6589c);
                    e eVar2 = this.f6590d;
                    eVar2.k(new e.b(eVar2, f11, this.f6588b));
                } else {
                    q.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f6589c), new Throwable[0]);
                }
            } else {
                q.c().a(f6586j, String.format("Already stopped work for %s", this.f6589c), new Throwable[0]);
            }
        }
    }

    @Override // l5.p.b
    public void a(String str) {
        q.c().a(f6586j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // g5.c
    public void b(List<String> list) {
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f6594h = l.b(this.f6587a, String.format("%s (%s)", this.f6589c, Integer.valueOf(this.f6588b)));
        q c11 = q.c();
        String str = f6586j;
        c11.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f6594h, this.f6589c), new Throwable[0]);
        this.f6594h.acquire();
        k5.p g11 = this.f6590d.g().v().l().g(this.f6589c);
        if (g11 == null) {
            g();
            return;
        }
        boolean b11 = g11.b();
        this.f6595i = b11;
        if (!b11) {
            q.c().a(str, String.format("No constraints for %s", this.f6589c), new Throwable[0]);
            f(Collections.singletonList(this.f6589c));
            return;
        }
        this.f6591e.d(Collections.singletonList(g11));
    }

    @Override // d5.b
    public void e(String str, boolean z11) {
        q.c().a(f6586j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z11)), new Throwable[0]);
        c();
        if (z11) {
            Intent f11 = b.f(this.f6587a, this.f6589c);
            e eVar = this.f6590d;
            eVar.k(new e.b(eVar, f11, this.f6588b));
        }
        if (this.f6595i) {
            Intent a11 = b.a(this.f6587a);
            e eVar2 = this.f6590d;
            eVar2.k(new e.b(eVar2, a11, this.f6588b));
        }
    }

    @Override // g5.c
    public void f(List<String> list) {
        if (list.contains(this.f6589c)) {
            synchronized (this.f6592f) {
                if (this.f6593g == 0) {
                    this.f6593g = 1;
                    q.c().a(f6586j, String.format("onAllConstraintsMet for %s", this.f6589c), new Throwable[0]);
                    if (this.f6590d.d().j(this.f6589c)) {
                        this.f6590d.h().b(this.f6589c, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    q.c().a(f6586j, String.format("Already started work for %s", this.f6589c), new Throwable[0]);
                }
            }
        }
    }
}