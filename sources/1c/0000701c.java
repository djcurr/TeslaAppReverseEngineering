package g6;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.s;
import vz.p;

/* loaded from: classes.dex */
public final class b {
    public static final Object a(r5.b mapData, Object data) {
        s.g(mapData, "$this$mapData");
        s.g(data, "data");
        List<p<y5.b<? extends Object, ?>, Class<? extends Object>>> d11 = mapData.d();
        int size = d11.size();
        for (int i11 = 0; i11 < size; i11++) {
            p<y5.b<? extends Object, ?>, Class<? extends Object>> pVar = d11.get(i11);
            y5.b<? extends Object, ?> a11 = pVar.a();
            if (pVar.b().isAssignableFrom(data.getClass())) {
                Objects.requireNonNull(a11, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                if (a11.a(data)) {
                    data = a11.b(data);
                }
            }
        }
        return data;
    }

    public static final <T> v5.f b(r5.b requireDecoder, T data, okio.h source, String str) {
        v5.f fVar;
        s.g(requireDecoder, "$this$requireDecoder");
        s.g(data, "data");
        s.g(source, "source");
        List<v5.f> a11 = requireDecoder.a();
        int size = a11.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                fVar = null;
                break;
            }
            fVar = a11.get(i11);
            if (fVar.b(source, str)) {
                break;
            }
            i11++;
        }
        v5.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2;
        }
        throw new IllegalStateException(("Unable to decode data. No decoder supports: " + data).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[LOOP:0: B:3:0x0014->B:12:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[EDGE_INSN: B:20:0x0048->B:14:0x0048 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> w5.g<T> c(r5.b r7, T r8) {
        /*
            java.lang.String r0 = "$this$requireFetcher"
            kotlin.jvm.internal.s.g(r7, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.s.g(r8, r0)
            java.util.List r7 = r7.b()
            int r0 = r7.size()
            r1 = 0
            r2 = r1
        L14:
            if (r2 >= r0) goto L47
            java.lang.Object r3 = r7.get(r2)
            r4 = r3
            vz.p r4 = (vz.p) r4
            java.lang.Object r5 = r4.a()
            w5.g r5 = (w5.g) r5
            java.lang.Object r4 = r4.b()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class r6 = r8.getClass()
            boolean r4 = r4.isAssignableFrom(r6)
            if (r4 == 0) goto L40
            java.lang.String r4 = "null cannot be cast to non-null type coil.fetch.Fetcher<kotlin.Any>"
            java.util.Objects.requireNonNull(r5, r4)
            boolean r4 = r5.a(r8)
            if (r4 == 0) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = r1
        L41:
            if (r4 == 0) goto L44
            goto L48
        L44:
            int r2 = r2 + 1
            goto L14
        L47:
            r3 = 0
        L48:
            vz.p r3 = (vz.p) r3
            if (r3 == 0) goto L58
            java.lang.Object r7 = r3.c()
            java.lang.String r8 = "null cannot be cast to non-null type coil.fetch.Fetcher<T>"
            java.util.Objects.requireNonNull(r7, r8)
            w5.g r7 = (w5.g) r7
            return r7
        L58:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unable to fetch data. No fetcher supports: "
            r7.append(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.b.c(r5.b, java.lang.Object):w5.g");
    }
}