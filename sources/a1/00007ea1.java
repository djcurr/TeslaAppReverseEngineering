package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public enum c {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    public boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}