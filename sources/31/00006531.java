package d40;

/* loaded from: classes5.dex */
abstract class a extends d {

    /* renamed from: i  reason: collision with root package name */
    Class[] f23574i;

    /* renamed from: j  reason: collision with root package name */
    Class[] f23575j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i11, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i11, str, cls);
        this.f23574i = clsArr;
        this.f23575j = clsArr2;
    }

    public Class[] l() {
        if (this.f23575j == null) {
            this.f23575j = e(5);
        }
        return this.f23575j;
    }

    public Class[] m() {
        if (this.f23574i == null) {
            this.f23574i = e(3);
        }
        return this.f23574i;
    }
}