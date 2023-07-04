package freemarker.ext.beans;

import freemarker.template.utility.NullArgumentException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
abstract class x {

    /* renamed from: f  reason: collision with root package name */
    static final int[] f26990f;

    /* renamed from: g  reason: collision with root package name */
    private static final int[][] f26991g;

    /* renamed from: h  reason: collision with root package name */
    static /* synthetic */ Class f26992h;

    /* renamed from: i  reason: collision with root package name */
    static /* synthetic */ Class f26993i;

    /* renamed from: j  reason: collision with root package name */
    static /* synthetic */ Class f26994j;

    /* renamed from: k  reason: collision with root package name */
    static /* synthetic */ Class f26995k;

    /* renamed from: l  reason: collision with root package name */
    static /* synthetic */ Class f26996l;

    /* renamed from: m  reason: collision with root package name */
    static /* synthetic */ Class f26997m;

    /* renamed from: n  reason: collision with root package name */
    static /* synthetic */ Class f26998n;

    /* renamed from: o  reason: collision with root package name */
    static /* synthetic */ Class f26999o;

    /* renamed from: p  reason: collision with root package name */
    static /* synthetic */ Class f27000p;

    /* renamed from: q  reason: collision with root package name */
    static /* synthetic */ Class f27001q;

    /* renamed from: r  reason: collision with root package name */
    static /* synthetic */ Class f27002r;

    /* renamed from: s  reason: collision with root package name */
    static /* synthetic */ Class f27003s;

    /* renamed from: a  reason: collision with root package name */
    private Class[][] f27004a;

    /* renamed from: b  reason: collision with root package name */
    private int[][] f27005b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f27006c;

    /* renamed from: d  reason: collision with root package name */
    private final List f27007d;

    /* renamed from: e  reason: collision with root package name */
    protected final boolean f27008e;

