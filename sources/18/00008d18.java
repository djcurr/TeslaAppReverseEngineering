package nw;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes6.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f41930a;

    protected c(Context context, lw.a aVar) {
        this.f41930a = context;
    }

    public static b g(Context context) {
        return h(context, new lw.a());
    }

    public static b h(Context context, lw.a aVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof a) {
            return ((a) applicationContext).a(context, aVar);
        }
        return new c(context, aVar);
    }

    @Override // nw.b
    public void a() {
    }

    @Override // nw.b
    public void b(int i11) {
        ((NotificationManager) this.f41930a.getSystemService("notification")).cancel(i11);
    }

    @Override // nw.b
    public void c(Activity activity) {
    }

    @Override // nw.b
    public void d() {
    }

    @Override // nw.b
    public void e(String str, int i11) {
        ((NotificationManager) this.f41930a.getSystemService("notification")).cancel(str, i11);
    }

    @Override // nw.b
    public void f() {
        ((NotificationManager) this.f41930a.getSystemService("notification")).cancelAll();
    }
}