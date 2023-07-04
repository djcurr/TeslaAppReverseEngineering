package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Map f32931a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f32931a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i11 = b.f32892c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = b.f32891b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((v) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = b.f32891b;
        Collections.sort(arrayList, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(long j11, v vVar) {
        Map map = (Map) this.f32931a.get(vVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j11));
        }
        return null;
    }
}