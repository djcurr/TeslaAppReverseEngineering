package io.grpc;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: classes5.dex */
public final class a0 extends x0 {

    /* renamed from: a  reason: collision with root package name */
    private final SocketAddress f30505a;

    /* renamed from: b  reason: collision with root package name */
    private final InetSocketAddress f30506b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30507c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30508d;

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private SocketAddress f30509a;

        /* renamed from: b  reason: collision with root package name */
        private InetSocketAddress f30510b;

        /* renamed from: c  reason: collision with root package name */
        private String f30511c;

        /* renamed from: d  reason: collision with root package name */
        private String f30512d;

        public a0 a() {
            return new a0(this.f30509a, this.f30510b, this.f30511c, this.f30512d);
        }

        public b b(String str) {
            this.f30512d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.f30509a = (SocketAddress) com.google.common.base.u.p(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.f30510b = (InetSocketAddress) com.google.common.base.u.p(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(String str) {
            this.f30511c = str;
            return this;
        }

        private b() {
        }
    }

    public static b e() {
        return new b();
    }

    public String a() {
        return this.f30508d;
    }

    public SocketAddress b() {
        return this.f30505a;
    }

    public InetSocketAddress c() {
        return this.f30506b;
    }

    public String d() {
        return this.f30507c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return com.google.common.base.q.a(this.f30505a, a0Var.f30505a) && com.google.common.base.q.a(this.f30506b, a0Var.f30506b) && com.google.common.base.q.a(this.f30507c, a0Var.f30507c) && com.google.common.base.q.a(this.f30508d, a0Var.f30508d);
        }
        return false;
    }

    public int hashCode() {
        return com.google.common.base.q.b(this.f30505a, this.f30506b, this.f30507c, this.f30508d);
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("proxyAddr", this.f30505a).d("targetAddr", this.f30506b).d("username", this.f30507c).e("hasPassword", this.f30508d != null).toString();
    }

    private a0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        com.google.common.base.u.p(socketAddress, "proxyAddress");
        com.google.common.base.u.p(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            com.google.common.base.u.x(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f30505a = socketAddress;
        this.f30506b = inetSocketAddress;
        this.f30507c = str;
        this.f30508d = str2;
    }
}