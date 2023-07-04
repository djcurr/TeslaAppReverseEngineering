package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface Schema<T> {
    boolean equals(T t11, T t12);

    int getSerializedSize(T t11);

    int hashCode(T t11);

    boolean isInitialized(T t11);

    void makeImmutable(T t11);

    void mergeFrom(T t11, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    void mergeFrom(T t11, T t12);

    void mergeFrom(T t11, byte[] bArr, int i11, int i12, ArrayDecoders.Registers registers);

    T newInstance();

    void writeTo(T t11, Writer writer);
}