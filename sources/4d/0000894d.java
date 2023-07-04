package n2;

import java.util.ArrayList;
import java.util.List;
import n2.a;

/* loaded from: classes.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<a.b<p>> b(List<a.b<p>> list, int i11, int i12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            a.b<p> bVar = list.get(i13);
            a.b<p> bVar2 = bVar;
            if (b.g(i11, i12, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
            i13 = i14;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            int i16 = i15 + 1;
            a.b bVar3 = (a.b) arrayList.get(i15);
            if (i11 <= bVar3.f() && bVar3.d() <= i12) {
                arrayList2.add(new a.b(bVar3.e(), bVar3.f() - i11, bVar3.d() - i11));
                i15 = i16;
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}