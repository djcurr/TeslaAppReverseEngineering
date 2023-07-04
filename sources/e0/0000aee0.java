package qv;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u;
import nr.v;
import nr.y;
import qv.j;
import sv.a;
import sv.e;
import vz.b0;
import wz.e0;

/* loaded from: classes6.dex */
public final class m extends nr.k<a, j, b, c> {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f48590a;

    /* renamed from: b  reason: collision with root package name */
    private final a.b f48591b;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f48592a;

        /* renamed from: b  reason: collision with root package name */
        private final String f48593b;

        /* renamed from: c  reason: collision with root package name */
        private final String f48594c;

        /* renamed from: d  reason: collision with root package name */
        private final List<String> f48595d;

        /* renamed from: e  reason: collision with root package name */
        private final C1050a f48596e;

        /* renamed from: qv.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1050a implements Parcelable {
            public static final Parcelable.Creator<C1050a> CREATOR = new C1051a();

            /* renamed from: a  reason: collision with root package name */
            private final String f48597a;

            /* renamed from: b  reason: collision with root package name */
            private final String f48598b;

            /* renamed from: c  reason: collision with root package name */
            private final String f48599c;

            /* renamed from: d  reason: collision with root package name */
            private final String f48600d;

            /* renamed from: e  reason: collision with root package name */
            private final String f48601e;

            /* renamed from: f  reason: collision with root package name */
            private final String f48602f;

            /* renamed from: g  reason: collision with root package name */
            private final String f48603g;

            /* renamed from: h  reason: collision with root package name */
            private final String f48604h;

            /* renamed from: i  reason: collision with root package name */
            private final String f48605i;

            /* renamed from: j  reason: collision with root package name */
            private final String f48606j;

            /* renamed from: k  reason: collision with root package name */
            private final String f48607k;

            /* renamed from: l  reason: collision with root package name */
            private final String f48608l;

