package f2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface z {

    /* loaded from: classes.dex */
    public static final class a {
        public static int a(z zVar, k receiver, List<? extends j> measurables, int i11) {
            kotlin.jvm.internal.s.g(zVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(new f(measurables.get(i12), l.Max, m.Height));
            }
            return zVar.b(new n(receiver, receiver.getLayoutDirection()), arrayList, x2.c.b(0, i11, 0, 0, 13, null)).getHeight();
        }

        public static int b(z zVar, k receiver, List<? extends j> measurables, int i11) {
            kotlin.jvm.internal.s.g(zVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(new f(measurables.get(i12), l.Max, m.Width));
            }
            return zVar.b(new n(receiver, receiver.getLayoutDirection()), arrayList, x2.c.b(0, 0, 0, i11, 7, null)).getWidth();
        }

        public static int c(z zVar, k receiver, List<? extends j> measurables, int i11) {
            kotlin.jvm.internal.s.g(zVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(new f(measurables.get(i12), l.Min, m.Height));
            }
            return zVar.b(new n(receiver, receiver.getLayoutDirection()), arrayList, x2.c.b(0, i11, 0, 0, 13, null)).getHeight();
        }

        public static int d(z zVar, k receiver, List<? extends j> measurables, int i11) {
            kotlin.jvm.internal.s.g(zVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(new f(measurables.get(i12), l.Min, m.Width));
            }
            return zVar.b(new n(receiver, receiver.getLayoutDirection()), arrayList, x2.c.b(0, 0, 0, i11, 7, null)).getWidth();
        }
    }

    int a(k kVar, List<? extends j> list, int i11);

    a0 b(b0 b0Var, List<? extends y> list, long j11);

    int c(k kVar, List<? extends j> list, int i11);

    int d(k kVar, List<? extends j> list, int i11);

    int e(k kVar, List<? extends j> list, int i11);
}