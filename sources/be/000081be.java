package l1;

import h00.l;
import h00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    /* renamed from: l1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0691a<Original> extends u implements p<k, Original, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<k, Original, List<Saveable>> f36334a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0691a(p<? super k, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f36334a = pVar;
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(k Saver, Original original) {
            s.g(Saver, "$this$Saver");
            List list = (List) this.f36334a.invoke(Saver, original);
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Object obj = list.get(i11);
                if (obj != null && !Saver.a(obj)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                i11 = i12;
            }
            if (!list.isEmpty()) {
                return new ArrayList(list);
            }
            return null;
        }
    }

    public static final <Original, Saveable> i<Original, Object> a(p<? super k, ? super Original, ? extends List<? extends Saveable>> save, l<? super List<? extends Saveable>, ? extends Original> restore) {
        s.g(save, "save");
        s.g(restore, "restore");
        return j.a(new C0691a(save), (l) r0.f(restore, 1));
    }
}