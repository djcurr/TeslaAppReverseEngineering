package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zaa implements OnDelegateCreatedListener {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        LinkedList linkedList;
        LinkedList linkedList2;
        LifecycleDelegate lifecycleDelegate2;
        this.zaa.zaa = lifecycleDelegate;
        linkedList = this.zaa.zac;
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            lifecycleDelegate2 = this.zaa.zaa;
            ((zah) it2.next()).zab(lifecycleDelegate2);
        }
        linkedList2 = this.zaa.zac;
        linkedList2.clear();
        this.zaa.zab = null;
    }
}