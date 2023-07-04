package io.grpc;

import io.grpc.a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: d  reason: collision with root package name */
    public static final a.c<String> f31679d = a.c.a("io.grpc.EquivalentAddressGroup.authorityOverride");

    /* renamed from: a  reason: collision with root package name */
    private final List<SocketAddress> f31680a;

    /* renamed from: b  reason: collision with root package name */
    private final a f31681b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31682c;

    public x(List<SocketAddress> list) {
        this(list, a.f30500c);
    }

    public List<SocketAddress> a() {
        return this.f31680a;
    }

    public a b() {
        return this.f31681b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f31680a.size() != xVar.f31680a.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f31680a.size(); i11++) {
                if (!this.f31680a.get(i11).equals(xVar.f31680a.get(i11))) {
                    return false;
                }
            }
            return this.f31681b.equals(xVar.f31681b);
        }
        return false;
    }

    public int hashCode() {
        return this.f31682c;
    }

    public String toString() {
        return "[" + this.f31680a + "/" + this.f31681b + "]";
    }

    public x(List<SocketAddress> list, a aVar) {
        com.google.common.base.u.e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f31680a = unmodifiableList;
        this.f31681b = (a) com.google.common.base.u.p(aVar, "attrs");
        this.f31682c = unmodifiableList.hashCode();
    }

    public x(SocketAddress socketAddress) {
        this(socketAddress, a.f30500c);
    }

    public x(SocketAddress socketAddress, a aVar) {
        this(Collections.singletonList(socketAddress), aVar);
    }
}