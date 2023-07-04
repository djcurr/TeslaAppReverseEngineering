package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final char f32895a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(char c11) {
        this.f32895a = c11;
    }

    @Override // j$.time.format.g
    public boolean c(q qVar, StringBuilder sb2) {
        sb2.append(this.f32895a);
        return true;
    }

    public String toString() {
        if (this.f32895a == '\'') {
            return "''";
        }
        return "'" + this.f32895a + "'";
    }
}