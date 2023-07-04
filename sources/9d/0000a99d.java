package p20;

import java.util.List;
import kotlin.jvm.internal.s;
import p20.c;

/* loaded from: classes5.dex */
public abstract class a {
    public final c a(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        s.g(functionDescriptor, "functionDescriptor");
        for (d dVar : b()) {
            if (dVar.b(functionDescriptor)) {
                return dVar.a(functionDescriptor);
            }
        }
        return c.a.f45899b;
    }

    public abstract List<d> b();
}