            /* renamed from: qv.m$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1051a implements Parcelable.Creator<C1050a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final C1050a createFromParcel(Parcel parcel) {
                    kotlin.jvm.internal.s.g(parcel, "parcel");
                    return new C1050a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final C1050a[] newArray(int i11) {
                    return new C1050a[i11];
                }
            }

            public C1050a(String birthdate, String nameFirst, String nameMiddle, String nameLast, String addressStreet1, String addressStreet2, String addressCity, String addressSubdivision, String addressSubdivisionAbbr, String addressPostalCode, String addressCountryCode, String phoneNumber) {
                kotlin.jvm.internal.s.g(birthdate, "birthdate");
                kotlin.jvm.internal.s.g(nameFirst, "nameFirst");
                kotlin.jvm.internal.s.g(nameMiddle, "nameMiddle");
                kotlin.jvm.internal.s.g(nameLast, "nameLast");
                kotlin.jvm.internal.s.g(addressStreet1, "addressStreet1");
                kotlin.jvm.internal.s.g(addressStreet2, "addressStreet2");
                kotlin.jvm.internal.s.g(addressCity, "addressCity");
                kotlin.jvm.internal.s.g(addressSubdivision, "addressSubdivision");
                kotlin.jvm.internal.s.g(addressSubdivisionAbbr, "addressSubdivisionAbbr");
                kotlin.jvm.internal.s.g(addressPostalCode, "addressPostalCode");
                kotlin.jvm.internal.s.g(addressCountryCode, "addressCountryCode");
                kotlin.jvm.internal.s.g(phoneNumber, "phoneNumber");
                this.f48597a = birthdate;
                this.f48598b = nameFirst;
                this.f48599c = nameMiddle;
                this.f48600d = nameLast;
                this.f48601e = addressStreet1;
                this.f48602f = addressStreet2;
                this.f48603g = addressCity;
                this.f48604h = addressSubdivision;
                this.f48605i = addressSubdivisionAbbr;
                this.f48606j = addressPostalCode;
                this.f48607k = addressCountryCode;
                this.f48608l = phoneNumber;
            }

            public final String a() {
                return this.f48603g;
            }

            public final String b() {
                return this.f48606j;
            }

            public final String c() {
                return this.f48601e;
            }

            public final String d() {
                return this.f48602f;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f48604h;
            }

            public final String f() {
                return this.f48605i;
            }

            public final String g() {
                return this.f48597a;
            }

            public final String h() {
                return this.f48598b;
            }

            public final String i() {
                return this.f48600d;
            }

            public final String j() {
                return this.f48599c;
            }

            public final String k() {
                return this.f48608l;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                kotlin.jvm.internal.s.g(out, "out");
                out.writeString(this.f48597a);
                out.writeString(this.f48598b);
                out.writeString(this.f48599c);
                out.writeString(this.f48600d);
                out.writeString(this.f48601e);
                out.writeString(this.f48602f);
                out.writeString(this.f48603g);
                out.writeString(this.f48604h);
                out.writeString(this.f48605i);
                out.writeString(this.f48606j);
                out.writeString(this.f48607k);
                out.writeString(this.f48608l);
            }
        }

        public a(String sessionToken, String verificationToken, String countryCode, List<String> inputFields, C1050a prefill) {
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(verificationToken, "verificationToken");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            kotlin.jvm.internal.s.g(inputFields, "inputFields");
            kotlin.jvm.internal.s.g(prefill, "prefill");
            this.f48592a = sessionToken;
            this.f48593b = verificationToken;
            this.f48594c = countryCode;
            this.f48595d = inputFields;
            this.f48596e = prefill;
        }

        public final String a() {
            return this.f48594c;
        }

        public final List<String> b() {
            return this.f48595d;
        }

        public final C1050a c() {
            return this.f48596e;
        }

        public final String d() {
            return this.f48592a;
        }

        public final String e() {
            return this.f48593b;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b {

        /* loaded from: classes6.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f48609a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: qv.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1052b extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1052b(String message) {
                super(null);
                kotlin.jvm.internal.s.g(message, "message");
            }
        }

        /* loaded from: classes6.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f48610a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class c {

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final j.b f48611a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f48612b;

            /* renamed from: c  reason: collision with root package name */
            private final h00.l<AbstractC1053a, b0> f48613c;

            /* renamed from: d  reason: collision with root package name */
            private final h00.a<b0> f48614d;

            /* renamed from: e  reason: collision with root package name */
            private final h00.a<b0> f48615e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f48616f;

            /* renamed from: qv.m$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static abstract class AbstractC1053a {

                /* renamed from: a  reason: collision with root package name */
                private final String f48617a;

