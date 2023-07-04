package h5;

import android.content.Context;
import android.os.Build;
import androidx.work.q;
import androidx.work.r;
import k5.p;

/* loaded from: classes.dex */
public class f extends c<g5.b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f28893e = q.f("NetworkNotRoamingCtrlr");

    public f(Context context, m5.a aVar) {
        super(i5.g.c(context, aVar).d());
    }

    @Override // h5.c
    boolean b(p pVar) {
        return pVar.f34414j.b() == r.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h5.c
    /* renamed from: i */
    public boolean c(g5.b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (bVar.a() && bVar.c()) ? false : true;
        }
        q.c().a(f28893e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}