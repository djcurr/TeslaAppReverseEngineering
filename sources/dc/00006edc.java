package freemarker.ext.beans;

import java.util.HashSet;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private final i f26952a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f26953b;

    /* JADX INFO: Access modifiers changed from: protected */
    public n(i iVar) {
        Map c11 = freemarker.core.n.c();
        this.f26953b = c11;
        freemarker.core.n.b(c11);
        new HashSet();
        this.f26952a = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f26952a.i()) {
            this.f26953b.clear();
        }
    }
}