    static {
        int[] iArr = new int[0];
        f26990f = iArr;
        f26991g = r2;
        int[][] iArr2 = {iArr};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(boolean z11) {
        Map d11 = freemarker.core.n.d(6, 0.75f, 1);
        this.f27006c = d11;
        freemarker.core.n.b(d11);
        this.f27007d = new LinkedList();
        this.f27008e = z11;
    }

    static /* synthetic */ Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(z zVar) {
        this.f27007d.add(zVar);
        Class[] h11 = h(zVar);
        int length = h11.length;
        Class[][] clsArr = this.f27004a;
        if (clsArr == null) {
            Class[][] clsArr2 = new Class[length + 1];
            this.f27004a = clsArr2;
            clsArr2[length] = (Class[]) h11.clone();
        } else if (clsArr.length <= length) {
            Class[][] clsArr3 = new Class[length + 1];
            System.arraycopy(clsArr, 0, clsArr3, 0, clsArr.length);
            this.f27004a = clsArr3;
            clsArr3[length] = (Class[]) h11.clone();
        } else {
            Class[] clsArr4 = clsArr[length];
            if (clsArr4 == null) {
                clsArr[length] = (Class[]) h11.clone();
            } else {
                for (int i11 = 0; i11 < h11.length; i11++) {
                    clsArr4[i11] = d(clsArr4[i11], h11[i11]);
                }
            }
        }
        int[] iArr = f26990f;
        if (this.f27008e) {
            for (int i12 = 0; i12 < length; i12++) {
                int b11 = c0.b(h11[i12]);
                if (b11 != 0) {
                    if (iArr == f26990f) {
                        iArr = new int[length];
                    }
                    iArr[i12] = b11;
                }
            }
            g(length, iArr);
        }
        if (!this.f27008e) {
            h11 = this.f27004a[length];
        }
        b(h11, iArr);
    }

    abstract void b(Class[] clsArr, int[] iArr);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public Class d(Class cls, Class cls2) {
        boolean z11;
        boolean z12;
        if (cls == cls2) {
            return cls;
        }
        if (this.f27008e) {
            if (cls.isPrimitive()) {
                cls = jx.a.g(cls);
                z11 = true;
            } else {
                z11 = false;
            }
            if (cls2.isPrimitive()) {
                cls2 = jx.a.g(cls2);
                z12 = true;
            } else {
                z12 = false;
            }
            if (cls == cls2) {
                return cls;
            }
            Class cls3 = f26992h;
            Class cls4 = cls3;
            if (cls3 == null) {
                Class c11 = c("java.lang.Number");
                f26992h = c11;
                cls4 = c11;
            }
            if (cls4.isAssignableFrom(cls)) {
                Class cls5 = f26992h;
                Class cls6 = cls5;
                if (cls5 == null) {
                    Class c12 = c("java.lang.Number");
                    f26992h = c12;
                    cls6 = c12;
                }
                if (cls6.isAssignableFrom(cls2)) {
                    Class cls7 = f26992h;
                    if (cls7 == null) {
                        Class c13 = c("java.lang.Number");
                        f26992h = c13;
                        return c13;
                    }
                    return cls7;
                }
            }
            if (z11 || z12) {
                Class cls8 = f26993i;
                if (cls8 == null) {
                    Class c14 = c("java.lang.Object");
                    f26993i = c14;
                    return c14;
                }
                return cls8;
            }
        } else if (cls2.isPrimitive()) {
            if (cls2 == Byte.TYPE) {
                cls2 = f26994j;
                if (cls2 == null) {
                    cls2 = c("java.lang.Byte");
                    f26994j = cls2;
                }
            } else if (cls2 == Short.TYPE) {
                cls2 = f26995k;
                if (cls2 == null) {
                    cls2 = c("java.lang.Short");
                    f26995k = cls2;
                }
            } else if (cls2 == Character.TYPE) {
                cls2 = f26996l;
                if (cls2 == null) {
                    cls2 = c("java.lang.Character");
                    f26996l = cls2;
                }
            } else if (cls2 == Integer.TYPE) {
                cls2 = f26997m;
                if (cls2 == null) {
                    cls2 = c("java.lang.Integer");
                    f26997m = cls2;
                }
            } else if (cls2 == Float.TYPE) {
                cls2 = f26998n;
                if (cls2 == null) {
                    cls2 = c("java.lang.Float");
                    f26998n = cls2;
                }
            } else if (cls2 == Long.TYPE) {
                cls2 = f26999o;
                if (cls2 == null) {
                    cls2 = c("java.lang.Long");
                    f26999o = cls2;
                }
            } else if (cls2 == Double.TYPE && (cls2 = f27000p) == null) {
                cls2 = c("java.lang.Double");
                f27000p = cls2;
            }
        }
        Set<Class> c15 = ex.a.c(cls, cls2);
        c15.retainAll(ex.a.c(cls2, cls));
        if (c15.isEmpty()) {
            Class cls9 = f26993i;
            if (cls9 == null) {
                Class c16 = c("java.lang.Object");
                f26993i = c16;
                return c16;
            }
            return cls9;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls10 : c15) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls11 = (Class) it2.next();
                    if (ex.a.e(cls11, cls10, false, 0) != 0) {
                        break;
                    } else if (ex.a.e(cls10, cls11, false, 0) != 0) {
                        it2.remove();
                    }
                } else {
                    arrayList.add(cls10);
                    break;
                }
            }
        }
        if (arrayList.size() > 1) {
            if (this.f27008e) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Class cls12 = (Class) it3.next();
                    if (!cls12.isInterface()) {
                        Class cls13 = f26993i;
                        if (cls13 == null) {
                            cls13 = c("java.lang.Object");
                            f26993i = cls13;
                        }
                        if (cls12 != cls13) {
                            return cls12;
                        }
                        it3.remove();
                    }
                }
                Class cls14 = f27001q;
                if (cls14 == null) {
                    cls14 = c("java.lang.Cloneable");
                    f27001q = cls14;
                }
                arrayList.remove(cls14);
                if (arrayList.size() > 1) {
                    Class cls15 = f27002r;
                    if (cls15 == null) {
                        cls15 = c("java.io.Serializable");
                        f27002r = cls15;
                    }
                    arrayList.remove(cls15);
                    if (arrayList.size() > 1) {
                        Class cls16 = f27003s;
                        if (cls16 == null) {
                            cls16 = c("java.lang.Comparable");
                            f27003s = cls16;
                        }
                        arrayList.remove(cls16);
                        if (arrayList.size() > 1) {
                            Class cls17 = f26993i;
                            if (cls17 == null) {
                                Class c17 = c("java.lang.Object");
                                f26993i = c17;
                                return c17;
                            }
                            return cls17;
                        }
                    }
                }
            } else {
                Class cls18 = f26993i;
                if (cls18 == null) {
                    Class c18 = c("java.lang.Object");
                    f26993i = c18;
                    return c18;
                }
                return cls18;
            }
        }
        return (Class) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] e(int i11) {
        int[][] iArr = this.f27005b;
        if (iArr == null || iArr.length <= i11) {
            return null;
        }
        return iArr[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class[][] f() {
        return this.f27004a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(int i11, int[] iArr) {
        int i12;
        NullArgumentException.a("srcTypesFlagsByParamIdx", iArr);
        int i13 = 0;
        if (i11 == 0) {
            int[][] iArr2 = this.f27005b;
            if (iArr2 == null) {
                this.f27005b = f26991g;
                return;
            } else if (iArr2 != f26991g) {
                iArr2[0] = f26990f;
                return;
            } else {
                return;
            }
        }
        int[][] iArr3 = this.f27005b;
        if (iArr3 == null) {
            this.f27005b = new int[i11 + 1];
        } else if (iArr3.length <= i11) {
            int[][] iArr4 = new int[i11 + 1];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            this.f27005b = iArr4;
        }
        int[][] iArr5 = this.f27005b;
        int[] iArr6 = iArr5[i11];
        if (iArr6 == null) {
            int[] iArr7 = f26990f;
            if (iArr != iArr7) {
                int length = iArr.length;
                int[] iArr8 = new int[i11];
                while (i13 < i11) {
                    iArr8[i13] = iArr[i13 < length ? i13 : length - 1];
                    i13++;
                }
                iArr7 = iArr8;
            }
            this.f27005b[i11] = iArr7;
        } else if (iArr == iArr6) {
        } else {
            if (iArr6 == f26990f && i11 > 0) {
                iArr6 = new int[i11];
                iArr5[i11] = iArr6;
            }
            int i14 = 0;
            while (i14 < i11) {
                if (iArr != f26990f) {
                    int length2 = iArr.length;
                    i12 = iArr[i14 < length2 ? i14 : length2 - 1];
                } else {
                    i12 = 0;
                }
                int i15 = iArr6[i14];
                if (i15 != i12) {
                    int i16 = i12 | i15;
                    if ((i16 & 2044) != 0) {
                        i16 |= 1;
                    }
                    iArr6[i14] = i16;
                }
                i14++;
            }
        }
    }

    abstract Class[] h(m mVar);
}