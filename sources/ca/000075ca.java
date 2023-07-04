package io.grpc;

/* loaded from: classes5.dex */
public abstract class f {

    /* loaded from: classes5.dex */
    public enum a {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public abstract void a(a aVar, String str);

    public abstract void b(a aVar, String str, Object... objArr);
}