package yy;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes5.dex */
public enum i {
    COMPLETE;

    /* loaded from: classes5.dex */
    static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final iy.b f59923a;

        a(iy.b bVar) {
            this.f59923a = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f59923a + "]";
        }
    }

    /* loaded from: classes5.dex */
    static final class b implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Throwable f59924a;

        b(Throwable th2) {
            this.f59924a = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f59924a, ((b) obj).f59924a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59924a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f59924a + "]";
        }
    }

    /* loaded from: classes5.dex */
    static final class c implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final b80.c f59925a;

        c(b80.c cVar) {
            this.f59925a = cVar;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f59925a + "]";
        }
    }

    public static <T> boolean accept(Object obj, b80.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            bVar.onError(((b) obj).f59924a);
            return true;
        } else {
            bVar.b(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, b80.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            bVar.onError(((b) obj).f59924a);
            return true;
        } else if (obj instanceof c) {
            bVar.c(((c) obj).f59925a);
            return false;
        } else {
            bVar.b(obj);
            return false;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(iy.b bVar) {
        return new a(bVar);
    }

    public static Object error(Throwable th2) {
        return new b(th2);
    }

    public static iy.b getDisposable(Object obj) {
        return ((a) obj).f59923a;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f59924a;
    }

    public static b80.c getSubscription(Object obj) {
        return ((c) obj).f59925a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static <T> Object next(T t11) {
        return t11;
    }

    public static Object subscription(b80.c cVar) {
        return new c(cVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, hy.k<? super T> kVar) {
        if (obj == COMPLETE) {
            kVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            kVar.onError(((b) obj).f59924a);
            return true;
        } else {
            kVar.b(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, hy.k<? super T> kVar) {
        if (obj == COMPLETE) {
            kVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            kVar.onError(((b) obj).f59924a);
            return true;
        } else if (obj instanceof a) {
            kVar.a(((a) obj).f59923a);
            return false;
        } else {
            kVar.b(obj);
            return false;
        }
    }
}