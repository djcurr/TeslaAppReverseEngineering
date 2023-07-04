package atd.m;

import android.content.Context;
import atd.i.c;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes.dex */
public final class a implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public String a(Context context) {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
        } catch (Throwable th2) {
            throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, th2);
        }
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-73958000749120L);
    }
}