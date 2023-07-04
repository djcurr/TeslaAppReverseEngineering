package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    private final String f32919a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str) {
        this.f32919a = str;
    }

    @Override // j$.time.format.g
    public boolean c(q qVar, StringBuilder sb2) {
        sb2.append(this.f32919a);
        return true;
    }

    public String toString() {
        String replace = this.f32919a.replace("'", "''");
        return "'" + replace + "'";
    }
}