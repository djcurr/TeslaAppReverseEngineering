package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class o implements g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j$.time.temporal.u uVar, String str) {
    }

    @Override // j$.time.format.g
    public boolean c(q qVar, StringBuilder sb2) {
        j$.time.k kVar = (j$.time.k) qVar.f(a.f32890a);
        if (kVar == null) {
            return false;
        }
        sb2.append(kVar.h());
        return true;
    }

    public String toString() {
        return "ZoneRegionId()";
    }
}