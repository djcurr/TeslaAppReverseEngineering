package hd;

import java.util.Collection;

/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public interface a {
        long a();

        String getId();

        long getTimestamp();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean e();

        void f(gd.j jVar, Object obj);

        fd.a g(Object obj);
    }

    void a();

    void b();

    boolean c(String str, Object obj);

    long d(a aVar);

    b e(String str, Object obj);

    boolean f(String str, Object obj);

    fd.a g(String str, Object obj);

    Collection<a> getEntries();

    boolean isExternal();

    long remove(String str);
}