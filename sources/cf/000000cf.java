package ak;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final SparseBooleanArray f518a = new SparseBooleanArray();

    public void a(int i11) {
        this.f518a.append(i11, true);
    }

    public boolean b(int i11) {
        return this.f518a.get(i11);
    }

    public boolean c(int... iArr) {
        for (int i11 : iArr) {
            if (b(i11)) {
                return true;
            }
        }
        return false;
    }

    public int d(int i11) {
        a.a(i11 >= 0 && i11 < e());
        return this.f518a.keyAt(i11);
    }

    public int e() {
        return this.f518a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f518a.equals(((s) obj).f518a);
        }
        return false;
    }

    public int hashCode() {
        return this.f518a.hashCode();
    }
}