package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public class j0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f16325a;

    /* loaded from: classes3.dex */
    static class a<K, V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k11, V v11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void d(CodedOutputStream codedOutputStream, a<K, V> aVar, K k11, V v11) {
        throw null;
    }

    public int a(int i11, K k11, V v11) {
        return CodedOutputStream.U(i11) + CodedOutputStream.C(b(this.f16325a, k11, v11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f16325a;
    }
}