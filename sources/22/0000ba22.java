package vl;

import android.os.Bundle;
import java.util.Locale;
import sl.a;

/* loaded from: classes3.dex */
class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private xl.b f54524a;

    /* renamed from: b  reason: collision with root package name */
    private xl.b f54525b;

    private static void b(xl.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.g(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        xl.b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f54524a;
        } else {
            bVar = this.f54525b;
        }
        b(bVar, str, bundle);
    }

    @Override // sl.a.b
    public void a(int i11, Bundle bundle) {
        String string;
        wl.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i11), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(xl.b bVar) {
        this.f54525b = bVar;
    }

    public void e(xl.b bVar) {
        this.f54524a = bVar;
    }
}