package f;

import android.content.Context;
import android.content.Intent;
import f.a;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e extends a<String, Boolean> {
    @Override // f.a
    /* renamed from: a */
    public Intent createIntent(Context context, String input) {
        s.g(context, "context");
        s.g(input, "input");
        return d.f25475a.a(new String[]{input});
    }

    @Override // f.a
    /* renamed from: b */
    public a.C0496a<Boolean> getSynchronousResult(Context context, String input) {
        s.g(context, "context");
        s.g(input, "input");
        if (androidx.core.content.b.checkSelfPermission(context, input) == 0) {
            return new a.C0496a<>(Boolean.TRUE);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
        if (r5 == true) goto L7;
     */
    @Override // f.a
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean parseResult(int r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L2c
            r0 = -1
            if (r5 == r0) goto L6
            goto L2c
        L6:
            java.lang.String r5 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r5 = r6.getIntArrayExtra(r5)
            r6 = 1
            r0 = 0
            if (r5 != 0) goto L12
        L10:
            r6 = r0
            goto L27
        L12:
            int r1 = r5.length
            r2 = r0
        L14:
            if (r2 >= r1) goto L24
            r3 = r5[r2]
            if (r3 != 0) goto L1c
            r3 = r6
            goto L1d
        L1c:
            r3 = r0
        L1d:
            if (r3 == 0) goto L21
            r5 = r6
            goto L25
        L21:
            int r2 = r2 + 1
            goto L14
        L24:
            r5 = r0
        L25:
            if (r5 != r6) goto L10
        L27:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L2c:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.parseResult(int, android.content.Intent):java.lang.Boolean");
    }
}