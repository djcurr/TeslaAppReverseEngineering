package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final v0 f16419a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final v0 f16420b = new w0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 a() {
        return f16419a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 b() {
        return f16420b;
    }

    private static v0 c() {
        try {
            return (v0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}