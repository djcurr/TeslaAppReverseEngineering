package atd.o;

import android.content.Context;
import android.os.Build;
import atd.i.b;

/* loaded from: classes.dex */
public class a implements b {
    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Integer.valueOf(context.getResources().getConfiguration().getLocales().size());
        }
        return 1;
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-71101847497280L);
    }
}