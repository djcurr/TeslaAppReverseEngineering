package q4;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.z;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import h00.l;
import h00.p;
import java.util.Arrays;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements p<l1.k, p4.u, Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47405a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Bundle mo160invoke(l1.k Saver, p4.u it2) {
            s.g(Saver, "$this$Saver");
            s.g(it2, "it");
            return it2.c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements l<Bundle, p4.u> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f47406a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(1);
            this.f47406a = context;
        }

        @Override // h00.l
        /* renamed from: a */
        public final p4.u mo12invoke(Bundle it2) {
            s.g(it2, "it");
            p4.u c11 = i.c(this.f47406a);
            c11.a0(it2);
            return c11;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends u implements h00.a<p4.u> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f47407a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f47407a = context;
        }

        @Override // h00.a
        /* renamed from: a */
        public final p4.u mo11invoke() {
            return i.c(this.f47407a);
        }
    }

    private static final l1.i<p4.u, ?> a(Context context) {
        return l1.j.a(a.f47405a, new b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p4.u c(Context context) {
        p4.u uVar = new p4.u(context);
        uVar.D().c(new d());
        uVar.D().c(new f());
        return uVar;
    }

    public static final p4.u d(Navigator<? extends NavDestination>[] navigators, c1.i iVar, int i11) {
        s.g(navigators, "navigators");
        iVar.x(760684129);
        Context context = (Context) iVar.A(z.g());
        p4.u uVar = (p4.u) l1.b.b(Arrays.copyOf(navigators, navigators.length), a(context), null, new c(context), iVar, 72, 4);
        int length = navigators.length;
        int i12 = 0;
        while (i12 < length) {
            Navigator<? extends NavDestination> navigator = navigators[i12];
            i12++;
            uVar.D().c(navigator);
        }
        iVar.N();
        return uVar;
    }
}