                /* renamed from: qv.m$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1054a extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1054a(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$b */
                /* loaded from: classes6.dex */
                public static final class b extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$c  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1055c extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1055c(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$d */
                /* loaded from: classes6.dex */
                public static final class d extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public d(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$e */
                /* loaded from: classes6.dex */
                public static final class e extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$f */
                /* loaded from: classes6.dex */
                public static final class f extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$g */
                /* loaded from: classes6.dex */
                public static final class g extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$h */
                /* loaded from: classes6.dex */
                public static final class h extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$i */
                /* loaded from: classes6.dex */
                public static final class i extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                /* renamed from: qv.m$c$a$a$j */
                /* loaded from: classes6.dex */
                public static final class j extends AbstractC1053a {
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public j(String text) {
                        super(text, null);
                        kotlin.jvm.internal.s.g(text, "text");
                    }
                }

                private AbstractC1053a(String str) {
                    this.f48617a = str;
                }

                public /* synthetic */ AbstractC1053a(String str, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str);
                }

                public final String a() {
                    return this.f48617a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j.b state, boolean z11, h00.l<? super AbstractC1053a, b0> onTextChange, h00.a<b0> onSubmit, h00.a<b0> onIdVisibilityToggle, boolean z12) {
                super(null);
                kotlin.jvm.internal.s.g(state, "state");
                kotlin.jvm.internal.s.g(onTextChange, "onTextChange");
                kotlin.jvm.internal.s.g(onSubmit, "onSubmit");
                kotlin.jvm.internal.s.g(onIdVisibilityToggle, "onIdVisibilityToggle");
                this.f48611a = state;
                this.f48612b = z11;
                this.f48613c = onTextChange;
                this.f48614d = onSubmit;
                this.f48615e = onIdVisibilityToggle;
                this.f48616f = z12;
            }

            public final boolean a() {
                return this.f48616f;
            }

            public final h00.a<b0> b() {
                return this.f48615e;
            }

            public final h00.a<b0> c() {
                return this.f48614d;
            }

            public final h00.l<AbstractC1053a, b0> d() {
                return this.f48613c;
            }

            public final j.b e() {
                return this.f48611a;
            }

            public final boolean f() {
                return this.f48612b;
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f48618a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class d extends u implements h00.l<c.a.AbstractC1053a, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<a, j, b, c>.a f48619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f48620b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f48621c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, j, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.a.AbstractC1053a f48622a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f48623b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c.a.AbstractC1053a abstractC1053a, j jVar) {
                super(1);
                this.f48622a = abstractC1053a;
                this.f48623b = jVar;
            }

            public final void a(nr.q<? super a, j, ? extends b>.c action) {
                j.b a11;
                kotlin.jvm.internal.s.g(action, "$this$action");
                c.a.AbstractC1053a abstractC1053a = this.f48622a;
                if (abstractC1053a instanceof c.a.AbstractC1053a.C1055c) {
                    j jVar = this.f48623b;
                    j.b bVar = (j.b) jVar;
                    j.b.c.d j11 = ((j.b) jVar).j();
                    a11 = bVar.a((r20 & 1) != 0 ? bVar.f48538a : null, (r20 & 2) != 0 ? bVar.f48539b : j11 != null ? j.b.c.d.c(j11, this.f48622a.a(), null, null, 6, null) : null, (r20 & 4) != 0 ? bVar.f48540c : null, (r20 & 8) != 0 ? bVar.f48541d : null, (r20 & 16) != 0 ? bVar.f48542e : null, (r20 & 32) != 0 ? bVar.f48543f : null, (r20 & 64) != 0 ? bVar.f48544g : null, (r20 & 128) != 0 ? bVar.f48545h : false, (r20 & 256) != 0 ? bVar.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.e) {
                    j jVar2 = this.f48623b;
                    j.b bVar2 = (j.b) jVar2;
                    j.b.c.d j12 = ((j.b) jVar2).j();
                    a11 = bVar2.a((r20 & 1) != 0 ? bVar2.f48538a : null, (r20 & 2) != 0 ? bVar2.f48539b : j12 != null ? j.b.c.d.c(j12, null, null, this.f48622a.a(), 3, null) : null, (r20 & 4) != 0 ? bVar2.f48540c : null, (r20 & 8) != 0 ? bVar2.f48541d : null, (r20 & 16) != 0 ? bVar2.f48542e : null, (r20 & 32) != 0 ? bVar2.f48543f : null, (r20 & 64) != 0 ? bVar2.f48544g : null, (r20 & 128) != 0 ? bVar2.f48545h : false, (r20 & 256) != 0 ? bVar2.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.d) {
                    j jVar3 = this.f48623b;
                    j.b bVar3 = (j.b) jVar3;
                    j.b.c.C1044c h11 = ((j.b) jVar3).h();
                    a11 = bVar3.a((r20 & 1) != 0 ? bVar3.f48538a : null, (r20 & 2) != 0 ? bVar3.f48539b : null, (r20 & 4) != 0 ? bVar3.f48540c : null, (r20 & 8) != 0 ? bVar3.f48541d : null, (r20 & 16) != 0 ? bVar3.f48542e : h11 != null ? j.b.c.C1044c.c(h11, null, this.f48622a.a(), 1, null) : null, (r20 & 32) != 0 ? bVar3.f48543f : null, (r20 & 64) != 0 ? bVar3.f48544g : null, (r20 & 128) != 0 ? bVar3.f48545h : false, (r20 & 256) != 0 ? bVar3.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.f) {
                    j jVar4 = this.f48623b;
                    j.b bVar4 = (j.b) jVar4;
                    j.b.c.e k11 = ((j.b) jVar4).k();
                    a11 = bVar4.a((r20 & 1) != 0 ? bVar4.f48538a : null, (r20 & 2) != 0 ? bVar4.f48539b : null, (r20 & 4) != 0 ? bVar4.f48540c : null, (r20 & 8) != 0 ? bVar4.f48541d : null, (r20 & 16) != 0 ? bVar4.f48542e : null, (r20 & 32) != 0 ? bVar4.f48543f : k11 != null ? k11.b(this.f48622a.a()) : null, (r20 & 64) != 0 ? bVar4.f48544g : null, (r20 & 128) != 0 ? bVar4.f48545h : false, (r20 & 256) != 0 ? bVar4.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.C1054a) {
                    j jVar5 = this.f48623b;
                    j.b bVar5 = (j.b) jVar5;
                    j.b.c.C1043b e11 = ((j.b) jVar5).e();
                    a11 = bVar5.a((r20 & 1) != 0 ? bVar5.f48538a : null, (r20 & 2) != 0 ? bVar5.f48539b : null, (r20 & 4) != 0 ? bVar5.f48540c : null, (r20 & 8) != 0 ? bVar5.f48541d : e11 != null ? e11.b(this.f48622a.a()) : null, (r20 & 16) != 0 ? bVar5.f48542e : null, (r20 & 32) != 0 ? bVar5.f48543f : null, (r20 & 64) != 0 ? bVar5.f48544g : null, (r20 & 128) != 0 ? bVar5.f48545h : false, (r20 & 256) != 0 ? bVar5.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.h) {
                    j jVar6 = this.f48623b;
                    j.b bVar6 = (j.b) jVar6;
                    j.b.c.a d11 = ((j.b) jVar6).d();
                    a11 = bVar6.a((r20 & 1) != 0 ? bVar6.f48538a : null, (r20 & 2) != 0 ? bVar6.f48539b : null, (r20 & 4) != 0 ? bVar6.f48540c : d11 != null ? j.b.c.a.c(d11, this.f48622a.a(), null, null, null, null, 30, null) : null, (r20 & 8) != 0 ? bVar6.f48541d : null, (r20 & 16) != 0 ? bVar6.f48542e : null, (r20 & 32) != 0 ? bVar6.f48543f : null, (r20 & 64) != 0 ? bVar6.f48544g : null, (r20 & 128) != 0 ? bVar6.f48545h : false, (r20 & 256) != 0 ? bVar6.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.i) {
                    j jVar7 = this.f48623b;
                    j.b bVar7 = (j.b) jVar7;
                    j.b.c.a d12 = ((j.b) jVar7).d();
                    a11 = bVar7.a((r20 & 1) != 0 ? bVar7.f48538a : null, (r20 & 2) != 0 ? bVar7.f48539b : null, (r20 & 4) != 0 ? bVar7.f48540c : d12 != null ? j.b.c.a.c(d12, null, this.f48622a.a(), null, null, null, 29, null) : null, (r20 & 8) != 0 ? bVar7.f48541d : null, (r20 & 16) != 0 ? bVar7.f48542e : null, (r20 & 32) != 0 ? bVar7.f48543f : null, (r20 & 64) != 0 ? bVar7.f48544g : null, (r20 & 128) != 0 ? bVar7.f48545h : false, (r20 & 256) != 0 ? bVar7.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.b) {
                    j jVar8 = this.f48623b;
                    j.b bVar8 = (j.b) jVar8;
                    j.b.c.a d13 = ((j.b) jVar8).d();
                    a11 = bVar8.a((r20 & 1) != 0 ? bVar8.f48538a : null, (r20 & 2) != 0 ? bVar8.f48539b : null, (r20 & 4) != 0 ? bVar8.f48540c : d13 != null ? j.b.c.a.c(d13, null, null, this.f48622a.a(), null, null, 27, null) : null, (r20 & 8) != 0 ? bVar8.f48541d : null, (r20 & 16) != 0 ? bVar8.f48542e : null, (r20 & 32) != 0 ? bVar8.f48543f : null, (r20 & 64) != 0 ? bVar8.f48544g : null, (r20 & 128) != 0 ? bVar8.f48545h : false, (r20 & 256) != 0 ? bVar8.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.j) {
                    j jVar9 = this.f48623b;
                    j.b bVar9 = (j.b) jVar9;
                    j.b.c.a d14 = ((j.b) jVar9).d();
                    a11 = bVar9.a((r20 & 1) != 0 ? bVar9.f48538a : null, (r20 & 2) != 0 ? bVar9.f48539b : null, (r20 & 4) != 0 ? bVar9.f48540c : d14 != null ? j.b.c.a.c(d14, null, null, null, this.f48622a.a(), null, 23, null) : null, (r20 & 8) != 0 ? bVar9.f48541d : null, (r20 & 16) != 0 ? bVar9.f48542e : null, (r20 & 32) != 0 ? bVar9.f48543f : null, (r20 & 64) != 0 ? bVar9.f48544g : null, (r20 & 128) != 0 ? bVar9.f48545h : false, (r20 & 256) != 0 ? bVar9.f48546i : false);
                } else if (abstractC1053a instanceof c.a.AbstractC1053a.g) {
                    j jVar10 = this.f48623b;
                    j.b bVar10 = (j.b) jVar10;
                    j.b.c.a d15 = ((j.b) jVar10).d();
                    a11 = bVar10.a((r20 & 1) != 0 ? bVar10.f48538a : null, (r20 & 2) != 0 ? bVar10.f48539b : null, (r20 & 4) != 0 ? bVar10.f48540c : d15 != null ? j.b.c.a.c(d15, null, null, null, null, this.f48622a.a(), 15, null) : null, (r20 & 8) != 0 ? bVar10.f48541d : null, (r20 & 16) != 0 ? bVar10.f48542e : null, (r20 & 32) != 0 ? bVar10.f48543f : null, (r20 & 64) != 0 ? bVar10.f48544g : null, (r20 & 128) != 0 ? bVar10.f48545h : false, (r20 & 256) != 0 ? bVar10.f48546i : false);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                action.e(a11);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, j, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(nr.k<? super a, j, ? extends b, ? extends c>.a aVar, m mVar, j jVar) {
            super(1);
            this.f48619a = aVar;
            this.f48620b = mVar;
            this.f48621c = jVar;
        }

        public final void a(c.a.AbstractC1053a field) {
            nr.q<? super a, j, ? extends b> d11;
            kotlin.jvm.internal.s.g(field, "field");
            nr.h<nr.q<? super a, j, ? extends b>> b11 = this.f48619a.b();
            d11 = y.d(this.f48620b, null, new a(field, this.f48621c), 1, null);
            b11.d(d11);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(c.a.AbstractC1053a abstractC1053a) {
            a(abstractC1053a);
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class e extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<a, j, b, c>.a f48624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f48625b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f48626c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, j, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f48627a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(1);
                this.f48627a = jVar;
            }

            public final void a(nr.q<? super a, j, ? extends b>.c action) {
                j.b a11;
                kotlin.jvm.internal.s.g(action, "$this$action");
                a11 = r2.a((r20 & 1) != 0 ? r2.f48538a : null, (r20 & 2) != 0 ? r2.f48539b : null, (r20 & 4) != 0 ? r2.f48540c : null, (r20 & 8) != 0 ? r2.f48541d : null, (r20 & 16) != 0 ? r2.f48542e : null, (r20 & 32) != 0 ? r2.f48543f : null, (r20 & 64) != 0 ? r2.f48544g : null, (r20 & 128) != 0 ? r2.f48545h : false, (r20 & 256) != 0 ? ((j.b) this.f48627a).f48546i : false);
                action.e(new j.c(a11));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, j, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(nr.k<? super a, j, ? extends b, ? extends c>.a aVar, m mVar, j jVar) {
            super(0);
            this.f48624a = aVar;
            this.f48625b = mVar;
            this.f48626c = jVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super a, j, ? extends b> d11;
            nr.h<nr.q<? super a, j, ? extends b>> b11 = this.f48624a.b();
            d11 = y.d(this.f48625b, null, new a(this.f48626c), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class f extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nr.k<a, j, b, c>.a f48628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f48629b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f48630c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, j, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f48631a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(1);
                this.f48631a = jVar;
            }

            public final void a(nr.q<? super a, j, ? extends b>.c action) {
                j.b a11;
                kotlin.jvm.internal.s.g(action, "$this$action");
                j jVar = this.f48631a;
                a11 = r1.a((r20 & 1) != 0 ? r1.f48538a : null, (r20 & 2) != 0 ? r1.f48539b : null, (r20 & 4) != 0 ? r1.f48540c : null, (r20 & 8) != 0 ? r1.f48541d : null, (r20 & 16) != 0 ? r1.f48542e : null, (r20 & 32) != 0 ? r1.f48543f : null, (r20 & 64) != 0 ? r1.f48544g : null, (r20 & 128) != 0 ? r1.f48545h : !((j.b) jVar).i(), (r20 & 256) != 0 ? ((j.b) jVar).f48546i : false);
                action.e(a11);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, j, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(nr.k<? super a, j, ? extends b, ? extends c>.a aVar, m mVar, j jVar) {
            super(0);
            this.f48628a = aVar;
            this.f48629b = mVar;
            this.f48630c = jVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            nr.q<? super a, j, ? extends b> d11;
            nr.h<nr.q<? super a, j, ? extends b>> b11 = this.f48628a.b();
            d11 = y.d(this.f48629b, null, new a(this.f48630c), 1, null);
            b11.d(d11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class g extends u implements h00.l<e.b, nr.q<? super a, j, ? extends b>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f48633b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, j, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f48634a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super a, j, ? extends b>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.e(j.a.f48536a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, j, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends u implements h00.l<nr.q<? super a, j, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f48635a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar) {
                super(1);
                this.f48635a = jVar;
            }

            public final void a(nr.q<? super a, j, ? extends b>.c action) {
                j.b a11;
                kotlin.jvm.internal.s.g(action, "$this$action");
                a11 = r1.a((r20 & 1) != 0 ? r1.f48538a : null, (r20 & 2) != 0 ? r1.f48539b : null, (r20 & 4) != 0 ? r1.f48540c : null, (r20 & 8) != 0 ? r1.f48541d : null, (r20 & 16) != 0 ? r1.f48542e : null, (r20 & 32) != 0 ? r1.f48543f : null, (r20 & 64) != 0 ? r1.f48544g : null, (r20 & 128) != 0 ? r1.f48545h : false, (r20 & 256) != 0 ? ((j.c) this.f48635a).a().f48546i : true);
                action.e(a11);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, j, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j jVar) {
            super(1);
            this.f48633b = jVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<a, j, b> invoke(e.b it2) {
            nr.q<a, j, b> d11;
            nr.q<a, j, b> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (kotlin.jvm.internal.s.c(it2, e.b.C1130b.f50701a)) {
                d12 = y.d(m.this, null, a.f48634a, 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, e.b.a.f50700a)) {
                d11 = y.d(m.this, null, new b(this.f48633b), 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class h extends u implements h00.l<a.c, nr.q<? super a, j, ? extends b>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a extends u implements h00.l<nr.q<? super a, j, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f48637a = new a();

            a() {
                super(1);
            }

            public final void a(nr.q<? super a, j, ? extends b>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(b.c.f48610a);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, j, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class b extends u implements h00.l<nr.q<? super a, j, ? extends b>.c, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f48638a = new b();

            b() {
                super(1);
            }

            public final void a(nr.q<? super a, j, ? extends b>.c action) {
                kotlin.jvm.internal.s.g(action, "$this$action");
                action.d(new b.C1052b("There was a problem retrieving the status of the database verification."));
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(nr.q<? super a, j, ? extends b>.c cVar) {
                a(cVar);
                return b0.f54756a;
            }
        }

        h() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final nr.q<a, j, b> invoke(a.c it2) {
            nr.q<a, j, b> d11;
            nr.q<a, j, b> d12;
            kotlin.jvm.internal.s.g(it2, "it");
            if (kotlin.jvm.internal.s.c(it2, a.c.C1128c.f50670a) ? true : kotlin.jvm.internal.s.c(it2, a.c.b.f50669a)) {
                d12 = y.d(m.this, null, a.f48637a, 1, null);
                return d12;
            } else if (kotlin.jvm.internal.s.c(it2, a.c.C1127a.f50668a)) {
                d11 = y.d(m.this, null, b.f48638a, 1, null);
                return d11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public m(e.a updateVerificationWorker, a.b checkVerificationWorker) {
        kotlin.jvm.internal.s.g(updateVerificationWorker, "updateVerificationWorker");
        kotlin.jvm.internal.s.g(checkVerificationWorker, "checkVerificationWorker");
        this.f48590a = updateVerificationWorker;
        this.f48591b = checkVerificationWorker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.os.Parcelable, java.lang.Object] */
    @Override // nr.k
    /* renamed from: h */
    public j d(a props, nr.i iVar) {
        Set<String> S0;
        kotlin.jvm.internal.s.g(props, "props");
        j jVar = null;
        if (iVar != null) {
            okio.i b11 = iVar.b();
            if (!(b11.z() > 0)) {
                b11 = null;
            }
            if (b11 != null) {
                Parcel obtain = Parcel.obtain();
                kotlin.jvm.internal.s.f(obtain, "obtain()");
                byte[] E = b11.E();
                obtain.unmarshall(E, 0, E.length);
                obtain.setDataPosition(0);
                ?? readParcelable = obtain.readParcelable(nr.i.class.getClassLoader());
                kotlin.jvm.internal.s.e(readParcelable);
                kotlin.jvm.internal.s.f(readParcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                obtain.recycle();
                jVar = readParcelable;
            }
            jVar = jVar;
        }
        if (jVar == null) {
            j.b.a aVar = j.b.f48537j;
            S0 = e0.S0(props.b());
            return aVar.a(S0, props.a(), props.c());
        }
        return jVar;
    }

    @Override // nr.k
    /* renamed from: i */
    public c f(a props, j state, nr.k<? super a, j, ? extends b, ? extends c>.a context) {
        kotlin.jvm.internal.s.g(props, "props");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(context, "context");
        if (state instanceof j.b) {
            j.b bVar = (j.b) state;
            return new c.a(bVar, false, new d(context, this, state), new e(context, this, state), new f(context, this, state), bVar.g());
        } else if (state instanceof j.c) {
            v.i(context, this.f48590a.a(props.d(), props.e(), ((j.c) state).a().l()), m0.m(sv.e.class), "", new g(state));
            return c.b.f48618a;
        } else if (state instanceof j.a) {
            v.i(context, this.f48591b.a(props.d(), props.e()), m0.m(sv.a.class), "", new h());
            return c.b.f48618a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // nr.k
    /* renamed from: j */
    public nr.i g(j state) {
        kotlin.jvm.internal.s.g(state, "state");
        return jw.a.a(state);
    }
}