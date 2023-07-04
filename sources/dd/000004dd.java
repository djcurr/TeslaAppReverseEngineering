package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class u1 implements u20.h<t1> {

    /* renamed from: a  reason: collision with root package name */
    private final List<t1> f3119a = new ArrayList();

    public final void b(String name, Object obj) {
        kotlin.jvm.internal.s.g(name, "name");
        this.f3119a.add(new t1(name, obj));
    }

    @Override // u20.h
    public Iterator<t1> iterator() {
        return this.f3119a.iterator();
    }
}