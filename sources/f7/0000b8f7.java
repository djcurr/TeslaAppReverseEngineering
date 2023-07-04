package v20;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zz.g;

/* loaded from: classes5.dex */
public abstract class q1 extends j0 implements Closeable {

    /* loaded from: classes5.dex */
    public static final class a extends zz.b<j0, q1> {

        /* renamed from: v20.q1$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C1212a extends kotlin.jvm.internal.u implements h00.l<g.b, q1> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1212a f53989a = new C1212a();

            C1212a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final q1 invoke(g.b bVar) {
                if (bVar instanceof q1) {
                    return (q1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(j0.f53957a, C1212a.f53989a);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public abstract Executor R0();
}