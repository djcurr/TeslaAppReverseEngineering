package w;

import androidx.camera.core.impl.e1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d {
    public static e1 a(String str, u.d dVar) {
        ArrayList arrayList = new ArrayList();
        if (a.c(dVar)) {
            arrayList.add(new a(dVar));
        }
        if (b.b(dVar)) {
            arrayList.add(new b());
        }
        if (k.a(dVar)) {
            arrayList.add(new k());
        }
        if (j.a(dVar)) {
            arrayList.add(new j());
        }
        if (c.a(dVar)) {
            arrayList.add(new c());
        }
        return new e1(arrayList);
    }
}