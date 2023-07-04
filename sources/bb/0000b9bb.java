package v70;

/* loaded from: classes5.dex */
public class j implements r70.k {

    /* renamed from: a  reason: collision with root package name */
    private k f54358a;

    /* renamed from: b  reason: collision with root package name */
    private k f54359b;

    /* renamed from: c  reason: collision with root package name */
    private l f54360c;

    public l a() {
        return this.f54360c;
    }

    public k b() {
        return this.f54358a;
    }

    public void c(k kVar) {
        this.f54358a = kVar;
    }

    @Override // r70.k
    public Object clone() {
        j jVar = new j();
        jVar.f54360c = this.f54360c;
        k kVar = this.f54358a;
        if (kVar != null) {
            jVar.c((k) kVar.clone());
        }
        k kVar2 = this.f54359b;
        if (kVar2 != null) {
            jVar.d((k) kVar2.clone());
        }
        return jVar;
    }

    public void d(k kVar) {
        this.f54359b = kVar;
    }

    @Override // r70.k
    public boolean match(Object obj) {
        try {
            if (obj instanceof l) {
                l lVar = (l) obj;
                k kVar = this.f54358a;
                if (kVar == null || kVar.match((Object) lVar.a())) {
                    k kVar2 = this.f54359b;
                    if (kVar2 == null || kVar2.match((Object) lVar.b())) {
                        l lVar2 = this.f54360c;
                        if (lVar2 != null) {
                            return lVar2.equals(obj);
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}