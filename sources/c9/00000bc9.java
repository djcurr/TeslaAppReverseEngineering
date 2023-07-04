package b10;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class g {
    public static final c a(Annotation[] annotationArr, u10.c fqName) {
        Annotation annotation;
        kotlin.jvm.internal.s.g(annotationArr, "<this>");
        kotlin.jvm.internal.s.g(fqName, "fqName");
        int length = annotationArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i11];
            if (kotlin.jvm.internal.s.c(b.a(g00.a.b(g00.a.a(annotation))).b(), fqName)) {
                break;
            }
            i11++;
        }
        if (annotation == null) {
            return null;
        }
        return new c(annotation);
    }

    public static final List<c> b(Annotation[] annotationArr) {
        kotlin.jvm.internal.s.g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new c(annotation));
        }
        return arrayList;
    }
}