package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
class x implements p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final x f16418a = new x();

    private x() {
    }

    public static x a() {
        return f16418a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public boolean isSupported(Class<?> cls) {
        return y.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public o0 messageInfoFor(Class<?> cls) {
        if (y.class.isAssignableFrom(cls)) {
            try {
                return (o0) y.n(cls.asSubclass(y.class)).g();
            } catch (Exception e11) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e11);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }
}