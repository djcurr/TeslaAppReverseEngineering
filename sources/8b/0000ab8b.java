package pr;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.a2;
import v20.e1;
import v20.o0;
import v20.p0;
import wz.r0;

/* loaded from: classes2.dex */
public final class z extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f46903a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<Parcelable> f46904b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f46907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar) {
            super(1);
            this.f46907b = sVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            z.this.b(it2, this.f46907b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final o0 f46908a = p0.a(e1.c().R0());

        /* renamed from: b  reason: collision with root package name */
        private a2 f46909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<S> f46910c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.l<S, vz.b0> f46911d;

        /* JADX INFO: Add missing generic type declarations: [S] */
        @kotlin.coroutines.jvm.internal.f(c = "com.squareup.workflow1.ui.WorkflowLayout$takeWhileAttached$listener$1$onViewAttachedToWindow$1", f = "WorkflowLayout.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        static final class a<S> extends kotlin.coroutines.jvm.internal.l implements h00.p<S, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f46912a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f46913b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h00.l<S, vz.b0> f46914c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h00.l<? super S, vz.b0> lVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f46914c = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                a aVar = new a(this.f46914c, dVar);
                aVar.f46913b = obj;
                return aVar;
            }

            @Override // h00.p
            /* renamed from: e */
            public final Object invoke(S s11, zz.d<? super vz.b0> dVar) {
                return ((a) create(s11, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f46912a == 0) {
                    vz.r.b(obj);
                    this.f46914c.invoke(this.f46913b);
                    return vz.b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.flow.e<? extends S> eVar, h00.l<? super S, vz.b0> lVar) {
            this.f46910c = eVar;
            this.f46911d = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f46909b = kotlinx.coroutines.flow.g.z(kotlinx.coroutines.flow.g.B(this.f46910c, new a(this.f46911d, null)), this.f46908a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a2 a2Var = this.f46909b;
            if (a2Var != null) {
                a2.a.a(a2Var, null, 1, null);
            }
            this.f46909b = null;
        }
    }

    public /* synthetic */ z(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj, s sVar) {
        this.f46903a.c(obj, sVar);
        SparseArray<Parcelable> sparseArray = this.f46904b;
        if (sparseArray == null) {
            return;
        }
        this.f46904b = null;
        this.f46903a.getActual().restoreHierarchyState(sparseArray);
    }

    private final <S> void e(View view, kotlinx.coroutines.flow.e<? extends S> eVar, h00.l<? super S, vz.b0> lVar) {
        view.addOnAttachStateChangeListener(new c(eVar, lVar));
    }

    public final void c(kotlinx.coroutines.flow.e<? extends Object> renderings, s environment) {
        kotlin.jvm.internal.s.g(renderings, "renderings");
        kotlin.jvm.internal.s.g(environment, "environment");
        e(this, renderings, new b(environment));
    }

    public final void d(kotlinx.coroutines.flow.e<? extends Object> renderings, v registry) {
        Map f11;
        kotlin.jvm.internal.s.g(renderings, "renderings");
        kotlin.jvm.internal.s.g(registry, "registry");
        f11 = r0.f(vz.v.a(v.f46897a, registry));
        c(renderings, new s(f11));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        vz.b0 b0Var = null;
        a aVar = parcelable instanceof a ? (a) parcelable : null;
        if (aVar != null) {
            this.f46904b = aVar.a();
            super.onRestoreInstanceState(((a) parcelable).getSuperState());
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.s.e(onSaveInstanceState);
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f46903a.getActual().saveHierarchyState(sparseArray);
        vz.b0 b0Var = vz.b0.f54756a;
        return new a(onSaveInstanceState, sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a extends View.BaseSavedState {
        public static final C1004a CREATOR = new C1004a(null);

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<Parcelable> f46905a;

        /* renamed from: pr.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1004a implements Parcelable.Creator<a> {
            private C1004a() {
            }

            public /* synthetic */ C1004a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a createFromParcel(Parcel source) {
                kotlin.jvm.internal.s.g(source, "source");
                return new a(source);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcelable parcelable, SparseArray<Parcelable> childState) {
            super(parcelable);
            kotlin.jvm.internal.s.g(childState, "childState");
            this.f46905a = childState;
        }

        public final SparseArray<Parcelable> a() {
            return this.f46905a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            super.writeToParcel(out, i11);
            out.writeSparseArray(this.f46905a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcel source) {
            super(source);
            kotlin.jvm.internal.s.g(source, "source");
            SparseArray<Parcelable> readSparseArray = source.readSparseArray(a.class.getClassLoader());
            kotlin.jvm.internal.s.e(readSparseArray);
            kotlin.jvm.internal.s.f(readSparseArray, "source.readSparseArray(SavedState::class.java.classLoader)!!");
            this.f46905a = readSparseArray;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.s.g(context, "context");
        if (getId() == -1) {
            setId(o.f46885b);
        }
        d0 d0Var = new d0(context, null, 0, 0, 14, null);
        d0Var.setUpdatesVisibility(false);
        addView(d0Var, new ViewGroup.LayoutParams(-1, -1));
        vz.b0 b0Var = vz.b0.f54756a;
        this.f46903a = d0Var;
    }
}