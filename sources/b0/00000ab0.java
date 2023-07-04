package atd.k;

import android.content.Context;
import android.os.Build;
import atd.i.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a extends d {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-74593655908928L);
    }

    @Override // atd.i.d
    protected List<String> b() {
        ArrayList arrayList = new ArrayList();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            arrayList.add(atd.s0.a.a(-74606540810816L));
        }
        if (i11 >= 26) {
            arrayList.add(atd.s0.a.a(-73717482580544L));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: d */
    public String c(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Build.getSerial();
        }
        return Build.SERIAL;
    }
}