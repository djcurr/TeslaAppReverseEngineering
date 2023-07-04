package m7;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f38435a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f38436b = Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f38437c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<com.adyen.checkout.core.api.d> f38438d;

    static {
        List<com.adyen.checkout.core.api.d> l11;
        Pattern.compile("^\\D*(\\d\\D*){9,14}$");
        f38437c = Pattern.compile("([a-z]){4}\\_([A-z]|\\d){32}");
        l11 = w.l(com.adyen.checkout.core.api.d.f9584g, com.adyen.checkout.core.api.d.f9582e, com.adyen.checkout.core.api.d.f9580c, com.adyen.checkout.core.api.d.f9583f, com.adyen.checkout.core.api.d.f9581d);
        f38438d = l11;
    }

    private d() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r4 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r6 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r6, com.adyen.checkout.core.api.d r7) {
        /*
            r5 = this;
            java.lang.String r0 = "clientKey"
            kotlin.jvm.internal.s.g(r6, r0)
            java.lang.String r0 = "environment"
            kotlin.jvm.internal.s.g(r7, r0)
            com.adyen.checkout.core.api.d r0 = com.adyen.checkout.core.api.d.f9579b
            boolean r0 = kotlin.jvm.internal.s.c(r7, r0)
            java.util.List<com.adyen.checkout.core.api.d> r1 = m7.d.f38438d
            boolean r7 = r1.contains(r7)
            r1 = 0
            r2 = 2
            r3 = 0
            if (r7 == 0) goto L23
            java.lang.String r4 = "live_"
            boolean r4 = kotlin.text.m.H(r6, r4, r3, r2, r1)
            if (r4 != 0) goto L31
        L23:
            if (r0 == 0) goto L2d
            java.lang.String r4 = "test_"
            boolean r6 = kotlin.text.m.H(r6, r4, r3, r2, r1)
            if (r6 != 0) goto L31
        L2d:
            if (r7 != 0) goto L32
            if (r0 != 0) goto L32
        L31:
            r3 = 1
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.d.a(java.lang.String, com.adyen.checkout.core.api.d):boolean");
    }

    public final boolean b(String clientKey) {
        s.g(clientKey, "clientKey");
        return f38437c.matcher(clientKey).matches();
    }

    public final boolean c(String emailAddress) {
        s.g(emailAddress, "emailAddress");
        return f38436b.matcher(emailAddress).matches();
    }
}