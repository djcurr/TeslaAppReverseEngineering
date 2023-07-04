package t;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class p0 implements androidx.camera.core.impl.p {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, t1> f51123a;

    /* renamed from: b  reason: collision with root package name */
    private final b f51124b;

    public p0(Context context, Object obj, Set<String> set) {
        this(context, new b() { // from class: t.o0
            @Override // t.b
            public final boolean a(int i11, int i12) {
                return CamcorderProfile.hasProfile(i11, i12);
            }
        }, obj, set);
    }

    private void c(Context context, u.j jVar, Set<String> set) {
        v3.h.f(context);
        for (String str : set) {
            this.f51123a.put(str, new t1(context, str, jVar, this.f51124b));
        }
    }

    @Override // androidx.camera.core.impl.p
    public androidx.camera.core.impl.j1 a(String str, int i11, Size size) {
        t1 t1Var = this.f51123a.get(str);
        if (t1Var != null) {
            return t1Var.J(i11, size);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.p
    public Map<androidx.camera.core.impl.p1<?>, Size> b(String str, List<androidx.camera.core.impl.j1> list, List<androidx.camera.core.impl.p1<?>> list2) {
        v3.h.b(!list2.isEmpty(), "No new use cases to be bound.");
        ArrayList arrayList = new ArrayList(list);
        for (androidx.camera.core.impl.p1<?> p1Var : list2) {
            arrayList.add(a(str, p1Var.getInputFormat(), new Size(640, 480)));
        }
        t1 t1Var = this.f51123a.get(str);
        if (t1Var != null) {
            if (t1Var.b(arrayList)) {
                return t1Var.x(list, list2);
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + str + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    p0(Context context, b bVar, Object obj, Set<String> set) {
        u.j a11;
        this.f51123a = new HashMap();
        v3.h.f(bVar);
        this.f51124b = bVar;
        if (obj instanceof u.j) {
            a11 = (u.j) obj;
        } else {
            a11 = u.j.a(context);
        }
        c(context, a11, set);
    }
}