package wz;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class a0 extends z {
    public static <T extends Comparable<? super T>> void x(List<T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void y(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.g(list, "<this>");
        kotlin.jvm.internal.s.g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}