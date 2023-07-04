package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, HashSet<WeakReference<a>>> f4192a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public j() {
        new SparseIntArray();
        this.f4192a = new HashMap<>();
    }

    public void a(int i11, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f4192a.get(Integer.valueOf(i11));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f4192a.put(Integer.valueOf(i11), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}