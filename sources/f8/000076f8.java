package io.grpc.internal;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f31258a = new ArrayList<>();

    public w0 a(Object obj) {
        this.f31258a.add(String.valueOf(obj));
        return this;
    }

    public w0 b(String str, Object obj) {
        ArrayList<String> arrayList = this.f31258a;
        arrayList.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f31258a.toString();
    }
}