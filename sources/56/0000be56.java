package x1;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class i<T> {
    public static <T> ArrayList<T> a(ArrayList<T> backing) {
        kotlin.jvm.internal.s.g(backing, "backing");
        return backing;
    }

    public static /* synthetic */ ArrayList b(ArrayList arrayList, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return a(arrayList);
    }

    public static final int c(ArrayList<T> arg0) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        return arg0.size();
    }

    public static final T d(ArrayList<T> arg0) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        return arg0.get(c(arg0) - 1);
    }

    public static final T e(ArrayList<T> arg0) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        return arg0.remove(c(arg0) - 1);
    }

    public static final boolean f(ArrayList<T> arg0, T t11) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        return arg0.add(t11);
    }
}