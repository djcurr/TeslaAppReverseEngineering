package bb;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private Class<?> f7583a;

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f7584b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?> f7585c;

    public i() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f7583a = cls;
        this.f7584b = cls2;
        this.f7585c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f7583a.equals(iVar.f7583a) && this.f7584b.equals(iVar.f7584b) && k.d(this.f7585c, iVar.f7585c);
    }

    public int hashCode() {
        int hashCode = ((this.f7583a.hashCode() * 31) + this.f7584b.hashCode()) * 31;
        Class<?> cls = this.f7585c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f7583a + ", second=" + this.f7584b + CoreConstants.CURLY_RIGHT;
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}