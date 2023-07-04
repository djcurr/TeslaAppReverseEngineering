package atd.l0;

import android.content.Context;
import com.adyen.threeds2.Warning;

/* loaded from: classes.dex */
final class c extends f {

    /* renamed from: a  reason: collision with root package name */
    private final atd.m0.c f6895a;

    static {
        atd.s0.a.a(-787979133839936L);
        atd.s0.a.a(-788069328153152L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(atd.m0.c cVar) {
        this.f6895a = cVar;
    }

    @Override // atd.l0.f
    boolean b(Context context) {
        return this.f6895a.a();
    }

    @Override // atd.l0.f
    String c() {
        return atd.s0.a.a(-789181724682816L);
    }

    @Override // atd.l0.f
    String d() {
        return atd.s0.a.a(-789271918996032L);
    }

    @Override // atd.l0.f
    Warning.Severity e() {
        return Warning.Severity.HIGH;
    }
}