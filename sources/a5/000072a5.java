package h5;

import android.content.Context;
import android.os.Build;
import androidx.work.r;
import k5.p;

/* loaded from: classes.dex */
public class d extends c<g5.b> {
    public d(Context context, m5.a aVar) {
        super(i5.g.c(context, aVar).d());
    }

    @Override // h5.c
    boolean b(p pVar) {
        return pVar.f34414j.b() == r.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h5.c
    /* renamed from: i */
    public boolean c(g5.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.d()) ? false : true;
        }
        return !bVar.a();
    }
}