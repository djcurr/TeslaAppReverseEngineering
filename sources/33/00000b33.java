package atd.v;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class t extends a0 {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.v.a0, atd.i.d
    public List<String> b() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_PHONE_STATE");
            arrayList.add("android.permission.READ_PRIVILEGED_PHONE_STATE");
            return Collections.unmodifiableList(arrayList);
        }
        return super.b();
    }
}