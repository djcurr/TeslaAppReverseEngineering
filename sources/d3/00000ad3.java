package atd.m;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class l implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public String a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + atd.s0.a.a(-71874941610560L) + displayMetrics.heightPixels;
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-71862056708672L);
    }
}