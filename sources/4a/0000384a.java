package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
final class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static final l0 f16349a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final l0 f16350b = new m0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0 a() {
        return f16349a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0 b() {
        return f16350b;
    }

    private static l0 c() {
        try {
            return (l0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}