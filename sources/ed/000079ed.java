package io.sentry;

import com.stripe.android.core.networking.NetworkConstantsKt;
import java.net.URI;
import java.util.HashMap;

/* loaded from: classes5.dex */
final class s1 {

    /* renamed from: a  reason: collision with root package name */
    private final g3 f32605a;

    public s1(g3 g3Var) {
        this.f32605a = (g3) rz.j.a(g3Var, "options is required");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r1 a() {
        URI c11;
        String str;
        k kVar = new k(this.f32605a.getDsn());
        String uri = kVar.c().resolve(c11.getPath() + "/envelope/").toString();
        String a11 = kVar.a();
        String b11 = kVar.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f32605a.getSentryClientName());
        sb2.append(",sentry_key=");
        sb2.append(a11);
        if (b11 == null || b11.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + b11;
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        String sentryClientName = this.f32605a.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put(NetworkConstantsKt.HEADER_USER_AGENT, sentryClientName);
        hashMap.put("X-Sentry-Auth", sb3);
        return new r1(uri, hashMap);
    }
}