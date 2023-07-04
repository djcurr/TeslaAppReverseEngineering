package gw;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class c0 implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final List<n> f28227a;

    /* loaded from: classes6.dex */
    public static final class b extends c0 {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final List<n> f28230b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f28231c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(n.CREATOR.createFromParcel(parcel));
                }
                return new b(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public /* synthetic */ b(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? false : z11);
        }

        @Override // gw.c0
        public List<n> a() {
            return this.f28230b;
        }

        public final boolean c() {
            return this.f28231c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            List<n> list = this.f28230b;
            out.writeInt(list.size());
            for (n nVar : list) {
                nVar.writeToParcel(out, i11);
            }
            out.writeInt(this.f28231c ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<n> selfies, boolean z11) {
            super(selfies, null);
            kotlin.jvm.internal.s.g(selfies, "selfies");
            this.f28230b = selfies;
            this.f28231c = z11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends c0 {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final List<n> f28232b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f28233c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(n.CREATOR.createFromParcel(parcel));
                }
                return new c(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public /* synthetic */ c(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? false : z11);
        }

        @Override // gw.c0
        public List<n> a() {
            return this.f28232b;
        }

        public final boolean c() {
            return this.f28233c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            List<n> list = this.f28232b;
            out.writeInt(list.size());
            for (n nVar : list) {
                nVar.writeToParcel(out, i11);
            }
            out.writeInt(this.f28233c ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<n> selfies, boolean z11) {
            super(selfies, null);
            kotlin.jvm.internal.s.g(selfies, "selfies");
            this.f28232b = selfies;
            this.f28233c = z11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends c0 {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final c0 f28234b;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new d((c0) parcel.readParcelable(d.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c0 nextState) {
            super(nextState.a(), null);
            kotlin.jvm.internal.s.g(nextState, "nextState");
            this.f28234b = nextState;
        }

        public final c0 c() {
            return this.f28234b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeParcelable(this.f28234b, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends c0 {

        /* renamed from: b  reason: collision with root package name */
        public static final f f28237b = new f();
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                parcel.readInt();
                return f.f28237b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final f[] newArray(int i11) {
                return new f[i11];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private f() {
            /*
                r2 = this;
                java.util.List r0 = wz.u.i()
                r1 = 0
                r2.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.c0.f.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends c0 {

        /* renamed from: b  reason: collision with root package name */
        public static final g f28238b = new g();
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final g createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                parcel.readInt();
                return g.f28238b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final g[] newArray(int i11) {
                return new g[i11];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private g() {
            /*
                r2 = this;
                java.util.List r0 = wz.u.i()
                r1 = 0
                r2.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.c0.g.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends c0 {

        /* renamed from: b  reason: collision with root package name */
        public static final h f28239b = new h();
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final h createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                parcel.readInt();
                return h.f28239b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final h[] newArray(int i11) {
                return new h[i11];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private h() {
            /*
                r2 = this;
                java.util.List r0 = wz.u.i()
                r1 = 0
                r2.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.c0.h.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends c0 {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final Integer f28240b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f28241c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final i createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new i(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final i[] newArray(int i11) {
                return new i[i11];
            }
        }

        public i() {
            this(null, false, 3, null);
        }

        public /* synthetic */ i(Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? false : z11);
        }

        public static /* synthetic */ i d(i iVar, Integer num, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = iVar.f28240b;
            }
            if ((i11 & 2) != 0) {
                z11 = iVar.f28241c;
            }
            return iVar.c(num, z11);
        }

        public final i c(Integer num, boolean z11) {
            return new i(num, z11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f28241c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return kotlin.jvm.internal.s.c(this.f28240b, iVar.f28240b) && this.f28241c == iVar.f28241c;
            }
            return false;
        }

        public final Integer f() {
            return this.f28240b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Integer num = this.f28240b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            boolean z11 = this.f28241c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            return "StartCapture(countDown=" + this.f28240b + ", centered=" + this.f28241c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            int intValue;
            kotlin.jvm.internal.s.g(out, "out");
            Integer num = this.f28240b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f28241c ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(java.lang.Integer r3, boolean r4) {
            /*
                r2 = this;
                java.util.List r0 = wz.u.i()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f28240b = r3
                r2.f28241c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.c0.i.<init>(java.lang.Integer, boolean):void");
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends c0 {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final List<n> f28242b;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final j createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(n.CREATOR.createFromParcel(parcel));
                }
                return new j(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final j[] newArray(int i11) {
                return new j[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<n> selfies) {
            super(selfies, null);
            kotlin.jvm.internal.s.g(selfies, "selfies");
            this.f28242b = selfies;
        }

        @Override // gw.c0
        public List<n> a() {
            return this.f28242b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            List<n> list = this.f28242b;
            out.writeInt(list.size());
            for (n nVar : list) {
                nVar.writeToParcel(out, i11);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class k extends c0 {

        /* renamed from: b  reason: collision with root package name */
        public static final k f28243b = new k();
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final k createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                parcel.readInt();
                return k.f28243b;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final k[] newArray(int i11) {
                return new k[i11];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private k() {
            /*
                r2 = this;
                java.util.List r0 = wz.u.i()
                r1 = 0
                r2.<init>(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.c0.k.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(1);
        }
    }

    private c0(List<n> list) {
        this.f28227a = list;
    }

    public /* synthetic */ c0(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public List<n> a() {
        return this.f28227a;
    }

    public final c0 b(n selfie) {
        List v02;
        List v03;
        List v04;
        List v05;
        List v06;
        kotlin.jvm.internal.s.g(selfie, "selfie");
        h hVar = h.f28239b;
        if (kotlin.jvm.internal.s.c(this, hVar)) {
            return hVar;
        }
        g gVar = g.f28238b;
        if (kotlin.jvm.internal.s.c(this, gVar)) {
            return gVar;
        }
        if (this instanceof i) {
            return this;
        }
        if (this instanceof a) {
            v06 = wz.e0.v0(a(), selfie);
            return new a(v06, false, 2, null);
        } else if (this instanceof b) {
            v05 = wz.e0.v0(a(), selfie);
            return new b(v05, false, 2, null);
        } else if (this instanceof c) {
            v04 = wz.e0.v0(a(), selfie);
            return new c(v04, false, 2, null);
        } else if (this instanceof e) {
            v03 = wz.e0.v0(a(), selfie);
            return new e(v03, false, 2, null);
        } else if (this instanceof j) {
            v02 = wz.e0.v0(a(), selfie);
            return new j(v02);
        } else if (this instanceof d) {
            return new d(((d) this).c().b(selfie));
        } else {
            k kVar = k.f28243b;
            if (kotlin.jvm.internal.s.c(this, kVar)) {
                return kVar;
            }
            f fVar = f.f28237b;
            if (kotlin.jvm.internal.s.c(this, fVar)) {
                return fVar;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* loaded from: classes6.dex */
    public static final class a extends c0 {
        public static final Parcelable.Creator<a> CREATOR = new C0536a();

        /* renamed from: b  reason: collision with root package name */
        private final List<n> f28228b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f28229c;

        /* renamed from: gw.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0536a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(n.CREATOR.createFromParcel(parcel));
                }
                return new a(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a() {
            this(null, false, 3, null);
        }

        public /* synthetic */ a(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? false : z11);
        }

        @Override // gw.c0
        public List<n> a() {
            return this.f28228b;
        }

        public final boolean c() {
            return this.f28229c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            List<n> list = this.f28228b;
            out.writeInt(list.size());
            for (n nVar : list) {
                nVar.writeToParcel(out, i11);
            }
            out.writeInt(this.f28229c ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<n> selfies, boolean z11) {
            super(selfies, null);
            kotlin.jvm.internal.s.g(selfies, "selfies");
            this.f28228b = selfies;
            this.f28229c = z11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends c0 {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final List<n> f28235b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f28236c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(n.CREATOR.createFromParcel(parcel));
                }
                return new e(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i11) {
                return new e[i11];
            }
        }

        public e() {
            this(null, false, 3, null);
        }

        public /* synthetic */ e(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? false : z11);
        }

        @Override // gw.c0
        public List<n> a() {
            return this.f28235b;
        }

        public final boolean c() {
            return this.f28236c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            List<n> list = this.f28235b;
            out.writeInt(list.size());
            for (n nVar : list) {
                nVar.writeToParcel(out, i11);
            }
            out.writeInt(this.f28236c ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<n> selfies, boolean z11) {
            super(selfies, null);
            kotlin.jvm.internal.s.g(selfies, "selfies");
            this.f28235b = selfies;
            this.f28236c = z11;
        }
    }
}