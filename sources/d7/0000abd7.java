package pw;

import android.content.Context;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.o;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.tesla.logging.g;
import lw.e;

/* loaded from: classes6.dex */
public class b implements c {

    /* renamed from: c  reason: collision with root package name */
    protected static String f47003c;

    /* renamed from: a  reason: collision with root package name */
    protected final Context f47004a;

    /* renamed from: b  reason: collision with root package name */
    protected final e f47005b;

    protected b(Context context) {
        g.g("ReactNativeNotifs");
        if (context instanceof o) {
            this.f47005b = new e();
            this.f47004a = context;
            return;
        }
        throw new IllegalStateException("Application instance isn't a react-application");
    }

    public static c f(Context context) {
        return new b(context.getApplicationContext());
    }

    @Override // pw.c
    public void a() {
        synchronized (this.f47004a) {
            if (f47003c == null) {
                g();
            } else {
                h();
            }
        }
    }

    @Override // pw.c
    public void b() {
        synchronized (this.f47004a) {
            g();
        }
    }

    @Override // pw.c
    public void c(String str) {
        f47003c = str;
        h();
    }

    @Override // pw.c
    public void d() {
        synchronized (this.f47004a) {
            if (f47003c == null) {
                g();
            } else {
                h();
            }
        }
    }

    @Override // pw.c
    public void e() {
        f47003c = null;
    }

    protected void g() {
        FirebaseMessaging.o().r().addOnSuccessListener(new OnSuccessListener() { // from class: pw.a
            {
                b.this = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                b.this.c((String) obj);
            }
        });
    }

    protected void h() {
        ReactContext A = ((o) this.f47004a).c().getReactInstanceManager().A();
        if (A != null && A.hasActiveCatalystInstance()) {
            Bundle bundle = new Bundle();
            bundle.putString("deviceToken", f47003c);
            this.f47005b.b("remoteNotificationsRegistered", bundle, A);
        }
        ow.b.e(this.f47004a, f47003c);
    }
}