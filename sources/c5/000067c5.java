package ee;

import de.g;
import de.i;

/* loaded from: classes.dex */
public class b implements de.b {

    /* renamed from: a  reason: collision with root package name */
    private final i f25070a;

    /* renamed from: b  reason: collision with root package name */
    private final g f25071b;

    public b(i iVar, g gVar) {
        this.f25070a = iVar;
        this.f25071b = gVar;
    }

    @Override // de.b
    public void a(String str, int i11, boolean z11, String str2) {
        this.f25070a.p(i11);
        this.f25070a.y(str2);
        this.f25071b.b(this.f25070a, 1);
    }
}