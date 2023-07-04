package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j0;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface e1 {
    @Deprecated
    <T> T a(f1<T> f1Var, p pVar);

    @Deprecated
    <T> T b(Class<T> cls, p pVar);

    <K, V> void c(Map<K, V> map, j0.a<K, V> aVar, p pVar);

    <T> void d(List<T> list, f1<T> f1Var, p pVar);

    <T> T e(f1<T> f1Var, p pVar);

    <T> T f(Class<T> cls, p pVar);

    @Deprecated
    <T> void g(List<T> list, f1<T> f1Var, p pVar);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List<Boolean> list);

    i readBytes();

    void readBytesList(List<i> list);

    double readDouble();

    void readDoubleList(List<Double> list);

    int readEnum();

    void readEnumList(List<Integer> list);

    int readFixed32();

    void readFixed32List(List<Integer> list);

    long readFixed64();

    void readFixed64List(List<Long> list);

    float readFloat();

    void readFloatList(List<Float> list);

    int readInt32();

    void readInt32List(List<Integer> list);

    long readInt64();

    void readInt64List(List<Long> list);

    int readSFixed32();

    void readSFixed32List(List<Integer> list);

    long readSFixed64();

    void readSFixed64List(List<Long> list);

    int readSInt32();

    void readSInt32List(List<Integer> list);

    long readSInt64();

    void readSInt64List(List<Long> list);

    String readString();

    void readStringList(List<String> list);

    void readStringListRequireUtf8(List<String> list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List<Integer> list);

    long readUInt64();

    void readUInt64List(List<Long> list);

    boolean skipField();
}