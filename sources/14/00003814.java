package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface f1<T> {
    void a(T t11, byte[] bArr, int i11, int i12, e.b bVar);

    void b(T t11, e1 e1Var, p pVar);

    void c(T t11, s1 s1Var);

    boolean equals(T t11, T t12);

    int getSerializedSize(T t11);

    int hashCode(T t11);

    boolean isInitialized(T t11);

    void makeImmutable(T t11);

    void mergeFrom(T t11, T t12);

    T newInstance();
}