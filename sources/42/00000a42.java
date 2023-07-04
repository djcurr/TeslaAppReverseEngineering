package atd.b;

import atd.a.c;
import atd.a.d;
import atd.d.i;
import atd.d.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f6776a = Executors.newFixedThreadPool(3);

    /* renamed from: b  reason: collision with root package name */
    private final a f6777b;

    /* renamed from: c  reason: collision with root package name */
    private final c<j> f6778c;

    public b(String str, atd.f0.a aVar, c<j> cVar) {
        this.f6777b = new a(str, aVar);
        this.f6778c = cVar;
    }

    public void a(i iVar) {
        this.f6776a.submit(new d(this.f6778c, this.f6777b.c(iVar)));
    }
}