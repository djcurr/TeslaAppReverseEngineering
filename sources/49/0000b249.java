package sc;

import java.util.ArrayList;
import sc.h;

/* loaded from: classes.dex */
public abstract class i<T extends h> extends c {

    /* renamed from: c  reason: collision with root package name */
    long f50347c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<T> f50348d;

    public i(bc.m mVar, a aVar) {
        super(mVar, aVar);
        this.f50347c = mVar.q();
        this.f50348d = new ArrayList<>((int) this.f50347c);
        for (int i11 = 0; i11 < this.f50347c; i11++) {
            this.f50348d.add(a(mVar));
        }
    }

    abstract T a(bc.m mVar);
}