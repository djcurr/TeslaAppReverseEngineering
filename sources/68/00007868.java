package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f31922a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a> f31923b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f31924c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f31925d;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i11) {
        this(i11, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long a(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property c11 = osObjectSchemaInfo.c(str2);
        a aVar = new a(c11);
        this.f31922a.put(str, aVar);
        this.f31923b.put(str2, aVar);
        this.f31924c.put(str, str2);
        return c11.c();
    }

    protected abstract void b(c cVar, c cVar2);

    public void c(c cVar) {
        if (this.f31925d) {
            Objects.requireNonNull(cVar, "Attempt to copy null ColumnInfo");
            this.f31922a.clear();
            this.f31922a.putAll(cVar.f31922a);
            this.f31923b.clear();
            this.f31923b.putAll(cVar.f31923b);
            this.f31924c.clear();
            this.f31924c.putAll(cVar.f31924c);
            b(cVar, this);
            return;
        }
        throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnInfo[");
        sb2.append("mutable=" + this.f31925d);
        sb2.append(",");
        boolean z11 = false;
        if (this.f31922a != null) {
            sb2.append("JavaFieldNames=[");
            boolean z12 = false;
            for (Map.Entry<String, a> entry : this.f31922a.entrySet()) {
                if (z12) {
                    sb2.append(",");
                }
                sb2.append(entry.getKey());
                sb2.append("->");
                sb2.append(entry.getValue());
                z12 = true;
            }
            sb2.append("]");
        }
        if (this.f31923b != null) {
            sb2.append(", InternalFieldNames=[");
            for (Map.Entry<String, a> entry2 : this.f31923b.entrySet()) {
                if (z11) {
                    sb2.append(",");
                }
                sb2.append(entry2.getKey());
                sb2.append("->");
                sb2.append(entry2.getValue());
                z11 = true;
            }
            sb2.append("]");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(c cVar, boolean z11) {
        this(cVar == null ? 0 : cVar.f31922a.size(), z11);
        if (cVar != null) {
            this.f31922a.putAll(cVar.f31922a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f31926a;

        /* renamed from: b  reason: collision with root package name */
        public final RealmFieldType f31927b;

        /* renamed from: c  reason: collision with root package name */
        public final String f31928c;

        private a(long j11, RealmFieldType realmFieldType, String str) {
            this.f31926a = j11;
            this.f31927b = realmFieldType;
            this.f31928c = str;
        }

        public String toString() {
            return "ColumnDetails[" + this.f31926a + ", " + this.f31927b + ", " + this.f31928c + "]";
        }

        a(Property property) {
            this(property.c(), property.e(), property.d());
        }
    }

    private c(int i11, boolean z11) {
        this.f31922a = new HashMap(i11);
        this.f31923b = new HashMap(i11);
        this.f31924c = new HashMap(i11);
        this.f31925d = z11;
    }
}