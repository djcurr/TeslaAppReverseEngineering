package hp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, Integer> f29358a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int i11 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f29358a.entrySet()) {
            if (entry.getValue().intValue() > i11) {
                i11 = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i11) {
                arrayList.add(entry.getKey());
            }
        }
        return gp.a.b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i11) {
        Integer num = this.f29358a.get(Integer.valueOf(i11));
        if (num == null) {
            num = 0;
        }
        this.f29358a.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() + 1));
    }
}