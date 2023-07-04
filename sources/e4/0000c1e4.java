package y5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d implements b<Uri, Uri> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f59140a;

    public d(Context context) {
        s.g(context, "context");
        this.f59140a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    @Override // y5.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.net.Uri r4) {
        /*
            r3 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "android.resource"
            boolean r0 = kotlin.jvm.internal.s.c(r0, r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L36
            java.lang.String r0 = r4.getAuthority()
            if (r0 == 0) goto L22
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 == 0) goto L20
            goto L22
        L20:
            r0 = r2
            goto L23
        L22:
            r0 = r1
        L23:
            if (r0 != 0) goto L36
            java.util.List r4 = r4.getPathSegments()
            java.lang.String r0 = "data.pathSegments"
            kotlin.jvm.internal.s.f(r4, r0)
            int r4 = r4.size()
            r0 = 2
            if (r4 != r0) goto L36
            goto L37
        L36:
            r1 = r2
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.d.a(android.net.Uri):boolean");
    }

    @Override // y5.b
    /* renamed from: d */
    public Uri b(Uri data) {
        s.g(data, "data");
        String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = this.f59140a.getPackageManager().getResourcesForApplication(authority);
        s.f(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        List<String> pathSegments = data.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
            s.d(parse, "Uri.parse(this)");
            return parse;
        }
        throw new IllegalStateException(("Invalid android.resource URI: " + data).toString());
    }
}