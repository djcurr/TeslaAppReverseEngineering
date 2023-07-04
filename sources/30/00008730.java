package ms;

import com.tesla.data.oapi.Calendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.x;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, C0750a> f38931a = new LinkedHashMap();

    /* loaded from: classes6.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        private final long f38936a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38937b;

        /* renamed from: c  reason: collision with root package name */
        private final long f38938c;

        /* renamed from: d  reason: collision with root package name */
        private final long f38939d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f38940e;

        /* renamed from: f  reason: collision with root package name */
        private final String f38941f;

        /* renamed from: g  reason: collision with root package name */
        private final String f38942g;

        /* renamed from: h  reason: collision with root package name */
        private final String f38943h;

        /* renamed from: i  reason: collision with root package name */
        private final int f38944i;

        /* renamed from: j  reason: collision with root package name */
        private final String f38945j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f38946k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f38947l;

        public b(long j11, String name, long j12, long j13, boolean z11, String location, String color, String organizer, int i11, String description) {
            s.g(name, "name");
            s.g(location, "location");
            s.g(color, "color");
            s.g(organizer, "organizer");
            s.g(description, "description");
            this.f38936a = j11;
            this.f38937b = name;
            this.f38938c = j12;
            this.f38939d = j13;
            this.f38940e = z11;
            this.f38941f = location;
            this.f38942g = color;
            this.f38943h = organizer;
            this.f38944i = i11;
            this.f38945j = description;
            this.f38946k = i11 == 2;
            this.f38947l = i11 == 0;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b other) {
            s.g(other, "other");
            long j11 = this.f38938c;
            long j12 = other.f38938c;
            if (j11 == j12) {
                j11 = this.f38936a;
                j12 = other.f38936a;
            }
            return (int) (j11 - j12);
        }

        public final boolean b() {
            return this.f38940e;
        }

        public final boolean c() {
            return this.f38946k;
        }

        public final String d() {
            return this.f38945j;
        }

        public final long e() {
            return this.f38939d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f38936a == bVar.f38936a && s.c(this.f38937b, bVar.f38937b) && this.f38938c == bVar.f38938c && this.f38939d == bVar.f38939d && this.f38940e == bVar.f38940e && s.c(this.f38941f, bVar.f38941f) && s.c(this.f38942g, bVar.f38942g) && s.c(this.f38943h, bVar.f38943h) && this.f38944i == bVar.f38944i && s.c(this.f38945j, bVar.f38945j);
            }
            return false;
        }

        public final long f() {
            return this.f38938c;
        }

        public final String g() {
            return this.f38941f;
        }

        public final String h() {
            return this.f38937b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((Long.hashCode(this.f38936a) * 31) + this.f38937b.hashCode()) * 31) + Long.hashCode(this.f38938c)) * 31) + Long.hashCode(this.f38939d)) * 31;
            boolean z11 = this.f38940e;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return ((((((((((hashCode + i11) * 31) + this.f38941f.hashCode()) * 31) + this.f38942g.hashCode()) * 31) + this.f38943h.hashCode()) * 31) + Integer.hashCode(this.f38944i)) * 31) + this.f38945j.hashCode();
        }

        public final String i() {
            return this.f38943h;
        }

        public final boolean k() {
            return this.f38947l;
        }

        public String toString() {
            long j11 = this.f38936a;
            String str = this.f38937b;
            long j12 = this.f38938c;
            long j13 = this.f38939d;
            boolean z11 = this.f38940e;
            String str2 = this.f38941f;
            String str3 = this.f38942g;
            String str4 = this.f38943h;
            int i11 = this.f38944i;
            String str5 = this.f38945j;
            return "CalendarEvent(eventId=" + j11 + ", name=" + str + ", dtstart=" + j12 + ", dtend=" + j13 + ", allDay=" + z11 + ", location=" + str2 + ", color=" + str3 + ", organizer=" + str4 + ", status=" + i11 + ", description=" + str5 + ")";
        }
    }

    public final void a(int i11, String name, String color) {
        s.g(name, "name");
        s.g(color, "color");
        this.f38931a.put(Integer.valueOf(i11), new C0750a(i11, name, color, null, 8, null));
    }

    public final void b(int i11, long j11, String title, long j12, long j13, boolean z11, String location, String color, String organizer, int i12, String description) {
        s.g(title, "title");
        s.g(location, "location");
        s.g(color, "color");
        s.g(organizer, "organizer");
        s.g(description, "description");
        C0750a c0750a = this.f38931a.get(Integer.valueOf(i11));
        if (c0750a == null) {
            return;
        }
        c0750a.a(new b(j11, title, j12, j13, z11, location, color, organizer, i12, description));
    }

    public final List<Calendar> c() {
        int t11;
        int t12;
        Collection<C0750a> values = this.f38931a.values();
        int i11 = 10;
        t11 = x.t(values, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (C0750a c0750a : values) {
            String e11 = c0750a.e();
            String c11 = c0750a.c();
            List<b> d11 = c0750a.d();
            t12 = x.t(d11, i11);
            ArrayList arrayList2 = new ArrayList(t12);
            for (b bVar : d11) {
                arrayList2.add(new Calendar.Event(bVar.b(), bVar.f(), bVar.e(), bVar.h(), bVar.g(), bVar.d(), bVar.i(), Boolean.valueOf(bVar.c()), Boolean.valueOf(bVar.k())));
            }
            arrayList.add(new Calendar(e11, c11, arrayList2));
            i11 = 10;
        }
        return arrayList;
    }

    /* renamed from: ms.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0750a implements Comparable<C0750a> {

        /* renamed from: a  reason: collision with root package name */
        private final int f38932a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38933b;

        /* renamed from: c  reason: collision with root package name */
        private final String f38934c;

        /* renamed from: d  reason: collision with root package name */
        private final List<b> f38935d;

        public C0750a(int i11, String name, String color, List<b> _events) {
            s.g(name, "name");
            s.g(color, "color");
            s.g(_events, "_events");
            this.f38932a = i11;
            this.f38933b = name;
            this.f38934c = color;
            this.f38935d = _events;
        }

        public final boolean a(b event) {
            s.g(event, "event");
            return this.f38935d.add(event);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(C0750a other) {
            s.g(other, "other");
            return s.i(this.f38932a, other.f38932a);
        }

        public final String c() {
            return this.f38934c;
        }

        public final List<b> d() {
            List<b> F0;
            F0 = e0.F0(this.f38935d);
            return F0;
        }

        public final String e() {
            return this.f38933b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0750a) {
                C0750a c0750a = (C0750a) obj;
                return this.f38932a == c0750a.f38932a && s.c(this.f38933b, c0750a.f38933b) && s.c(this.f38934c, c0750a.f38934c) && s.c(this.f38935d, c0750a.f38935d);
            }
            return false;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f38932a) * 31) + this.f38933b.hashCode()) * 31) + this.f38934c.hashCode()) * 31) + this.f38935d.hashCode();
        }

        public String toString() {
            int i11 = this.f38932a;
            String str = this.f38933b;
            String str2 = this.f38934c;
            List<b> list = this.f38935d;
            return "Calendar(id=" + i11 + ", name=" + str + ", color=" + str2 + ", _events=" + list + ")";
        }

        public /* synthetic */ C0750a(int i11, String str, String str2, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, str, str2, (i12 & 8) != 0 ? new ArrayList() : list);
        }
    }
}