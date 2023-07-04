package w6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55654a;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f55655a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.COUNTRY.ordinal()] = 1;
            iArr[c.STATE.ordinal()] = 2;
            f55655a = iArr;
        }
    }

    static {
        String c11 = o7.a.c();
        s.f(c11, "getTag()");
        f55654a = c11;
    }

    public static final String b(com.adyen.checkout.core.api.d environment, c dataType, String localeString, String str) {
        s.g(environment, "environment");
        s.g(dataType, "dataType");
        s.g(localeString, "localeString");
        int i11 = a.f55655a[dataType.ordinal()];
        if (i11 == 1) {
            return environment.a() + "datasets/" + dataType.getPathParam() + '/' + localeString + ".json";
        } else if (i11 == 2) {
            return environment.a() + "datasets/" + dataType.getPathParam() + '/' + ((Object) str) + '/' + localeString + ".json";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}