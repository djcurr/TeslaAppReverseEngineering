package mz;

import io.sentry.e3;
import io.sentry.f3;
import io.sentry.g3;
import io.sentry.i2;
import io.sentry.z2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h f39656a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final g3 f39657b;

    public d(g3 g3Var) {
        this.f39657b = g3Var;
    }

    private io.sentry.f e(e3 e3Var) {
        if (e3.Event.equals(e3Var)) {
            return io.sentry.f.Error;
        }
        if (e3.Session.equals(e3Var)) {
            return io.sentry.f.Session;
        }
        if (e3.Transaction.equals(e3Var)) {
            return io.sentry.f.Transaction;
        }
        if (e3.UserFeedback.equals(e3Var)) {
            return io.sentry.f.UserReport;
        }
        if (e3.Attachment.equals(e3Var)) {
            return io.sentry.f.Attachment;
        }
        return io.sentry.f.Default;
    }

    private void f(String str, String str2, Long l11) {
        this.f39656a.a(new c(str, str2), l11);
    }

    private void h(b bVar) {
        if (bVar == null) {
            return;
        }
        for (f fVar : bVar.a()) {
            f(fVar.c(), fVar.a(), fVar.b());
        }
    }

    @Override // mz.g
    public void a(e eVar, z2 z2Var) {
        if (z2Var == null) {
            return;
        }
        try {
            e3 b11 = z2Var.w().b();
            if (e3.ClientReport.equals(b11)) {
                try {
                    h(z2Var.u(this.f39657b.getSerializer()));
                } catch (Exception unused) {
                    this.f39657b.getLogger().c(f3.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                f(eVar.getReason(), e(b11).getCategory(), 1L);
            }
        } catch (Throwable th2) {
            this.f39657b.getLogger().a(f3.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // mz.g
    public void b(e eVar, i2 i2Var) {
        if (i2Var == null) {
            return;
        }
        try {
            for (z2 z2Var : i2Var.c()) {
                a(eVar, z2Var);
            }
        } catch (Throwable th2) {
            this.f39657b.getLogger().a(f3.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // mz.g
    public void c(e eVar, io.sentry.f fVar) {
        try {
            f(eVar.getReason(), fVar.getCategory(), 1L);
        } catch (Throwable th2) {
            this.f39657b.getLogger().a(f3.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // mz.g
    public i2 d(i2 i2Var) {
        b g11 = g();
        if (g11 == null) {
            return i2Var;
        }
        try {
            this.f39657b.getLogger().c(f3.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (z2 z2Var : i2Var.c()) {
                arrayList.add(z2Var);
            }
            arrayList.add(z2.q(this.f39657b.getSerializer(), g11));
            return new i2(i2Var.b(), arrayList);
        } catch (Throwable th2) {
            this.f39657b.getLogger().a(f3.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return i2Var;
        }
    }

    b g() {
        Date b11 = io.sentry.g.b();
        List<f> b12 = this.f39656a.b();
        if (b12.isEmpty()) {
            return null;
        }
        return new b(b11, b12);
    }
}