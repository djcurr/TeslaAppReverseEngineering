package ln;

import android.content.Context;
import ul.q;

/* loaded from: classes2.dex */
public class h {

    /* loaded from: classes2.dex */
    public interface a<T> {
        String a(T t11);
    }

    public static ul.d<?> b(String str, String str2) {
        return ul.d.i(f.a(str, str2), f.class);
    }

    public static ul.d<?> c(final String str, final a<Context> aVar) {
        return ul.d.j(f.class).b(q.j(Context.class)).f(new ul.h() { // from class: ln.g
            @Override // ul.h
            public final Object a(ul.e eVar) {
                f d11;
                d11 = h.d(str, aVar, eVar);
                return d11;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, ul.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}