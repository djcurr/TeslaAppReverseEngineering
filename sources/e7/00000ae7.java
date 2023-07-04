package atd.p;

import android.content.Context;
import android.content.pm.FeatureInfo;

/* loaded from: classes.dex */
public class d extends a {
    @Override // atd.i.b
    /* renamed from: c */
    public Integer a(Context context) {
        FeatureInfo[] systemAvailableFeatures = b(context).getSystemAvailableFeatures();
        return Integer.valueOf(systemAvailableFeatures != null ? systemAvailableFeatures.length : 0);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-71174861941312L);
    }
}