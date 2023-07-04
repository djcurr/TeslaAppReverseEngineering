package qr;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.savedstate.c;
import androidx.savedstate.d;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48434a = new a();

    private a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T b(android.content.Context r3, n00.d<T> r4) {
        /*
            r2 = this;
        L0:
            boolean r0 = r4.m(r3)
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object r1 = n00.e.a(r4, r3)
            goto L1d
        Lc:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            goto L14
        L13:
            r3 = r1
        L14:
            if (r3 != 0) goto L17
            goto L1d
        L17:
            android.content.Context r3 = r3.getBaseContext()
            if (r3 != 0) goto L0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.a.b(android.content.Context, n00.d):java.lang.Object");
    }

    public final v a(View view) {
        s.g(view, "view");
        v a11 = v0.a(view);
        if (a11 == null) {
            Context context = view.getContext();
            s.f(context, "view.context");
            return (v) b(context, m0.b(v.class));
        }
        return a11;
    }

    public final c c(View view) {
        s.g(view, "view");
        c a11 = d.a(view);
        if (a11 == null) {
            Context context = view.getContext();
            s.f(context, "view.context");
            return (c) b(context, m0.b(c.class));
        }
        return a11;
    }
}