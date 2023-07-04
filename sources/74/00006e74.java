package fp;

import com.google.zxing.NotFoundException;

/* loaded from: classes2.dex */
abstract class f extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(uo.a aVar) {
        super(aVar);
    }

    @Override // fp.j
    public String d() {
        if (c().g() == 60) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 5);
            j(sb2, 45, 15);
            return sb2.toString();
        }
        throw NotFoundException.a();
    }
}