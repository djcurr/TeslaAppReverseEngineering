package j$.time;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class l extends k {

    /* renamed from: b  reason: collision with root package name */
    private final String f32948b;

    /* renamed from: c  reason: collision with root package name */
    private final transient j$.time.zone.c f32949c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, j$.time.zone.c cVar) {
        this.f32948b = str;
        this.f32949c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l n(String str, boolean z11) {
        int length = str.length();
        if (length >= 2) {
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i11 == 0) && ((charAt < '0' || charAt > '9' || i11 == 0) && ((charAt != '~' || i11 == 0) && ((charAt != '.' || i11 == 0) && ((charAt != '_' || i11 == 0) && ((charAt != '+' || i11 == 0) && (charAt != '-' || i11 == 0))))))))) {
                    throw new c("Invalid ID for region-based ZoneId, invalid format: " + str);
                }
            }
            j$.time.zone.c cVar = null;
            try {
                cVar = j$.time.zone.g.a(str, true);
            } catch (j$.time.zone.d e11) {
                if (z11) {
                    throw e11;
                }
            }
            return new l(str, cVar);
        }
        throw new c("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    @Override // j$.time.k
    public String h() {
        return this.f32948b;
    }

    @Override // j$.time.k
    public j$.time.zone.c i() {
        j$.time.zone.c cVar = this.f32949c;
        return cVar != null ? cVar : j$.time.zone.g.a(this.f32948b, false);
    }
}