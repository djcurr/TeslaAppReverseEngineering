package atd.l0;

import android.content.Context;
import com.adyen.threeds2.Warning;

/* loaded from: classes.dex */
final class d extends f {

    /* renamed from: a  reason: collision with root package name */
    private final atd.m0.f f6896a;

    static {
        atd.s0.a.a(-787244694432320L);
        atd.s0.a.a(-787060010838592L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(atd.m0.f fVar) {
        this.f6896a = fVar;
    }

    @Override // atd.l0.f
    boolean b(Context context) {
        return !this.f6896a.a(16);
    }

    @Override // atd.l0.f
    String c() {
        return atd.s0.a.a(-787326298810944L);
    }

    @Override // atd.l0.f
    String d() {
        return atd.s0.a.a(-787691371031104L);
    }

    @Override // atd.l0.f
    Warning.Severity e() {
        return Warning.Severity.HIGH;
    }
}