package v6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class k extends e7.f {
    public static final Parcelable.Creator<k> CREATOR;

    /* renamed from: o  reason: collision with root package name */
    private static final x6.a[] f54149o;

    /* renamed from: p  reason: collision with root package name */
    public static final List<x6.a> f54150p;

    /* renamed from: d  reason: collision with root package name */
    private final String f54151d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f54152e;

    /* renamed from: f  reason: collision with root package name */
    private final List<x6.a> f54153f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54154g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f54155h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f54156i;

    /* renamed from: j  reason: collision with root package name */
    private final b0 f54157j;

    /* renamed from: k  reason: collision with root package name */
    private final u f54158k;

    /* renamed from: l  reason: collision with root package name */
    private final e7.a f54159l;

    /* renamed from: m  reason: collision with root package name */
    private final q f54160m;

    /* renamed from: n  reason: collision with root package name */
    private final v6.a f54161n;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public k[] newArray(int i11) {
            return new k[i11];
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends e7.c<k> {

        /* renamed from: d  reason: collision with root package name */
        private List<x6.a> f54162d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f54163e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f54164f;

        /* renamed from: g  reason: collision with root package name */
        private String f54165g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f54166h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f54167i;

        /* renamed from: j  reason: collision with root package name */
        private b0 f54168j;

        /* renamed from: k  reason: collision with root package name */
        private u f54169k;

        /* renamed from: l  reason: collision with root package name */
        private e7.a f54170l;

        /* renamed from: m  reason: collision with root package name */
        private q f54171m;

        /* renamed from: n  reason: collision with root package name */
        private v6.a f54172n;

        public b(k kVar) {
            super(kVar);
            this.f54162d = Collections.emptyList();
            this.f54164f = true;
            this.f54168j = b0.HIDE;
            this.f54169k = u.HIDE;
            this.f54170l = e7.a.NONE;
            this.f54162d = kVar.j();
            this.f54163e = kVar.m();
            this.f54164f = kVar.n();
            this.f54165g = kVar.h();
            this.f54166h = kVar.k();
            this.f54167i = kVar.l();
            this.f54168j = kVar.i();
            this.f54169k = kVar.g();
            this.f54170l = kVar.e();
            this.f54171m = kVar.f();
            this.f54172n = kVar.d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e7.c
        /* renamed from: s */
        public k b() {
            return new k(this);
        }

        public b t(x6.a... aVarArr) {
            this.f54162d = Arrays.asList(aVarArr);
            return this;
        }
    }

    static {
        x6.a[] aVarArr = {x6.a.VISA, x6.a.AMERICAN_EXPRESS, x6.a.MASTERCARD};
        f54149o = aVarArr;
        f54150p = Collections.unmodifiableList(Arrays.asList(aVarArr));
        CREATOR = new a();
    }

    k(b bVar) {
        super(bVar.e(), bVar.d(), bVar.c());
        this.f54152e = bVar.f54163e;
        this.f54153f = bVar.f54162d;
        this.f54151d = bVar.f54165g;
        this.f54154g = bVar.f54164f;
        this.f54155h = bVar.f54166h;
        this.f54156i = bVar.f54167i;
        this.f54157j = bVar.f54168j;
        this.f54158k = bVar.f54169k;
        this.f54159l = bVar.f54170l;
        this.f54160m = bVar.f54171m;
        this.f54161n = bVar.f54172n;
    }

    public v6.a d() {
        return this.f54161n;
    }

    public e7.a e() {
        return this.f54159l;
    }

    public q f() {
        return this.f54160m;
    }

    public u g() {
        return this.f54158k;
    }

    public String h() {
        return this.f54151d;
    }

    public b0 i() {
        return this.f54157j;
    }

    public List<x6.a> j() {
        return this.f54153f;
    }

    public boolean k() {
        return this.f54155h;
    }

    public boolean l() {
        return this.f54156i;
    }

    public boolean m() {
        return this.f54152e;
    }

    public boolean n() {
        return this.f54154g;
    }

    public b o() {
        return new b(this);
    }

    @Override // e7.f, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f54151d);
        q7.c.b(parcel, this.f54152e);
        parcel.writeList(this.f54153f);
        q7.c.b(parcel, this.f54154g);
        q7.c.b(parcel, this.f54155h);
        q7.c.b(parcel, this.f54156i);
        parcel.writeString(this.f54157j.name());
        parcel.writeString(this.f54158k.name());
        parcel.writeSerializable(this.f54159l);
        parcel.writeParcelable(this.f54160m, i11);
        parcel.writeParcelable(this.f54161n, i11);
    }

    k(Parcel parcel) {
        super(parcel);
        this.f54151d = parcel.readString();
        this.f54152e = q7.c.a(parcel);
        this.f54153f = parcel.readArrayList(x6.a.class.getClassLoader());
        this.f54154g = q7.c.a(parcel);
        this.f54155h = q7.c.a(parcel);
        this.f54156i = q7.c.a(parcel);
        this.f54157j = b0.valueOf(parcel.readString());
        this.f54158k = u.valueOf(parcel.readString());
        this.f54159l = (e7.a) parcel.readSerializable();
        this.f54160m = (q) parcel.readParcelable(q.class.getClassLoader());
        this.f54161n = (v6.a) parcel.readParcelable(v6.a.class.getClassLoader());
    }
}