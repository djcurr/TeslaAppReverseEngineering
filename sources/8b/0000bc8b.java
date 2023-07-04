package wc;

import expo.modules.constants.ExponentInstallationId;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public long f55747a;

    /* renamed from: b  reason: collision with root package name */
    public String f55748b;

    /* renamed from: c  reason: collision with root package name */
    public String f55749c;

    public b(bc.m mVar) {
        this.f55747a = mVar.q();
        this.f55748b = mVar.m(4);
        long j11 = this.f55747a;
        if (j11 == 1) {
            this.f55747a = mVar.g();
        } else if (j11 == 0) {
            this.f55747a = -1L;
        }
        if (this.f55748b.equals(ExponentInstallationId.LEGACY_UUID_KEY)) {
            this.f55749c = mVar.m(16);
        }
    }

    public b(b bVar) {
        this.f55747a = bVar.f55747a;
        this.f55748b = bVar.f55748b;
        this.f55749c = bVar.f55749c;
    }
}