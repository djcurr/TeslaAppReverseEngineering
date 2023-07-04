package p1;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.s;
import t1.v0;
import vz.o;

/* loaded from: classes.dex */
public final class c {
    public static final void a(a aVar, SparseArray<AutofillValue> values) {
        s.g(aVar, "<this>");
        s.g(values, "values");
        int size = values.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            int keyAt = values.keyAt(i11);
            AutofillValue value = values.get(keyAt);
            f fVar = f.f45456a;
            s.f(value, "value");
            if (fVar.d(value)) {
                aVar.b().b(keyAt, fVar.i(value).toString());
            } else if (!fVar.b(value)) {
                if (!fVar.c(value)) {
                    if (fVar.e(value)) {
                        throw new o(s.p("An operation is not implemented: ", "b/138604541:  Add onFill() callback for toggle"));
                    }
                } else {
                    throw new o(s.p("An operation is not implemented: ", "b/138604541: Add onFill() callback for list"));
                }
            } else {
                throw new o(s.p("An operation is not implemented: ", "b/138604541: Add onFill() callback for date"));
            }
            i11 = i12;
        }
    }

    public static final void b(a aVar, ViewStructure root) {
        Rect a11;
        s.g(aVar, "<this>");
        s.g(root, "root");
        int a12 = e.f45455a.a(root, aVar.b().a().size());
        for (Map.Entry<Integer, h> entry : aVar.b().a().entrySet()) {
            int intValue = entry.getKey().intValue();
            h value = entry.getValue();
            e eVar = e.f45455a;
            ViewStructure b11 = eVar.b(root, a12);
            if (b11 != null) {
                f fVar = f.f45456a;
                AutofillId a13 = fVar.a(root);
                s.e(a13);
                fVar.g(b11, a13, intValue);
                eVar.d(b11, intValue, aVar.c().getContext().getPackageName(), null, null);
                fVar.h(b11, 1);
                List<j> a14 = value.a();
                ArrayList arrayList = new ArrayList(a14.size());
                int size = a14.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(b.a(a14.get(i11)));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fVar.f(b11, (String[]) array);
                if (value.b() == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                s1.h b12 = value.b();
                if (b12 != null && (a11 = v0.a(b12)) != null) {
                    e.f45455a.c(b11, a11.left, a11.top, 0, 0, a11.width(), a11.height());
                }
            }
            a12++;
        }
    }
}