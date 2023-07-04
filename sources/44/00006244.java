package com.withpersona.sdk.inquiry;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import zv.z;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nR(\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk/inquiry/Fields;", "", "", "", "Lzv/z;", "fields", "Ljava/util/Map;", "getFields$inquiry_public_productionRelease", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "Builder", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Fields {
    private final Map<String, z> fields;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0006J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ*\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002JN\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0017\u001a\u00020\u0016R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk/inquiry/Fields$Builder;", "", "", "name", "value", "field", "", "", "phoneNumber", "emailAddress", "Ljava/util/Calendar;", "birthdate", "first", "middle", "last", "street1", "street2", "city", "subdivision", "postalCode", "countryCode", "address", "Lcom/withpersona/sdk/inquiry/Fields;", "build", "", "Lzv/z;", "fields", "Ljava/util/Map;", "<init>", "()V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final Map<String, z> fields = new LinkedHashMap();

        public static /* synthetic */ Builder address$default(Builder builder, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            if ((i11 & 8) != 0) {
                str4 = null;
            }
            if ((i11 & 16) != 0) {
                str5 = null;
            }
            if ((i11 & 32) != 0) {
                str6 = null;
            }
            return builder.address(str, str2, str3, str4, str5, str6);
        }

        public static /* synthetic */ Builder name$default(Builder builder, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return builder.name(str, str2, str3);
        }

        public final Builder address(String str, String str2, String str3, String str4, String str5, String str6) {
            if (str != null) {
                field("addressStreet1", str);
            }
            if (str2 != null) {
                field("addressStreet2", str2);
            }
            if (str3 != null) {
                field("addressCity", str3);
            }
            if (str4 != null) {
                field("addressSubdivision", str4);
            }
            if (str5 != null) {
                field("addressPostalCode", str5);
            }
            if (str6 != null) {
                field("addressCountryCode", str6);
            }
            return this;
        }

        public final Builder birthdate(Calendar birthdate) {
            s.g(birthdate, "birthdate");
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(birthdate.getTime());
            s.f(format, "birthdate.let {\n        …format(it.time)\n        }");
            return field("birthdate", format);
        }

        public final Fields build() {
            return new Fields(this.fields, null);
        }

        public final Builder emailAddress(String emailAddress) {
            s.g(emailAddress, "emailAddress");
            return field("emailAddress", emailAddress);
        }

        public final Builder field(String name, String value) {
            s.g(name, "name");
            s.g(value, "value");
            this.fields.put(name, new z.c(value));
            return this;
        }

        public final Builder name(String str, String str2, String str3) {
            if (str != null) {
                field("nameFirst", str);
            }
            if (str2 != null) {
                field("nameMiddle", str2);
            }
            if (str3 != null) {
                field("nameLast", str3);
            }
            return this;
        }

        public final Builder phoneNumber(String phoneNumber) {
            s.g(phoneNumber, "phoneNumber");
            return field("phoneNumber", phoneNumber);
        }

        public final Builder field(String name, int i11) {
            s.g(name, "name");
            this.fields.put(name, new z.b(i11));
            return this;
        }

        public final Builder field(String name, boolean z11) {
            s.g(name, "name");
            this.fields.put(name, new z.a(z11));
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Fields(Map<String, ? extends z> map) {
        this.fields = map;
    }

    public /* synthetic */ Fields(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map<String, z> getFields$inquiry_public_productionRelease() {
        return this.fields;
    }
}