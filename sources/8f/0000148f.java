package com.android.volley;

import com.android.volley.a;
import com.android.volley.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o implements i.b {

    /* renamed from: b  reason: collision with root package name */
    private final l f10316b;

    /* renamed from: d  reason: collision with root package name */
    private final b f10318d;

    /* renamed from: e  reason: collision with root package name */
    private final BlockingQueue<i<?>> f10319e;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<i<?>>> f10315a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final j f10317c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(b bVar, BlockingQueue<i<?>> blockingQueue, l lVar) {
        this.f10316b = lVar;
        this.f10318d = bVar;
        this.f10319e = blockingQueue;
    }

    @Override // com.android.volley.i.b
    public void a(i<?> iVar, k<?> kVar) {
        List<i<?>> remove;
        a.C0196a c0196a = kVar.f10303b;
        if (c0196a != null && !c0196a.a()) {
            String cacheKey = iVar.getCacheKey();
            synchronized (this) {
                remove = this.f10315a.remove(cacheKey);
            }
            if (remove != null) {
                if (n.f10307b) {
                    n.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), cacheKey);
                }
                for (i<?> iVar2 : remove) {
                    this.f10316b.a(iVar2, kVar);
                }
                return;
            }
            return;
        }
        b(iVar);
    }

    @Override // com.android.volley.i.b
    public synchronized void b(i<?> iVar) {
        BlockingQueue<i<?>> blockingQueue;
        String cacheKey = iVar.getCacheKey();
        List<i<?>> remove = this.f10315a.remove(cacheKey);
        if (remove != null && !remove.isEmpty()) {
            if (n.f10307b) {
                n.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), cacheKey);
            }
            i<?> remove2 = remove.remove(0);
            this.f10315a.put(cacheKey, remove);
            remove2.setNetworkRequestCompleteListener(this);
            j jVar = this.f10317c;
            if (jVar != null) {
                jVar.f(remove2);
            } else if (this.f10318d != null && (blockingQueue = this.f10319e) != null) {
                try {
                    blockingQueue.put(remove2);
                } catch (InterruptedException e11) {
                    n.c("Couldn't add request to queue. %s", e11.toString());
                    Thread.currentThread().interrupt();
                    this.f10318d.d();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean c(i<?> iVar) {
        String cacheKey = iVar.getCacheKey();
        if (this.f10315a.containsKey(cacheKey)) {
            List<i<?>> list = this.f10315a.get(cacheKey);
            if (list == null) {
                list = new ArrayList<>();
            }
            iVar.addMarker("waiting-for-response");
            list.add(iVar);
            this.f10315a.put(cacheKey, list);
            if (n.f10307b) {
                n.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        }
        this.f10315a.put(cacheKey, null);
        iVar.setNetworkRequestCompleteListener(this);
        if (n.f10307b) {
            n.b("new request, sending to network %s", cacheKey);
        }
        return false;
    }
}