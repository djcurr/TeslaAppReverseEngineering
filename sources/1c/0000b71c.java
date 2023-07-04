package u4;

import android.database.Cursor;
import android.os.Build;
import androidx.room.v;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f53111a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f53112b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f53113c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f53114d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f53115a;

        /* renamed from: b  reason: collision with root package name */
        public final String f53116b;

        /* renamed from: c  reason: collision with root package name */
        public final int f53117c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f53118d;

        /* renamed from: e  reason: collision with root package name */
        public final int f53119e;

        /* renamed from: f  reason: collision with root package name */
        public final String f53120f;

        /* renamed from: g  reason: collision with root package name */
        private final int f53121g;

        public a(String str, String str2, boolean z11, int i11, String str3, int i12) {
            this.f53115a = str;
            this.f53116b = str2;
            this.f53118d = z11;
            this.f53119e = i11;
            this.f53117c = c(str2);
            this.f53120f = str3;
            this.f53121g = i12;
        }

        private static boolean a(String str) {
            if (str.length() == 0) {
                return false;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < str.length(); i12++) {
                char charAt = str.charAt(i12);
                if (i12 == 0 && charAt != '(') {
                    return false;
                }
                if (charAt == '(') {
                    i11++;
                } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                    return false;
                }
            }
            return i11 == 0;
        }

        public static boolean b(String str, String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (a(str)) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        private static int c(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean d() {
            return this.f53119e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Build.VERSION.SDK_INT >= 20) {
                    if (this.f53119e != aVar.f53119e) {
                        return false;
                    }
                } else if (d() != aVar.d()) {
                    return false;
                }
                if (this.f53115a.equals(aVar.f53115a) && this.f53118d == aVar.f53118d) {
                    if (this.f53121g != 1 || aVar.f53121g != 2 || (str3 = this.f53120f) == null || b(str3, aVar.f53120f)) {
                        if (this.f53121g != 2 || aVar.f53121g != 1 || (str2 = aVar.f53120f) == null || b(str2, this.f53120f)) {
                            int i11 = this.f53121g;
                            return (i11 == 0 || i11 != aVar.f53121g || ((str = this.f53120f) == null ? aVar.f53120f == null : b(str, aVar.f53120f))) && this.f53117c == aVar.f53117c;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f53115a.hashCode() * 31) + this.f53117c) * 31) + (this.f53118d ? 1231 : 1237)) * 31) + this.f53119e;
        }

        public String toString() {
            return "Column{name='" + this.f53115a + CoreConstants.SINGLE_QUOTE_CHAR + ", type='" + this.f53116b + CoreConstants.SINGLE_QUOTE_CHAR + ", affinity='" + this.f53117c + CoreConstants.SINGLE_QUOTE_CHAR + ", notNull=" + this.f53118d + ", primaryKeyPosition=" + this.f53119e + ", defaultValue='" + this.f53120f + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f53122a;

        /* renamed from: b  reason: collision with root package name */
        public final String f53123b;

        /* renamed from: c  reason: collision with root package name */
        public final String f53124c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f53125d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f53126e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f53122a = str;
            this.f53123b = str2;
            this.f53124c = str3;
            this.f53125d = Collections.unmodifiableList(list);
            this.f53126e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f53122a.equals(bVar.f53122a) && this.f53123b.equals(bVar.f53123b) && this.f53124c.equals(bVar.f53124c) && this.f53125d.equals(bVar.f53125d)) {
                    return this.f53126e.equals(bVar.f53126e);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f53122a.hashCode() * 31) + this.f53123b.hashCode()) * 31) + this.f53124c.hashCode()) * 31) + this.f53125d.hashCode()) * 31) + this.f53126e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f53122a + CoreConstants.SINGLE_QUOTE_CHAR + ", onDelete='" + this.f53123b + CoreConstants.SINGLE_QUOTE_CHAR + ", onUpdate='" + this.f53124c + CoreConstants.SINGLE_QUOTE_CHAR + ", columnNames=" + this.f53125d + ", referenceColumnNames=" + this.f53126e + CoreConstants.CURLY_RIGHT;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        final int f53127a;

        /* renamed from: b  reason: collision with root package name */
        final int f53128b;

        /* renamed from: c  reason: collision with root package name */
        final String f53129c;

        /* renamed from: d  reason: collision with root package name */
        final String f53130d;

        c(int i11, int i12, String str, String str2) {
            this.f53127a = i11;
            this.f53128b = i12;
            this.f53129c = str;
            this.f53130d = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i11 = this.f53127a - cVar.f53127a;
            return i11 == 0 ? this.f53128b - cVar.f53128b : i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f53131a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f53132b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f53133c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f53134d;

        public d(String str, boolean z11, List<String> list) {
            this(str, z11, list, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f53132b == dVar.f53132b && this.f53133c.equals(dVar.f53133c) && this.f53134d.equals(dVar.f53134d)) {
                    if (this.f53131a.startsWith("index_")) {
                        return dVar.f53131a.startsWith("index_");
                    }
                    return this.f53131a.equals(dVar.f53131a);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f53131a.startsWith("index_") ? -1184239155 : this.f53131a.hashCode()) * 31) + (this.f53132b ? 1 : 0)) * 31) + this.f53133c.hashCode()) * 31) + this.f53134d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f53131a + CoreConstants.SINGLE_QUOTE_CHAR + ", unique=" + this.f53132b + ", columns=" + this.f53133c + ", orders=" + this.f53134d + CoreConstants.CURLY_RIGHT;
        }

        public d(String str, boolean z11, List<String> list, List<String> list2) {
            this.f53131a = str;
            this.f53132b = z11;
            this.f53133c = list;
            this.f53134d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), v.ASC.name()) : list2;
        }
    }

    public g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f53111a = str;
        this.f53112b = Collections.unmodifiableMap(map);
        this.f53113c = Collections.unmodifiableSet(set);
        this.f53114d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static g a(v4.g gVar, String str) {
        return new g(str, b(gVar, str), d(gVar, str), f(gVar, str));
    }

    private static Map<String, a> b(v4.g gVar, String str) {
        Cursor a12 = gVar.a1("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (a12.getColumnCount() > 0) {
                int columnIndex = a12.getColumnIndex("name");
                int columnIndex2 = a12.getColumnIndex("type");
                int columnIndex3 = a12.getColumnIndex("notnull");
                int columnIndex4 = a12.getColumnIndex("pk");
                int columnIndex5 = a12.getColumnIndex("dflt_value");
                while (a12.moveToNext()) {
                    String string = a12.getString(columnIndex);
                    hashMap.put(string, new a(string, a12.getString(columnIndex2), a12.getInt(columnIndex3) != 0, a12.getInt(columnIndex4), a12.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            a12.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < count; i11++) {
            cursor.moveToPosition(i11);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(v4.g gVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor a12 = gVar.a1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = a12.getColumnIndex("id");
            int columnIndex2 = a12.getColumnIndex("seq");
            int columnIndex3 = a12.getColumnIndex("table");
            int columnIndex4 = a12.getColumnIndex("on_delete");
            int columnIndex5 = a12.getColumnIndex("on_update");
            List<c> c11 = c(a12);
            int count = a12.getCount();
            for (int i11 = 0; i11 < count; i11++) {
                a12.moveToPosition(i11);
                if (a12.getInt(columnIndex2) == 0) {
                    int i12 = a12.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c11) {
                        if (cVar.f53127a == i12) {
                            arrayList.add(cVar.f53129c);
                            arrayList2.add(cVar.f53130d);
                        }
                    }
                    hashSet.add(new b(a12.getString(columnIndex3), a12.getString(columnIndex4), a12.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            a12.close();
        }
    }

    private static d e(v4.g gVar, String str, boolean z11) {
        Cursor a12 = gVar.a1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = a12.getColumnIndex("seqno");
            int columnIndex2 = a12.getColumnIndex("cid");
            int columnIndex3 = a12.getColumnIndex("name");
            int columnIndex4 = a12.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (a12.moveToNext()) {
                    if (a12.getInt(columnIndex2) >= 0) {
                        int i11 = a12.getInt(columnIndex);
                        String string = a12.getString(columnIndex3);
                        String str2 = a12.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i11), string);
                        treeMap2.put(Integer.valueOf(i11), str2);
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                ArrayList arrayList2 = new ArrayList(treeMap2.size());
                arrayList2.addAll(treeMap2.values());
                return new d(str, z11, arrayList, arrayList2);
            }
            return null;
        } finally {
            a12.close();
        }
    }

    private static Set<d> f(v4.g gVar, String str) {
        Cursor a12 = gVar.a1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = a12.getColumnIndex("name");
            int columnIndex2 = a12.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            int columnIndex3 = a12.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (a12.moveToNext()) {
                    if (cg.c.f9084i.equals(a12.getString(columnIndex2))) {
                        String string = a12.getString(columnIndex);
                        boolean z11 = true;
                        if (a12.getInt(columnIndex3) != 1) {
                            z11 = false;
                        }
                        d e11 = e(gVar, string, z11);
                        if (e11 == null) {
                            return null;
                        }
                        hashSet.add(e11);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            a12.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str = this.f53111a;
            if (str == null ? gVar.f53111a == null : str.equals(gVar.f53111a)) {
                Map<String, a> map = this.f53112b;
                if (map == null ? gVar.f53112b == null : map.equals(gVar.f53112b)) {
                    Set<b> set2 = this.f53113c;
                    if (set2 == null ? gVar.f53113c == null : set2.equals(gVar.f53113c)) {
                        Set<d> set3 = this.f53114d;
                        if (set3 == null || (set = gVar.f53114d) == null) {
                            return true;
                        }
                        return set3.equals(set);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f53111a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f53112b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f53113c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f53111a + CoreConstants.SINGLE_QUOTE_CHAR + ", columns=" + this.f53112b + ", foreignKeys=" + this.f53113c + ", indices=" + this.f53114d + CoreConstants.CURLY_RIGHT;
    }
}