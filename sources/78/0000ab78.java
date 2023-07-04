package pr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.m0;

/* loaded from: classes2.dex */
public final class m implements u<l<?>> {

    /* renamed from: b  reason: collision with root package name */
    public static final m f46880b = new m();

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ g<l<?>, Object> f46881a = new g<>(m0.b(l.class), a.f46882a, null, null, 12, null);

    /* loaded from: classes2.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<l<?>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46882a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Object invoke(l<?> named) {
            kotlin.jvm.internal.s.g(named, "named");
            return named.b();
        }
    }

    private m() {
    }

    @Override // pr.u
    /* renamed from: b */
    public View a(l<?> initialRendering, s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
        return this.f46881a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
    }

    @Override // pr.u
    public n00.d<? super l<?>> getType() {
        return this.f46881a.getType();
    }
}