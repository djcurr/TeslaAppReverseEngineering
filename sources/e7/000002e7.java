package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f2076a;

    /* renamed from: b  reason: collision with root package name */
    private final a.a f2077b;

    /* renamed from: c  reason: collision with root package name */
    private final PendingIntent f2078c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a.b bVar, a.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f2076a = bVar;
        this.f2077b = aVar;
        this.f2078c = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f2078c;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public boolean c(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f2076a.B(this.f2077b, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}