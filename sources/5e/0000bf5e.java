package xe;

import android.net.Uri;

/* loaded from: classes3.dex */
public abstract class f {
    public static <T> Uri a(T t11, T t12, T[] tArr, md.e<T, Uri> eVar) {
        Uri apply;
        Uri apply2;
        if (t11 == null || (apply2 = eVar.apply(t11)) == null) {
            if (tArr == null || tArr.length <= 0 || tArr[0] == null || (apply = eVar.apply(tArr[0])) == null) {
                if (t12 != null) {
                    return eVar.apply(t12);
                }
                return null;
            }
            return apply;
        }
        return apply2;
    }
}