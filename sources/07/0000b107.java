package rr;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.squareup.workflow1.ui.backstack.StateRegistryAggregator;
import h00.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import u20.p;
import vz.b0;
import vz.v;
import wz.e0;
import wz.x;
import wz.y0;

/* loaded from: classes2.dex */
public final class h implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, j> f49654a;

    /* renamed from: b  reason: collision with root package name */
    private f f49655b;

    /* renamed from: c  reason: collision with root package name */
    private final StateRegistryAggregator f49656c;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<h> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            parcel.readMap(linkedHashMap, h.class.getClassLoader());
            return new h(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public h[] newArray(int i11) {
            return new h[i11];
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends u implements l<StateRegistryAggregator, b0> {
        c() {
            super(1);
        }

        public final void a(StateRegistryAggregator aggregator) {
            s.g(aggregator, "aggregator");
            f fVar = h.this.f49655b;
            if (fVar == null) {
                return;
            }
            aggregator.m(fVar.b(), fVar.a());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(StateRegistryAggregator stateRegistryAggregator) {
            a(stateRegistryAggregator);
            return b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends u implements l<StateRegistryAggregator, b0> {
        d() {
            super(1);
        }

        public final void a(StateRegistryAggregator aggregator) {
            s.g(aggregator, "aggregator");
            f fVar = h.this.f49655b;
            if (fVar == null) {
                return;
            }
            aggregator.l(fVar.b(), fVar.a());
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(StateRegistryAggregator stateRegistryAggregator) {
            a(stateRegistryAggregator);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends u implements l<pr.l<?>, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f49660a = new e();

        e() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final String invoke(pr.l<?> it2) {
            s.g(it2, "it");
            return it2.a();
        }
    }

    public h(Map<String, j> viewStates) {
        s.g(viewStates, "viewStates");
        this.f49654a = viewStates;
        this.f49656c = new StateRegistryAggregator(new c(), new d());
    }

    private final void f(Collection<String> collection) {
        Set k11;
        k11 = y0.k(this.f49654a.keySet(), collection);
        wz.b0.E(this.f49654a.keySet(), k11);
        this.f49656c.j(collection);
    }

    public final void b(String key, androidx.savedstate.c parentOwner) {
        s.g(key, "key");
        s.g(parentOwner, "parentOwner");
        this.f49656c.g(key, parentOwner);
    }

    public final void c() {
        this.f49656c.h();
    }

    public final Map<String, j> d() {
        return this.f49654a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(Collection<? extends pr.l<?>> retaining) {
        int t11;
        s.g(retaining, "retaining");
        t11 = x.t(retaining, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<T> it2 = retaining.iterator();
        while (it2.hasNext()) {
            arrayList.add(((pr.l) it2.next()).a());
        }
        f(arrayList);
    }

    public final void g(h from) {
        s.g(from, "from");
        this.f49654a.clear();
        this.f49654a.putAll(from.f49654a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Collection<? extends pr.l<?>> retainedRenderings, View view, View newView) {
        String b11;
        u20.h S;
        u20.h B;
        Set K;
        String b12;
        s.g(retainedRenderings, "retainedRenderings");
        s.g(newView, "newView");
        b11 = i.b(newView);
        S = e0.S(retainedRenderings);
        B = p.B(S, e.f49660a);
        K = p.K(B);
        if (retainedRenderings.size() == K.size()) {
            f a11 = f.f49649d.a(newView, b11);
            this.f49655b = a11;
            this.f49656c.l(b11, a11.a());
            j remove = this.f49654a.remove(b11);
            if (remove != null) {
                newView.restoreHierarchyState(remove.a());
            }
            if (view != null) {
                b12 = i.b(view);
                if (!K.contains(b12)) {
                    b12 = null;
                }
                if (b12 != null) {
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    view.saveHierarchyState(sparseArray);
                    Map<String, j> d11 = d();
                    vz.p a12 = v.a(b12, new j(b12, sparseArray));
                    d11.put(a12.c(), a12.d());
                    androidx.savedstate.c a13 = androidx.savedstate.d.a(view);
                    Objects.requireNonNull(a13, "null cannot be cast to non-null type com.squareup.workflow1.ui.backstack.KeyedStateRegistryOwner");
                    this.f49656c.m(b12, ((f) a13).a());
                }
            }
            f(K);
            return;
        }
        throw new IllegalArgumentException(("Duplicate entries not allowed in " + retainedRenderings + CoreConstants.DOT).toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        parcel.writeMap(this.f49654a);
    }

    /* loaded from: classes2.dex */
    public static final class b extends View.BaseSavedState {
        public static final a CREATOR = new a(null);

        /* renamed from: a  reason: collision with root package name */
        private final h f49657a;

        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<b> {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel source) {
                s.g(source, "source");
                return new b(source);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Parcelable parcelable, h viewStateCache) {
            super(parcelable);
            s.g(viewStateCache, "viewStateCache");
            this.f49657a = viewStateCache;
        }

        public final h a() {
            return this.f49657a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            super.writeToParcel(out, i11);
            out.writeParcelable(this.f49657a, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Parcel source) {
            super(source);
            s.g(source, "source");
            Parcelable readParcelable = source.readParcelable(b.class.getClassLoader());
            s.e(readParcelable);
            s.f(readParcelable, "source.readParcelable(SavedState::class.java.classLoader)!!");
            this.f49657a = (h) readParcelable;
        }
    }

    public h() {
        this(new LinkedHashMap());
    }
}