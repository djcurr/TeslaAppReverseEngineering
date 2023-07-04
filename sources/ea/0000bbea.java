package w10;

import java.util.Collection;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class i {
    public abstract void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar);

    public abstract void b(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);

    public abstract void c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);

    public void d(kotlin.reflect.jvm.internal.impl.descriptors.b member, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> overridden) {
        s.g(member, "member");
        s.g(overridden, "overridden");
        member.y0(overridden);
    }
}