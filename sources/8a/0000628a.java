package com.withpersona.sdk.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.spongycastle.i18n.MessageBundle;

@g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/DocumentDescription;", "Landroid/os/Parcelable;", "", "kind", MessageBundle.TITLE_ENTRY, "prompt", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "document_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DocumentDescription implements Parcelable {
    public static final Parcelable.Creator<DocumentDescription> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f22334a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22335b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22336c;

    /* renamed from: d  reason: collision with root package name */
    private final String f22337d;

    /* loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator<DocumentDescription> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DocumentDescription createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new DocumentDescription(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final DocumentDescription[] newArray(int i11) {
            return new DocumentDescription[i11];
        }
    }

    public DocumentDescription(String kind, String title, String prompt, String description) {
        s.g(kind, "kind");
        s.g(title, "title");
        s.g(prompt, "prompt");
        s.g(description, "description");
        this.f22334a = kind;
        this.f22335b = title;
        this.f22336c = prompt;
        this.f22337d = description;
    }

    public final String a() {
        return this.f22334a;
    }

    public final String b() {
        return this.f22336c;
    }

    public final String c() {
        return this.f22335b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getDescription() {
        return this.f22337d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f22334a);
        out.writeString(this.f22335b);
        out.writeString(this.f22336c);
        out.writeString(this.f22337d);
    }
}