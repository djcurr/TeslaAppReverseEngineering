package d50;

/* loaded from: classes5.dex */
public class b extends c {
    public static final c50.e Q = new b();

    @Override // d50.a, c50.e
    public boolean a(c50.c cVar, c50.c cVar2) {
        c50.b[] i11 = cVar.i();
        c50.b[] i12 = cVar2.i();
        if (i11.length != i12.length) {
            return false;
        }
        for (int i13 = 0; i13 != i11.length; i13++) {
            if (!i(i11[i13], i12[i13])) {
                return false;
            }
        }
        return true;
    }
}