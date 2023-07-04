package d40;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class e extends a implements b40.a {

    /* renamed from: k  reason: collision with root package name */
    Class f23588k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i11, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i11, str, cls, clsArr, strArr, clsArr2);
        this.f23588k = cls2;
    }

    @Override // d40.f
    protected String a(h hVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(hVar.e(i()));
        if (hVar.f23604b) {
            stringBuffer.append(hVar.g(n()));
        }
        if (hVar.f23604b) {
            stringBuffer.append(" ");
        }
        stringBuffer.append(hVar.f(f(), g()));
        stringBuffer.append(".");
        stringBuffer.append(j());
        hVar.a(stringBuffer, m());
        hVar.b(stringBuffer, l());
        return stringBuffer.toString();
    }

    public Class n() {
        if (this.f23588k == null) {
            this.f23588k = d(6);
        }
        return this.f23588k;
    }
}