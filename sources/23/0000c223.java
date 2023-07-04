package y7;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public class m extends a<c8.m, Path> {

    /* renamed from: i  reason: collision with root package name */
    private final c8.m f59292i;

    /* renamed from: j  reason: collision with root package name */
    private final Path f59293j;

    public m(List<i8.a<c8.m>> list) {
        super(list);
        this.f59292i = new c8.m();
        this.f59293j = new Path();
    }

    @Override // y7.a
    /* renamed from: p */
    public Path i(i8.a<c8.m> aVar, float f11) {
        this.f59292i.c(aVar.f30188b, aVar.f30189c, f11);
        h8.g.i(this.f59292i, this.f59293j);
        return this.f59293j;
    }
}