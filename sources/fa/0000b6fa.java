package u20;

import java.util.Iterator;
import kotlin.jvm.internal.s;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p f53063a;

        public a(h00.p pVar) {
            this.f53063a = pVar;
        }

        @Override // u20.h
        public Iterator<T> iterator() {
            return l.a(this.f53063a);
        }
    }

    public static final <T> Iterator<T> a(h00.p<? super j<? super T>, ? super zz.d<? super b0>, ? extends Object> block) {
        zz.d<b0> b11;
        s.g(block, "block");
        i iVar = new i();
        b11 = a00.c.b(block, iVar, iVar);
        iVar.f(b11);
        return iVar;
    }

    public static <T> h<T> b(h00.p<? super j<? super T>, ? super zz.d<? super b0>, ? extends Object> block) {
        s.g(block, "block");
        return new a(block);
    }
}