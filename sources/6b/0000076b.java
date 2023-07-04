package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: e  reason: collision with root package name */
    private static final Class[] f5173e;

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Object> f5174a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, SavedStateRegistry.b> f5175b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b<?>> f5176c;

    /* renamed from: d  reason: collision with root package name */
    private final SavedStateRegistry.b f5177d;

    /* loaded from: classes.dex */
    class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            for (Map.Entry entry : new HashMap(l0.this.f5175b).entrySet()) {
                l0.this.h((String) entry.getKey(), ((SavedStateRegistry.b) entry.getValue()).a());
            }
            Set<String> keySet = l0.this.f5174a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(l0.this.f5174a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i11 = Build.VERSION.SDK_INT;
        clsArr[27] = i11 >= 21 ? Size.class : cls;
        if (i11 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f5173e = clsArr;
    }

    public l0(Map<String, Object> map) {
        this.f5175b = new HashMap();
        this.f5176c = new HashMap();
        this.f5177d = new a();
        this.f5174a = new HashMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new l0();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
            return new l0(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            HashMap hashMap2 = new HashMap();
            for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                hashMap2.put((String) parcelableArrayList.get(i11), parcelableArrayList2.get(i11));
            }
            return new l0(hashMap2);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    private <T> f0<T> f(String str, boolean z11, T t11) {
        b<?> bVar;
        b<?> bVar2 = this.f5176c.get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        if (this.f5174a.containsKey(str)) {
            bVar = new b<>(this, str, this.f5174a.get(str));
        } else if (z11) {
            bVar = new b<>(this, str, t11);
        } else {
            bVar = new b<>(this, str);
        }
        this.f5176c.put(str, bVar);
        return bVar;
    }

    private static void i(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f5173e) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    public boolean a(String str) {
        return this.f5174a.containsKey(str);
    }

    public <T> T c(String str) {
        return (T) this.f5174a.get(str);
    }

    public <T> f0<T> d(String str) {
        return f(str, false, null);
    }

    public <T> f0<T> e(String str, T t11) {
        return f(str, true, t11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SavedStateRegistry.b g() {
        return this.f5177d;
    }

    public <T> void h(String str, T t11) {
        i(t11);
        b<?> bVar = this.f5176c.get(str);
        if (bVar != null) {
            bVar.setValue(t11);
        } else {
            this.f5174a.put(str, t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<T> extends f0<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f5179a;

        /* renamed from: b  reason: collision with root package name */
        private l0 f5180b;

        b(l0 l0Var, String str, T t11) {
            super(t11);
            this.f5179a = str;
            this.f5180b = l0Var;
        }

        @Override // androidx.lifecycle.f0, androidx.lifecycle.LiveData
        public void setValue(T t11) {
            l0 l0Var = this.f5180b;
            if (l0Var != null) {
                l0Var.f5174a.put(this.f5179a, t11);
            }
            super.setValue(t11);
        }

        b(l0 l0Var, String str) {
            this.f5179a = str;
            this.f5180b = l0Var;
        }
    }

    public l0() {
        this.f5175b = new HashMap();
        this.f5176c = new HashMap();
        this.f5177d = new a();
        this.f5174a = new HashMap();
    }
}