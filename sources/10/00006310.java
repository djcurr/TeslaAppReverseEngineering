package com.withpersona.sdk.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.squareup.moshi.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wv.j0;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/Id;", "Landroid/os/Parcelable;", "", Action.CLASS_ATTRIBUTE, "", "requiresSides", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "b", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Id implements Parcelable {
    public static final Parcelable.Creator<Id> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f22540a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f22541b;

    /* loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator<Id> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Id createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Id(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final Id[] newArray(int i11) {
            return new Id[i11];
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Back uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes6.dex */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b Back;
        public static final b BarcodePdf417;
        public static final b Front = new b("Front", 0, j0.f56329d, j0.Q, j0.f56335j);
        public static final b FrontOrBack;
        public static final b PassportSignature;
        private final int overlayHint;
        private final int reviewTitle;
        private final int title;

        private static final /* synthetic */ b[] $values() {
            return new b[]{Front, Back, FrontOrBack, BarcodePdf417, PassportSignature};
        }

        static {
            int i11 = j0.f56327b;
            int i12 = j0.P;
            Back = new b("Back", 1, i11, i12, j0.f56333h);
            FrontOrBack = new b("FrontOrBack", 2, j0.f56330e, j0.R, j0.f56336k);
            BarcodePdf417 = new b("BarcodePdf417", 3, j0.f56328c, i12, j0.f56334i);
            PassportSignature = new b("PassportSignature", 4, j0.f56331f, j0.S, j0.f56337l);
            $VALUES = $values();
        }

        private b(String str, int i11, int i12, int i13, int i14) {
            this.title = i12;
            this.reviewTitle = i13;
            this.overlayHint = i14;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int getOverlayHint() {
            return this.overlayHint;
        }

        public final int getReviewTitle() {
            return this.reviewTitle;
        }

        public final int getTitle() {
            return this.title;
        }
    }

    public Id(String str, List<String> requiresSides) {
        s.g(str, "class");
        s.g(requiresSides, "requiresSides");
        this.f22540a = str;
        this.f22541b = requiresSides;
    }

    public final String a() {
        return this.f22540a;
    }

    public final List<String> b() {
        return this.f22541b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<b> c() {
        b bVar;
        List<String> list = this.f22541b;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            switch (str.hashCode()) {
                case 3015911:
                    if (str.equals("back")) {
                        bVar = b.Back;
                        break;
                    }
                    bVar = null;
                    break;
                case 97705513:
                    if (str.equals("front")) {
                        bVar = b.Front;
                        break;
                    }
                    bVar = null;
                    break;
                case 281190343:
                    if (str.equals("barcode_pdf417")) {
                        bVar = b.BarcodePdf417;
                        break;
                    }
                    bVar = null;
                    break;
                case 1243263179:
                    if (str.equals("passport_signature")) {
                        bVar = b.PassportSignature;
                        break;
                    }
                    bVar = null;
                    break;
                case 1868509613:
                    if (str.equals("front_or_back")) {
                        bVar = b.FrontOrBack;
                        break;
                    }
                    bVar = null;
                    break;
                default:
                    bVar = null;
                    break;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final com.withpersona.sdk.inquiry.governmentid.network.b d() {
        return com.withpersona.sdk.inquiry.governmentid.network.b.Companion.a(this.f22540a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Id) {
            Id id2 = (Id) obj;
            return s.c(this.f22540a, id2.f22540a) && s.c(this.f22541b, id2.f22541b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f22540a.hashCode() * 31) + this.f22541b.hashCode();
    }

    public String toString() {
        return "Id(class=" + this.f22540a + ", requiresSides=" + this.f22541b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f22540a);
        out.writeStringList(this.f22541b);
    }
}