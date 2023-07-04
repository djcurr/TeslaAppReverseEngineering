package de;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f23916a;

    public a(b... bVarArr) {
        ArrayList arrayList = new ArrayList(bVarArr.length);
        this.f23916a = arrayList;
        Collections.addAll(arrayList, bVarArr);
    }

    @Override // de.b
    public synchronized void a(String str, int i11, boolean z11, String str2) {
        int size = this.f23916a.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f23916a.get(i12);
            if (bVar != null) {
                try {
                    bVar.a(str, i11, z11, str2);
                } catch (Exception e11) {
                    nd.a.k("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e11);
                }
            }
        }
    }

    public synchronized void b(b bVar) {
        this.f23916a.add(bVar);
    }

    public synchronized void c(b bVar) {
        this.f23916a.remove(bVar);
    }
}