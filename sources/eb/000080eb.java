package ku;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35882a;

        static {
            int[] iArr = new int[tt.e.values().length];
            iArr[tt.e.GET.ordinal()] = 1;
            iArr[tt.e.PUT.ordinal()] = 2;
            iArr[tt.e.POST.ordinal()] = 3;
            iArr[tt.e.DELETE.ordinal()] = 4;
            iArr[tt.e.HEAD.ordinal()] = 5;
            iArr[tt.e.PATCH.ordinal()] = 6;
            iArr[tt.e.OPTIONS.ordinal()] = 7;
            iArr[tt.e.TRACE.ordinal()] = 8;
            iArr[tt.e.CONNECT.ordinal()] = 9;
            f35882a = iArr;
        }
    }

    public static final String a(tt.e eVar) {
        s.g(eVar, "<this>");
        switch (a.f35882a[eVar.ordinal()]) {
            case 1:
                return "GET";
            case 2:
                return "PUT";
            case 3:
                return "POST";
            case 4:
                return "DELETE";
            case 5:
                return "HEAD";
            case 6:
                return "PATCH";
            case 7:
                return "OPTIONS";
            case 8:
                return "TRACE";
            case 9:
                return "CONNECT";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}