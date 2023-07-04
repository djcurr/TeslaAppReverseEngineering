package kotlinx.coroutines;

import h00.l;
import h00.p;
import kotlin.NoWhenBranchMatchedException;
import z20.b;
import zz.d;
import zz.f;

/* loaded from: classes5.dex */
public enum a {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: kotlinx.coroutines.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C0662a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35229a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.DEFAULT.ordinal()] = 1;
            iArr[a.ATOMIC.ordinal()] = 2;
            iArr[a.UNDISPATCHED.ordinal()] = 3;
            iArr[a.LAZY.ordinal()] = 4;
            f35229a = iArr;
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        int i11 = C0662a.f35229a[ordinal()];
        if (i11 == 1) {
            z20.a.b(lVar, dVar);
        } else if (i11 == 2) {
            f.b(lVar, dVar);
        } else if (i11 == 3) {
            b.a(lVar, dVar);
        } else if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r11, d<? super T> dVar) {
        int i11 = C0662a.f35229a[ordinal()];
        if (i11 == 1) {
            z20.a.e(pVar, r11, dVar, null, 4, null);
        } else if (i11 == 2) {
            f.c(pVar, r11, dVar);
        } else if (i11 == 3) {
            b.b(pVar, r11, dVar);
        } else if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}