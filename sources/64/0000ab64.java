package pr;

import android.view.View;

/* loaded from: classes2.dex */
public final class c {
    private static final h a(View view) {
        return (h) view.getTag(o.f46884a);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.activity.f b(android.content.Context r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.g(r2, r0)
        L5:
            boolean r0 = r2 instanceof androidx.activity.f
            r1 = 0
            if (r0 == 0) goto Le
            r1 = r2
            androidx.activity.f r1 = (androidx.activity.f) r1
            goto L1f
        Le:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L15
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 != 0) goto L19
            goto L1f
        L19:
            android.content.Context r2 = r2.getBaseContext()
            if (r2 != 0) goto L5
        L1f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pr.c.b(android.content.Context):androidx.activity.f");
    }

    public static final void c(View view, h00.a<vz.b0> aVar) {
        h hVar;
        kotlin.jvm.internal.s.g(view, "<this>");
        h a11 = a(view);
        if (a11 != null) {
            a11.c();
        }
        if (aVar == null) {
            hVar = null;
        } else {
            h hVar2 = new h(view, aVar);
            hVar2.b();
            hVar = hVar2;
        }
        view.setTag(o.f46884a, hVar);
    }
}