package r0;

import androidx.compose.foundation.lazy.layout.LazyLayoutPlaceable;
import f2.v0;
import f2.y;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final f f48888a;

    /* renamed from: b  reason: collision with root package name */
    private final c f48889b;

    /* renamed from: c  reason: collision with root package name */
    private final v0 f48890c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<Integer, LazyLayoutPlaceable[]> f48891d;

    public k(f itemsProvider, c itemContentFactory, v0 subcomposeMeasureScope) {
        kotlin.jvm.internal.s.g(itemsProvider, "itemsProvider");
        kotlin.jvm.internal.s.g(itemContentFactory, "itemContentFactory");
        kotlin.jvm.internal.s.g(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.f48888a = itemsProvider;
        this.f48889b = itemContentFactory;
        this.f48890c = subcomposeMeasureScope;
        this.f48891d = new HashMap<>();
    }

    public final j[] a(int i11, long j11) {
        j[] jVarArr = this.f48891d.get(Integer.valueOf(i11));
        if (jVarArr != null) {
            return jVarArr;
        }
        Object d11 = this.f48888a.d(i11);
        List<y> F = this.f48890c.F(d11, this.f48889b.d(i11, d11));
        int size = F.size();
        LazyLayoutPlaceable[] lazyLayoutPlaceableArr = new j[size];
        for (int i12 = 0; i12 < size; i12++) {
            y yVar = F.get(i12);
            lazyLayoutPlaceableArr[i12] = new j(yVar.X(j11), yVar.t());
        }
        this.f48891d.put(Integer.valueOf(i11), lazyLayoutPlaceableArr);
        return lazyLayoutPlaceableArr;
    }
}