package y7;

import java.util.List;

/* loaded from: classes.dex */
public class e extends g<c8.d> {

    /* renamed from: i  reason: collision with root package name */
    private final c8.d f59280i;

    public e(List<i8.a<c8.d>> list) {
        super(list);
        c8.d dVar = list.get(0).f30188b;
        int c11 = dVar != null ? dVar.c() : 0;
        this.f59280i = new c8.d(new float[c11], new int[c11]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y7.a
    /* renamed from: p */
    public c8.d i(i8.a<c8.d> aVar, float f11) {
        this.f59280i.d(aVar.f30188b, aVar.f30189c, f11);
        return this.f59280i;
    }
}