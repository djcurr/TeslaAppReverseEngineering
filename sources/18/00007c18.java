package js;

import hy.m;
import vz.p;
import zu.c0;

/* loaded from: classes6.dex */
public interface b {

    /* loaded from: classes6.dex */
    public static final class a {
        public static /* synthetic */ m a(b bVar, String str, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    str = null;
                }
                if ((i11 & 2) != 0) {
                    z11 = false;
                }
                return bVar.f(str, z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToken");
        }
    }

    String a();

    String b();

    m<p<c0<String>, Integer>> c(String str, String str2, String str3);

    String d();

    void e();

    m<k> f(String str, boolean z11);

    String getIssuer();
}