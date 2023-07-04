package h0;

import androidx.camera.core.impl.d1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<d1> a() {
        ArrayList arrayList = new ArrayList();
        if (c.b()) {
            arrayList.add(new c());
        }
        if (d.a()) {
            arrayList.add(new d());
        }
        if (e.c()) {
            arrayList.add(new e());
        }
        return arrayList;
    }
}