package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends l {
    @Override // androidx.work.l
    public e b(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e eVar : list) {
            hashMap.putAll(eVar.j());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}