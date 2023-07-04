package com.withpersona.sdk.inquiry.internal.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.withpersona.sdk.inquiry.document.DocumentDescription;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import ir.d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class NextStep {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22683b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f22684a;

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Completed;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Completed$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Completed$Config;)V", "Config", "CustomTranslations", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Completed extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22685c;

        /* renamed from: d  reason: collision with root package name */
        private final Config f22686d;

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Completed$Config;", "", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$b;", "pictograph", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Completed$CustomTranslations;", "customTranslations", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/NextStep$b;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Completed$CustomTranslations;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Config {

            /* renamed from: a  reason: collision with root package name */
            private final b f22687a;

            /* renamed from: b  reason: collision with root package name */
            private final CustomTranslations f22688b;

            public Config(b bVar, CustomTranslations customTranslations) {
                this.f22687a = bVar;
                this.f22688b = customTranslations;
            }

            public final CustomTranslations a() {
                return this.f22688b;
            }

            public final b b() {
                return this.f22687a;
            }
        }

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Completed$CustomTranslations;", "Landroid/os/Parcelable;", "", "successTitle", "successPrompt", "successBtnSubmit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class CustomTranslations implements Parcelable {
            public static final Parcelable.Creator<CustomTranslations> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            private final String f22689a;

            /* renamed from: b  reason: collision with root package name */
            private final String f22690b;

            /* renamed from: c  reason: collision with root package name */
            private final String f22691c;

            /* loaded from: classes6.dex */
            public static final class a implements Parcelable.Creator<CustomTranslations> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final CustomTranslations createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new CustomTranslations(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final CustomTranslations[] newArray(int i11) {
                    return new CustomTranslations[i11];
                }
            }

            public CustomTranslations(String str, String str2, String str3) {
                this.f22689a = str;
                this.f22690b = str2;
                this.f22691c = str3;
            }

            public final String a() {
                return this.f22691c;
            }

            public final String b() {
                return this.f22690b;
            }

            public final String c() {
                return this.f22689a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.f22689a);
                out.writeString(this.f22690b);
                out.writeString(this.f22691c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(String name, Config config) {
            super(name, null);
            s.g(name, "name");
            s.g(config, "config");
            this.f22685c = name;
            this.f22686d = config;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22685c;
        }

        public final Config b() {
            return this.f22686d;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$CountrySelect;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$CountrySelect$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$CountrySelect$Config;)V", "Config", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class CountrySelect extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22692c;

        /* renamed from: d  reason: collision with root package name */
        private final Config f22693d;

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$CountrySelect$Config;", "", "", "", "enabledCountryCodes", "<init>", "(Ljava/util/List;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Config {

            /* renamed from: a  reason: collision with root package name */
            private final List<String> f22694a;

            public Config(List<String> list) {
                this.f22694a = list;
            }

            public final List<String> a() {
                return this.f22694a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountrySelect(String name, Config config) {
            super(name, null);
            s.g(name, "name");
            s.g(config, "config");
            this.f22692c = name;
            this.f22693d = config;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22692c;
        }

        public final Config b() {
            return this.f22693d;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Database;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Database$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Database$Config;)V", "Config", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Database extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22695c;

        /* renamed from: d  reason: collision with root package name */
        private final Config f22696d;

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Database$Config;", "", "", "", "inputFields", "enabledCountryCodes", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Config {

            /* renamed from: a  reason: collision with root package name */
            private final List<String> f22697a;

            /* renamed from: b  reason: collision with root package name */
            private final List<String> f22698b;

            public Config(List<String> list, List<String> list2) {
                this.f22697a = list;
                this.f22698b = list2;
            }

            public final List<String> a() {
                return this.f22698b;
            }

            public final List<String> b() {
                return this.f22697a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Database(String name, Config config) {
            super(name, null);
            s.g(name, "name");
            s.g(config, "config");
            this.f22695c = name;
            this.f22696d = config;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22695c;
        }

        public final Config b() {
            return this.f22696d;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$DocumentsUpload;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$DocumentsUpload$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$DocumentsUpload$Config;)V", "Config", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class DocumentsUpload extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22699c;

        /* renamed from: d  reason: collision with root package name */
        private final Config f22700d;

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$DocumentsUpload$Config;", "", "", "Lcom/withpersona/sdk/inquiry/document/DocumentDescription;", "required", "<init>", "(Ljava/util/List;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Config {

            /* renamed from: a  reason: collision with root package name */
            private final List<DocumentDescription> f22701a;

            public Config(List<DocumentDescription> list) {
                this.f22701a = list;
            }

            public final List<DocumentDescription> a() {
                return this.f22701a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentsUpload(String name, Config config) {
            super(name, null);
            s.g(name, "name");
            s.g(config, "config");
            this.f22699c = name;
            this.f22700d = config;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22699c;
        }

        public final Config b() {
            return this.f22700d;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Failed;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Failed$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Failed$Config;)V", "Config", "CustomTranslations", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Failed extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22702c;

        /* renamed from: d  reason: collision with root package name */
        private final Config f22703d;

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Failed$Config;", "", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$b;", "pictograph", "", "hasSupport", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Failed$CustomTranslations;", "customTranslations", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/NextStep$b;Ljava/lang/Boolean;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Failed$CustomTranslations;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Config {

            /* renamed from: a  reason: collision with root package name */
            private final b f22704a;

            /* renamed from: b  reason: collision with root package name */
            private final Boolean f22705b;

            /* renamed from: c  reason: collision with root package name */
            private final CustomTranslations f22706c;

            public Config(b bVar, Boolean bool, CustomTranslations customTranslations) {
                this.f22704a = bVar;
                this.f22705b = bool;
                this.f22706c = customTranslations;
            }

            public final CustomTranslations a() {
                return this.f22706c;
            }

            public final Boolean b() {
                return this.f22705b;
            }

            public final b c() {
                return this.f22704a;
            }
        }

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Failed$CustomTranslations;", "Landroid/os/Parcelable;", "", "failedTitle", "failedPrompt", "failedBtnSubmit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class CustomTranslations implements Parcelable {
            public static final Parcelable.Creator<CustomTranslations> CREATOR = new a();

            /* renamed from: a  reason: collision with root package name */
            private final String f22707a;

            /* renamed from: b  reason: collision with root package name */
            private final String f22708b;

            /* renamed from: c  reason: collision with root package name */
            private final String f22709c;

            /* loaded from: classes6.dex */
            public static final class a implements Parcelable.Creator<CustomTranslations> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final CustomTranslations createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new CustomTranslations(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final CustomTranslations[] newArray(int i11) {
                    return new CustomTranslations[i11];
                }
            }

            public CustomTranslations(String str, String str2, String str3) {
                this.f22707a = str;
                this.f22708b = str2;
                this.f22709c = str3;
            }

            public final String a() {
                return this.f22709c;
            }

            public final String b() {
                return this.f22708b;
            }

            public final String c() {
                return this.f22707a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.f22707a);
                out.writeString(this.f22708b);
                out.writeString(this.f22709c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String name, Config config) {
            super(name, null);
            s.g(name, "name");
            s.g(config, "config");
            this.f22702c = name;
            this.f22703d = config;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22702c;
        }

        public final Config b() {
            return this.f22703d;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$GovernmentId;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$GovernmentId$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$GovernmentId$Config;)V", "Config", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class GovernmentId extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22710c;

        /* renamed from: d  reason: collision with root package name */
        private final Config f22711d;

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$GovernmentId$Config;", "", "", "", "", "Lcom/withpersona/sdk/inquiry/governmentid/network/Id;", "enabledIdClassesByCountry", "<init>", "(Ljava/util/Map;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Config {

            /* renamed from: a  reason: collision with root package name */
            private final Map<String, List<Id>> f22712a;

            /* JADX WARN: Multi-variable type inference failed */
            public Config(Map<String, ? extends List<Id>> map) {
                this.f22712a = map;
            }

            public final Map<String, List<Id>> a() {
                return this.f22712a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GovernmentId(String name, Config config) {
            super(name, null);
            s.g(name, "name");
            s.g(config, "config");
            this.f22710c = name;
            this.f22711d = config;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22710c;
        }

        public final Config b() {
            return this.f22711d;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$PhoneNumber;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "<init>", "(Ljava/lang/String;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class PhoneNumber extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22713c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneNumber(String name) {
            super(name, null);
            s.g(name, "name");
            this.f22713c = name;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22713c;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Selfie;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Selfie$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Selfie$Config;)V", "Config", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Selfie extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22714c;

        /* renamed from: d  reason: collision with root package name */
        private final Config f22715d;

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Selfie$Config;", "", "", "requireSelfieMatch", "", "skipStart", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Config {

            /* renamed from: a  reason: collision with root package name */
            private final String f22716a;

            /* renamed from: b  reason: collision with root package name */
            private final Boolean f22717b;

            public Config(String str, Boolean bool) {
                this.f22716a = str;
                this.f22717b = bool;
            }

            public final String a() {
                return this.f22716a;
            }

            public final Boolean b() {
                return this.f22717b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selfie(String name, Config config) {
            super(name, null);
            s.g(name, "name");
            s.g(config, "config");
            this.f22714c = name;
            this.f22715d = config;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22714c;
        }

        public final Config b() {
            return this.f22715d;
        }
    }

    @g(generateAdapter = true)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Start;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep;", "", "name", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Start$Config;", "config", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Start$Config;)V", "Config", "DisclaimerConfig", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Start extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        private final String f22718c;

        /* renamed from: d  reason: collision with root package name */
        private final Config f22719d;

        @g(generateAdapter = true)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Start$Config;", "", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Start$DisclaimerConfig;", "disclaimer", "<init>", "(Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Start$DisclaimerConfig;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
        /* loaded from: classes6.dex */
        public static final class Config {

            /* renamed from: a  reason: collision with root package name */
            private final DisclaimerConfig f22720a;

            public Config(DisclaimerConfig disclaimer) {
                s.g(disclaimer, "disclaimer");
                this.f22720a = disclaimer;
            }

            public final DisclaimerConfig a() {
                return this.f22720a;
            }
        }

        @g(generateAdapter = false)
        /* loaded from: classes6.dex */
        public enum DisclaimerConfig {
            DEFAULT,
            BIOMETRIC;
            
            public static final Companion Companion = new Companion(null);

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Start$DisclaimerConfig$Companion;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Start$DisclaimerConfig;", "Lcom/squareup/moshi/h;", "reader", "fromJson", "Lcom/squareup/moshi/m;", "writer", "value", "Lvz/b0;", "toJson", "<init>", "()V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
            /* loaded from: classes6.dex */
            public static final class Companion extends f<DisclaimerConfig> {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Override // com.squareup.moshi.f
                @ir.a
                /* renamed from: fromJson */
                public DisclaimerConfig b(h reader) {
                    s.g(reader, "reader");
                    return s.c(reader.F0(), "biometric") ? DisclaimerConfig.BIOMETRIC : DisclaimerConfig.DEFAULT;
                }

                @Override // com.squareup.moshi.f
                @d
                /* renamed from: toJson */
                public void j(m writer, DisclaimerConfig disclaimerConfig) {
                    s.g(writer, "writer");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Start(String name, Config config) {
            super(name, null);
            s.g(name, "name");
            s.g(config, "config");
            this.f22718c = name;
            this.f22719d = config;
        }

        @Override // com.withpersona.sdk.inquiry.internal.network.NextStep
        public String a() {
            return this.f22718c;
        }

        public final Config b() {
            return this.f22719d;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f.d a() {
            jr.a f11 = jr.a.c(NextStep.class, "type").d(c.f22721c).f(Start.class, "start").f(CountrySelect.class, "country_select").f(DocumentsUpload.class, "documents_upload").f(Completed.class, "completed").f(Failed.class, "failed").f(PhoneNumber.class, "verification/phone-number").f(GovernmentId.class, "verification/government-id").f(Selfie.class, "verification/selfie").f(Database.class, "verification/database");
            s.f(f11, "of(NextStep::class.java,… \"verification/database\")");
            return f11;
        }
    }

    @g(generateAdapter = false)
    /* loaded from: classes6.dex */
    public enum b {
        DEFAULT,
        NONE
    }

    /* loaded from: classes6.dex */
    public static final class c extends NextStep {

        /* renamed from: c  reason: collision with root package name */
        public static final c f22721c = new c();

        private c() {
            super("unknown", null);
        }
    }

    private NextStep(String str) {
        this.f22684a = str;
    }

    public /* synthetic */ NextStep(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String a() {
        return this.f22684a;
    }
}