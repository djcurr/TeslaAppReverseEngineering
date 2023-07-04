package rr;

import android.view.View;
import pr.a0;
import pr.b0;
import pr.l;

/* loaded from: classes2.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(View view) {
        a0<?> d11 = b0.d(view);
        Object c11 = d11 == null ? null : d11.c();
        l lVar = c11 == null ? null : (l) c11;
        String a11 = lVar != null ? lVar.a() : null;
        if (a11 != null) {
            return a11;
        }
        throw new IllegalStateException(("Expected " + view + " to be showing a " + ((Object) l.class.getSimpleName()) + "<*> rendering, found " + lVar).toString());
    }
}