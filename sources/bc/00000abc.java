package atd.l0;

import android.content.Context;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.internal.j;

/* loaded from: classes.dex */
abstract class f {
    final String a() {
        return a(c());
    }

    final String b() {
        return a(d());
    }

    abstract boolean b(Context context);

    abstract String c();

    abstract String d();

    abstract Warning.Severity e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j a(Context context) {
        if (b(context)) {
            return new j(a(), b(), e());
        }
        return null;
    }

    final String a(String str) {
        return atd.r0.g.a(str);
    }
}