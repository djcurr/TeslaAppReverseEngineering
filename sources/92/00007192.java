package gx;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public class d extends AbstractMap implements Cloneable, Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static a f28492i = new a();

    /* renamed from: a  reason: collision with root package name */
    private transient b[] f28493a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f28494b;

    /* renamed from: c  reason: collision with root package name */
    private int f28495c;

    /* renamed from: d  reason: collision with root package name */
    private float f28496d;

    /* renamed from: e  reason: collision with root package name */
    private transient int f28497e;

    /* renamed from: f  reason: collision with root package name */
    private transient Set f28498f;

    /* renamed from: g  reason: collision with root package name */
    private transient Set f28499g;

    /* renamed from: h  reason: collision with root package name */
    private transient Collection f28500h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a implements Iterator {
        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b implements Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        int f28501a;

        /* renamed from: b  reason: collision with root package name */
        Object f28502b;

        /* renamed from: c  reason: collision with root package name */
        Object f28503c;

        /* renamed from: d  reason: collision with root package name */
        b f28504d;

        b(int i11, Object obj, Object obj2, b bVar) {
            this.f28501a = i11;
            this.f28502b = obj;
            this.f28503c = obj2;
            this.f28504d = bVar;
        }

        protected Object clone() {
            int i11 = this.f28501a;
            Object obj = this.f28502b;
            Object obj2 = this.f28503c;
            b bVar = this.f28504d;
            return new b(i11, obj, obj2, bVar == null ? null : (b) bVar.clone());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f28502b == entry.getKey()) {
                    Object obj2 = this.f28503c;
                    if (obj2 == null) {
                        if (entry.getValue() != null) {
                            return false;
                        }
                    } else if (!obj2.equals(entry.getValue())) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f28502b;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f28503c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i11 = this.f28501a;
            Object obj = this.f28503c;
            return i11 ^ (obj == null ? 0 : obj.hashCode());
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f28503c;
            this.f28503c = obj;
            return obj2;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f28502b);
            stringBuffer.append("=");
            stringBuffer.append(this.f28503c);
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        b[] f28505a;

        /* renamed from: b  reason: collision with root package name */
        int f28506b;

        /* renamed from: c  reason: collision with root package name */
        b f28507c;

        /* renamed from: d  reason: collision with root package name */
        b f28508d;

        /* renamed from: e  reason: collision with root package name */
        int f28509e;

        /* renamed from: f  reason: collision with root package name */
        private int f28510f;

        c(int i11) {
            b[] bVarArr = d.this.f28493a;
            this.f28505a = bVarArr;
            this.f28506b = bVarArr.length;
            this.f28507c = null;
            this.f28508d = null;
            this.f28510f = d.this.f28497e;
            this.f28509e = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b bVar = this.f28507c;
            int i11 = this.f28506b;
            b[] bVarArr = this.f28505a;
            while (bVar == null && i11 > 0) {
                i11--;
                bVar = bVarArr[i11];
            }
            this.f28507c = bVar;
            this.f28506b = i11;
            return bVar != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (d.this.f28497e == this.f28510f) {
                b bVar = this.f28507c;
                int i11 = this.f28506b;
                b[] bVarArr = this.f28505a;
                while (bVar == null && i11 > 0) {
                    i11--;
                    bVar = bVarArr[i11];
                }
                this.f28507c = bVar;
                this.f28506b = i11;
                if (bVar != null) {
                    this.f28508d = bVar;
                    this.f28507c = bVar.f28504d;
                    int i12 = this.f28509e;
                    return i12 == 0 ? bVar.f28502b : i12 == 1 ? bVar.f28503c : bVar;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f28508d != null) {
                if (d.this.f28497e == this.f28510f) {
                    b[] bVarArr = d.this.f28493a;
                    int length = (this.f28508d.f28501a & Integer.MAX_VALUE) % bVarArr.length;
                    b bVar = null;
                    for (b bVar2 = bVarArr[length]; bVar2 != null; bVar2 = bVar2.f28504d) {
                        if (bVar2 == this.f28508d) {
                            d.h(d.this);
                            this.f28510f++;
                            if (bVar == null) {
                                bVarArr[length] = bVar2.f28504d;
                            } else {
                                bVar.f28504d = bVar2.f28504d;
                            }
                            d.c(d.this);
                            this.f28508d = null;
                            return;
                        }
                        bVar = bVar2;
                    }
                    throw new ConcurrentModificationException();
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException();
        }
    }

    public d(int i11, float f11) {
        this.f28497e = 0;
        this.f28498f = null;
        this.f28499g = null;
        this.f28500h = null;
        if (i11 >= 0) {
            if (f11 > BitmapDescriptorFactory.HUE_RED && !Float.isNaN(f11)) {
                i11 = i11 == 0 ? 1 : i11;
                this.f28496d = f11;
                this.f28493a = new b[i11];
                this.f28495c = (int) (i11 * f11);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Illegal Load factor: ");
            stringBuffer.append(f11);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Illegal Initial Capacity: ");
        stringBuffer2.append(i11);
        throw new IllegalArgumentException(stringBuffer2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int c(d dVar) {
        int i11 = dVar.f28494b;
        dVar.f28494b = i11 - 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int h(d dVar) {
        int i11 = dVar.f28497e;
        dVar.f28497e = i11 + 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator i(int i11) {
        if (this.f28494b == 0) {
            return f28492i;
        }
        return new c(i11);
    }

    private void j() {
        b[] bVarArr = this.f28493a;
        int length = bVarArr.length;
        int i11 = (length * 2) + 1;
        b[] bVarArr2 = new b[i11];
        this.f28497e++;
        this.f28495c = (int) (i11 * this.f28496d);
        this.f28493a = bVarArr2;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return;
            }
            b bVar = bVarArr[i12];
            while (bVar != null) {
                b bVar2 = bVar.f28504d;
                int i13 = (bVar.f28501a & Integer.MAX_VALUE) % i11;
                bVar.f28504d = bVarArr2[i13];
                bVarArr2[i13] = bVar;
                bVar = bVar2;
            }
            length = i12;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b[] bVarArr = this.f28493a;
        this.f28497e++;
        int length = bVarArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                bVarArr[length] = null;
            } else {
                this.f28494b = 0;
                return;
            }
        }
    }

    @Override // java.util.AbstractMap
    public Object clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f28493a = new b[this.f28493a.length];
            int length = this.f28493a.length;
            while (true) {
                int i11 = length - 1;
                b bVar = null;
                if (length > 0) {
                    b[] bVarArr = dVar.f28493a;
                    b[] bVarArr2 = this.f28493a;
                    if (bVarArr2[i11] != null) {
                        bVar = (b) bVarArr2[i11].clone();
                    }
                    bVarArr[i11] = bVar;
                    length = i11;
                } else {
                    dVar.f28498f = null;
                    dVar.f28499g = null;
                    dVar.f28500h = null;
                    dVar.f28497e = 0;
                    return dVar;
                }
            }
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        b[] bVarArr = this.f28493a;
        if (obj != null) {
            int identityHashCode = System.identityHashCode(obj);
            for (b bVar = bVarArr[(Integer.MAX_VALUE & identityHashCode) % bVarArr.length]; bVar != null; bVar = bVar.f28504d) {
                if (bVar.f28501a == identityHashCode && obj == bVar.f28502b) {
                    return true;
                }
            }
        } else {
            for (b bVar2 = bVarArr[0]; bVar2 != null; bVar2 = bVar2.f28504d) {
                if (bVar2.f28502b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        b[] bVarArr = this.f28493a;
        if (obj == null) {
            int length = bVarArr.length;
            while (true) {
                int i11 = length - 1;
                if (length <= 0) {
                    return false;
                }
                for (b bVar = bVarArr[i11]; bVar != null; bVar = bVar.f28504d) {
                    if (bVar.f28503c == null) {
                        return true;
                    }
                }
                length = i11;
            }
        } else {
            int length2 = bVarArr.length;
            while (true) {
                int i12 = length2 - 1;
                if (length2 <= 0) {
                    return false;
                }
                for (b bVar2 = bVarArr[i12]; bVar2 != null; bVar2 = bVar2.f28504d) {
                    if (obj.equals(bVar2.f28503c)) {
                        return true;
                    }
                }
                length2 = i12;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f28499g == null) {
            this.f28499g = new gx.c(this);
        }
        return this.f28499g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        b[] bVarArr = this.f28493a;
        if (obj != null) {
            int identityHashCode = System.identityHashCode(obj);
            for (b bVar = bVarArr[(Integer.MAX_VALUE & identityHashCode) % bVarArr.length]; bVar != null; bVar = bVar.f28504d) {
                if (bVar.f28501a == identityHashCode && obj == bVar.f28502b) {
                    return bVar.f28503c;
                }
            }
            return null;
        }
        for (b bVar2 = bVarArr[0]; bVar2 != null; bVar2 = bVar2.f28504d) {
            if (bVar2.f28502b == null) {
                return bVar2.f28503c;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f28494b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        if (this.f28498f == null) {
            this.f28498f = new gx.a(this);
        }
        return this.f28498f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int i11;
        b[] bVarArr = this.f28493a;
        int i12 = 0;
        if (obj != null) {
            i12 = System.identityHashCode(obj);
            i11 = (i12 & Integer.MAX_VALUE) % bVarArr.length;
            for (b bVar = bVarArr[i11]; bVar != null; bVar = bVar.f28504d) {
                if (bVar.f28501a == i12 && obj == bVar.f28502b) {
                    Object obj3 = bVar.f28503c;
                    bVar.f28503c = obj2;
                    return obj3;
                }
            }
        } else {
            for (b bVar2 = bVarArr[0]; bVar2 != null; bVar2 = bVar2.f28504d) {
                if (bVar2.f28502b == null) {
                    Object obj4 = bVar2.f28503c;
                    bVar2.f28503c = obj2;
                    return obj4;
                }
            }
            i11 = 0;
        }
        this.f28497e++;
        if (this.f28494b >= this.f28495c) {
            j();
            bVarArr = this.f28493a;
            i11 = (Integer.MAX_VALUE & i12) % bVarArr.length;
        }
        bVarArr[i11] = new b(i12, obj, obj2, bVarArr[i11]);
        this.f28494b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        b[] bVarArr = this.f28493a;
        if (obj != null) {
            int identityHashCode = System.identityHashCode(obj);
            int length = (Integer.MAX_VALUE & identityHashCode) % bVarArr.length;
            b bVar = null;
            for (b bVar2 = bVarArr[length]; bVar2 != null; bVar2 = bVar2.f28504d) {
                if (bVar2.f28501a == identityHashCode && obj == bVar2.f28502b) {
                    this.f28497e++;
                    if (bVar != null) {
                        bVar.f28504d = bVar2.f28504d;
                    } else {
                        bVarArr[length] = bVar2.f28504d;
                    }
                    this.f28494b--;
                    Object obj2 = bVar2.f28503c;
                    bVar2.f28503c = null;
                    return obj2;
                }
                bVar = bVar2;
            }
        } else {
            b bVar3 = null;
            for (b bVar4 = bVarArr[0]; bVar4 != null; bVar4 = bVar4.f28504d) {
                if (bVar4.f28502b == null) {
                    this.f28497e++;
                    if (bVar3 != null) {
                        bVar3.f28504d = bVar4.f28504d;
                    } else {
                        bVarArr[0] = bVar4.f28504d;
                    }
                    this.f28494b--;
                    Object obj3 = bVar4.f28503c;
                    bVar4.f28503c = null;
                    return obj3;
                }
                bVar3 = bVar4;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f28494b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        if (this.f28500h == null) {
            this.f28500h = new gx.b(this);
        }
        return this.f28500h;
    }

    public d() {
        this(11, 0.75f);
    }
}