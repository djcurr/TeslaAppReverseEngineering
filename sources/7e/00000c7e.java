package bi;

import android.util.SparseArray;
import java.util.HashMap;
import nh.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f7666a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<d, Integer> f7667b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f7667b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f7667b.put(d.VERY_LOW, 1);
        f7667b.put(d.HIGHEST, 2);
        for (d dVar : f7667b.keySet()) {
            f7666a.append(f7667b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f7667b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i11) {
        d dVar = f7666a.get(i11);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i11);
    }
}