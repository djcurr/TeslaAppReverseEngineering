package fu;

import java.util.List;
import wz.v;

/* loaded from: classes6.dex */
public final class d implements com.tesla.TeslaV4.reactnative.module.e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f27031a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final List<a> f27032b;

    static {
        List<a> d11;
        d11 = v.d(new a());
        f27032b = d11;
    }

    private d() {
    }

    @Override // com.tesla.TeslaV4.reactnative.module.e
    public List<c> a() {
        return f27032b;
    }

    @Override // com.tesla.TeslaV4.reactnative.module.e
    public b b(double d11, double d12, double d13, double d14) {
        return b.DRIVE;
    }
}