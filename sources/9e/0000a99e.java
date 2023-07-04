package p20;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface b {

    /* loaded from: classes5.dex */
    public static final class a {
        public static String a(b bVar, kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            s.g(bVar, "this");
            s.g(functionDescriptor, "functionDescriptor");
            if (bVar.b(functionDescriptor)) {
                return null;
            }
            return bVar.getDescription();
        }
    }

    String a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    String getDescription();
}