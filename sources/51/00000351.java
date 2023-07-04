package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<d1> f2286a;

    public e1(List<d1> list) {
        this.f2286a = new ArrayList(list);
    }

    public boolean a(Class<? extends d1> cls) {
        for (d1 d1Var : this.f2286a) {
            if (cls.isAssignableFrom(d1Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends d1> T b(Class<T> cls) {
        Iterator<d1> it2 = this.f2286a.iterator();
        while (it2.hasNext()) {
            T t11 = (T) it2.next();
            if (t11.getClass() == cls) {
                return t11;
            }
        }
        return null;
    }
}