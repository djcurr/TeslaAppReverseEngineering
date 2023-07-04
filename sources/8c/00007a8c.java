package j$.time;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class a extends b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final k f32872a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(k kVar) {
        this.f32872a = kVar;
    }

    @Override // j$.time.b
    public long a() {
        return System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f32872a.equals(((a) obj).f32872a);
        }
        return false;
    }

    public int hashCode() {
        return this.f32872a.hashCode() + 1;
    }

    public String toString() {
        return "SystemClock[" + this.f32872a + "]";
    }
}