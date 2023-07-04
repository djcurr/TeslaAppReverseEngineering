package wn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class h extends vn.f {
    public List<k> f() {
        List<vn.c> d11 = d();
        ArrayList arrayList = new ArrayList();
        Iterator<vn.c> it2 = d11.iterator();
        while (it2.hasNext()) {
            arrayList.add((k) it2.next());
        }
        return arrayList;
    }
}