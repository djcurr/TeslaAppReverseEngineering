package atd.l0;

import android.content.Context;
import com.adyen.threeds2.Warning;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final atd.m0.b f6894a;

    static {
        atd.s0.a.a(-789044285729344L);
        atd.s0.a.a(-789134480042560L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(atd.m0.b bVar) {
        this.f6894a = bVar;
    }

    @Override // atd.l0.f
    boolean b(Context context) {
        return this.f6894a.a(context);
    }

    @Override // atd.l0.f
    String c() {
        return atd.s0.a.a(-789456602589760L);
    }

    @Override // atd.l0.f
    String d() {
        return atd.s0.a.a(-789546796902976L);
    }

    @Override // atd.l0.f
    Warning.Severity e() {
        return Warning.Severity.HIGH;
    }
}