package b4;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
class b {

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(T t11, Rect rect);
    }

    /* renamed from: b4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0146b<T, V> {
        V a(T t11, int i11);

        int b(T t11);
    }

    /* loaded from: classes.dex */
    private static class c<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f7381a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f7382b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final boolean f7383c;

        /* renamed from: d  reason: collision with root package name */
        private final a<T> f7384d;

        c(boolean z11, a<T> aVar) {
            this.f7383c = z11;
            this.f7384d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t11, T t12) {
            Rect rect = this.f7381a;
            Rect rect2 = this.f7382b;
            this.f7384d.a(t11, rect);
            this.f7384d.a(t12, rect2);
            int i11 = rect.top;
            int i12 = rect2.top;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
            int i13 = rect.left;
            int i14 = rect2.left;
            if (i13 < i14) {
                return this.f7383c ? 1 : -1;
            } else if (i13 > i14) {
                return this.f7383c ? -1 : 1;
            } else {
                int i15 = rect.bottom;
                int i16 = rect2.bottom;
                if (i15 < i16) {
                    return -1;
                }
                if (i15 > i16) {
                    return 1;
                }
                int i17 = rect.right;
                int i18 = rect2.right;
                if (i17 < i18) {
                    return this.f7383c ? 1 : -1;
                } else if (i17 > i18) {
                    return this.f7383c ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    private static boolean a(int i11, Rect rect, Rect rect2, Rect rect3) {
        boolean b11 = b(i11, rect, rect2);
        if (b(i11, rect, rect3) || !b11) {
            return false;
        }
        return !j(i11, rect, rect3) || i11 == 17 || i11 == 66 || k(i11, rect, rect2) < m(i11, rect, rect3);
    }

    private static boolean b(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(L l11, InterfaceC0146b<L, T> interfaceC0146b, a<T> aVar, T t11, Rect rect, int i11) {
        Rect rect2 = new Rect(rect);
        if (i11 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i11 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i11 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i11 == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t12 = null;
        int b11 = interfaceC0146b.b(l11);
        Rect rect3 = new Rect();
        for (int i12 = 0; i12 < b11; i12++) {
            T a11 = interfaceC0146b.a(l11, i12);
            if (a11 != t11) {
                aVar.a(a11, rect3);
                if (h(i11, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t12 = a11;
                }
            }
        }
        return t12;
    }

    public static <L, T> T d(L l11, InterfaceC0146b<L, T> interfaceC0146b, a<T> aVar, T t11, int i11, boolean z11, boolean z12) {
        int b11 = interfaceC0146b.b(l11);
        ArrayList arrayList = new ArrayList(b11);
        for (int i12 = 0; i12 < b11; i12++) {
            arrayList.add(interfaceC0146b.a(l11, i12));
        }
        Collections.sort(arrayList, new c(z11, aVar));
        if (i11 != 1) {
            if (i11 == 2) {
                return (T) e(t11, arrayList, z12);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) f(t11, arrayList, z12);
    }

    private static <T> T e(T t11, ArrayList<T> arrayList, boolean z11) {
        int size = arrayList.size();
        int lastIndexOf = (t11 == null ? -1 : arrayList.lastIndexOf(t11)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z11 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t11, ArrayList<T> arrayList, boolean z11) {
        int size = arrayList.size();
        int indexOf = (t11 == null ? size : arrayList.indexOf(t11)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z11 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i11, int i12) {
        return (i11 * 13 * i11) + (i12 * i12);
    }

    private static boolean h(int i11, Rect rect, Rect rect2, Rect rect3) {
        if (i(rect, rect2, i11)) {
            if (i(rect, rect3, i11) && !a(i11, rect, rect2, rect3)) {
                return !a(i11, rect, rect3, rect2) && g(k(i11, rect, rect2), o(i11, rect, rect2)) < g(k(i11, rect, rect3), o(i11, rect, rect3));
            }
            return true;
        }
        return false;
    }

    private static boolean i(Rect rect, Rect rect2, int i11) {
        if (i11 == 17) {
            int i12 = rect.right;
            int i13 = rect2.right;
            return (i12 > i13 || rect.left >= i13) && rect.left > rect2.left;
        } else if (i11 == 33) {
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            return (i14 > i15 || rect.top >= i15) && rect.top > rect2.top;
        } else if (i11 == 66) {
            int i16 = rect.left;
            int i17 = rect2.left;
            return (i16 < i17 || rect.right <= i17) && rect.right < rect2.right;
        } else if (i11 == 130) {
            int i18 = rect.top;
            int i19 = rect2.top;
            return (i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean j(int i11, Rect rect, Rect rect2) {
        if (i11 == 17) {
            return rect.left >= rect2.right;
        } else if (i11 == 33) {
            return rect.top >= rect2.bottom;
        } else if (i11 == 66) {
            return rect.right <= rect2.left;
        } else if (i11 == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static int k(int i11, Rect rect, Rect rect2) {
        return Math.max(0, l(i11, rect, rect2));
    }

    private static int l(int i11, Rect rect, Rect rect2) {
        int i12;
        int i13;
        if (i11 == 17) {
            i12 = rect.left;
            i13 = rect2.right;
        } else if (i11 == 33) {
            i12 = rect.top;
            i13 = rect2.bottom;
        } else if (i11 == 66) {
            i12 = rect2.left;
            i13 = rect.right;
        } else if (i11 == 130) {
            i12 = rect2.top;
            i13 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i12 - i13;
    }

    private static int m(int i11, Rect rect, Rect rect2) {
        return Math.max(1, n(i11, rect, rect2));
    }

    private static int n(int i11, Rect rect, Rect rect2) {
        int i12;
        int i13;
        if (i11 == 17) {
            i12 = rect.left;
            i13 = rect2.left;
        } else if (i11 == 33) {
            i12 = rect.top;
            i13 = rect2.top;
        } else if (i11 == 66) {
            i12 = rect2.right;
            i13 = rect.right;
        } else if (i11 == 130) {
            i12 = rect2.bottom;
            i13 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i12 - i13;
    }

    private static int o(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}