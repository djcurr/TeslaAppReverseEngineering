package b10;

import b10.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class h extends d implements l10.e {

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f7298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u10.f fVar, Object[] values) {
        super(fVar, null);
        kotlin.jvm.internal.s.g(values, "values");
        this.f7298c = values;
    }

    @Override // l10.e
    public List<d> c() {
        Object[] objArr = this.f7298c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            d.a aVar = d.f7295b;
            kotlin.jvm.internal.s.e(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}