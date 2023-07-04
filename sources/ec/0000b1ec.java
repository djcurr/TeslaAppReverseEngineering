package s20;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public class e<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private int f50181a;

    /* renamed from: b  reason: collision with root package name */
    private Object f50182b;

    /* loaded from: classes5.dex */
    private static class b<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private static final b f50183a = new b();

        private b() {
        }

        public static <T> b<T> a() {
            return f50183a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes5.dex */
    private class c extends d<E> {

        /* renamed from: b  reason: collision with root package name */
        private final int f50184b;

        public c() {
            super();
            this.f50184b = ((AbstractList) e.this).modCount;
        }

        @Override // s20.e.d
        protected void a() {
            if (((AbstractList) e.this).modCount == this.f50184b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) e.this).modCount + "; expected: " + this.f50184b);
        }

        @Override // s20.e.d
        protected E b() {
            return (E) e.this.f50182b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            e.this.clear();
        }
    }

    /* loaded from: classes5.dex */
    private static abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f50186a;

        private d() {
        }

        protected abstract void a();

        protected abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f50186a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f50186a) {
                this.f50186a = true;
                a();
                return b();
            }
            throw new NoSuchElementException();
        }
    }

    private static /* synthetic */ void b(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i11 == 2 || i11 == 3) {
            objArr[1] = "iterator";
        } else if (i11 == 5 || i11 == 6 || i11 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        int i11 = this.f50181a;
        if (i11 == 0) {
            this.f50182b = e11;
        } else if (i11 == 1) {
            this.f50182b = new Object[]{this.f50182b, e11};
        } else {
            Object[] objArr = (Object[]) this.f50182b;
            int length = objArr.length;
            if (i11 >= length) {
                int i12 = ((length * 3) / 2) + 1;
                int i13 = i11 + 1;
                if (i12 < i13) {
                    i12 = i13;
                }
                Object[] objArr2 = new Object[i12];
                this.f50182b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f50181a] = e11;
        }
        this.f50181a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f50182b = null;
        this.f50181a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        int i12;
        if (i11 >= 0 && i11 < (i12 = this.f50181a)) {
            if (i12 == 1) {
                return (E) this.f50182b;
            }
            return (E) ((Object[]) this.f50182b)[i11];
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f50181a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i11 = this.f50181a;
        if (i11 == 0) {
            b a11 = b.a();
            if (a11 == null) {
                b(2);
            }
            return a11;
        } else if (i11 == 1) {
            return new c();
        } else {
            Iterator<E> it2 = super.iterator();
            if (it2 == null) {
                b(3);
            }
            return it2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        int i12;
        E e11;
        if (i11 >= 0 && i11 < (i12 = this.f50181a)) {
            if (i12 == 1) {
                e11 = (E) this.f50182b;
                this.f50182b = null;
            } else {
                Object[] objArr = (Object[]) this.f50182b;
                Object obj = objArr[i11];
                if (i12 == 2) {
                    this.f50182b = objArr[1 - i11];
                } else {
                    int i13 = (i12 - i11) - 1;
                    if (i13 > 0) {
                        System.arraycopy(objArr, i11 + 1, objArr, i11, i13);
                    }
                    objArr[this.f50181a - 1] = null;
                }
                e11 = (E) obj;
            }
            this.f50181a--;
            ((AbstractList) this).modCount++;
            return e11;
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f50181a);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f50181a)) {
            throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f50181a);
        } else if (i12 == 1) {
            E e12 = (E) this.f50182b;
            this.f50182b = e11;
            return e12;
        } else {
            Object[] objArr = (Object[]) this.f50182b;
            E e13 = (E) objArr[i11];
            objArr[i11] = e11;
            return e13;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f50181a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            b(4);
        }
        int length = tArr.length;
        int i11 = this.f50181a;
        if (i11 == 1) {
            if (length != 0) {
                tArr[0] = this.f50182b;
            } else {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f50182b;
                return tArr2;
            }
        } else if (length < i11) {
            T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f50182b, i11, tArr.getClass());
            if (tArr3 == null) {
                b(6);
            }
            return tArr3;
        } else if (i11 != 0) {
            System.arraycopy(this.f50182b, 0, tArr, 0, i11);
        }
        int i12 = this.f50181a;
        if (length > i12) {
            tArr[i12] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        int i12;
        if (i11 >= 0 && i11 <= (i12 = this.f50181a)) {
            if (i12 == 0) {
                this.f50182b = e11;
            } else if (i12 == 1 && i11 == 0) {
                this.f50182b = new Object[]{e11, this.f50182b};
            } else {
                Object[] objArr = new Object[i12 + 1];
                if (i12 == 1) {
                    objArr[0] = this.f50182b;
                } else {
                    Object[] objArr2 = (Object[]) this.f50182b;
                    System.arraycopy(objArr2, 0, objArr, 0, i11);
                    System.arraycopy(objArr2, i11, objArr, i11 + 1, this.f50181a - i11);
                }
                objArr[i11] = e11;
                this.f50182b = objArr;
            }
            this.f50181a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f50181a);
    }
}