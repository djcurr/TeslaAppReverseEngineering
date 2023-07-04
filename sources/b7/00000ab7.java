package atd.l0;

import android.content.Context;
import com.adyen.threeds2.Warning;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final atd.m0.a f6893a;

    static {
        atd.s0.a.a(-790212516833856L);
        atd.s0.a.a(-790027833240128L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(atd.m0.a aVar) {
        this.f6893a = aVar;
    }

    @Override // atd.l0.f
    boolean b(Context context) {
        return this.f6893a.b(context);
    }

    @Override // atd.l0.f
    String c() {
        return atd.s0.a.a(-790693553171008L);
    }

    @Override // atd.l0.f
    String d() {
        return atd.s0.a.a(-790783747484224L);
    }

    @Override // atd.l0.f
    Warning.Severity e() {
        return Warning.Severity.MEDIUM;
    }
}