package ep;

import java.util.List;

/* loaded from: classes2.dex */
final class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static uo.a a(List<b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).d() == null) {
            size--;
        }
        uo.a aVar = new uo.a(size * 12);
        int i11 = 0;
        int b11 = list.get(0).d().b();
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & b11) != 0) {
                aVar.k(i11);
            }
            i11++;
        }
        for (int i13 = 1; i13 < list.size(); i13++) {
            b bVar = list.get(i13);
            int b12 = bVar.c().b();
            for (int i14 = 11; i14 >= 0; i14--) {
                if (((1 << i14) & b12) != 0) {
                    aVar.k(i11);
                }
                i11++;
            }
            if (bVar.d() != null) {
                int b13 = bVar.d().b();
                for (int i15 = 11; i15 >= 0; i15--) {
                    if (((1 << i15) & b13) != 0) {
                        aVar.k(i11);
                    }
                    i11++;
                }
            }
        }
        return aVar;
    }
}