package f8;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import g8.c;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26094a = c.a.a("ch", "size", "w", "style", "fFamily", MessageExtension.FIELD_DATA);

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26095b = c.a.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a8.d a(g8.c cVar, v7.d dVar) {
        ArrayList arrayList = new ArrayList();
        cVar.j();
        String str = null;
        String str2 = null;
        double d11 = 0.0d;
        double d12 = 0.0d;
        char c11 = 0;
        while (cVar.p()) {
            int p02 = cVar.p0(f26094a);
            if (p02 == 0) {
                c11 = cVar.R().charAt(0);
            } else if (p02 == 1) {
                d11 = cVar.D();
            } else if (p02 == 2) {
                d12 = cVar.D();
            } else if (p02 == 3) {
                str = cVar.R();
            } else if (p02 == 4) {
                str2 = cVar.R();
            } else if (p02 != 5) {
                cVar.t0();
                cVar.u0();
            } else {
                cVar.j();
                while (cVar.p()) {
                    if (cVar.p0(f26095b) != 0) {
                        cVar.t0();
                        cVar.u0();
                    } else {
                        cVar.g();
                        while (cVar.p()) {
                            arrayList.add((c8.o) h.a(cVar, dVar));
                        }
                        cVar.l();
                    }
                }
                cVar.m();
            }
        }
        cVar.m();
        return new a8.d(arrayList, c11, d11, d12, str, str2);
    }
}