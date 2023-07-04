package ls;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.CalendarContract;
import android.util.LongSparseArray;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import expo.modules.contacts.EXColumns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import org.spongycastle.i18n.MessageBundle;
import vz.b0;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37311a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final g f37312b = g.f21878b.a("CalendarBuilder");

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f37313c = {EXColumns.ID, MessageBundle.TITLE_ENTRY, "eventLocation", "allDay", "calendar_color", "organizer", "calendar_id", "eventStatus", "description"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f37314d = {"begin", "end", "event_id"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f37315e = {EXColumns.ID, "calendar_displayName", "calendar_color"};

    /* renamed from: ls.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    private static final class C0708a {

        /* renamed from: a  reason: collision with root package name */
        private final int f37316a;

        /* renamed from: b  reason: collision with root package name */
        private final String f37317b;

        /* renamed from: c  reason: collision with root package name */
        private final String f37318c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f37319d;

        /* renamed from: e  reason: collision with root package name */
        private final String f37320e;

        /* renamed from: f  reason: collision with root package name */
        private final String f37321f;

        /* renamed from: g  reason: collision with root package name */
        private final int f37322g;

        /* renamed from: h  reason: collision with root package name */
        private final String f37323h;

        public C0708a(int i11, String title, String location, boolean z11, String calendarColor, String organizer, int i12, String description) {
            s.g(title, "title");
            s.g(location, "location");
            s.g(calendarColor, "calendarColor");
            s.g(organizer, "organizer");
            s.g(description, "description");
            this.f37316a = i11;
            this.f37317b = title;
            this.f37318c = location;
            this.f37319d = z11;
            this.f37320e = calendarColor;
            this.f37321f = organizer;
            this.f37322g = i12;
            this.f37323h = description;
        }

        public final boolean a() {
            return this.f37319d;
        }

        public final String b() {
            return this.f37320e;
        }

        public final int c() {
            return this.f37316a;
        }

        public final String d() {
            return this.f37323h;
        }

        public final String e() {
            return this.f37318c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0708a) {
                C0708a c0708a = (C0708a) obj;
                return this.f37316a == c0708a.f37316a && s.c(this.f37317b, c0708a.f37317b) && s.c(this.f37318c, c0708a.f37318c) && this.f37319d == c0708a.f37319d && s.c(this.f37320e, c0708a.f37320e) && s.c(this.f37321f, c0708a.f37321f) && this.f37322g == c0708a.f37322g && s.c(this.f37323h, c0708a.f37323h);
            }
            return false;
        }

        public final String f() {
            return this.f37321f;
        }

        public final int g() {
            return this.f37322g;
        }

        public final String h() {
            return this.f37317b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.f37316a) * 31) + this.f37317b.hashCode()) * 31) + this.f37318c.hashCode()) * 31;
            boolean z11 = this.f37319d;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return ((((((((hashCode + i11) * 31) + this.f37320e.hashCode()) * 31) + this.f37321f.hashCode()) * 31) + Integer.hashCode(this.f37322g)) * 31) + this.f37323h.hashCode();
        }

        public String toString() {
            int i11 = this.f37316a;
            String str = this.f37317b;
            String str2 = this.f37318c;
            boolean z11 = this.f37319d;
            String str3 = this.f37320e;
            String str4 = this.f37321f;
            int i12 = this.f37322g;
            String str5 = this.f37323h;
            return "EventData(calendarID=" + i11 + ", title=" + str + ", location=" + str2 + ", allDay=" + z11 + ", calendarColor=" + str3 + ", organizer=" + str4 + ", status=" + i12 + ", description=" + str5 + ")";
        }
    }

    /* loaded from: classes6.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private long f37324a;

        /* renamed from: b  reason: collision with root package name */
        private long f37325b;

        /* renamed from: c  reason: collision with root package name */
        private long f37326c;

        public b(long j11, long j12, long j13) {
            this.f37324a = j11;
            this.f37325b = j12;
            this.f37326c = j13;
        }

        public final long a() {
            return this.f37324a;
        }

        public final long b() {
            return this.f37325b;
        }

        public final long c() {
            return this.f37326c;
        }
    }

    private a() {
    }

    public final ms.a a(Context context) {
        Map f11;
        Map f12;
        Map f13;
        String str;
        String color;
        Map f14;
        Map f15;
        s.g(context, "context");
        if (!ns.a.f41862a.a(context)) {
            g gVar = f37312b;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f15 = r0.f(v.a(h11, "Calendar read permission not granted!"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f15.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("Calendar read permission not granted!"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("Calendar read permission not granted!", new Object[0]);
            return null;
        }
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        ms.a aVar2 = new ms.a();
        try {
            Cursor query = contentResolver.query(CalendarContract.Calendars.CONTENT_URI, f37315e, null, null, null);
            if (query == null) {
                g gVar2 = f37312b;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String h12 = gVar2.h();
                ht.a aVar3 = ht.a.f29422a;
                f14 = r0.f(v.a(h12, "Failed to get calendar cursor for calendar sync query!"));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : f14.entrySet()) {
                    ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception("Failed to get calendar cursor for calendar sync query!"));
                TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
                n80.a.a("Failed to get calendar cursor for calendar sync query!", new Object[0]);
                return null;
            }
            while (query.moveToNext()) {
                int i11 = query.getInt(0);
                try {
                    str = query.getString(1);
                    if (str == null) {
                        str = Address.ADDRESS_NULL_PLACEHOLDER;
                    }
                } catch (Exception e11) {
                    f37312b.d("Failed to get calendar name", e11);
                    str = "Unknown";
                }
                String str2 = str;
                try {
                    color = Integer.toHexString(query.getInt(2));
                } catch (Exception e12) {
                    f37312b.d("Failed to get calendar color index", e12);
                    color = Integer.toHexString(0);
                }
                s.f(color, "color");
                aVar2.a(i11, str2, color);
            }
            b0 b0Var = b0.f54756a;
            e00.b.a(query, null);
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(10, 0);
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Cursor query2 = CalendarContract.Instances.query(contentResolver, f37314d, timeInMillis, timeInMillis + 172800000);
            if (query2 == null) {
                g gVar3 = f37312b;
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String h13 = gVar3.h();
                ht.a aVar4 = ht.a.f29422a;
                f13 = r0.f(v.a(h13, "Failed to get instance cursor for calendar sync query!"));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : f13.entrySet()) {
                    ht.a.f29422a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception("Failed to get instance cursor for calendar sync query!"));
                TeslaLog.setTag$default(teslaLog3, h13, false, 2, null);
                n80.a.a("Failed to get instance cursor for calendar sync query!", new Object[0]);
                return null;
            }
            while (query2.moveToNext()) {
                long j11 = query2.getLong(0);
                long j12 = query2.getLong(1);
                long j13 = query2.getLong(2);
                arrayList.add(new b(j11, j12, j13));
                hashSet.add(Long.valueOf(j13));
            }
            b0 b0Var2 = b0.f54756a;
            e00.b.a(query2, null);
            int size = hashSet.size();
            String[] strArr = new String[size];
            StringBuilder sb2 = new StringBuilder("(");
            Iterator it2 = hashSet.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                int i13 = i12 + 1;
                strArr[i12] = String.valueOf(((Number) it2.next()).longValue());
                sb2.append('?');
                if (i12 < size - 1) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                }
                i12 = i13;
            }
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            q0 q0Var = q0.f34921a;
            String format = String.format("%s IN %s", Arrays.copyOf(new Object[]{EXColumns.ID, sb2.toString()}, 2));
            s.f(format, "java.lang.String.format(format, *args)");
            LongSparseArray longSparseArray = new LongSparseArray();
            Cursor query3 = context.getContentResolver().query(CalendarContract.Events.CONTENT_URI, f37313c, format, strArr, null);
            if (query3 == null) {
                g gVar4 = f37312b;
                TeslaLog teslaLog4 = TeslaLog.INSTANCE;
                String h14 = gVar4.h();
                ht.a aVar5 = ht.a.f29422a;
                f12 = r0.f(v.a(h14, "Failed to get event cursor for calendar sync query!"));
                FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry4 : f12.entrySet()) {
                    ht.a.f29422a.a((String) entry4.getKey(), (String) entry4.getValue());
                }
                firebaseCrashlytics4.recordException(new Exception("Failed to get event cursor for calendar sync query!"));
                TeslaLog.setTag$default(teslaLog4, h14, false, 2, null);
                n80.a.a("Failed to get event cursor for calendar sync query!", new Object[0]);
                return null;
            }
            while (query3.moveToNext()) {
                long j14 = query3.getLong(0);
                int i14 = query3.getInt(6);
                String string = query3.getString(1);
                String str3 = string == null ? "" : string;
                String string2 = query3.getString(2);
                String str4 = string2 == null ? "" : string2;
                boolean z11 = query3.getInt(3) == 1;
                String hexString = Integer.toHexString(query3.getInt(4));
                s.f(hexString, "toHexString(eventCursor.getInt(EVENT_COLOR_INDEX))");
                String string3 = query3.getString(5);
                String str5 = string3 == null ? "" : string3;
                int i15 = query3.getInt(7);
                String string4 = query3.getString(8);
                longSparseArray.put(j14, new C0708a(i14, str3, str4, z11, hexString, str5, i15, string4 == null ? "" : string4));
            }
            b0 b0Var3 = b0.f54756a;
            e00.b.a(query3, null);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                b bVar = (b) it3.next();
                C0708a c0708a = (C0708a) longSparseArray.get(bVar.c());
                if (c0708a == null) {
                    g gVar5 = f37312b;
                    String str6 = "Unable to find event with ID " + bVar.c();
                    TeslaLog teslaLog5 = TeslaLog.INSTANCE;
                    String h15 = gVar5.h();
                    ht.a aVar6 = ht.a.f29422a;
                    f11 = r0.f(v.a(h15, str6));
                    FirebaseCrashlytics firebaseCrashlytics5 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry5 : f11.entrySet()) {
                        ht.a.f29422a.a((String) entry5.getKey(), (String) entry5.getValue());
                    }
                    firebaseCrashlytics5.recordException(new Exception(str6));
                    TeslaLog.setTag$default(teslaLog5, h15, false, 2, null);
                    n80.a.a(str6, new Object[0]);
                } else {
                    long a11 = bVar.a();
                    long b11 = bVar.b();
                    if (c0708a.a()) {
                        TimeZone timeZone = TimeZone.getDefault();
                        a11 -= timeZone.getOffset(a11);
                        b11 = (b11 - timeZone.getOffset(b11)) - 1000;
                    }
                    ms.a aVar7 = aVar2;
                    aVar2.b(c0708a.c(), bVar.c(), c0708a.h(), a11, b11, c0708a.a(), c0708a.e(), c0708a.b(), c0708a.f(), c0708a.g(), c0708a.d());
                    aVar2 = aVar7;
                }
            }
            return aVar2;
        } catch (Exception e13) {
            f37312b.d("Failed to query calendar", e13);
            return null;
        }
    }
}